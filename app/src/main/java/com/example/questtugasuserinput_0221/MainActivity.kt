package com.example.questtugasuserinput_0221

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



                    Text(
                        text = stringResource(id = R.string.form_title),
                        fontSize = 24.sp,
                        color = Color(0xFF4A148C),
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = stringResource(id = R.string.form_subtitle),
                        fontSize = 13.sp,
                        color = Color.DarkGray
                    )

