package kz.arctan.navigation.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Colors
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProgressPanel(
    title: String,
    icon: ImageVector,
    maxValue: Int,
    completedValue: Int,
    color: Color
) {
    val isCompleted by remember { mutableStateOf(false) }
    var isLiked by remember { mutableStateOf(false) }
    Row {
        LinearProgressIndicator(progress = completedValue.toFloat() / maxValue)
        Column {
            IconButton(onClick = { isLiked = !isLiked }) {
                Icon(Icons.Default.Lock, "Liked")
            }
            Icon(
                Icons.Default.Check,
                "Completed",
//                modifier = Modifier if (isCompleted) Color.Green else Color.Red
            )
        }
    }
}

@Preview
@Composable
fun ProgressPanelPreview() {
    ProgressPanel(
        title = "Title",
        icon = Icons.Default.Check,
        maxValue = 100,
        completedValue = 80,
        color = Color.Red
    )
}