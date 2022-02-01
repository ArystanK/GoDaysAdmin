package kz.arctan.navigation.presentation.views

/**
 * Jetpack Compose
 * MVI
 * Clean Architecture
 *
 */
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.arctan.navigation.ui.theme.GoDaysAdminTheme

@Composable
fun MainScreen() {
    GoDaysAdminTheme {
        Scaffold(
            bottomBar = {
                BottomNavigation(modifier = Modifier.height(50.dp)) {

                }
            },
            topBar = {
                TopAppBar {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Default.Settings, "Settings")
                        }
                        Text("Сегодня")
                        IconButton(onClick = { /*TODO*/ }) {
//                        Icon(Icons.Default)
                        }
                    }
                }
            }
        ) {

        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}