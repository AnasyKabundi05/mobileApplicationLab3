package com.example.mobileapplicationdemolab3.StudentSupport

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StudentSupportScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Sports Centre",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "The campus sports centre has a fully equipped gym, sports hall and all-weather pitches. " +
                    "Students can join clubs, book facilities or drop in for fitness classes throughout the week.",
        )

        // Opening hours card – uses Rows
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("Opening hours", style = MaterialTheme.typography.titleMedium)
                Text("Monday – Friday 07:00 – 22:00")
                Text("Saturday 09:00 – 18:00")
                Text("Sunday 10:00 – 16:00")
            }
        }

        // Facilities card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("Facilities", style = MaterialTheme.typography.titleMedium)
                Text("Gym with cardio and weights areas")
                Text("Sports hall for basketball, badminton and futsal")
                Text("All-weather pitches")
                Text("Changing rooms and lockers")
            }
        }

        // Contact card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("Contact", style = MaterialTheme.typography.titleMedium)
                Text("Location: Sports Building, beside the main car park")
                Text("Email: sports@campus.ie")
                Text("Phone: 061 123 789")
            }
        }
    }
}