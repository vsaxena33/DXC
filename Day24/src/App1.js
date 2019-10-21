import React, { Component } from 'react'
import './App.css'
import axios from 'axios'
class App extends Component {
    constructor() {
        super()
        this.state = {
            username: ''
        }
        this.handleClick = this.handleClick.bind(this)
    }
    handleClick() {
        console.log("handleClick Called")
        axios.get('https://api.github.com/users/smohit02')
            .then(response => this.setState({ username: response.data.followers_url }))
    }
    render() {
        return (
            <div className='btn'>
                Enter URL: <input type='type' name='url' id='url' />
                <button className='button' onClick={this.handleClick}>Click Me</button>
                <p>{this.state.username}</p>
            </div>
        )
    }
}
export default App
