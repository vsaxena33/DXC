import React, { Component } from 'react'

export default class ProductDisplay extends Component {
    render() {
        const {a, product} = this.props
        return (
            <div>
                <h3>key: {a}
                    productId: {product.productId}
                    productName: {product.productName}
                    quantityOnHand: {product.quantityOnHand}
                    price: {product.price}</h3>
            </div>
        )
    }
}
