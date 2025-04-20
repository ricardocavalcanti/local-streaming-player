package br.com.tecnoforce.rickplayer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun VideoPlayerScreenForTv(videoTitle: String, videoList: List<String>) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        // Cabeçalho com o nome do video
        Text(  // <-- Título "Exemplo de Vídeo"
            text = videoTitle,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
        )

        // Logica do player de vídeo, apenas como um espaço reservado
        Box( // <-- Retângulo cinza com "Player de Vídeo"
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Definindo uma altura fixa para o player de vídeo
                .background(Color.Gray)
        ) {
            Text(
                text = "Player de Vídeo",
                modifier = Modifier.align(Alignment.Center)
            )
        }

        // Função dos controles de vídeo (ver próxima etapa)
        VideoControls()

        // Exibindo a lista de vídeos abaixo do player
        VideoList(videoList)
    }

}