import React, { Component } from 'react'
import ProductList from './ProductList'

export default class Product extends Component {
    render() {
        return (
            <div>
                <h1>Product</h1>
                <ProductList></ProductList>
            </div>
        )
    }
}
