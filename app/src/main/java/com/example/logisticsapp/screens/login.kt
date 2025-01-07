package com.example.logisticsapp.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.logisticsapp.R
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    // Remember the state of the text input
    var phone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE95F25)),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.dastgyrlogo),
            contentDescription = "Dastgyr Logo",
            modifier = Modifier
                .size(100.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.deliverytruck),
            contentDescription = "Delivery Truck Illustration",
            modifier = Modifier
                .size(200.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)
                .padding(20.dp)
        ) {
            // First Text: "Phone"
            Text(
                text = "Phone",
                modifier = Modifier.padding(bottom = 8.dp), // Add spacing below the label
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium // Use consistent typography
            )

            OutlinedTextField(
                value = phone,
                onValueChange = { phone = it },
                label = { Text("Enter Phone") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White, // Background inside the border
                    focusedBorderColor = Color.Blue, // Border color when focused
                    unfocusedBorderColor = Color.Gray, // Border color when not focused
                    textColor = Color.Black // Text color
                ),
                shape = MaterialTheme.shapes.small, // Rounded corner shape (optional)
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp)) // Vertical spacing

            // Second Text: "Password"
            Text(
                text = "Password",
                modifier = Modifier.padding(bottom = 8.dp), // Add spacing below the label
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium // Use consistent typography
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Enter Password") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White, // Background inside the border
                    focusedBorderColor = Color.Blue, // Border color when focused
                    unfocusedBorderColor = Color.Gray, // Border color when not focused
                    textColor = Color.Black // Text color
                ),
                shape = MaterialTheme.shapes.small, // Rounded corner shape (optional)
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp)) // Spacing before the button

            Button(onClick = { submit(phone, password, navController) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE95F25),
                    contentColor = Color.White
                ),
                shape = MaterialTheme.shapes.small,
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Login",
                    style = MaterialTheme.typography.bodyLarge // Use consistent typography
                )
            }
        }

    }
}

fun submit (phone: String, password: String, navController: NavHostController) {
    println("Phone: $phone")
    println("Password: $password")

    navController.navigate("home")
}