var server = require('./server')
var router = require('./router')

server.start(9999, router.route)