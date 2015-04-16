package com.example.phil.menuskip;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

/**
 * Created by Phil on 3/17/2015.
 */

public class MenuPref extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_pref);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.like_american_cheese:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_american_cheese:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_american_cheese:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_arugula:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_arugula:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_arugula:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_bacon:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_bacon:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_bacon:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_beef:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_beef:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_beef:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_bleuCheese:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_bleuCheese:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_bleuCheese:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_cheddarCheese:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_cheddarCheese:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_cheddarCheese:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_ciabatta:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_ciabatta:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_ciabatta:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_cornmealKaiserRoll:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_cornmealKaiserRoll:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_cornmealKaiserRoll:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_egg:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_egg:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_egg:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_garlic:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_garlic:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_garlic:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_guacamole:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_guacamole:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_guacamole:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_honeyBBQ:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_honeyBBQ:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_honeyBBQ:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_jalapenos:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_jalapenos:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_jalapenos:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_lettuce:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_lettuce:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_lettuce:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_mayo:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_mayo:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_mayo:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_oliveOil:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_oliveOil:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_oliveOil:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_onionBun:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_onionBun:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_onionBun:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_onions:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_onions:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_onions:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_onionStraws:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_onionStraws:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_onionStraws:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_pepperJackCheese:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_pepperJackCheese:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_pepperJackCheese:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_pickles:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_pickles:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_pickles:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_pineapple:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_pineapple:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_pineapple:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_ranch:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_ranch:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_ranch:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_relish:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_relish:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_relish:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_salsa:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_salsa:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_salsa:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_steakSauce:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_steakSauce:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_steakSauce:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_teriyaki:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_teriyaki:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_teriyaki:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_tomato:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_tomato:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_tomato:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_tortillaChips:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_tortillaChips:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_tortillaChips:
                if (checked)
                    // Pirates are the best
                    break;

            case R.id.like_whiteBun:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.neutral_whiteBun:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.dislike_whiteBun:
                if (checked)
                    // Pirates are the best
                    break;
        }
    }

}
