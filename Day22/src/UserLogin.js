import React, { Component } from 'react'

export default class UserLogin extends Component {

    constructor() {
        super()
        this.state = ({
            validUser: true,
            textofButton: 'Login'
        })
        this.toggleButton = this.toggleButton.bind(this);
    }

    toggleButton() {
        if (this.state.validUser === true) {
            this.setState({
                validUser: false,
                textofButton: 'LoggedIn'
            })
        }
        else {
            this.setState({
                validUser: true,
                textofButton: 'Login'
            })
        }
    }

    render() {
        let message
        if (this.state.validUser)
            message = <div><h1><button onClick={this.toggleButton}>{this.state.textofButton}</button></h1></div>
        else
            message = <div><h1><button onClick={this.toggleButton}>{this.state.textofButton}</button></h1></div>
        return <div>{message}</div>
    }
}
