import React from 'react'

export default class ChildComponent extends React.Component {
    render() {
        return (
            <div>
                <button onClick={this.props.updateStateProp}>CLICK</button>
                <h3>The value of myDataprop: {this.props.myDataProp}</h3>
            </div>
        );
    }
}
