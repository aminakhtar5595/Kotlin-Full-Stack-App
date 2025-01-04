package com.example.logisticsapp.screens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(vertical = 20.dp) // Vertical margin for the entire screen
    ) {
        // Header Row with a bottom border
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .drawBehind {
                    val strokeWidth = 1.dp.toPx()
                    val y = size.height - strokeWidth / 2
                    drawLine(
                        color = Color.LightGray,
                        start = androidx.compose.ui.geometry.Offset(0f, y),
                        end = androidx.compose.ui.geometry.Offset(size.width, y),
                        strokeWidth = strokeWidth
                    )
                }
                .padding(bottom = 15.dp), // Padding below the Row
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Home",
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium
            )
        }

        // Content Box with border and padding
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
                .border(
                    BorderStroke(1.dp, Color.LightGray),
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(14.dp) // Padding inside the border
        ) {
            // Repeated text styles are abstracted into a reusable modifier
            val textModifier = Modifier.padding(bottom = 5.dp)

            Text(
                text = "Friday Route",
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium,
                modifier = textModifier
            )

            Text(
                text = "27th Dec, 2024",
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium,
                modifier = textModifier
            )

            Text(
                text = "Route In Transit",
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium,
                modifier = textModifier
            )
        }
    }
}
