package com.example.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Results extends AppCompatActivity {

    private TextView Answer;
    private Button Next;
    private ImageView ResultImage;

    private TextView title1;
    private  ImageView image2;
    private TextView  text3;
    private TextView textview4;
    private ImageView image5;
    private TextView text6;
    private TextView text7;
    private ImageView image8;
    private TextView  text9;
    private TextView text10;
    private ImageView image11;
    private TextView text12;
    private TextView  text13;
    private ImageView image14;
    private TextView  text15;
    private TextView text16;
    private ImageView image17;
    private ImageView edit2;
//
//    tcan1
//            tcan2
//    gif3
//            tcan4
//    tcan5
//            gif6
//    tcan7
//            tcan8
//    gif9
//            tcan10
//    tcan11
//            gif12
//    tcan13
//            tcan14
//    gif15
//            tcan16

    private TextView tesla1;
    private TextView tesla2;
    private GifImageView gifcan3;
    private TextView tesla4;
    private TextView tesla5;
    private GifImageView gifcan6;
    private TextView tesla7;
    private TextView tesla8;
    private GifImageView gifcan9;
    private TextView tesla10;
    private TextView tesla11;
    private GifImageView gifcan12;
    private TextView tesla13;
    private TextView tesla14;
    private GifImageView gifcan15;
    private TextView tesla16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        title1=findViewById(R.id.t1);
        image2=findViewById(R.id.p2);
        text3=findViewById(R.id.t3);
        textview4=findViewById(R.id.t4);
        image5=findViewById(R.id.i5);
        text6=findViewById(R.id.t6);
        text7=findViewById(R.id.t7);
        image8=findViewById(R.id.i8);
        text9=findViewById(R.id.t9);
        text10=findViewById(R.id.t10);
        image11=findViewById(R.id.i11);
        text12=findViewById(R.id.t12);
        text13=findViewById(R.id.t13);
        image14=findViewById(R.id.i14);
        text15=findViewById(R.id.t15);
        text16=findViewById(R.id.t16);
        image17=findViewById(R.id.i17);
=========

         tesla1;
        private TextView tesla2;
        private GifImageView gifcan3;
        private TextView tesla4;
        private TextView tesla5;
        private GifImageView gifcan6;
        private TextView tesla7;
        private TextView tesla8;
        private GifImageView gifcan9;
        private TextView tesla10;
        private TextView tesla11;
        private GifImageView gifcan12;
        private TextView tesla13;
        private TextView tesla14;
        private GifImageView gifcan15;
        private TextView tesla16;
       xet= can1
                tcan2
        gif3
                tcan4
        tcan5
                gif6
        tcan7
                tcan8
        gif9
                tcan10
        tcan11
                gif12
        tcan13
                tcan14
        gif15
                tcan16

        Answer = findViewById(R.id.tvAnswer);
        Next = findViewById(R.id.btn01);
        ResultImage = findViewById(R.id.imageViewResult);

        // Get BMI value sent from Main activity, using the key "bmiValue"
        Bundle extras = getIntent().getExtras();
        float bmiValue = extras.getFloat("bmiValue", 0);



        // Check bmiValue here and assign the text based on BMI value.
        if (bmiValue < 18.5) {
            // If BMI value less than 18.5, he is "underweight"//
               Answer.setText("You Are Underweight" );

            ResultImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.underweight));

            title1.setText("Best Advices");

            image2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.obese));

            text3.setText("What To Do If You Are Underweight");

            textview4.setText("Being underweight can affect your health." +
                    " So, it’s important to understand what ‘underweight’ means and what you can do about it." +
                    " If you are underweight, you should try to gain some weight safely.");

            image5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.weightundrc));

            text6.setText("Why Are Some People Underweight?");

            text7.setText("People become underweight for many different reasons. Some may be born naturally small and their low BMI is due to their genes. Some may have a very high metabolism and find it hard to put on weight, even if they eat foods that have a lot of calories.\n" +
                    "\n" +
                    "Some people may not follow a healthy, balanced diet because they forget to eat or they can’t afford nutritious foods.\n" +
                    " Others may not be eating properly because they are sick, or their medicines make them feel nauseous. Some people who do a lot of physical activity burn up more calories than they can eat, leading to their being underweight.");

            image8.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.underweightsafe));

            text9.setText("What are the symptoms of being underweight?");

            text10.setText("Some people who are underweight find they get sick all the time, or they feel very tired. That may be because they aren’t getting all the nutrients they need from their diet. They may also find their hair gets thinner or falls out, their skin gets very dry and their teeth are affected.\n" +
                    "\n" +
                    "Children who are underweight may not grow as expected for their age.\n" +
                    "\n" +
                    "Being underweight can lead to health problems including:\n" +
                    "\n" +
                    "osteoporosis\n" +
                    "infections, which are harder to fight off\n" +
                    "anaemia\n" +
                    "irregular periods in women, or menstruation may stop altogether\n" +
                    "pregnancy problems, such as difficulty falling pregnant or a higher likelihood of preterm labour\n" +
                    "heart problems");

            image11.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.healplate));

            text12.setText("How Can You Gain Weight Safely?");

            text13.setText("If you are underweight, it’s important to eat a variety of foods that give you the nutrition you need. You should make sure you eat enough energy to gain weight, protein to repair your body and build your muscles, and vitamins and minerals to make you healthy.\n" +
                    "\n" +
                    "The aim is to gain weight gradually by eating healthy foods. Even if you are underweight, try to avoid foods with a lot of added sugar, fat and salt, like cakes, takeaway foods and sugary drinks.\n" +
                    "\n" +
                    "You can put on weight by eating small meals frequently throughout the day. Try to snack on healthy, high energy foods like cheese, nuts, milk-based smoothies and dried fruit.\n" +
                    "\n" +
                    "Here are some healthy ways to gain weight when you're underweight:");

            image14.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.trackingfood));

            text15.setText("Further tips for gaining weight safely include:");

            text16.setText("-Eat more frequently\n" +
                    "-Choose nutrient-rich foods\n " +
                    "-Try smoothies and shakes\n" +
                    "-Make every bite count\n" +
                    "-Watch when you drink\n" +
                    "-Have an occasional treat\n" +
                    "-Exercise");

            image17.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.setup));


        } else if (bmiValue >= 18.5 && bmiValue < 25) {
            // If BMI value more than 18.5 and less than 25 he is "normal"

            Answer.setText("You Are Normal");

            ResultImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.normaweight));

            title1.setText("Best Advices");

            image2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.normalweightxd));

            text3.setText("8 Signs You’re Already at a Healthy Weight");

            textview4.setText("Maintaining a healthy weight is important for health. " +
                    "In addition to lowering the risk of heart disease, stroke, diabetes, and high blood pressure, it can also lower the risk of many different cancers.\n" +
                    "Move more, eat less. Turning off the television and skipping the sugary drinks are two ways to get started.");

            image5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.youfollowhealthylife));

            text6.setText("Maintaining a healthy weight is important for overall health and well-being");

            text7.setText("As you grow older, if you continue eating the same types and amounts of food but do not become more active, you will probably gain weight." +
                    " That’s because your metabolism (how your body gets energy from food) can slow with age," +
                    " and your body composition (amount of fat and muscle) may be different from when you were younger.");

            image8.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.healthylifestyle1));

            text9.setText("How Can I Keep a Healthy Weight?");

            text10.setText("Many things can affect your weight, including genetics, age, gender, lifestyle, family habits and culture, sleep, and even where you live and work. Some of these factors can make it hard to lose weight or keep weight off.");

            image11.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.measure));

            text12.setText("What Should I Eat to Maintain a Healthy Weight?");

            text13.setText("Choose foods that have a lot of nutrients but not a lot of calories." +
                    " NIA has information to help you make healthy food choices and shop for food that’s good for you.");

            image14.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.happyface));

            text15.setText("How Much Physical Activity Do I Need?");

            text16.setText("Aim for at least 150 minutes of moderate-intensity aerobic activity each week. " +
                    "You don’t have to do that all at once—break it up over the whole week, however you like." +
                    " If you can’t do this much activity right away, try to be as physically active as you can." +
                    " Doing something is better than doing nothing at all.");

            image17.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.phactivity));





        } else {

            Answer.setText("You are Obese");
            ResultImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.obesebmitr));

            title1.setText("Best Advices");

            image2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.obesecan1));

            text3.setText("It's All About Planning");

            textview4.setText("When you have a lot of weight to lose, " +
                    "it means playing the long game. And during that time, you'll face challenges. " +
                    "Weight loss experts and people who have done it offer you their ideas to cut calories," +
                    " fight the 'angry' make exercise easier, stay on track, and more." +
                    " Some are tried-and-true, and others may surprise you.");

            image5.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.obese1));

            text6.setText("Go Big for Breakfast");

            text7.setText("People who eat more in the morning and less at night tend to lose more weight. Some studies suggest that starting your day with a high-protein meal -- especially warm, solid food -- helps you feel fuller and less hungry later. Shoot for 350-400 calories with at least 25 grams of protein, says Domenica Rubino, MD, director of the Washington Center for Weight Management/Research.");

            image8.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.obesebreakfast));

            text9.setText("Keep a Photo Diary");

            text10.setText("‘We have horrible memories in terms of what we eat,’ says Susan Albers, PsyD, author of EatQ. Save your food photos in a daily file. Before your next snack or meal, review them. They'll remind you what you've already eaten. And that may help you decide to downsize or choose something else.");

            image11.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.obesetakepic));

            text12.setText("Try a Meal Replacement Plan");

            text13.setText("Under a licensed professional's care, you'll eat one regular meal per day and swap the others for special shakes, soups, or bars. ''If you can stick to it, you'll see big results in 6 months to a year,'' says Ken Fujioka, MD, an obesity specialist at the Scripps Clinic in San Diego.");

            image14.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.tryameal));

            text15.setText("Set Up Your Food Storage");

            text16.setText("Out of sight, out of mind -- and mouth. After you purge your home of those treats you can't resist, Albers recommends taking the idea a step further: Assign shelves in the pantry and the fridge so your healthy food becomes easy to see and reach. Put fresh veggies and fruit at eye level instead of inside a drawer, and you're more likely to grab them when you open the door.");

            image17.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.setup));





        }




        Button show = (Button) findViewById(R.id.btn01);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Results.this,Healthyeatingbasics.class));
            }
        });



    }

}

