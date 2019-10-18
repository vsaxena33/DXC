import React, { Component } from 'react'

export default class Destructuring extends Component {
    render() {
        const { uname } = this.props
        return (
            <div>
                <h1>Your name is: {uname}</h1>
            </div>
        )
    }
}
