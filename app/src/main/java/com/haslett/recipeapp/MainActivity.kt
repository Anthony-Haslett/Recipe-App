package com.haslett.recipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // region Interop
        setContentView(R.layout.activity_main)

        // endregion

        // region Columns
//        setContent {
//            Column(modifier = Modifier.fillMaxWidth()
//                .height(200.dp)
//                .border(border = BorderStroke(1.dp, Color.Black))) {
//                Text("ITEM 1",
//                    modifier = Modifier.align(Alignment.CenterHorizontally) )
//            }
//        }
        // endregion

        // region Rows
//        setContent {
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight()
//                    .background(
//                        color = Color(0xFFF2F2F2)
//                    )
//            ) {
//                Image(
//                    painter = painterResource(R.drawable.happy_meal_small),
//                    contentDescription = "",
//                    modifier = Modifier.height(300.dp),
//                    contentScale = ContentScale.Crop,
//                )
//                Column(modifier = Modifier.padding(16.dp)) {
//                    Row(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.SpaceBetween
//                    ) {
//                        Text(
//                            text = "Happy Meal",
//                            style = TextStyle(
//                                fontSize = 26.sp
//                            )
//                        )
//
//                        Text(
//                            text = "$5.99",
//                            style = TextStyle(
//                                color = Color(0xFF85bb65),
//                                fontSize = 17.sp
//                            ),
//                            modifier = Modifier.align(Alignment.CenterVertically)
//                        )
//                    }
//                    Spacer(modifier = Modifier.padding(top = 8.dp))
//                    Text(
//                        text = "800 calories",
//                        style = TextStyle(
//                            fontSize = 17.sp
//                        )
//                    )
//                    Spacer(modifier = Modifier.padding(top = 8.dp))
//                    Button(
//                        onClick = {},
//                        modifier = Modifier.align(Alignment.CenterHorizontally)
//                    ) {
//                        Text("Order now")
//                    }
//                }
//            }
//        }

        //endregion
    }
}
