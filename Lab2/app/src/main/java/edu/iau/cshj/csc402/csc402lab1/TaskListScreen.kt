package edu.iau.cshj.csc402.csc402lab1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

data class StudentTask(
    val id: Int,
    val title: String,
    val description: String
)

@Composable
fun TaskListScreen(modifier: Modifier = Modifier) {

    val tasks = listOf(
        StudentTask(
            1,
            "Study Kotlin",
            "Review variables and functions"
        ),
        StudentTask(
            2,
            "Practice Compose",
            "Build simple composable screens"
        ),
        StudentTask(
            3,
            "Finish Lab 2",
            "Complete all required tasks"
        ),
        StudentTask(
            4,
            "Review State",
            "Practice remember and mutableStateOf"
        ),
        StudentTask(
            5,
            "Prepare for Quiz",
            "Review the lecture material"
        )
    )

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        item {
            Text(
                text = "My Tasks",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))
        }

        items(tasks) { task ->

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = task.title,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = task.description,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskListScreenPreview() {
    TaskListScreen()
}