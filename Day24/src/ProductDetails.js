import React, { Component } from 'react'

export default class ProductDetails extends Component {
    render() {
        const {product} = this.props
        return (
            <div>
                <h3>
                    productId: {product.match.productId}
                    productName: {product.productName}
                    quantityOnHand: {product.quantityOnHand}
                    price: {product.price}
                </h3>
            </div>
        )
    }
}
