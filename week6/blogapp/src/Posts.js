import React, {Component} from 'react';

class Posts extends Component{
    constructor(props){
        super(props);
        this.state = {
            posts: [],
            errors: null
        }
    }

    loadposts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((res)=>res.json())
        .then((data)=>{
            this.setState({posts:data});
        })
        .catch((error)=>{
            this.setState({errors: error.message})
        })
    }

    componentDidMount(){
        this.loadposts();
    }

    componentDidCatch(){
        alert("An error occurred");
    }

    render(){
        return(
            <div>
                <h1>Blog Posts</h1>
                {this.state.posts.map((post) => (
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;