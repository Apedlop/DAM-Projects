function toggleTheme() {
    const currentTheme = document.documentElement.getAttribute('data-bs-theme');
    const newTheme = currentTheme === 'dark' ? 'light' : 'dark';
    document.documentElement.setAttribute('data-bs-theme', newTheme);
    if (newTheme === 'light') {
      document.body.style.backgroundColor = '#274f75';
      document.getElementById('darkImage').style.display = 'none';
      document.getElementById('lightImage').style.display = 'inline';
    } else {
      document.body.style.backgroundColor = '#171e1d';
      document.getElementById('darkImage').style.display = 'inline';
      document.getElementById('lightImage').style.display = 'none';
    }
}
