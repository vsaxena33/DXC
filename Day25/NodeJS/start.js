var http = require('http')
var url = require('url')
var router = require('./router')

function start(route) {
    function onRequest(request, response) {
        if (request.url === '/favicon.ico'){
            response.writeHead(200, { 'Content-type': 'image/x-icon'})
            response.end()
            return
        }
        response.writeHead(201, { "Content-type": "text-plain" })
        var pathname = url.parse(request.url).pathname
        console.log("1. The request current url is:" + pathname)
        route(pathname)
        console.log("3. The request completed url is")
        response.write("My name is Vaibhav Saxena")
        response.end()
    }

    var server = http.createServer(onRequest)
    server.listen(8888)
    console.log("Server has started on prot number: 8888")
}

exports.start = start