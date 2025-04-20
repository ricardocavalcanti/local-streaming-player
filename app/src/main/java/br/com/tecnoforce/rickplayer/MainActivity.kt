package br.com.tecnoforce.rickplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.tecnoforce.rickplayer.ui.theme.RickPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Aplica o tema personalizado
            RickPlayerTheme {
                // Usa o Surface para definir o layout principal
                Surface(modifier = Modifier.fillMaxSize()) {
                    // Chama a função Composable que contém a interface
                    VideoPlayerScreenForTv(
                        videoTitle = "Exemplo de Vídeo",
                        videoList = listOf(
                            "S01EP01-Maskman.mp4",
                            "S01EP02-Jiraya.mp4",
                            "S01EP03-Gavan.mp4",
                            "S01EP03-OnePiece.mp4",
                            "S01EP03-Naruto.mp4",
                            "S01EP03-BlueLock.mp4",
                        )
                    )
                }
            }
        }
    }
}


