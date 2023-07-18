import React, { Component } from 'react';

export default class Contacts extends Component {
    constructor(props){
        super(props);
        this.state = {
            contacts: [],
        };
    }

    render() {
        const content = (
            <div>
                <p>Hello Yevhen</p>
            </div>
        )
        return content;
    }
}