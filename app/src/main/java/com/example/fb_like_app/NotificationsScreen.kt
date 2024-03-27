package com.example.fb_like_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun NotificationsScreen(modifier:Modifier) {
    val people = remember { mutableStateOf(Person.getPeople()) }

    LazyColumn(modifier.background(Color.White)) {
        items(people.value) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 4.dp)
                    .background(Color(0xF6BBE1FF))
            ) {
                Image(
                    painter = painterResource(id = it.resId),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(CircleShape)
                        .size(50.dp)
                )
                Text(text = "${it.name} ${it.text}")
            }
        }
    }
}