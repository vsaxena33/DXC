import React from 'react'
import ChildComponent from './ChildComponent'

export default class ParentComponent extends React.Component {
    constructor(props) {
        super();
        this.state = {
            data: "Apple"
        }
        this.parentMessage = this.parentMessage.bind(this);
    };
    parentMessage() {
        this.setState({
            data: "Child Apple"
        })
    }

    render() {
        return (
            <div>
                <ChildComponent myDataProp={this.state.data} updateStateProp={this.parentMessage}></ChildComponent>
            </div>
        );
    }
}
