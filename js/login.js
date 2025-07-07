document.getElementById('loginForm').addEventListener('submit', async function(event) {
  event.preventDefault();

  const email = document.getElementById('email').value.trim();
  const senha = document.getElementById('senha').value.trim();

  if (!email || !senha) {
    alert('Por favor, preencha todos os campos.');
    return;
  }

  try {
    const response = await fetch('http://localhost:9090/api/usuarios/login', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ email, senha })
    });

    if (!response.ok) {
      alert('Falha no login: usuário ou senha inválidos.');
      return;
    }

    const data = await response.json();

    alert('Login realizado com sucesso! Bem-vindo(a) ' + data.nome);

    // Redirecionar para página principal após login
    window.location.href = 'index.html';

  } catch (error) {
    alert('Erro ao tentar realizar login. Tente novamente mais tarde.');
    console.error('Erro no login:', error);
  }
});
