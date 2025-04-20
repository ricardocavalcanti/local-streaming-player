package br.com.tecnoforce.rickplayer

import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun VideoControls() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(onClick = { /* Ação de Play/Pause */ }, modifier = Modifier.focusable()) {
            Icon(Icons.Default.PlayArrow, contentDescription = "Play")
        }
        IconButton(onClick = { /* Ação de aumentar volume */ }, modifier = Modifier.focusable()) {
            Icon(Icons.Default.Add, contentDescription = "Volume")
        }
        IconButton(onClick = { /* Ação de Configurações */ }, modifier = Modifier.focusable()) {
            Icon(Icons.Default.Settings, contentDescription = "Configurações")
        }
    }
}