# 📺 Streaming Player 

Um app Android simples para listar e assistir vídeos de um HD externo conectado à rede local — feito com Kotlin e Jetpack Compose.

---

## 🔧 Tecnologias

- [x] Kotlin
- [x] Jetpack Compose
- [x] Android Studio
- [ ] Acesso remoto a arquivos via rede (LAN)

---

## 🎯 Objetivo

Criar um aplicativo Android que funcione como um player de vídeo via rede local (LAN), com foco em:

- Interface limpa e moderna com Jetpack Compose
- Leitura de vídeos organizados (ex: `S01EP01-nome.mp4`)
- Suporte a vídeos armazenados em HD externo ligado a roteador
- Reprodução via streaming local, sem necessidade de download completo

---

## 📸 Preview

*(Em breve: capturas de tela do app em execução)*

---

## 🚧 Status

✅ Ambiente de desenvolvimento configurado  
✅ Interface inicial com Jetpack Compose funcionando  
📌 Próximo passo: simulação de lista de vídeos

---

## 📁 Estrutura atual do projeto

```bash
app/
├── java/com.example.localstreamingplayer/
│   └── MainActivity.kt
└── res/
    └── theme/
```
---
## 🚀 Como rodar

1. Clone o projeto: `git clone https://github.com/ricardocavalcanti/local-streaming-player.git`
2. Abra com o Android Studio (preferencialmente Arctic Fox ou superior)
3. Rode em um emulador ou dispositivo físico

---

## 📝 Padrão de Mensagens de Commits

Cada tipo de commit segue um padrão bem definido:

### 🚀 Funcionalidades novas
- **`feat:`** Para novas funcionalidades.
    - Exemplo: `feat: criar botao login`

### 🐛 Correções de bugs
- **`fix:`** Para correções de bugs.
    - Exemplo: `fix: corrigir rota tela`

### 🔨 Refatorações de código
- **`refactor:`** Para refatorações de código sem alteração de comportamento.
    - Exemplo: `refactor: extrair logica para classe separada`

### 📄 Alterações na documentação
- **`docs:`** Para alterações na documentação.
    - Exemplo: `docs: atualizar instrucoes de execucao local`

### 🎨 Mudanças de estilo e formatação
- **`style:`** Para mudanças de estilo (formatação de código, etc.).
    - Exemplo: `style: remover espacos em branco desnecessarios`

### 🧪 Testes
- **`test:`** Para adicionar ou modificar testes.
    - Exemplo: `test: adicionar teste unitário para cotacaoService`

### 🧹 Tarefas diversas
- **`chore:`** Para tarefas diversas (build, configuração, etc.).
    - Exemplo: `chore: adicionar .gitignore para Android Studio`

