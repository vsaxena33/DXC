import React, { Component } from 'react'
import './App.css'

export default class App extends Component {
    render() {
        return (
            <div className='myDiv'>
                <a href='home'>Home</a>
                <a href='customers'>Customers</a>
                <a href='employees'>Employee</a>
                <a href='product'>Product</a>
                <hr/>
                <h1>Home Page- Welcome to DXC</h1>
            </div>
        )
    }
}
