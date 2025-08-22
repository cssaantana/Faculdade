window.onload = function () {
  const tarefasSalvas = JSON.parse(localStorage.getItem("tarefas")) || [];
  tarefasSalvas.forEach(tarefa => adicionarTarefa(tarefa.texto, tarefa.concluida));
};

function adicionarTarefa(texto = null, concluida = false) {
  const input = document.getElementById("novaTarefa");
  const lista = document.getElementById("listaTarefas");

  const valor = texto || input.value.trim();
  if (valor === "") return;

  const li = document.createElement("li");
  const checkbox = document.createElement("input");
  checkbox.type = "checkbox";
  checkbox.checked = concluida;

  const span = document.createElement("span");
  span.textContent = valor;

  let timeoutId;

  if (concluida) {
    span.classList.add("concluida");
    li.style.opacity = "0.6";
  }

  checkbox.onchange = function () {
    if (checkbox.checked) {
      span.classList.add("concluida");
      li.style.opacity = "0.6";

      timeoutId = setTimeout(() => {
        lista.removeChild(li);
        atualizarStorage();
      }, 1000);
    } else {
      span.classList.remove("concluida");
      li.style.opacity = "1";
      clearTimeout(timeoutId);
      atualizarStorage();
    }
  };

  li.appendChild(checkbox);
  li.appendChild(span);
  lista.appendChild(li);

  if (!texto) input.value = "";

  atualizarStorage();
}

function atualizarStorage() {
  const lista = document.getElementById("listaTarefas");
  const itens = lista.querySelectorAll("li");

  const tarefas = Array.from(itens).map(li => {
    return {
      texto: li.querySelector("span").textContent,
      concluida: li.querySelector("input").checked
    };
  });

  localStorage.setItem("tarefas", JSON.stringify(tarefas));
}
