//add book

document.getElementById("add_book_form").eventListener("submit"){

    let book = {
        title: document.getElementById("title").value,
        author: document.getElementById("author").value,
        isbn: document.getElementById("isbn").value,
        pages: parseInt(document.getElementById("pagecount").value),
        rating: parseInt(document.getElementById("rating").value);
        genre: document.getElementById("genre").value,
        status: document.getElementById("status").value
    };

});