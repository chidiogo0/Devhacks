//add book
let allBooks = [];
let showingBooks = false;

document.getElementById("add_book_form").addEventListener("submit", function(e){

    e.preventDefault();
    let book = {
        title: document.getElementById("title").value,
        author: document.getElementById("author").value,
        isbn: document.getElementById("isbn").value,
        pages: parseInt(document.getElementById("pagecount").value),
        rating: parseInt(document.getElementById("rating").value),
        genre: document.getElementById("genre").value,
        status: document.getElementById("status").value
    };
    console.log(book);
    allBooks.push(book);


    document.getElementById("add_book_form").reset();
});

//view all books
document.getElementById("all-books").addEventListener("click", function(){

    let container = document.getElementById("book_list");
    container.innerHTML ="";


    allBooks.forEach(book => {
        let div = document.createElement("div");
        div.classList.add("book-item");

        div.innerHTML = `
            <h3>${book.title}</h3>
            <p><strong>Author: </strong> ${book.author}</p>
            <p><strong>ISBN: </strong> ${book.isbn}</p>
            <p><strong>Pages: </strong> ${book.pages}</p>
            <p><strong>Rating: </strong> ${book.rating}</p>
            <p><strong>Genre: </strong> ${book.genre}</p>
            <p><strong>Status: </strong> ${book.status}</p>
        `;

        container.appendChild(div);
    });


});


