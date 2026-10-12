package com.example.mobileapplicationdemolab3.Library

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mobileapplicationdemolab3.R

@Composable
fun Library() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Library",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "The campus library is a quiet space to study, borrow books and get help with research. " +
                    "It offers individual and group study areas, computers, printing, and access to online journals and e-books."
        )

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tina_picture),
                    contentDescription = "Campus library",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                        .clip(RoundedCornerShape(12.dp))
                )

                Text(
                    text = "Contact",
                    style = MaterialTheme.typography.titleMedium
                )
                Text("Location: Ground floor, Main Building")
                Text("Email: library@campus.ie")
                Text("Phone: 061 123 456")
                Text("Help desk: Monday – Friday, 09:00 – 17:00")
            }
        }
    }
}