package br.com.tecnoforce.rickplayer

import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun VideoList(videoList: List<String>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxWidth()  // Aqui é importante definir uma largura
            .heightIn(min = 0.dp, max = 400.dp)  // Ajuste a altura máxima como necessário
            .padding(top = 16.dp)
    ) {
        items(videoList) { video ->
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .focusable()
                    .fillMaxWidth()
                    .fillMaxWidth()
                    .background(Color.LightGray)  // Adicionando um fundo para os itens da lista
            ) {
                BasicText(text = video)
            }

        }
    }
}