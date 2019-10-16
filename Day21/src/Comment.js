import React, { Component } from 'react';

export default class Comment extends Component {
    constructor(props) {
        super(props);
        this.state = ({
            commentsText: this.props.commentsText
        })
        console.log("1.cons called")
    }

    componentWillMount() {
        console.log("2.componentWillMount called")
        this.setState({
            commentsText: "Let's start the session"
        })
    }

    componentDidMount() {
        console.log("4.componentDidMount called")
        this.setState({
            commentsText: "Let's start for lunch"
        })
    }

    render() {
        console.log("3.render called")
        return <div><h1>Welcome {this.state.commentsText}</h1></div>
    }
}
