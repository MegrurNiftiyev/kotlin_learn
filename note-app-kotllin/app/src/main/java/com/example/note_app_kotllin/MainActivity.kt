package com.example.note_app_kotllin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.note_app_kotllin.shared.theme.NoteappkotllinTheme
import com.example.note_app_kotllin.ui.notedetail.NoteDetailScreen
import com.example.note_app_kotllin.ui.notes.NotesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "notes"
            ) {
                composable("notes") {
                    NoteappkotllinTheme {
                        NotesScreen(
                            navController = navController
                        )
                    }
                }
                composable("note_detail/{id}/{title}/{subtitle}") { backStackEntry ->
                    val id = backStackEntry.arguments?.getString("id") ?: ""
                    val title = backStackEntry.arguments?.getString("title") ?: ""
                    val subtitle = backStackEntry.arguments?.getString("subtitle") ?: ""
                    NoteappkotllinTheme() {
                        NoteDetailScreen(id, title, subtitle,navController)
                    }
                }
            }
        }
    }
}


