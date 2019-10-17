import React, { Component } from 'react';

class LifeCycle extends Component {
    constructor(props) {
        super(props);

        this.state = {
            name : "Saxena"
        }
        console.log("Life Cycle con")

    }

    componentWillMount() {
        console.log("Life Cycle componentWillMount")
    }

    componentDidMount() {
        console.log("Life Cycle componentDidMount")
    }

    componentWillReceiveProps(nextProps) {
        console.log("Life Cycle componentWillReceiveProps")
    }

    shouldComponentUpdate(nextProps, nextState) {
        console.log("Life Cycle shouldComponentUpdate")
        return true
    }

    componentWillUpdate(nextProps, nextState) {
        console.log("Life Cycle componentWillUpdate")
    }

    componentDidUpdate(prevProps, prevState) {
        console.log("Life Cycle componentDidUpdate")
    }

    componentWillUnmount() {
        console.log("Life Cycle componentWillUnmount")
    }

    changeName(){
        this.setState({
            name: "Vaibhav"
        })
    }

    callMe(){
        console.log("call me method called")
    }

    render() {
        console.log("Life Cycle render")
        return (
            <div>
                <h2>Name: {this.state.name}.</h2>
                <button onClick={this.changeName.bind(this)}>Change</button>
            </div>
        );
    }
}

export default LifeCycle;