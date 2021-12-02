package com.young.compose_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.young.compose_01.model.Test

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(Test("영진", "제트팩 컴포즈 !!"))
        }
    }
}


@Composable
fun Greeting(test:Test) {
    Row (modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.f16e86b330f2eb75707b43d091a393fb),
            contentDescription = "Contact profile picture",
            
            // 이미지 스타일 적용
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)

        )
        
        Spacer(modifier = Modifier.width(70.dp))

    Column {
        Text(text = test.name)
        Text(text = test.content)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        Greeting(Test("영진", "테스트용 텍스트"))
}