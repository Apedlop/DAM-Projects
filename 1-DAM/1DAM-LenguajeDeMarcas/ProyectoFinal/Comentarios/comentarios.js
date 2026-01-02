document.getElementById('commentForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const commentText = document.getElementById('comment').value;
    if (commentText) {
        saveComment(commentText);
        displayComments();
        document.getElementById('commentForm').reset();
    }
});

function saveComment(comment) {
    const comments = JSON.parse(localStorage.getItem('comments')) || [];
    comments.push(comment);
    localStorage.setItem('comments', JSON.stringify(comments));
}

function displayComments() {
    const comments = JSON.parse(localStorage.getItem('comments')) || [];
    const commentsList = document.getElementById('commentsList');
    commentsList.innerHTML = '';
    comments.forEach((comment, index) => {
        const commentDiv = document.createElement('div');
        commentDiv.className = 'card mt-2';
        commentDiv.innerHTML = `
            <div class="card-body">
                <p class="card-text">${comment}</p>
            </div>
        `;
        commentsList.appendChild(commentDiv);
    });
}

document.addEventListener('DOMContentLoaded', displayComments);
