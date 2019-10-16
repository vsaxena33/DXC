import React, { Component } from 'react'

export default class Bye extends Component {
    render() {
        const {name, designation} = this.props
        return <h1>Thanks for visiting my website {name} - {designation}</h1>
    }
}
