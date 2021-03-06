package com.example.android.researchhero.LearnToResearch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.android.researchhero.R;
import com.example.android.researchhero.fragment.ResearchTopicLessonOneFragment;

/**
 * Created by absak on 6/28/2017.
 */

public class ResearchTopicLessonOneActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_quiz);
        /*// Find the View that shows the numbers category
        Button continueButton = (Button) findViewById(R.id.continue_button);

        // Set a click listener on that View
        continueButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent learnMenuIntent = new Intent(ResearchTopicLessonOneActivity.this, ResearchTopicQuizOneActivity.class);
                startActivity(learnMenuIntent);
            }
        });*/
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ResearchTopicLessonOneFragment())
                .commit();
    }
}
