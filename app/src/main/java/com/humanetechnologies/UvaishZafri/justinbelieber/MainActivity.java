package com.humanetechnologies.UvaishZafri.justinbelieber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
       // MobileAds.initialize(this, "ca-app-pub-4698448308348065~4470567634");
        MobileAds.initialize(this, "ca-app-pub-6593719489242391~2414710936");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void AATW(View view) {
        Global.lyrics = "\"All Around The World\"\n" +
                "(feat. Ludacris)\n" +
                "\n" +
                "[Bieber]\n" +
                "You're beautiful, beautiful, you should know it\n" +
                "(You're beautiful, beautiful, you should know it)\n" +
                "I think it's time, think it's time that you show it\n" +
                "You're beautiful, beautiful\n" +
                "\n" +
                "Go go go\n" +
                "\n" +
                "Baby what you doin', where you at, where you at?\n" +
                "Why you actin' so shy holdin' back, holdin' back?\n" +
                "We're not the only ones doin' it like that, it like that\n" +
                "So DJ bring that, bring that, bring that, bring that back\n" +
                "\n" +
                "'Cuz all around the world people want to be loved (yeah)\n" +
                "'Cuz all around the world they're no different than us (no)\n" +
                "All around the world people want to be loved\n" +
                "All around the world they're no different than us\n" +
                "All around the world\n" +
                "All around the world\n" +
                "\n" +
                "You're crazy girl, crazy girl, you should know it\n" +
                "(You're crazy girl, crazy girl, don't control it)\n" +
                "Light it up, light it up, so explosive\n" +
                "You're crazy girl (yeah yeah)\n" +
                "\n" +
                "Baby what you doin', where you at, where you at?\n" +
                "Why you actin' so shy holdin' back, holdin' back?\n" +
                "We're not the only ones doin' it like that, it like that\n" +
                "So DJ bring that, bring that, bring that, bring that back\n" +
                "\n" +
                "All around the world people want to be loved (yeah)\n" +
                "All around the world they're no different than us (no)\n" +
                "All around the world people want to be loved\n" +
                "All around the world they're no different than us\n" +
                "All around the world\n" +
                "\n" +
                "[Ludacris]\n" +
                "Yeah\n" +
                "Okay\n" +
                "Once again\n" +
                "(All around the world)\n" +
                "The dynamic duo is back at it\n" +
                "JB, Luda!\n" +
                "I love everything about you, you're imperfectly perfect\n" +
                "Everyone's itching for beauty, but just scratchin' the surface\n" +
                "Lost time is never found, can the DJ please reverse it?\n" +
                "In life we pay for change, let's make every second worth it\n" +
                "Anything can work if you work it when people say you don't deserve it\n" +
                "Then don't give in, 'cuz hate may win some battles, but love wins in the end\n" +
                "You shine just like the sun while the moon and the stars reflect your light\n" +
                "Beauty revolves around you\n" +
                "It's only right that...\n" +
                "\n" +
                "[Bieber]\n" +
                "All around the world people want to be loved\n" +
                "All around the world they're no different than us\n" +
                "All around the world (all around the world people wanna be loved)\n" +
                "All around the world (all around the world they're no different than us)\n" +
                "All around the world (all around the world people wanna be loved)\n" +
                "All around the world (all around the world they're no different than us)\n" +
                "All around the world\n" +
                "\n";
        intentactivity(view);
    }

    public void AATWa(View view) {
        Global.lyrics = "\"All Around The World (Acoustic Version)\"\n" +
                "\n" +
                "You're beautiful, beautiful, you should know it\n" +
                "(You're beautiful, beautiful, you should know it)\n" +
                "I think it's time, think it's time that you show it\n" +
                "You're beautiful, beautiful\n" +
                "\n" +
                "Baby what you doin', where you at, where you at?\n" +
                "Why you actin' so shy? Holdin' back, holdin' back\n" +
                "We're not the only ones doin' it like that, it like that\n" +
                "So DJ bring that, bring that, bring that, bring that back\n" +
                "\n" +
                "'Cuz all around the world people want to be loved (oh)\n" +
                "'Cuz all around the world they're no different than us (oh)\n" +
                "All around the world world world people want to be loved (yeah)\n" +
                "All around the world world world they're no different than us (yeah yeah oh)\n" +
                "\n" +
                "You're crazy girl, crazy girl, you should know it\n" +
                "(You're crazy girl, crazy girl, you should know it)\n" +
                "I think it's time, think it's time that you show it\n" +
                "You're crazy girl (yeah yeah)\n" +
                "\n" +
                "Well baby what you doin', where you at, where you at?\n" +
                "Why you actin' so shy? Holdin' back, holdin' back\n" +
                "We're not the only ones doin' it like that, it like that\n" +
                "So DJ bring that, bring that, bring that, bring that back\n" +
                "\n" +
                "'Cuz all around the world world world people want to be loved \n" +
                "'Cuz all around the world world world they're no different than us (yeah)\n" +
                "'Cuz all around the world world world people want to be loved \n" +
                "'Cuz all around the world world world they're no different than us (yeah)\n" +
                "'Cuz all around the world";
        intentactivity(view);
    }

    public void AB(View view) {
        Global.lyrics = "\"All Bad\"\n" +
                "\n" +
                "[Verse 1:]\n" +
                "It's another, if it ain't one thing\n" +
                "Instigators, like puttin' fire on propane\n" +
                "The wrong thing, they be worried 'bout\n" +
                "Ooh, you know females\n" +
                "And how they like to run their mouths\n" +
                "\n" +
                "Wanna be, wanna be, just like, talk like, you\n" +
                "(Like you) you (like you)\n" +
                "Misery, misery, loves company\n" +
                "Don't let 'em change your mood (don't let 'em change your mood)\n" +
                "\n" +
                "[Chorus:]\n" +
                "They try to get at me (They try to get at me)\n" +
                "Behind your back (your back, your back, your back)\n" +
                "Try'na tell me that I'm just like the others\n" +
                "But I ain't all bad\n" +
                "\n" +
                "No, no, I ain't all bad\n" +
                "All bad, all bad\n" +
                "I ain't all bad\n" +
                "All bad, all bad\n" +
                "\n" +
                "I might make you mad, so mad\n" +
                "My bad, no, no, I ain't all bad\n" +
                "\n" +
                "[Verse 2:]\n" +
                "Between us, they wanna come in\n" +
                "Your worst enemy sometimes be your best friend\n" +
                "Perfect, ain't sayin' that I am\n" +
                "Proven, least I'm provin' that I give a damn\n" +
                "\n" +
                "Wanna be, wanna be everything I outta be to you (to you)\n" +
                "Envy, envy, same thing as jealousy\n" +
                "Jealous of you\n" +
                "That's what they do\n" +
                "\n" +
                "[Chorus:]\n" +
                "They try to get at me (They try to get at me)\n" +
                "Behind your back (your back, your back, your back)\n" +
                "Try'na tell me that I'm just like the others\n" +
                "But I ain't all bad\n" +
                "\n" +
                "No, no, I ain't all bad\n" +
                "All bad, all bad\n" +
                "I ain't all bad\n" +
                "All bad, all bad\n" +
                "\n" +
                "I might make you mad, so mad\n" +
                "My bad, no, no, I ain't all bad\n" +
                "\n";
        intentactivity(view);
    }

    public void AWCY(View view) {
        Global.lyrics = "\"All I Want For Christmas Is You\"\n" +
                "(duet with Mariah Carey)\n" +
                "\n" +
                "[Justin Bieber]\n" +
                "I just can't wait\n" +
                "\n" +
                "[Mariah Carey]\n" +
                "I don't want a lot for Christmas\n" +
                "There is just one thing I need\n" +
                "And I don't care about the presents\n" +
                "Underneath the Christmas tree\n" +
                "\n" +
                "[Mariah Carey]\n" +
                "I don't need to hang my stocking\n" +
                "There upon the fireplace\n" +
                "Santa Claus won't make me happy\n" +
                "With a toy on Christmas Day\n" +
                "\n" +
                "[Mariah Carey]\n" +
                "I just want you for my own\n" +
                "More than you could ever know\n" +
                "Make my wish come true\n" +
                "All I want for Christmas\n" +
                "Is you\n" +
                "You, baby\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Oh, I won't ask for much this Christmas\n" +
                "I won't even wish for snow\n" +
                "And I'm just gonna keep on waiting\n" +
                "Underneath the mistletoe\n" +
                "\n" +
                "[Justin Bieber]\n" +
                "I won't make a list and send it\n" +
                "To the North Pole for Saint Nick\n" +
                "I won't even stay awake to\n" +
                "Hear those magic reindeer click\n" +
                "\n" +
                "[Justin Bieber]\n" +
                "'Cause I just want you here tonight\n" +
                "Holding on to me so tight\n" +
                "What more can I do?\n" +
                "Cause baby all I want for Christmas is you\n" +
                "You\n" +
                "\n" +
                "[Mariah Carey & Justin Bieber:]\n" +
                "Oh-ho, all the lights are shining\n" +
                "So brightly everywhere\n" +
                "And the sound of children\n" +
                "Laughter fills the air\n" +
                "\n" +
                "[Both]\n" +
                "And everyone is singing\n" +
                "I hear those sleigh bells ringing\n" +
                "Santa won't you bring me the one I really need?\n" +
                "Won't you please bring my baby to me?\n" +
                "Yeah\n" +
                "\n" +
                "[Mariah Carey]\n" +
                "Oh, I don't want a lot for Christmas\n" +
                "This is all I'm asking for\n" +
                "I just wanna see my baby (Yeahhh)\n" +
                "Standing right outside my door\n" +
                "\n" +
                "[Mariah Carey]\n" +
                "Oh I just want you for my own\n" +
                "\n" +
                "[Justin Bieber]\n" +
                "For my own\n" +
                "Baby\n" +
                "\n" +
                "[Mariah Carey]\n" +
                "More than you could ever know\n" +
                "Make my wish come true\n" +
                "\n" +
                "[Both]\n" +
                "Baby all I want for Christmas is\n" +
                "You baby\n" +
                "\n" +
                "All I want for Christmas is you baby\n" +
                "All I want for Christmas is you baby\n" +
                "All I want for Christmas is you baby";
        intentactivity(view);
    }

    public void AWY(View view) {
        Global.lyrics = "\"All I Want Is You\"\n" +
                "\n" +
                "Sitting here, all alone\n" +
                "Watching the snow fall\n" +
                "Looking back at the days\n" +
                "We threw them snow balls\n" +
                "I can't believe\n" +
                "I'm putting the tree up by myself\n" +
                "I need you\n" +
                "And nobody else\n" +
                "\n" +
                "And I'm sorry\n" +
                "If I pushed you away\n" +
                "Cause I need you here\n" +
                "And I want for you to know\n" +
                "\n" +
                "And I don't care, if I don't get anything\n" +
                "All I need is you here right now\n" +
                "And I'm sorry if I hurt you\n" +
                "But I know that all I want is you\n" +
                "This christmas, this christmas, this christmas\n" +
                "All I want is you\n" +
                "This christmas (I'm sorry),\n" +
                "This christmas (if I hurt you),\n" +
                "This christmas (but I know that),\n" +
                "All I want is you this christmas\n" +
                "\n" +
                "And I never wanna do this alone\n" +
                "Baby I just need you to be here\n" +
                "Here through the holidays\n" +
                "I just wanna know if you feel same way\n" +
                "Because I'm lonely baby\n" +
                "Want you to hold me baby\n" +
                "\n" +
                "And I'm sorry\n" +
                "If I pushed you away\n" +
                "I just want you to know I miss you\n" +
                "And I want you to stay\n" +
                "\n" +
                "And I don't care, if I don't get anything\n" +
                "All I need is you here right now\n" +
                "And I'm sorry if I hurt you\n" +
                "But I know that all I want is you\n" +
                "This christmas, this christmas, this christmas\n" +
                "All I want is you\n" +
                "This christmas (I'm sorry),\n" +
                "This christmas (if I hurt you),\n" +
                "This christmas (but I know that),\n" +
                "All I want is you this christmas\n" +
                "\n" +
                "Wrapping gifts without you babe\n" +
                "Is like mid-December and there's no cold\n" +
                "I can't do this on my own\n" +
                "I've changed my ways\n" +
                "Keep running back and forth again\n" +
                "I'm here to stay\n" +
                "\n" +
                "And I don't care, if I don't get anything\n" +
                "All I need is you here right now\n" +
                "And I'm sorry if I hurt you\n" +
                "But I know that all I want is you\n" +
                "This christmas, this christmas, this christmas\n" +
                "All I want is you\n" +
                "This christmas (I'm sorry),\n" +
                "This christmas (if I hurt you),\n" +
                "This christmas (but I know that),\n" +
                "All I want is you this christmas\n" +
                "\n";
        intentactivity(view);
    }

    public void AIT(View view) {
        Global.lyrics = "\"All In It\"\n" +
                "\n" +
                "Don't do nothin' 'less your heart's in it\n" +
                "Heart's in it, heart's in it\n" +
                "Don't do nothin' 'less you're all in it\n" +
                "All in it, all in it\n" +
                "\n" +
                "If you got a twenty for all of your tries\n" +
                "Twenty for all of the times,\n" +
                "The times you got back up, whoa\n" +
                "You'd be a billionaire in a year\n" +
                "That's what you gotta think 'til you're there\n" +
                "On the regular.\n" +
                "\n" +
                "If you got a diamond for all of your passion,\n" +
                "Diamond for your dedication\n" +
                "You could be icy like cake and\n" +
                "Icy for every occasion, gotta go hard, yeah\n" +
                "Still don't condone it,\n" +
                "Love is a component\n" +
                "You're the only opponent,\n" +
                "Gotta seize the moment\n" +
                "\n" +
                "And don't do nothin' 'less your heart's in it\n" +
                "Heart's in it, heart's in it\n" +
                "Don't do nothin' 'less you're all in it\n" +
                "All in it, all in it\n" +
                "Gonna give each time\n" +
                "'til the water runs dry\n" +
                "Don't do nothin' 'less you're all in it\n" +
                "All in it, all in it\n" +
                "\n" +
                "All in it, all in it\n" +
                "\n" +
                "If I had a guitar missing five strings?\n" +
                "A guitar with only one string, I can only play one song, ooh\n" +
                "A simple melody, simple enough to make the world sing\n" +
                "Strong enough to make your mood swing, you know what I mean\n" +
                "\n" +
                "If you got a diamond for all of your passion,\n" +
                "Diamond for your dedication\n" +
                "You could be icy like cake and\n" +
                "Icy for every occasion, gotta go hard, yeah\n" +
                "Still don't condone it,\n" +
                "Love is a component\n" +
                "You're the only opponent,\n" +
                "Gotta seize the moment\n" +
                "\n" +
                "And don't do nothin' 'less your heart's in it\n" +
                "Heart's in it, heart's in it\n" +
                "Don't do nothin' 'less you're all in it\n" +
                "All in it, all in it\n" +
                "Gonna give each time\n" +
                "'Til the water runs dry\n" +
                "Don't do nothin' 'less you're all in it\n" +
                "All in it, all in it\n" +
                "\n" +
                "All in it, all in it\n" +
                "\n" +
                "See, growing up I—I always felt like I had to be the best at everything\n" +
                "'Cause I, I just didn't think I was good enough\n" +
                "And maybe if I was good at something, that I'd get recognition from that\n" +
                "But I quickly found out that I wasn't going to get the recognition that I wanted or that I needed\n" +
                "Because, because people aren't perfect\n" +
                "And by not being perfect you—you sometimes can disappoint people\n" +
                "And with God, it's like He's perfect and He never disappoints\n" +
                "So I just get my recognition from Him\n" +
                "And give Him recognition";
        intentactivity(view);
    }

    public void ATM(View view) {
        Global.lyrics = "\"All That Matters\"\n" +
                "\n" +
                "Oh oh, just as sure as the stars in the sky\n" +
                "I need you to show me the light\n" +
                "Not just for the meanwhile, for a long long time\n" +
                "Better believe it\n" +
                "\n" +
                "Oh oh, whenever you're not in my presence\n" +
                "It feels like I'm missing my blessings, yeah\n" +
                "So I sleep through the daylight, stay awake all night\n" +
                "'Til you back again, oh, yeah, yeah\n" +
                "\n" +
                "You think I'm biased\n" +
                "To my significant other\n" +
                "You hit it right on the head\n" +
                "Only been missing my lover\n" +
                "Got a whole lotta texts on my phone and I don't reply\n" +
                "The next eight bars tell you why\n" +
                "\n" +
                "[Chorus:]\n" +
                "You're all that matters to me, yeah yeah,\n" +
                "Ain't worried about nobody else\n" +
                "If it ain't you, I ain't myself\n" +
                "You make me complete\n" +
                "You're all that matters to me, yeah, yeah,\n" +
                "What's a king bed without a queen\n" +
                "There ain't no \"I\" in team\n" +
                "You make me complete\n" +
                "You're all that matters to me\n" +
                "\n" +
                "Take the gas out the car it won't drive\n" +
                "That's how I feel when you're not by my side\n" +
                "When I wake up in the morning up under you, and only you\n" +
                "\n" +
                "Oh oh, I'm grateful for your existence\n" +
                "Faithful no matter the distance\n" +
                "You're the only girl I see\n" +
                "From the bottom of my heart please believe\n" +
                "\n" +
                "[Chorus]\n" +
                "\n" +
                "Yeah, yeah, yeah, yeah\n" +
                "You're all that matters to me\n" +
                "Yeah, yeah, yeah, yeah\n" +
                "You're all that matters to me\n";
        intentactivity(view);
    }

    public void AY(View view) {
        Global.lyrics = "\"All Yours\"\n" +
                "\n" +
                "You know it babe\n" +
                "You know it babe\n" +
                "\n" +
                "I could open up your door like a gentleman\n" +
                "If you open up your heart and just let me in\n" +
                "Tell me what you need girl I will never disappoint you\n" +
                "Woah\n" +
                "\n" +
                "And if you ride with me I can show you babe\n" +
                "And nobody gonna know you like I know you babe\n" +
                "We can fly away, fly, fly away\n" +
                "I adore ya (I adore ya)\n" +
                "\n" +
                "Woah\n" +
                "\n" +
                "Walkin around with a little attitude?\n" +
                "Short black skirt, the leather jacket too\n" +
                "How could I ever be mad at you?\n" +
                "When I know (oh, oh)\n" +
                "\n" +
                "Yeah\n" +
                "\n" +
                "Well I know all about your secrets\n" +
                "Cause you know that I can keep them\n" +
                "Babe how can't you see that I'm yours (I'm yours babe)\n" +
                "\n" +
                "And all yours babe (all yours all yours)\n" +
                "And all yours babe yeah\n" +
                "And all yours babe (all yours all yours)\n" +
                "And all yours babe yeah\n" +
                "\n" +
                "I could open up your door like a gentleman\n" +
                "If you open up your heart and just let me in\n" +
                "Tell me what you need girl I will never disappoint you\n" +
                "\n" +
                "Woah\n" +
                "\n" +
                "And if you ride with me I can show you babe\n" +
                "And nobody gonna know you like I know you babe\n" +
                "We can fly away, fly, fly away\n" +
                "I adore ya (I adore ya)\n" +
                "\n" +
                "Woah\n" +
                "\n" +
                "Walkin around with a little attitude?\n" +
                "Short black skirt, the leather jacket too\n" +
                "How could I ever be mad at you?\n" +
                "When I know (oh, oh)\n" +
                "\n" +
                "Yeah\n" +
                "\n" +
                "Well I know all about your secrets\n" +
                "Cause you know that I can keep them\n" +
                "Babe how can't you see I'm yours (I'm yours babe)\n" +
                "\n" +
                "And all yours babe (all yours all yours)\n" +
                "And all yours babe yeah\n" +
                "And all yours babe (all yours all yours)\n" +
                "And all yours babe yeah";
        intentactivity(view);
    }

    public void A(View view) {
        Global.lyrics = "\"Alone\"\n" +
                "\n" +
                "We were inseparable (inseparable)\n" +
                "Everything I had to do, I did it next to you (next to you)\n" +
                "And the memories we made were so incredible\n" +
                "Then our love was interrupted by my schedule\n" +
                "\n" +
                "There was nothing that I could do\n" +
                "Cause you fell into the deepest depression baby\n" +
                "And I hate to know I'm responsible\n" +
                "And your heart filled up with so much aggression baby, you got used to\n" +
                "\n" +
                "Being alone, alone\n" +
                "You adapted, now you're used to\n" +
                "Being alone, all alone\n" +
                "Ooh you got used to being on your own\n" +
                "\n" +
                "I saw it happening\n" +
                "But I didn't accept the truth, I couldn't fathom it\n" +
                "There was so much going on you couldn't handle it\n" +
                "Could have divided my time, I should have rationed it \n" +
                "\n" +
                "There was nothing that I could do \n" +
                "Cause you fell into the deepest depression baby\n" +
                "And I hate to know I'm responsible\n" +
                "And your heart filled up with so much aggression baby, you got used to\n" +
                "\n" +
                "You got used to being alone (alone), alone (all alone)\n" +
                "You adapted (you adapted) now you're used to (forgive me for you)\n" +
                "being alone, all alone (didn't mean to leave you lonely girl)\n" +
                "Oooh you got used to being (used to) on your own\n" +
                "(All on your own)\n" +
                "\n";
        intentactivity(view);
    }

    public void ALYL(View view) {
        Global.lyrics = "\"As Long As You Love Me\"\n" +
                "(feat. Big Sean)\n" +
                "\n" +
                "As long as you love me [3x]\n" +
                "\n" +
                "We're under pressure,\n" +
                "Seven billion people in the world trying to fit in\n" +
                "Keep it together,\n" +
                "Smile on your face even though your heart is frowning (frowning)\n" +
                "But hey now (hey now), you know, girl (know girl),\n" +
                "We both know it's a cruel world\n" +
                "But I will take my chances\n" +
                "\n" +
                "As long as you love me\n" +
                "We could be starving, we could be homeless, we could be broke\n" +
                "As long as you love me\n" +
                "I'll be your platinum, I'll be your silver, I'll be your gold\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me (love me)\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me (love me)\n" +
                "\n" +
                "I'll be your soldier,\n" +
                "Fighting every second of the day for your dreams, girl\n" +
                "I'll be your Hova\n" +
                "You could be my Destiny's Child on the scene girl\n" +
                "So don't stress (don't stress), don't cry (don't cry), we don't need no wings to fly\n" +
                "Just take my hand\n" +
                "\n" +
                "As long as you love me\n" +
                "We could be starving, we could be homeless, we could be broke\n" +
                "As long as you love me\n" +
                "I'll be your platinum, I'll be your silver, I'll be your gold\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me (love me)\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me (love me)\n" +
                "\n" +
                "[Big Sean]\n" +
                "Yo, B-I-G\n" +
                "I don't know if this makes sense, but you're my hallelujah\n" +
                "Give me a time and place, and I'll rendezvous it,I'll fly you to it,\n" +
                "I'll beat you there\n" +
                "Girl you know I got you\n" +
                "Us, trust...\n" +
                "A couple of things I can't spell without 'U'\n" +
                "Now we are on top of the world, 'cause that's just how we do (do it)\n" +
                "Used to tell me, \"Sky's the limit\", now the sky's our point of view (view)\n" +
                "Man now we stepping out like, \"Whoa\" (Oh God)\n" +
                "Cameras point and shoot (shoot)\n" +
                "Ask me what's my best side, I stand back and point at you\n" +
                "You, you the one that I argue with, I feel like I need a new girl to be bothered with,\n" +
                "But the grass ain't always greener on the other side,\n" +
                "It's green where you water it\n" +
                "So I know we got issues baby true, true, true,\n" +
                "But I'd rather work on this with you\n" +
                "Than to go ahead and start with someone new\n" +
                "As long as you love me\n" +
                "\n" +
                "As long as you love me (love me yeah yeah yeah)\n" +
                "We could be starving, we could be homeless, we could be broke\n" +
                "As long as you love me\n" +
                "I'll be your platinum (platinum), I'll be your silver, I'll be your gold\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me (I'll be your silver, I'll be your gold)\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love\n" +
                "As long as you love, love, love, love me\n" +
                "As long as you love me (that's all I want baby)\n" +
                "As long as you love, love, love, love me\n" +
                "As long as you love, love, love, love me (please don't go)\n" +
                "As long as you love me\n" +
                "As long as you love me\n";
        intentactivity(view);
    }

    public void ALYLa(View view) {
        Global.lyrics = "\"As Long As You Love Me (Acoustic Version)\"\n" +
                "\n" +
                "As long as you love me\n" +
                "\n" +
                "We're under pressure,\n" +
                "Seven billion people in the world trying to fit in\n" +
                "Keep it together,\n" +
                "Smile on your face even though your heart is frowning\n" +
                "But hey now, you know, girl,\n" +
                "We both know it's a cruel world\n" +
                "But I will take my chances\n" +
                "\n" +
                "As long as you love me\n" +
                "We could be starving,\n" +
                "We could be homeless,\n" +
                "We could be broke\n" +
                "As long as you love me\n" +
                "I'll be your platinum,\n" +
                "I'll be your silver,\n" +
                "And I'll be your gold\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me (love me)\n" +
                "\n" +
                "I'll be your soldier,\n" +
                "Fighting every second of the day for your dreams, girl\n" +
                "I'll be your Hova\n" +
                "You could be my Destiny's Child on the scene girl\n" +
                "Don't stress, don't cry, we don't need no wings to fly\n" +
                "Just take my hand\n" +
                "\n" +
                "As long as you love me\n" +
                "We could be starving,\n" +
                "We could be homeless,\n" +
                "We could be broke\n" +
                "As long as you love me\n" +
                "I'll be your platinum,\n" +
                "I'll be your silver,\n" +
                "And I'll be your gold\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me (love me)\n" +
                "\n" +
                "I don't know if this makes sense, but you're my hallelujah\n" +
                "Give me a time and place, and I'll rendezvous, and I'll fly you to it,\n" +
                "I'll beat you there\n" +
                "Girl you know I got you\n" +
                "Us, trust...\n" +
                "A couple of things I can't spell without 'U'\n" +
                "Now we are on top of the world, 'cause that's just how we do\n" +
                "Used to tell me, \"Sky's the limit\", now the sky's our point of view\n" +
                "Now we stepping out like, \"Oh God\"\n" +
                "Cameras point and shoot\n" +
                "Ask me what's my best side, I stand back and point at you\n" +
                "You, you the one that I argue with, I feel like I need a new girl to be bothering with,\n" +
                "But the grass ain't always greener on the other side,\n" +
                "It's green where you water it\n" +
                "So I know we got issues baby true, true, true,\n" +
                "But I'd rather work on this with you\n" +
                "Than to go ahead and start with someone new\n" +
                "\n" +
                "As long as you love me\n" +
                "We could be starving,\n" +
                "We could be homeless,\n" +
                "We could be broke\n" +
                "As long as you love me\n" +
                "I'll be your platinum,\n" +
                "I'll be your silver,\n" +
                "I'll be your gold\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me\n" +
                "As long as you lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-lo-love me\n" +
                "\n" +
                "As long as you love, you love me, you love me,\n" +
                "As long as you love, you love me, you love me,\n" +
                "As long as you love me\n" +
                "\n";
        intentactivity(view);
    }

    public void B(View view) {
        Global.lyrics = "\"Baby\"\n" +
                "(feat. Ludacris)\n" +
                "\n" +
                "Oh whoa [x3]\n" +
                "\n" +
                "You know you love me, I know you care\n" +
                "Just shout whenever, and I'll be there\n" +
                "You are my love, you are my heart\n" +
                "And we would never ever ever be apart\n" +
                "\n" +
                "Are we an item? Girl, quit playing\n" +
                "We're just friends, what are you saying?\n" +
                "Say there's another and look right in my eyes\n" +
                "My first love broke my heart for the first time\n" +
                "And I was like...\n" +
                "\n" +
                "Baby, baby, baby oooh\n" +
                "Like baby, baby, baby nooo\n" +
                "Like baby, baby, baby oooh\n" +
                "I thought you'd always be mine (mine)\n" +
                "\n" +
                "Baby, baby, baby oooh\n" +
                "Like baby, baby, baby nooo\n" +
                "Like baby, baby, baby oooh\n" +
                "I thought you'd always be mine (mine)\n" +
                "\n" +
                "Oh, for you I would have done whatever\n" +
                "And I just can't believe we ain't together\n" +
                "And I wanna play it cool, but I'm losin' you\n" +
                "I'll buy you anything, I'll buy you any ring\n" +
                "And I'm in pieces, baby fix me\n" +
                "And just shake me 'til you wake me from this bad dream\n" +
                "I'm going down, down, down, down\n" +
                "And I just can't believe my first love won't be around\n" +
                "\n" +
                "And I'm like\n" +
                "Baby, baby, baby oooh\n" +
                "Like baby, baby, baby nooo\n" +
                "Like baby, baby, baby oooh\n" +
                "I thought you'd always be mine (mine)\n" +
                "\n" +
                "Baby, baby, baby oooh\n" +
                "Like baby, baby, baby nooo\n" +
                "Like baby, baby, baby oooh\n" +
                "I thought you'd always be mine (mine)\n" +
                "\n" +
                "[Ludacris:]\n" +
                "Luda! When I was 13, I had my first love,\n" +
                "There was nobody that compared to my baby\n" +
                "And nobody came between us or could ever come above\n" +
                "She had me going crazy, oh, I was star-struck,\n" +
                "She woke me up daily, don't need no Starbucks.\n" +
                "She made my heart pound, it skipped a beat when I see her in the street and\n" +
                "At school on the playground but I really wanna see her on the weekend.\n" +
                "She knows she got me dazing cause she was so amazing\n" +
                "And now my heart is breaking but I just keep on saying...\n" +
                "\n" +
                "Baby, baby, baby oooh\n" +
                "Like baby, baby, baby nooo\n" +
                "Like baby, baby, baby oooh\n" +
                "I thought you'd always be mine (mine)\n" +
                "\n" +
                "Baby, baby, baby oooh\n" +
                "Like baby, baby, baby nooo\n" +
                "Like baby, baby, baby oooh\n" +
                "I thought you'd always be mine (mine)\n" +
                "\n" +
                "I'm gone (Yeah Yeah Yeah, Yeah Yeah Yeah)\n" +
                "Now I'm all gone (Yeah Yeah Yeah, Yeah Yeah Yeah)\n" +
                "Now I'm all gone (Yeah Yeah Yeah, Yeah Yeah Yeah)\n" +
                "Now I'm all gone (gone, gone, gone...)\n" +
                "I'm gone\n";
        intentactivity(view);
    }

    public void BP(View view) {
        Global.lyrics = "\"Backpack\"\n" +
                "(feat. Lil Wayne)\n" +
                "\n" +
                "You said, \"I come in peace,\" so I took you home\n" +
                "I gave you food and I gave you clothes\n" +
                "I taught you how to move your feet when the rhythm's on\n" +
                "Still you wanna leave cause you feel alone\n" +
                "\n" +
                "You don't know what they're like if they know that you're alive\n" +
                "They're gonna try to take away the secrets of your planet's life\n" +
                "I know you must be upset, you lost your family in a wreck\n" +
                "But you gotta listen (listen, listen)\n" +
                "\n" +
                "Don't try to find your spaceship\n" +
                "They might be out there waiting\n" +
                "Stay in my backpack forever\n" +
                "Stay in my backpack forever\n" +
                "You know I gotta find my spaceship\n" +
                "My planet's outside there waiting\n" +
                "I can't stay in your backpack forever\n" +
                "Stay in your backpack, backpack, backpack\n" +
                "\n" +
                "Before you came around I was in a rut\n" +
                "Didn't have a friend, didn't know what it was\n" +
                "You taught me how to dream and how to love\n" +
                "You're my best friend, please listen to me\n" +
                "\n" +
                "You don't know what they're like if they know that you're alive\n" +
                "They're gonna try to take away the secrets of your planet's life\n" +
                "I know you must be upset, you lost your family in a wreck\n" +
                "But you gotta listen (listen, listen)\n" +
                "\n" +
                "Don't try to find your spaceship\n" +
                "They might be out there waiting\n" +
                "Stay in my backpack forever\n" +
                "Stay in my backpack forever\n" +
                "You know I gotta find my spaceship\n" +
                "My planet's outside there waiting\n" +
                "I can't stay in your backpack forever\n" +
                "Stay in your backpack, backpack, backpack\n" +
                "\n" +
                "[Lil Wayne:]\n" +
                "Uh, greetings, I fell from the sky\n" +
                "I'm from a different world, I use Lil Wayne as a disguise\n" +
                "And my flying saucer crashed, I'm the only one that survived\n" +
                "I've only taken over this planet since I've arrived\n" +
                "I'm in the backpack, I'm ducking Men In Black\n" +
                "Yeah, I'm an alien, my swag is outta this world\n" +
                "Different galaxy, they try to capture me\n" +
                "When I die they gon' name this planet after me\n" +
                "Wayne's world (Wayne's world, Wayne's world)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Don't try to find your spaceship\n" +
                "They might be out there waiting\n" +
                "Stay in my backpack forever\n" +
                "Stay in my backpack forever\n" +
                "You know I gotta find my spaceship\n" +
                "My planet's outside there waiting\n" +
                "I can't stay in your backpack forever\n" +
                "Stay in your backpack, backpack, backpack\n" +
                "\n" +
                "In our planet we don't kill one another\n" +
                "We don't take love for granted, it's a gift from the mother land,\n" +
                "In your planet you are filled with greed and false belief\n" +
                "We came here to bring you peace\n" +
                "\n";
        intentactivity(view);
    }

    public void BD(View view) {
        Global.lyrics = "\"Bad Day\"\n" +
                "\n" +
                "No I didn't think you would let me down that easy\n" +
                "Oh no girl\n" +
                "And I didn't think it was over until you walked away\n" +
                "Like it was nothing, baby\n" +
                "\n" +
                "And that moment was so hard for me to breathe, yeah\n" +
                "Cause you took away the biggest part of me, yeah\n" +
                "Life is so unpredictable, yeah\n" +
                "Never thought a love like yours would leave me all alone oh no\n" +
                "\n" +
                "Didn't waste any time\n" +
                "Like you had already made up your mind\n" +
                "No sympathy\n" +
                "Cause I was out of line, oh yeah\n" +
                "\n" +
                "But I didn't think you would let me down that easy\n" +
                "Oh no girl\n" +
                "And I didn't think it was over until you walked away\n" +
                "Like it was nothing girl\n" +
                "\n" +
                "It was a bad day!\n" +
                "Hey hey hey...\n" +
                "I know I was wrong\n" +
                "But you could've said goodbye baby\n" +
                "It was a bad day\n" +
                "Now I'm like whoa\n" +
                "\n" +
                "It was a bad day\n" +
                "It was a bad day\n" +
                "It was a bad day";
        intentactivity(view);
    }

    public void BA(View view) {
        Global.lyrics = "\"Be Alright\"\n" +
                "\n" +
                "Across the ocean, across the sea,\n" +
                "Starting to forget the way you look at me now\n" +
                "Over the mountains, across the sky,\n" +
                "Need to see your face, I need to look in your eyes\n" +
                "\n" +
                "Through the storm and through the clouds\n" +
                "Bumps on the road and upside down now\n" +
                "I know it's hard, babe, to sleep at night\n" +
                "Don't you worry\n" +
                "'cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the sorrow, and the fights,\n" +
                "Don't you worry\n" +
                "'cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "All alone, in my room\n" +
                "Waiting for your phone call to come soon\n" +
                "And for you, oh, I would walk a thousand miles,\n" +
                "To be in your arms, holding my heart\n" +
                "\n" +
                "Oh, I,\n" +
                "Oh, I,\n" +
                "I love you\n" +
                "And everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the long nights\n" +
                "And the bright lights\n" +
                "Don't you worry\n" +
                "'cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "You know that I care for you\n" +
                "I'll always be there for you\n" +
                "I promise I will stay right here, yeah\n" +
                "\n" +
                "I know that you want me too,\n" +
                "Baby we can make it through anything\n" +
                "'Cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the sorrow, and the fights,\n" +
                "Don't you worry\n" +
                "'cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the sorrow, and the fights,\n" +
                "Don't you worry\n" +
                "Everything's gonna be alright\n";
        intentactivity(view);
    }

    public void BAa(View view) {
        Global.lyrics = "\"Be Alright (Acoustic Version)\"\n" +
                "\n" +
                "Damn, I miss you\n" +
                "\n" +
                "Across the ocean, across the sea\n" +
                "Starting to forget the way you look at me now\n" +
                "Over the mountains, across the sky\n" +
                "Need to see your face, I need to look in your eyes\n" +
                "\n" +
                "Through the storm and through the clouds\n" +
                "Bumps on the road and we're upside down\n" +
                "I know it's hard, babe, to sleep at night\n" +
                "Don't you worry\n" +
                "'Cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the long nights\n" +
                "And the bright lights\n" +
                "Don't you worry\n" +
                "'Cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the long nights\n" +
                "And the bright lights\n" +
                "Don't you worry\n" +
                "'Cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "All alone, in my room..\n" +
                "Waiting for your phone call to come soon\n" +
                "And for you, oh, I would walk a thousand miles\n" +
                "To be in your arms, holding my heart\n" +
                "\n" +
                "Oh I\n" +
                "Oh I\n" +
                "(Oh I)\n" +
                "Love you\n" +
                "And everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "You know that I care for you\n" +
                "I'll always be there for you\n" +
                "I promise I will stay right here, yeah\n" +
                "\n" +
                "I know that you want me too\n" +
                "Baby we can make it through.. anything\n" +
                "'Cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the long lights, and the bright lights\n" +
                "Don't you worry\n" +
                "'Cause everything's gonna be alright, ai-ai-ai-aight\n" +
                "Be alright, ai-ai-ai-aight\n" +
                "\n" +
                "Through the long lights, and the bright lights\n" +
                "Don't you worry\n" +
                "'Cause everything's gonna be alright\n";
        intentactivity(view);
    }

    public void BAB(View view) {
        Global.lyrics = "\"Beauty And A Beat\"\n" +
                "(feat. Nicki Minaj)\n" +
                "\n" +
                "Yeah, Young Money, Nicki Minaj, Justin\n" +
                "\n" +
                "Show you off, tonight I wanna show you off (eh, eh, eh)\n" +
                "What you got, a billion could've never bought (eh, eh, eh)\n" +
                "\n" +
                "We gonna party like it's 3012 tonight\n" +
                "I wanna show you all the finer things in life\n" +
                "So just forget about the world, we're young tonight\n" +
                "I'm coming for ya, I'm coming for ya\n" +
                "\n" +
                "Cause all I need\n" +
                "Is a beauty and a beat\n" +
                "Who can make my life complete\n" +
                "It's all about you,\n" +
                "When the music makes you move\n" +
                "Baby, do it like you do\n" +
                "Cause...\n" +
                "\n" +
                "[Beat break]\n" +
                "\n" +
                "Body rock, girl, I can feel your body rock (eh, eh, eh)\n" +
                "Take a bow, you're on the hottest ticket now, oh (eh, eh, eh)\n" +
                "\n" +
                "We gonna party like it's 3012 tonight\n" +
                "I wanna show you all the finer things in life\n" +
                "So just forget about the world, we're young tonight\n" +
                "I'm coming for ya, I'm coming for ya\n" +
                "\n" +
                "Cause all I need\n" +
                "Is a beauty and a beat\n" +
                "Who can make my life complete\n" +
                "It's all about you,\n" +
                "When the music makes you move\n" +
                "Baby, do it like you do\n" +
                "\n" +
                "[Nicki Minaj]\n" +
                "In time, ink lines, bitches couldn't get on my incline\n" +
                "World tours, it's mine, ten little letters, on a big sign\n" +
                "Justin Bieber, you know I'mma hit 'em with the ether\n" +
                "Buns out, wiener, but I gotta keep an eye out for Selener\n" +
                "Beauty, beauty and the beast\n" +
                "Beauty from the east, beautiful confessions of the priest\n" +
                "Beast, beauty from the streets, we don't get deceased\n" +
                "Every time a beauty on the beats\n" +
                "\n" +
                "(Yeah, yeah, yeah, yeah, let's go, let's go)\n" +
                "Body rock, girl, I wanna feel your body rock\n" +
                "\n" +
                "Cause all... (all I need is love) I need\n" +
                "Is a beauty and a beat\n" +
                "Who can make my life complete\n" +
                "It's all... (all I need is you) about you,\n" +
                "When the music makes you move\n" +
                "Baby, do it like you do\n" +
                "Cause...";
        intentactivity(view);
    }

    public void BABa(View view) {
        Global.lyrics = "\"Beauty And A Beat (Acoustic Version)\"\n" +
                "\n" +
                "Oh oh\n" +
                "Show you off, tonight I wanna show you off\n" +
                "What you got, a billion could've never bought, oh, oh\n" +
                "\n" +
                "We gonna party like it's 3012 tonight\n" +
                "I wanna show you all the finer things in life\n" +
                "So just forget about the world, we're young tonight\n" +
                "I'm coming for ya, I'm coming for ya\n" +
                "\n" +
                "'Cause all I need\n" +
                "Is a beauty and a beat\n" +
                "Who can make my life complete, whoa, oh.\n" +
                "It's all 'bout you\n" +
                "When the music makes you move\n" +
                "Baby, do it like you do, whoa, oh, oh\n" +
                "\n" +
                "Body rock, I wanna feel your body rock, oh, oh.\n" +
                "Take a bow, girl on the hottest ticket now, oh, oh\n" +
                "\n" +
                "We gonna party like it's 3012 tonight\n" +
                "I wanna show you all the finer things in life\n" +
                "So just forget about the world, we're young tonight\n" +
                "I'm coming for ya, I'm coming for ya\n" +
                "\n" +
                "'Cause all I need\n" +
                "Is a beauty and a beat\n" +
                "Who can make my life complete, whoa, oh.\n" +
                "It's all 'bout you\n" +
                "When the music makes you move\n" +
                "Baby, do it like you do, whoa, oh, oh, oh\n";
        intentactivity(view);
    }

    public void BY(View view) {
        Global.lyrics = "\"Been You\"\n" +
                "\n" +
                "Feeling the remnants, caught in an instance\n" +
                "Blink of an eye, no goodbye\n" +
                "I had a notion, deep as the ocean\n" +
                "Blue like the sky, oh my\n" +
                "\n" +
                "Like a permanent stain\n" +
                "Wishing I could've just wash away, away\n" +
                "Prayed our love wasn't vain\n" +
                "Who was to blame for all the pain? For all the pain?\n" +
                "\n" +
                "If I would've known,\n" +
                "If I would've known, if I would have known it could have been you\n" +
                "If I had the chance, if I had the chance I'd make us brand new\n" +
                "I never wanted to be—wanted to be your enemy, no,\n" +
                "But if I, if I would've known\n" +
                "If I would have known it could have been you, been you\n" +
                "\n" +
                "The repercussions, I'm missing your loving\n" +
                "Haunts me tonight,\n" +
                "The ghosts are alive\n" +
                "All of the memories\n" +
                "Of serenity\n" +
                "Dwindle in my mind\n" +
                "All the time\n" +
                "\n" +
                "Like a permanent stain\n" +
                "Wishing I could've just wash away, away\n" +
                "Prayed our love wasn't vain\n" +
                "Who was to blame for all the pain? For all the pain?\n" +
                "\n" +
                "If I would've known,\n" +
                "If I would've known, if I would have known it could have been you\n" +
                "If I had the chance, if I had the chance I'd make us brand new\n" +
                "I never wanted to be—wanted to be your enemy, no,\n" +
                "But if I, if I would've known\n" +
                "If I would have known it could have been you, been you\n" +
                "\n" +
                "If I would've known,\n" +
                "If I would've known, if I would have known it could have been you\n" +
                "If I had the chance, if I had the chance I'd make us brand new\n" +
                "I never wanted to be—wanted to be your enemy, no,\n" +
                "But if I, if I would've known\n" +
                "If I would have known it could have been you, been you\n";

    }


    public void BE(View view) {
        Global.lyrics = "\"Believe\"\n" +
                "\n" +
                "(Believe)\n" +
                "Believe, believe, believe\n" +
                "\n" +
                "I don't know how I got here\n" +
                "I knew it wouldn't be easy\n" +
                "But your faith in me was so clear\n" +
                "It didn't matter how many times I got knocked on the floor\n" +
                "But you knew one day I would be standing tall\n" +
                "Just look at me now\n" +
                "\n" +
                "Cause everything starts from something\n" +
                "But something would be nothing\n" +
                "Nothing if your heart didn't dream with me\n" +
                "Where would I be, if you didn't believe\n" +
                "(Believe)\n" +
                "Believe...\n" +
                "\n" +
                "There were days when I was just broken, you know\n" +
                "There were nights when I was doubting myself\n" +
                "But you kept my heart from falling\n" +
                "It didn't matter how many times I got knocked on the floor\n" +
                "But you knew one day I would be standing tall\n" +
                "Just look at us now\n" +
                "\n" +
                "Cause everything starts from something\n" +
                "But something would be nothing\n" +
                "Nothing if your heart didn't dream with me\n" +
                "Where would I be, if you didn't believe\n" +
                "\n" +
                "[Gospel]\n" +
                "Where would I be, if you, if you\n" +
                "If you didn't believe\n" +
                "Would I know how it feels to\n" +
                "Touch the sky, if you didn't believe\n" +
                "Believe, believe\n" +
                "\n" +
                "It didn't matter how many times I got knocked on the floor\n" +
                "You knew one day I would be standing tall\n" +
                "Just look at us now\n" +
                "\n" +
                "Cause everything starts from something\n" +
                "But something would be nothing\n" +
                "Nothing if your heart didn't dream with me\n" +
                "\n" +
                "Cause everything starts from something\n" +
                "But something would be nothing\n" +
                "Nothing if your heart didn't dream with me\n" +
                "Where would I be, if you didn't believe\n" +
                "\n" +
                "[Gospel]\n" +
                "Where would I be, if you\n" +
                "If you didn't believe\n" +
                "Would I know how it feels to\n" +
                "Touch the sky, if you didn't believe\n" +
                "Believe, believe\n" +
                "\n" +
                "Where would I be, if you didn't believe";
        intentactivity(view);
    }

    public  void  BG(View view)
    {
        Global.lyrics="\"Bigger\"\n" +
                "\n" +
                "Love you\n" +
                "\n" +
                "The love, the love is bigger,\n" +
                "The love, the love is bigger,\n" +
                "The love, the love is bigger, big\n" +
                "\n" +
                "Gotta believe in me (gotta believe in me)\n" +
                "Believe me like a fairy tale (yeah)\n" +
                "Put your tooth under your pillowcase\n" +
                "No, I won't, I won't ever, ever let you down (no)\n" +
                "Like a see saw lets you down (oh) you know why\n" +
                "Cause we ain't on the playground no more baby\n" +
                "\n" +
                "We're big enough to stand in the picture\n" +
                "We're big enough to stand next to love\n" +
                "\n" +
                "I was a player when I was little\n" +
                "But now I'm bigger, I'm bigger\n" +
                "A heart breaker when I was little\n" +
                "But I'm bigger (I'm bigger), I'm bigger\n" +
                "And all the haters, I swear,\n" +
                "They look so small from up here\n" +
                "Cause we're bigger, our love's bigger\n" +
                "I'm bigger and you're bigger\n" +
                "\n" +
                "Whoa, remember when my heart was young\n" +
                "It was still bigger than me (still bigger than me)\n" +
                "Is that the reason that you stayed\n" +
                "Most would've got rid of me\n" +
                "Now the bullies in the school yard\n" +
                "Can't take our hugs and our kisses from us\n" +
                "Because we ain't push-overs, no more baby,\n" +
                "\n" +
                "We're big enough to stand in the picture\n" +
                "We're big enough to stand next to love\n" +
                "\n" +
                "I was a player when I was little\n" +
                "But now I'm bigger, I'm bigger\n" +
                "A heart breaker when I was little\n" +
                "But I'm bigger (I'm bigger), I'm bigger\n" +
                "And all the haters, I swear\n" +
                "They look so small from up here\n" +
                "Cause we're bigger, our love's bigger\n" +
                "I'm bigger and you're bigger\n" +
                "\n" +
                "Whoa, I was a player when I was little\n" +
                "But now I'm bigger, I'm bigger (hey)\n" +
                "A heart breaker when I was little\n" +
                "But I'm bigger (I'm bigger), I'm bigger\n" +
                "And all the haters, I swear\n" +
                "They look so small from up here\n" +
                "Cause we're bigger, our love's bigger\n" +
                "I'm bigger and you're bigger\n" +
                "\n" +
                "Whoa,\n" +
                "(Remember those stroll down street) I remember that\n" +
                "(don't knock ya earrings) like yesterday\n" +
                "(They shine on me) we were little then\n" +
                "(in class daydreamed about you) my baby\n" +
                "Just remember\n" +
                "You wow wow (You wow wow)\n" +
                "Since then all I can remember is the love's only gotten bigger\n" +
                "\n" +
                "I was a player when I was little\n" +
                "But I'm bigger, I'm bigger\n" +
                "A heart breaker when I was little\n" +
                "But I'm bigger, I'm bigger\n" +
                "And all the haters, I swear\n" +
                "They look so small from up here\n" +
                "Cause we're bigger, our love's bigger\n" +
                "I'm bigger and you're bigger\n" +
                "\n" +
                "I was a player when I was little\n" +
                "But I'm bigger, I'm bigger (hey)\n" +
                "A heart breaker when I was little\n" +
                "But I'm bigger, I'm bigger (heart breaker)\n" +
                "And all the haters, I swear\n" +
                "They look so small from up here\n" +
                "Cause we're bigger, our love's bigger\n" +
                "I'm bigger and you're bigger";
        intentactivity(view);
    }
    public  void BTBS(View view)
    {
        Global.lyrics="\"Born To Be Somebody\"\n" +
                "\n" +
                "There's a dream in my soul\n" +
                "A fire that's deep inside me\n" +
                "There's a me no one knows\n" +
                "Waiting to be set free\n" +
                "\n" +
                "I'm gonna see that day\n" +
                "I can feel it, I can taste it\n" +
                "Change is, coming my way\n" +
                "\n" +
                "I was born to be somebody\n" +
                "Ain't nothing that's ever gonna stop me\n" +
                "I'll light up the sky like lightning\n" +
                "I'm gonna rise above\n" +
                "Show 'em what I'm made of\n" +
                "I was born to be somebody\n" +
                "I was born to be\n" +
                "And this world will belong to me\n" +
                "\n" +
                "This life can kick you around (whoa)\n" +
                "This world can make you feel small (whoa)\n" +
                "They will not keep me down (whoa)\n" +
                "I was born to stand tall\n" +
                "\n" +
                "I'm going all the way\n" +
                "I can feel it, I believe it\n" +
                "I'm here, I'm here to stay\n" +
                "\n" +
                "I was born to be somebody\n" +
                "Ain't nothing that's ever gonna stop me\n" +
                "I'll light up the sky like lightning\n" +
                "I'm gonna rise above\n" +
                "Show 'em what I'm made of\n" +
                "I was born to be somebody\n" +
                "I was born to be\n" +
                "And this world will belong to me\n" +
                "\n" +
                "Feel it\n" +
                "Believe it\n" +
                "Dream it\n" +
                "Be it\n" +
                "\n" +
                "I was born to be somebody (born to be, yeah!)\n" +
                "Ain't nothing that's ever gonna stop me (no, no, woah)\n" +
                "I'll light up the sky like lightning\n" +
                "I'm gonna rise above\n" +
                "Show 'em what I'm made of\n" +
                "I was born to be somebody\n" +
                "I was born to be\n" +
                "And this world will belong to me\n" +
                "\n" +
                "Oh, oh\n" +
                "And this world will belong to me\n" +
                "Yeah, yeah, oh\n" +
                "This world will belong to me";
        intentactivity(view);
    }
    public  void  BF(View view)
    {
        Global.lyrics="\"Boyfriend\"\n" +
                "\n" +
                "[Verse 1:]\n" +
                "If I was your boyfriend, I'd never let you go\n" +
                "I can take you places you ain't never been before\n" +
                "Baby, take a chance or you'll never ever know\n" +
                "I got money in my hands that I'd really like to blow\n" +
                "Swag, swag, swag, on you\n" +
                "Chillin' by the fire while we eatin' fondue\n" +
                "I don't know about me but I know about you\n" +
                "So say hello to falsetto in three, two, swag\n" +
                "\n" +
                "[Pre-chorus:]\n" +
                "I'd like to be everything you want\n" +
                "Hey girl, let me talk to you\n" +
                "\n" +
                "[Chorus:]\n" +
                "If I was your boyfriend, never let you go\n" +
                "Keep you on my arm girl, you'd never be alone\n" +
                "I can be a gentleman, anything you want\n" +
                "If I was your boyfriend, I'd never let you go, I'd never let you go\n" +
                "\n" +
                "[Verse 2:]\n" +
                "Tell me what you like yeah tell me what you don't\n" +
                "I could be your Buzz Lightyear, fly across the globe\n" +
                "I don't ever wanna fight yeah, you already know\n" +
                "I'mma make you shine bright like you're laying in the snow\n" +
                "Burr\n" +
                "Girlfriend, girlfriend, you could be my girlfriend\n" +
                "You could be my girlfriend until the w-w-world ends\n" +
                "Make you dance do a spin and a twirl and\n" +
                "Voice going crazy on this hook like a whirlwind\n" +
                "Swaggy\n" +
                "\n" +
                "[Pre-chorus:]\n" +
                "I'd like to be everything you want\n" +
                "Hey girl, let me talk to you\n" +
                "\n" +
                "[Chorus:]\n" +
                "If I was your boyfriend, never let you go\n" +
                "Keep you on my arm girl, you'd never be alone\n" +
                "I can be a gentleman, anything you want\n" +
                "If I was your boyfriend, I'd never let you go, I'd never let you go\n" +
                "\n" +
                "[Bridge:]\n" +
                "So give me a chance, 'cause you're all I need girl\n" +
                "Spend a week with your boy I'll be calling you my girlfriend\n" +
                "If I was your man (if I was your man), I'd never leave you girl\n" +
                "I just want to love and treat you right\n" +
                "\n" +
                "[Chorus:]\n" +
                "If I was your boyfriend (boyfriend), never let you go\n" +
                "Keep you on my arm girl, you'd never be alone (never be alone)\n" +
                "I can be a gentleman (gentleman), anything you want\n" +
                "If I was your boyfriend (boyfriend), I'd never let you go, never let you go\n" +
                "\n" +
                "Na, na, na, na, na, na, na, na, na, na ey\n" +
                "Yeah girl\n" +
                "Na, na, na, na, na, na, na, na, na ey\n" +
                "If I was your boyfriend\n" +
                "Na, na, na, na, na, na, na, na, na ey\n" +
                "Na, na, na, na, na, na, na, na, na ey\n" +
                "If I was your boyfriend";
        intentactivity(view);
    }

    public  void BFa(View view)
    {
        Global.lyrics="\"Boyfriend (Acoustic Version)\"\n" +
                "\n" +
                "[Verse 1]\n" +
                "If I was your boyfriend, I’d never let you go\n" +
                "I can take you places you ain't never been before\n" +
                "Baby, take a chance or you’ll never ever know\n" +
                "I got money in my hands that I’d really like to blow on you\n" +
                "Chillin' by the fire while we eatin’ fondue\n" +
                "I don't know about me but I know about you\n" +
                "So say hello to falsetto in three, two, swag\n" +
                "\n" +
                "[Pre-Chorus]\n" +
                "I’d like to be everything you want\n" +
                "Hey girl, let me talk to you\n" +
                "\n" +
                "[Chorus]\n" +
                "If I was your boyfriend, never let you go\n" +
                "Keep you on my arm girl, you’d never be alone\n" +
                "I can be a gentleman, anything you want\n" +
                "If I was your boyfriend, I’d never let you go\n" +
                "\n" +
                "[Verse 2]\n" +
                "Tell me what you like yeah tell me what you don’t\n" +
                "I could be your Buzz Lightyear, fly across the globe\n" +
                "I don’t ever wanna fight yeah, you already know\n" +
                "Imma make you shine bright like you’re laying in the snow\n" +
                "Girlfriend, girlfriend, you could be my girlfriend\n" +
                "You could be my girlfriend until the w-w-world ends\n" +
                "Make you dance do a spin and a twirl and\n" +
                "Voice goin crazy on this hook like a whirlwind swaggie\n" +
                "\n" +
                "[Pre-Chorus]\n" +
                "I’d like to be everything you want\n" +
                "Hey girl, let me talk to you\n" +
                "\n" +
                "[Chorus]\n" +
                "If I was your boyfriend, never let you go\n" +
                "Keep you on my arm girl, you’d never be alone\n" +
                "I can be a gentleman, anything you want\n" +
                "If I was your boyfriend, I’d never let you go\n" +
                "\n" +
                "[Bridge]\n" +
                "So give me a chance, ‘cause you’re all I need girl\n" +
                "Spend a week with your boy I’ll be calling you my girlfriend\n" +
                "If I was your (If I was your man), I’d never leave you girl\n" +
                "I just want...\n" +
                "\n" +
                "[Chorus]\n" +
                "If I was your boyfriend, I’d never let you go\n" +
                "Keep you on my arm girl, you’d never be alone \n" +
                "I can be a gentleman, anything you want\n" +
                "If I was your boyfriend (boyfriend), I’d never let you go\n" +
                "\n" +
                "Na na na, na na na, na na na\n" +
                "Yeah girl\n" +
                "Na na na, na na na, na na na, na na na ey\n" +
                "If I was your boyfriend never let you go\n" +
                "\n";
        intentactivity(view);
    }
    public void BR(View view)
    {
        Global.lyrics="\"Broken\"\n" +
                "(feat. Blake Kelly)\n" +
                "\n" +
                "I guess they want a reaction\n" +
                "I ain't gonna give it to em'\n" +
                "Tryn' to get at me, yeah\n" +
                "I ain't gonna feed into it\n" +
                "\n" +
                "Ooooh they been persistent\n" +
                "Tryna break me down\n" +
                "\n" +
                "Oooo I cannot be broken\n" +
                "I cannot be broken\n" +
                "Oooo I cannot be broken\n" +
                "I cannot be broken\n" +
                "\n" +
                "They can't take whats mine\n" +
                "Someone like me is hard to find\n" +
                "\n" +
                "Oooo I cannot be broken\n" +
                "Like I knew you were hoping\n" +
                "\n" +
                "Whooaa (Hoping it would change me)\n" +
                "Whooaa (Hoping it would make me loose my mind)\n" +
                "\n" +
                "I'm too strong for that\n" +
                "Know you were wrong for that\n" +
                "Listen at 4:58, As I cruise on the smooth high way\n" +
                "I ain't even tryna get away, I'm good\n" +
                "Tryna break me\n" +
                "\n" +
                "Ooooh I cannot be broken\n" +
                "I cannot be broken\n" +
                "Oooo I cannot be broken\n" +
                "I cannot be broken\n" +
                "\n" +
                "They can't take whats mine\n" +
                "Someone like me is hard to find\n" +
                "\n" +
                "Oooo I cannot be broken\n" +
                "Like I knew you were hoping\n" +
                "\n" +
                "[BLAKE KELLY]\n" +
                "Hoping and praying I really wont make it\n" +
                "All of these things they tried to forsake me\n" +
                "How you gon' play me, how you gon' break me. I've been in this shit since I was a baby\n" +
                "All of my life, been driving em' crazy, there go the Blakie, done all them ladies.\n" +
                "Drummin' the Benz, kissing Mercedes, living the life and acting so crazy.\n" +
                "Hidin' from cameras, hidin' the ladies.\n" +
                "How do you expect me not to go crazy.\n" +
                "Never been lazy, never been shady, lost a few friends the moneys still gravy.\n" +
                "Whishin' on stars that's why they still hatin'.\n" +
                "Money out front, we never be waiting.\n" +
                "Save some and invest some, just let my money be patient.\n" +
                "Its a cold world that we live in, diamonds all in my pendant.\n" +
                "They can't tell Satan whats in it, and they pray for me to be finished.\n" +
                "Haters gonna start trippin', when you don't pay them no attention.\n" +
                "Then the yachts go in my face.\n" +
                "I guarantee that I kill it.\n" +
                "Ah!\n" +
                "\n" +
                "[JUSTIN BIEBER]\n" +
                "Oooo I cannot be broken\n" +
                "I cannot be broken\n" +
                "[BK:] No\n" +
                "Oooo I cannot be broken\n" +
                "I cannot be broken\n" +
                "\n" +
                "They cant take what's mine\n" +
                "Someone like me that's hard to find\n" +
                "\n" +
                "Oooo I cannot be broken\n" +
                "I cannot\n";
        intentactivity(view);
    }
    public  void  CC(View view)
    {
        Global.lyrics="\"California Cruisin'\"\n" +
                "\n" +
                "West coast\n" +
                "This one’s for you\n" +
                "Alright\n" +
                "\n" +
                "Cause we're California cruisin’\n" +
                "California cruisin’\n" +
                "We're California cruisin’\n" +
                "Look where we got\n" +
                "California cruisin’\n" +
                "Look where we got\n" +
                "Look where we got baby\n" +
                "Look where we got\n" +
                "Look where we got baby\n" +
                "\n" +
                "Cruising down hollywood\n" +
                "Windows down, feelin' good, yeah\n" +
                "Feeling better than I’ve ever been, it must be adrenaline\n" +
                "As we're cruisin' down Sunset all night, all night\n" +
                "\n" +
                "Cause we're California cruising\n" +
                "California cruisin’\n" +
                "We're California cruisin’\n" +
                "California cruisin’\n" +
                "California cruisin’\n" +
                "Look where we got\n" +
                "Look where we got baby\n" +
                "\n" +
                "101 is backed up, Laurel canyon is a way to go\n" +
                "Windows down, matte black truck\n" +
                "I can take it where you wanna go\n" +
                "Venice beach, you can see clear, almost as pretty as you dear\n" +
                "[?] indeed, you should make it clear, roll out\n" +
                "\n" +
                "Cause we're California cruisin’\n" +
                "California cruisin’\n" +
                "We're California cruisin’\n" +
                "California cruisin’\n" +
                "Look where we got\n" +
                "Look where we got baby";
        intentactivity(view);
    }
    public  void CLWY(View view)
    {
        Global.lyrics="\"Can't Live Without You\"\n" +
                "\n" +
                "I just sit here\n" +
                "Waiting for you to call\n" +
                "And then I wonder\n" +
                "If you're even calling at all\n" +
                "\n" +
                "So many thoughts in my mind\n" +
                "Wishing you could be here all the time\n" +
                "\n" +
                "'Cause I'm lost without you\n" +
                "And I can't just doubt you\n" +
                "And there's something about you\n" +
                "I just can't live without you\n" +
                "\n" +
                "'Cause I'm lost without you\n" +
                "And I can't just doubt you\n" +
                "And there's something about you\n" +
                "I just can't live without you";
        intentactivity(view);
    }
    public  void  CF(View view)
    {
        Global.lyrics="\"Catching Feelings\"\n" +
                "\n" +
                "The sun comes up on another morning\n" +
                "My mind never wakes up without you on it\n" +
                "And it's crazy to me, I even see you in my dreams\n" +
                "Is this meant to be? Could this be happening to me?\n" +
                "\n" +
                "We were best of friends since we were this high\n" +
                "So why do I get nervous every time you walk by\n" +
                "We would be on the phone all day\n" +
                "Now I can't find the words to say to you\n" +
                "Now what am I supposed to do?\n" +
                "\n" +
                "Could it be a possibility\n" +
                "I'm trying to say what's up\n" +
                "'Cause I'm made for you, and you for me\n" +
                "Baby, now it's time for us\n" +
                "Tryna keep it all together\n" +
                "But enough is enough\n" +
                "They say we're too young for love\n" +
                "But I'm catching feelings (doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "Catching feelings (doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "\n" +
                "In my head we're already together\n" +
                "I'm good alone but with you I'm better\n" +
                "I just wanna see you smile\n" +
                "You say the word and I'll be right there\n" +
                "I ain't never going nowhere\n" +
                "\n" +
                "I'm just tryna see where this can take us\n" +
                "'Cause everything about you, girl, is so contagious\n" +
                "I think I finally got it done\n" +
                "Now all that's left to do now is get out the mirror\n" +
                "And say it to her\n" +
                "\n" +
                "Could it be a possibility\n" +
                "I'm trying to say what's up\n" +
                "'Cause I'm made for you, and you for me\n" +
                "Baby, now it's time for us\n" +
                "Tryna keep it all together\n" +
                "But enough is enough\n" +
                "They say we're too young for love\n" +
                "But I'm catching feelings (doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "Catching feelings (doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "\n" +
                "Should I tell her how I really feel (how I really feel)\n" +
                "Or should I move in close or just be still? (how will I know?)\n" +
                "'Cause if I take a chance and I touch her hand\n" +
                "Will everything change?\n" +
                "How do I know if she feels the same?\n" +
                "\n" +
                "Could it be a possibility\n" +
                "I'm trying to say what's up\n" +
                "'Cause I'm made for you, and you for me\n" +
                "Baby, now it's time for us\n" +
                "Tryna to keep it all together\n" +
                "But enough is enough\n" +
                "They say we're too young for love\n" +
                "But I'm catching feelings (doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "Catching feelings (doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "(doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "Catching feelings (doo-do-doo-doo-do-do-do-do-do-do-doo)\n" +
                "Catching feelings....\n";
        intentactivity(view);
    }
    public  void  CM(View view)
    {
        Global.lyrics="\"Change Me\"\n" +
                "\n" +
                "Girl, I’m ready, if you’re ready, now\n" +
                "Ooh, as I'm ever gonna be\n" +
                "If you're with it, then I'm with it, now\n" +
                "To accept all the responsibility\n" +
                "I'd go outta my way\n" +
                "To live by the words that you say\n" +
                "I don't wanna be the same\n" +
                "\n" +
                "Maybe you could change me\n" +
                "Maybe you could change me\n" +
                "Maybe you could be the light\n" +
                "That opens up my eyes\n" +
                "Make all my wrongs right\n" +
                "Change me, change me\n" +
                "\n" +
                "Don’t fight fire with fire\n" +
                "If I’m screaming, talk quieter\n" +
                "Understanding and patience\n" +
                "Feel the pain that I’m facing\n" +
                "Be like serenity, help re-position my mind\n" +
                "Take a chance, make a difference in my life\n" +
                "\n" +
                "Maybe you could change me\n" +
                "Maybe you could change me\n" +
                "Maybe you could be the light\n" +
                "That opens up my eyes\n" +
                "Make all my wrongs right\n" +
                "Change me, change me\n" +
                "\n" +
                "Girl, I’m ready, if you’re ready, now\n" +
                "Ooh, as I'm ever gonna be\n" +
                "If you’re with it, then I’m with it, now";
        intentactivity(view);
    }
    public  void C(View view)
    {Global.lyrics="\"Children\"\n" +
            "\n" +
            "What about the children?\n" +
            "Look at all the children we can change\n" +
            "What about a vision?\n" +
            "Be a visionary for a change\n" +
            "We're the generation\n" +
            "Who's gonna be the one to fight for it?\n" +
            "We're the inspiration\n" +
            "Do you believe enough to die for it, die for it, die for it?\n" +
            "\n" +
            "Who's got the heart? Who's got it?\n" +
            "Whose heart is the biggest?\n" +
            "Wear it on your sleeve\n" +
            "Bet we can make a difference, oh, yeah\n" +
            "Who's got the heart? Who's got it?\n" +
            "Whose heart is the biggest? Yeah\n" +
            "Wear it on your sleeve\n" +
            "Bet we can make a difference\n" +
            "Oh, yeah\n" +
            "\n" +
            "Oh, yeah\n" +
            "Who's got the heart?\n" +
            "Oh, yeah\n" +
            "Oh, yeah\n" +
            "Oh, yeah\n" +
            "\n" +
            "What about the children?\n" +
            "Look at all the children we can change\n" +
            "What about a vision?\n" +
            "Be a visionary for a change\n" +
            "We're the generation, oh, whoa\n" +
            "Who's gonna be the one to fight for it? Whoa\n" +
            "We're the inspiration\n" +
            "Do you believe enough to die for it, to die for it?\n" +
            "\n" +
            "Who's got the heart? Who's got it?\n" +
            "Whose heart is the biggest?\n" +
            "Wear it on your sleeve\n" +
            "Bet we can make a difference, oh, yeah\n" +
            "Who's got the heart? Who's got it?\n" +
            "Whose heart is the biggest?\n" +
            "Wear it on your sleeve\n" +
            "Bet we can make a difference, oh, yeah\n" +
            "\n" +
            "Oh, whoa, yeah, oh, whoa\n" +
            "Bet we can make a difference, oh, yeah\n" +
            "\n" +
            "Who's got the heart?\n" +
            "Oh, yeah\n" +
            "Oh, yeah\n" +
            "Oh, yeah\n" ;
        intentactivity(view);
    }
    public  void  CE(View view)
    {
        Global.lyrics=" I'm in love this Christmas. (yeah)\n" +
                "Just hang your stockings on the fire place.\n" +
                "You know that Santa's coming to town.\n" +
                "I'm the one who wants to take you on a sleigh right now.\n" +
                "So today is all about you baby.\n" +
                "The mistletoe can pull us closer that's what I'm waiting for.\n" +
                "It sorta feels like it's Valentine's, Valentine's.\n" +
                "So I'm entering the top of your roof, them sleigh bells is ringing.\n" +
                "I'll be up all night with you, them carols are singing.\n" +
                "Japan to Peru, baby me and you, this Christmas eve!\n" +
                "\n" +
                "[Chorus]\n" +
                "Be my date this Christmas eve!\n" +
                "Be my holiday, my dream!\n" +
                "(lay your head on me)\n" +
                "I got you baby!\n" +
                "Kissing underneath the tree,\n" +
                "I don't need no presents girl, you're everything I need!\n" +
                "Let me give you all of me, here\n" +
                "Together on this Christmas eve...\n" +
                "\n" +
                "You leave some cookies out,\n" +
                "Imma eat em all.\n" +
                "Nobody can see me but you,\n" +
                "It's so magical.\n" +
                "When we use imagination!\n" +
                "We can fly to never, neverland\n" +
                "To north pole, is that cold?\n" +
                "If you wanna go!\n" +
                "I got you baby.\n" +
                "\n" +
                "[Chorus]\n" +
                "Be my date this Christmas eve.\n" +
                "Be my holiday, my dream!\n" +
                "(lay your head on me)\n" +
                "I got you baby!\n" +
                "(WOAH! WOAH!)\n" +
                "Kissing underneath the tree,\n" +
                "I don't need no presents girl, you're everything I need.\n" +
                "Let me give you all of me, here\n" +
                "Together on this Christmas eve!...\n" +
                "\n" +
                "(Be my)\n" +
                "(Be my)\n" +
                "Christmas eve!\n" +
                "(Be my)\n" +
                "(Be my)\n" +
                "Christmas, Christmas!\n" +
                "(Be my)\n" +
                "(Be my)\n" +
                "Christmas eve!\n" +
                "I promise I won't do you wrong!!\n" +
                "\n" +
                "[Chorus]\n" +
                "Be my date this Christmas eve!\n" +
                "(BE MY BABY!)\n" +
                "Be my holiday, my dream!\n" +
                "(OOOH!)\n" +
                "(lay your head on me)\n" +
                "I got you baby!\n" +
                "(WOAH!, NO, NO, WOAH! NO!)\n" +
                "Kissing underneath the tree,\n" +
                "(I JUST HOLD YOU RIGHT!)\n" +
                "I don't need no presents girl\n" +
                "You're everything I need.\n" +
                "(OOOH!)\n" +
                "Let me give you all of me to you!\n" +
                "Together on this Christmas eve!...\n" +
                "\n" +
                "(Be my)\n" +
                "(Be my)\n" +
                "Christmas eve!\n" +
                "Be, Be,\n" +
                "(Be my)\n" +
                "(Be my)\n" +
                "Christmas eve! Be, Be, Be, Be, Be, Be, Be, Be\n" +
                "(Be my)\n" +
                "(Be my)\n" +
                "Christmas eve!\n" +
                "Be, Be!";
        intentactivity(view);
    }
    public  void  CL(View view) {
        Global.lyrics = "\"Christmas Love\"\n" +
                "\n" +
                "Baby I will not pout\n" +
                "Baby I will not cry\n" +
                "Cause I got your love this christmas time\n" +
                "When the snow's on the ground\n" +
                "And it's freezing outside\n" +
                "I got your love this christmas\n" +
                "\n" +
                "On every list I've ever sent\n" +
                "You're the gift I'd love the best\n" +
                "So deck the halls and all the rest\n" +
                "Warm me up\n" +
                "With your christmas love\n" +
                "\n" +
                "Hey angel in the snow\n" +
                "I'm under the mistletoe\n" +
                "You are the one\n" +
                "You're my very own christmas love\n" +
                "Tell Santa I'm cool this year\n" +
                "My present is standing right here\n" +
                "Thank God above for my very own christmas love, yeah\n" +
                "\n" +
                "Like a beautiful tree, you can light up the room\n" +
                "Your kinda star, can't be removed\n" +
                "Like a beautiful carol, I get lost in your song\n" +
                "And I will forever sing along\n" +
                "\n" +
                "On every list I've ever sent\n" +
                "You're the gift I'd love the best\n" +
                "So deck the halls and all the rest\n" +
                "You warm me up\n" +
                "With your christmas love\n" +
                "\n" +
                "Hey angel in the snow\n" +
                "I'm under the mistletoe\n" +
                "You are the one\n" +
                "You're my very own christmas love\n" +
                "Tell Santa I'm cool this year\n" +
                "My present is standing right here\n" +
                "Thank God above for my very own christmas love\n" +
                "\n" +
                "All the lovers around the world (all the lovers)\n" +
                "Let me sing you Merry Merry Christmas\n" +
                "Merry Merry Christmas (and happy holidays)\n" +
                "And every boy and every girl\n" +
                "Stay close to the ones you love and thank God above\n" +
                "That you got someone this year\n" +
                "That can fill your heart with cheer\n" +
                "\n" +
                "Hey angel in the snow\n" +
                "I'm under the mistletoe\n" +
                "You are the one\n" +
                "You're my very own christmas love\n" +
                "Tell Santa I'm cool this year\n" +
                "My present is standing right here\n" +
                "Thank God above for my very own christmas love\n" +
                "\n" +
                "Hey angel in the snow\n" +
                "I'm under the mistletoe\n" +
                "You are the one\n" +
                "You're my very own christmas love\n" +
                "Tell Santa I'm cool this year\n" +
                "My present is standing right here\n" +
                "Thank God above for my very own christmas love\n" +
                "For my very own christmas love\n" +
                "For my very own christmas love\n" +
                "(Give me a kiss baby)\n" +
                "(Give me a kiss baby)\n" +
                "For my very own christmas love\n";
        intentactivity(view);
    }
    public  void  CW(View view)
    {
        Global.lyrics="\"Cold Water\"\n" +
                "(feat. Justin Bieber & MØ)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Everybody gets high sometimes, you know\n" +
                "What else can we do when we're feeling low?\n" +
                "So take a deep breath and let it go\n" +
                "You shouldn't be drowning on your own\n" +
                "\n" +
                "And if you feel you're sinking,\n" +
                "I will jump right over into cold, cold water for you\n" +
                "And although time may take us into different places\n" +
                "I will still be patient with you\n" +
                "And I hope you know\n" +
                "\n" +
                "I won't let go\n" +
                "I'll be your lifeline tonight\n" +
                "I won't let go\n" +
                "I'll be your lifeline tonight\n" +
                "\n" +
                "Cause we all get lost sometimes, you know?\n" +
                "It's how we learn and how we grow\n" +
                "And I wanna lay with you 'til I'm old\n" +
                "You shouldn't be fighting on your own\n" +
                "\n" +
                "And if you feel you're sinking,\n" +
                "I will jump right over into cold, cold water for you\n" +
                "And although time may take us into different places\n" +
                "I will still be patient with you\n" +
                "And I hope you know\n" +
                "\n" +
                "I won't let go (I won't let go, no, no, no, no, no, no)\n" +
                "I'll be your lifeline tonight\n" +
                "I won't let go\n" +
                "I'll be your lifeline tonight\n" +
                "\n" +
                "[MØ:]\n" +
                "Come on, come on\n" +
                "Save me from my rocking boat\n" +
                "I just want to stay afloat\n" +
                "I'm all alone\n" +
                "And I hope, I hope\n" +
                "Someone's gonna take me home\n" +
                "Somewhere I can rest my soul\n" +
                "I need to know\n" +
                "\n" +
                "[Justin Bieber & MØ:]\n" +
                "You won't let go (I won't let go, no, no, no, no, no, no)\n" +
                "I'll be your lifeline tonight\n" +
                "You won't let go\n" +
                "I'll be your lifeline tonight\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "I won't let go\n" +
                "I won't let go";
        intentactivity(view);
    }
    public  void CHTM(View view)
    {
        Global.lyrics="\"Come Home To Me\"\n" +
                "(originally by Ernie Halter)\n" +
                "\n" +
                "Come home to me\n" +
                "Come home to me\n" +
                "Back into my arms\n" +
                "Home where you belong\n" +
                "Come home to me\n" +
                "Come home to me\n" +
                "If home is where you are\n" +
                "Then home is way too far away\n" +
                "\n" +
                "TV light of blue and white\n" +
                "I just can't fall asleep at night\n" +
                "Move over to the space where you should be\n" +
                "Even half way seems so far\n" +
                "Over mountains and diamond stars\n" +
                "Everybody has their own way home\n" +
                "\n" +
                "Come home to me\n" +
                "Come home to me\n" +
                "Back into my arms\n" +
                "Home where you belong\n" +
                "Come home to me\n" +
                "Come home to me\n" +
                "If home is where you are\n" +
                "Home is way too far away\n" +
                "\n" +
                "All my life I've dreamed of love\n" +
                "Never thought it would hurt this much\n" +
                "To kiss goodbye and wait for your return\n" +
                "So I'll be strong and hold on to\n" +
                "A picture and a thought of you\n" +
                "Getting all the love that you deserve\n" +
                "\n" +
                "So come home to me\n" +
                "Come home to me\n" +
                "Back into my arms\n" +
                "Home where you belong\n" +
                "Come home to me\n" +
                "Come home to me\n" +
                "If home is where you are\n" +
                "Home is way too far away\n" +
                "\n" +
                "If home is where you are\n" +
                "Then home is way too far away\n";
        intentactivity(view);
    }
    public  void  CD(View view)
    {Global.lyrics="\"Common Denominator\"\n" +
            "\n" +
            "Just a fraction of your love fills the air\n" +
            "And I fall in love with you all over again\n" +
            "You're the light that feeds the sun in my world\n" +
            "I'd face a thousand years of pain for my girl\n" +
            "\n" +
            "Out of all the things in life that I could fear\n" +
            "The only thing that would hurt me is if you weren't here\n" +
            "\n" +
            "I don't wanna go back to just being one half of the equation\n" +
            "Do you understand what I'm sayin'?\n" +
            "Girl, without you I'm lost\n" +
            "Can't fix this compass at heart\n" +
            "Between me and love\n" +
            "You're the common denominator\n" +
            "You're the common denominator\n" +
            "\n" +
            "Before you love was low\n" +
            "Playing girls was my high\n" +
            "You changed the game\n" +
            "Now I put my card to the side\n" +
            "When broken hearts rise up to say, \"Love is a lie.\"\n" +
            "You and I will stand to be love's reply\n" +
            "\n" +
            "Out of all the things in life that I could fear\n" +
            "The only thing that would hurt me is if you weren't here, here, here\n" +
            "\n" +
            "I don't wanna go back to just being one half of the equation\n" +
            "Do you understand what I'm sayin'?\n" +
            "Girl, without you I'm lost\n" +
            "Can't fix this compass at heart\n" +
            "Between me and love\n" +
            "You're the common denominator\n" +
            "You're the common denominator\n" +
            "\n" +
            "I can't imagine life without your touch\n" +
            "And every kiss that you give,\n" +
            "You fill me up\n" +
            "And through all the heart achin'\n" +
            "Jealous females hatin'\n" +
            "I'mma hold it down for you, you\n" +
            "You're the common denominator\n" +
            "\n" +
            "I don't wanna go back...\n" +
            "\n" +
            "I don't wanna go back to just being one half of the equation\n" +
            "Do you understand what I'm sayin'?\n" +
            "Girl, without you I'm lost\n" +
            "Can't fix this compass at heart\n" +
            "Between me and love,\n" +
            "You're the common denominator\n" +
            "You're the common denominator\n" +
            "\n" +
            "Just a fraction of your love fills the air\n" +
            "And I fall in love with you all over again";
        intentactivity(view);
    }
    public  void CY(View view)
    {
        Global.lyrics="\"Company\"\n" +
                "\n" +
                "Can we, we keep, keep each other company?\n" +
                "Maybe we can be, be each other's company\n" +
                "Oh, company\n" +
                "\n" +
                "Let's set each other's lonely nights\n" +
                "Be each other's paradise\n" +
                "Need a picture for my frame\n" +
                "Someone to share my reign\n" +
                "Tell me what you wanna drink\n" +
                "I tell you what I got in mind\n" +
                "Oh, I don't know your name\n" +
                "But I feel like that's gonna change\n" +
                "\n" +
                "You ain't gotta be my lover for you to call me \"baby\"\n" +
                "Never been around, no pressure. Ain't that serious?\n" +
                "\n" +
                "Can we, we keep, keep each other company?\n" +
                "Maybe we can be, be each other's company\n" +
                "Oh, company\n" +
                "\n" +
                "It ain't about the complications\n" +
                "I'm all about the elevation\n" +
                "We can keep it goin' up\n" +
                "Oh, don't miss out on us\n" +
                "Just wanna have a conversation\n" +
                "Forget about the obligations\n" +
                "Maybe we can stay in touch\n" +
                "Oh, that ain't doin' too much\n" +
                "\n" +
                "You ain't gotta be my lover for me to call you \"baby\"\n" +
                "Never been around, no pressure. Ain't that serious? No.\n" +
                "\n" +
                "Can we, we keep, keep each other company?\n" +
                "Maybe we can be, be each other's company\n" +
                "Oh, company\n" +
                "\n" +
                "Can we be, can we be, be each other's company,\n" +
                "Be each other's company,\n" +
                "Just be each other's company,\n" +
                "Be each other's company?\n" +
                "\n" +
                "Can we, we keep, keep each other company?\n" +
                "Maybe we can be, be each other's company\n" +
                "Oh, company\n";
        intentactivity(view);
    }
    public  void CT(View view)
    {
        Global.lyrics="\"Confident\"\n" +
                "(feat. Chance The Rapper)\n" +
                "\n" +
                "[Intro:]\n" +
                "Don't do it to me [x2]\n" +
                "Oh, no, no, Oh, no, no\n" +
                "Don't do it to me [x3]\n" +
                "Oh, no, no, Oh, no, no\n" +
                "\n" +
                "[Verse 1 - Justin Bieber:]\n" +
                "Focused, I'm focused\n" +
                "She got a body like that\n" +
                "I ain't never seen nothing like that (eh, eh, eh)\n" +
                "Like a fantasy in front of me\n" +
                "I think that something special is going down\n" +
                "That's right I think she foreign\n" +
                "I think she foreign, got passports\n" +
                "Mi amor started slow, got faster\n" +
                "She gon' work some more, work some more\n" +
                "No stopping her now, no stopping her now\n" +
                "\n" +
                "[Pre-Chorus:]\n" +
                "Then she started dancing, sexual romancing\n" +
                "Nasty but she fancy, lipstick on my satin sheets\n" +
                "What's your nationality? I wonder if there's more of you\n" +
                "She's got my attention, she's confident\n" +
                "\n" +
                "[Chorus:]\n" +
                "Oh, no, no, oh, no, no\n" +
                "She's confident\n" +
                "Oh, no, no, oh, no, no\n" +
                "And I'm down with it\n" +
                "Oh, no, no, oh, no, no\n" +
                "She's confident\n" +
                "You could tell by the way she walks in the room\n" +
                "\n" +
                "[Verse 2 - Justin Bieber:]\n" +
                "She said it's her first time (oh, ya, ya)\n" +
                "I think she might have lied\n" +
                "Feels so good damn (oh, ya, ya), and I don't know why\n" +
                "I'm addicted, something like an addict\n" +
                "Got me twisted (oh, ya, ya), but still I gotta have it\n" +
                "Explosive, explosive. I could still smell her perfume\n" +
                "It's not hard to notice that I'm open\n" +
                "Hypnotized by the way she moves\n" +
                "\n" +
                "[Pre-Chorus:]\n" +
                "Then she started dancing, sexual romancing\n" +
                "Nasty but she fancy, Mona Lisa masterpiece\n" +
                "What's your nationality? I wonder if there's more of you\n" +
                "She's got my attention, she's confident\n" +
                "\n" +
                "[Chorus:]\n" +
                "Oh, no, no, oh, no, no\n" +
                "She's confident\n" +
                "Oh, no, no, oh, no, no\n" +
                "And I'm down with it\n" +
                "Oh, no, no, oh, no, no\n" +
                "She's confident\n" +
                "You could tell by the way she walks in the room\n" +
                "\n" +
                "[Bridge:]\n" +
                "She said it's her first time\n" +
                "I think she might have lied\n" +
                "Feels so good damn, and I don't know why (IEH)\n" +
                "I'm addicted, something like an addict (chance)\n" +
                "Got me twisted (the rapper), but still I gotta have it (IEH)\n" +
                "\n" +
                "[Verse 3 - Chance the Rapper:]\n" +
                "Tattoos, piercings and she just learned to twerk\n" +
                "She ain't got a heart or an ass, just her brains\n" +
                "Gotta ask cause her ass on a learning curve\n" +
                "And she love to hurn the berb, I mean burn the word\n" +
                "That's only legal with a doctors note\n" +
                "Real deep pockets like a doctors coat\n" +
                "Stay fitted like Diddy, here back tryna rock the boat\n" +
                "She the first mate wanna rock the boat\n" +
                "She never forget to ride like a bicycle\n" +
                "She like planes, trains, chains and Icicles\n" +
                "It goes her, blank, blank, and rock & roll\n" +
                "She say, \"I know, honey bunny that's a funny thing.\"\n" +
                "Watch her twerk for a goodfella\n" +
                "She money down with The Money Team\n" +
                "(She's confident)\n" +
                "(ARGH!)\n" +
                "\n" +
                "[Chorus:]\n" +
                "Oh, no, no, oh, no, no\n" +
                "She's confident\n" +
                "Oh, no, no, oh, no, no\n" +
                "And I'm down with it\n" +
                "Oh, no, no, oh, no, no\n" +
                "She's confident\n" +
                "You could tell by the way she walks in the room\n" +
                "\n" +
                "[Bridge:]\n" +
                "She said it's her first time\n" +
                "I think she might have lied\n" +
                "Feels so good damn, and I don't know why\n" +
                "I'm addicted, something like an addict\n" +
                "Got me twisted, but still I gotta have it\n" +
                "\n" +
                "Still I gotta have it [x3]\n" +
                "Oh, no, no, oh, no, no [x4]\n" +
                "But still I gotta have it";
        intentactivity(view);
    }
    public  void DIYA(View view)
    {
        Global.lyrics="\"Die In Your Arms\"\n" +
                "\n" +
                "Mmm, uh-huh, yeah, yeah, alright [2x]\n" +
                "\n" +
                "Say you love me\n" +
                "As much as I love you, yeah\n" +
                "Would you hurt me, baby?\n" +
                "Could you do that to me, yeah?\n" +
                "\n" +
                "Would you lie to me, baby?\n" +
                "'Cause the truth hurts so much more\n" +
                "Would you do the things that drive me crazy?\n" +
                "Leave my heart still at the door?\n" +
                "\n" +
                "Oh, I can't help it, I'm just selfish\n" +
                "There's no way that I could share you\n" +
                "That would break my heart to pieces\n" +
                "Honestly the truth is...\n" +
                "\n" +
                "If I could just die in your arms\n" +
                "I wouldn't mind\n" +
                "'Cause every time you touch me\n" +
                "I just die in your arms\n" +
                "Ooh, it feels so right\n" +
                "So, baby, baby, please don't stop, girl\n" +
                "\n" +
                "Mmm, uh-huh, yeah, yeah, alright [2x]\n" +
                "\n" +
                "Ooh, baby, I know loving you ain't easy\n" +
                "But sure is worth a try\n" +
                "\n" +
                "Ooh, if there is a reason\n" +
                "To call me a fool\n" +
                "'Cause I love too hard\n" +
                "Are there any rules, baby?\n" +
                "\n" +
                "If this a lesson\n" +
                "Then, baby, teach me to behave\n" +
                "Just tell me what I gotta do\n" +
                "Just to stay right next to you, you, you\n" +
                "\n" +
                "Oh, I can't help it, I'm just selfish\n" +
                "There's no way that I could share you\n" +
                "That would break my heart to pieces\n" +
                "Honestly the truth is...\n" +
                "\n" +
                "If I could just die in your arms\n" +
                "I wouldn't mind\n" +
                "'Cause every time you touch me\n" +
                "I just die in your arms\n" +
                "Ooh, it feels so right\n" +
                "So, baby, baby, please don't stop, girl\n" +
                "\n" +
                "Basically I'm saying here\n" +
                "I can't live without my baby\n" +
                "Loving you is so damn easy for me\n" +
                "Ain't no need for contemplating\n" +
                "Promise you won't keep me waiting\n" +
                "Tell me, baby, I'm all that you need\n" +
                "\n" +
                "If I could just die in your arms\n" +
                "I wouldn't mind\n" +
                "'Cause every time you touch me\n" +
                "I just die in your arms\n" +
                "Ooh, it feels so right\n" +
                "So, baby, baby, please don't stop, girl\n" +
                "\n" +
                "If I could die in your arms\n" +
                "I'mma make you believe, girl\n" +
                "That I wouldn't mind, no\n" +
                "\n" +
                "Don't stop baby, no\n" +
                "(alright)\n" +
                "It's what you do to me, yeah\n" +
                "Whoa, whoa, no, no, no, whoa, ooh-whoa\n" +
                "Baby, please don't go, girl\n" +
                "No, no, no, no\n";
        intentactivity(view);



    }
    public  void DTE(View view)
    {
        Global.lyrics="\"Down To Earth\"\n" +
                "\n" +
                "I never thought that it'd be easy\n" +
                "'Cause we're both so distant now\n" +
                "And the walls are closing in on us\n" +
                "And we're wondering how\n" +
                "No one has a solid answer\n" +
                "But just walking in the dark\n" +
                "And you can see the look on my face\n" +
                "It just tears me apart\n" +
                "\n" +
                "[Pre-chorus:]\n" +
                "So, we fight, so, we fight through the hurt, through the hurt\n" +
                "And we cry and cry and cry and cry\n" +
                "And we live, and we live, and we learn, and we learn\n" +
                "And we try and try and try and try\n" +
                "\n" +
                "[Chorus:]\n" +
                "So, it's up to you and it's up to me\n" +
                "That we meet in the middle on our way back down to Earth\n" +
                "Down to Earth, down to Earth\n" +
                "On our way back down to Earth\n" +
                "Back down to Earth, back down to Earth, back down to Earth, back down to Earth,\n" +
                "Back down to Earth, back down to Earth, back down to Earth, back down to Earth\n" +
                "\n" +
                "Mamma, you were always somewhere\n" +
                "And, daddy, I live out of town,\n" +
                "So, tell me how could I ever be normal somehow?\n" +
                "You tell me this is for the best\n" +
                "So, tell me why am I in tears?\n" +
                "Whoa, so far away. And now I just need you here\n" +
                "\n" +
                "[Pre-chorus]\n" +
                "\n" +
                "[Chorus]\n" +
                "\n" +
                "We fell so far away from where we used to be\n" +
                "Now we're standing and where do we go\n" +
                "When there's no road to get to your heart?\n" +
                "Let's start over again\n" +
                "\n" +
                "[Chorus]\n" +
                "\n" +
                "Fell so far away\n" +
                "From where we used to be\n" +
                "And now we're standing\n" +
                "And where do we go when there's no road\n" +
                "To get to your heart?\n" +
                "So, let's start over again\n" +
                "\n" +
                "[Chorus]\n" +
                "\n" +
                "I never thought it'd be easy\n" +
                "'Cause we're both so distant now\n" +
                "And the walls are closing in on us\n" +
                "And we're wondering how";
        intentactivity(view);
    }
    public  void DB(View view)
    {
        Global.lyrics="\"Dr. Bieber\"\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Cure the Bieber fever\n" +
                "Dr. Bieber\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber (Bieber fever is spreading across the country...)\n" +
                "Dr. Bieber (wait world no universe...)\n" +
                "Dr. Bieber (Bieber fever is spreading rapidly and it is uncurable I repeat uncurable)\n" +
                "Bieber fever\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Cure the fever\n" +
                "Cur cur cure the fever\n" +
                "Cur cure the fever\n" +
                "Cure the bieber fever\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Cure the fever\n" +
                "Cur cur cure the fever\n" +
                "Cur cure the fever\n" +
                "Cure the Bieber fever (yeah, yeah)\n" +
                "\n" +
                "Yeah, I got a PHD\n" +
                "I don't need a fake ID\n" +
                "Yeah you females know of me\n" +
                "I'm so sick with no IV\n" +
                "J to the U to the S to the T\n" +
                "Bieber fever's in the street\n" +
                "Time to realize\n" +
                "I'm a beast, I'm a beast, I'm a Beast\n" +
                "Say it 3 times cause they know it's right\n" +
                "Catch this virus in the night\n" +
                "I know it's uncurable\n" +
                "It's durable\n" +
                "But it's alright\n" +
                "Bein' this bad across the globe\n" +
                "Been every single home\n" +
                "Every city\n" +
                "Every country\n" +
                "Every girl is on the phone\n" +
                "(Oh my gosh I love him. Isn't he perfect?)\n" +
                "You can be my queen, yeah\n" +
                "I'll show u how I work it\n" +
                "How I work it\n" +
                "How I how I work it\n" +
                "How I work it\n" +
                "How I how I (work)\n" +
                "\n" +
                "This is not a cold,\n" +
                "Not a flu\n" +
                "Not a sickness\n" +
                "Baby this is good\n" +
                "And it doesn't hurt to get this\n" +
                "You were never cured\n" +
                "And you never will regret this\n" +
                "Yeah, my swag's up\n" +
                "Riding with Kenny\n" +
                "In the Lexis\n" +
                "\n" +
                "[Kenny Hamilton:]\n" +
                "Oh My God\n" +
                "It's bieber fever\n" +
                "It's everywhere\n" +
                "It's taking over the water\n" +
                "It's taking over the air streams\n" +
                "You can not run from it\n" +
                "You can not hide from it\n" +
                "That's why we call it\n" +
                "BIEBER FEVER!\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Cure the fever\n" +
                "Cur cur cure the fever\n" +
                "Cur cure the fever\n" +
                "Cure the bieber fever\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Dr. Bieber\n" +
                "Doc Doc Doc Dr. Bieber\n" +
                "Cure the fever\n" +
                "Cur cur cure the fever\n" +
                "Cur cure the fever\n" +
                "Cure the bieber fever\n" +
                "We Know the DJ.com\n" +
                "We got DJ Tay James right here\n" +
                "We also got Sean Kingston\n" +
                "\n" +
                "[Sean Kingston:]\n" +
                "What a'gwaan\n" +
                "You know what it is Bieber fever man!\n" +
                "[Cough cough] Shawty mane, [cough cough] shawty mane\n" +
                "I caught Bieber fever too";
        intentactivity(view);
    }
    public  void DRB(View view)
    {
        Global.lyrics="\"Drummer Boy\"\n" +
                "(feat. Busta Rhymes)\n" +
                "\n" +
                "[Justin:]\n" +
                "Come they told me pa rum pa pum pum.\n" +
                "A newborn king to see, pa rum pa pum pum.\n" +
                "Our finest gifts we bring, pa rum pa pum pum.\n" +
                "To lay before the king, pa rum pa pum pum, rum pa pum pum, rum pa pum pum.\n" +
                "\n" +
                "Rum pa pa pum, rum pa pum pum pum pum.\n" +
                "Yeah I'm on the drum, yeah I'm on the snare drum.\n" +
                "Yeah I'm on the beat cause the beat goes dumb.\n" +
                "And I only spit heat cause I'm playin' for the Son.\n" +
                "Playin' for the King, playing for the Title,\n" +
                "I'm surprised you didn't hear this in the Bible.\n" +
                "I'm so tight, I might go psycho.\n" +
                "Christmas time so here's a recital.\n" +
                "I'm so bad like Michael, I know I'm still young but I go I go.\n" +
                "Stupid stupid love like cupid,\n" +
                "I'm the drummer boy so do it, do it.\n" +
                "\n" +
                "Little baby, pa rum pa pum pum.\n" +
                "I am a poor boy too, pa rum pa pum pum.\n" +
                "[Busta:]\n" +
                "Gather round the mistletoe real quick.\n" +
                "[Justin:]\n" +
                "I have no gifts to bring, pa rum pa pum pum.\n" +
                "[Busta:]\n" +
                "Matter of fact, let's gather round the fireplace; it's about to get hot in here.\n" +
                "[Justin:]\n" +
                "That's fit to give our king...\n" +
                "[Busta:]\n" +
                "Bieber what up!\n" +
                "[Justin:]\n" +
                "Pa rum pa pum pum, rum pa pum pum, rum pa pum pum.\n" +
                "\n" +
                "[Busta:]\n" +
                "Lemme get straight to it. Yo.\n" +
                "At the table with the family, havin' dinner,\n" +
                "Blackberry on our hip and then it gave a little flicker.\n" +
                "Then I took a look to see before it activates the ringer;\n" +
                "Came to realize my homie Bieber hit me on the Twitter.\n" +
                "Then I hit him back despite I had some food up on my finger,\n" +
                "Sippin' eggnog with a little sprinkle of vanilla,\n" +
                "Even though it's kinda cold, I'm pullin' out a chinchilla,\n" +
                "Bieber hit me back and said, \"Let's make it hot up in the winter.\"\n" +
                "I said, \"Cool.\" You know I'mma deliver;\n" +
                "Let's collaborate and make the holiday a little bigger.\n" +
                "Before we work I gotta get this off,\n" +
                "See the other family members and drop gifts off.\n" +
                "Then I'm headed to the studio cause ain't nothing stopping how\n" +
                "You know we bout to turn it up and really get it poppin' now.\n" +
                "People everywhere and all our Twitter followers,\n" +
                "\"Merry Christmas, Kwanza, happy Hanukkah! \"\n" +
                "\n" +
                "[Justin:]\n" +
                "Mary nodded, pa rum pa pum pum.\n" +
                "The ox and lamb kept time, pa rum pa pum pum.\n" +
                "I played my drum for him, pa rum pa pum pum.\n" +
                "I played my best for him, pa rum pa pum pum, rum pa pum pum, rum pa pum pum.\n" +
                "\n" +
                "If you wanna give, it's the time of year.\n" +
                "JB on the beat, yeah yeah, I'm on the snare.\n" +
                "It's crazy how some people say, say they don't care,\n" +
                "When there's people on the street with no food; it's not fair.\n" +
                "It's about time for you to act merrily;\n" +
                "It's about time for you to give to charity.\n" +
                "Rarely do people even wanna help at all,\n" +
                "'Cause they're warm by the fire, getting toys and their dolls.\n" +
                "Not thinking there's a family out hungry and cold,\n" +
                "Wishin' wishin' that they had somebody they could hold.\n" +
                "So I think some of you need to act bold;\n" +
                "Give a can to a drive, let's change the globe.\n" +
                "\n" +
                "Globe globe globe globe globe.\n" +
                "I'm the drummer boy so do it, do it\n" +
                "I'm the drummer boy so do it, do it\n" +
                "I'm the drummer boy so do it, do it\n" +
                "I'm the drummer boy so do it, do it\n" +
                "I'm the drummer boy so do it, do it";
        intentactivity(view);
    }
    public  void EM(View view)
    {
        Global.lyrics="\"Eenie Meenie\"\n" +
                "(with Justin Bieber)\n" +
                "\n" +
                "[Sean Kingston:]\n" +
                "Eenie meenie miney mo\n" +
                "Catch a bad chick by her toe\n" +
                "If she holler (if, if, if she holler) let her go\n" +
                "\n" +
                "She's indecisive\n" +
                "She can't decide\n" +
                "She keeps on lookin'\n" +
                "From left to right\n" +
                "\n" +
                "Girl, come a bit closer\n" +
                "Look in my eyes\n" +
                "Searchin' is so wrong\n" +
                "I'm Mr. Right\n" +
                "\n" +
                "You seem like the type\n" +
                "To love 'em and leave 'em\n" +
                "And disappear right after this song\n" +
                "So give me the night\n" +
                "To show you, hold you\n" +
                "Don't leave me out here dancin' alone\n" +
                "\n" +
                "You can't make up your mind, mind, mind, mind, mind\n" +
                "Please don't waste my time, time, time, time, time\n" +
                "I'm not tryin' to rewind, wind, wind, wind, wind\n" +
                "I wish our hearts could come together as one\n" +
                "\n" +
                "'Cause shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Let me show you what your missin'\n" +
                "Paradise\n" +
                "With me you're winning, girl\n" +
                "You don't have to roll the dice\n" +
                "Tell me what you're really here for (here for)\n" +
                "Them other guys?\n" +
                "I can see right through you\n" +
                "\n" +
                "You seem like the type\n" +
                "To love 'em and leave 'em\n" +
                "And disappear right after the song\n" +
                "So give me the night\n" +
                "To show you, hold you\n" +
                "Don't leave me out here dancin' alone\n" +
                "\n" +
                "Can't make up your mind, mind, mind, mind, mind\n" +
                "Please don't waste my time, time, time, time, time\n" +
                "Not tryin' to rewind, wind, wind, wind, wind\n" +
                "I wish our hearts could come together as one\n" +
                "\n" +
                "'Cause shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "\n" +
                "[Sean Kingston:]\n" +
                "Eenie meenie miney mo\n" +
                "Catch a bad chick by her toe\n" +
                "If she holler (if, if, if she holler) let her go\n" +
                "Eenie meenie miney mo\n" +
                "Catch a bad chick by her toe\n" +
                "If she holler, holler, holler (let, let, let, let)\n" +
                "\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "\n" +
                "(here we go)\n" +
                "\n" +
                "You can't make up your mind, mind, mind, mind, mind\n" +
                "Please don't waste my time, time, time, time, time\n" +
                "I'm not tryin' to rewind, wind, wind, wind, wind\n" +
                "I wish our hearts could come together as one\n" +
                "\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n" +
                "Shorty is a eenie meenie miney mo lover\n";
        intentactivity(view);
    }
    public  void FLL(View view)
    {
        Global.lyrics="\"Fa La La\"\n" +
                "(feat. Boyz II Men)\n" +
                "\n" +
                "This is the time of year we can give it\n" +
                "Give it, give it, give it all\n" +
                "One through ten on your list you can get it\n" +
                "Get it, get it, get it now\n" +
                "\n" +
                "Make your wish tonight\n" +
                "When you open your eyes\n" +
                "When the lights go bright girl\n" +
                "I'll be right there\n" +
                "\n" +
                "Baby you deserve everything you want\n" +
                "It's your night\n" +
                "Wanna put my ear to your chest girl\n" +
                "Baby I hear melodies\n" +
                "When your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "\n" +
                "Baby I hear melodies\n" +
                "When your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "I know that it's Christmas time\n" +
                "\n" +
                "You got on my favourite dress\n" +
                "You're looking, looking, looking good\n" +
                "Snow falling on your hair\n" +
                "And I don't, I don't wanna get it off\n" +
                "Even the stars in the sky\n" +
                "Can't outshine your eyes\n" +
                "Wanna be your biggest gift\n" +
                "\n" +
                "Baby you deserve everything you want\n" +
                "It's your night\n" +
                "Wanna put my ear to your chest now\n" +
                "Baby I hear melodies\n" +
                "When your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "\n" +
                "Baby I hear melodies\n" +
                "When your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "I know that it's Christmas time\n" +
                "\n" +
                "I'll deck your heart with bells of holly\n" +
                "Bells of holly\n" +
                "Fa la la la la la la, fa la la la la la la\n" +
                "Baby 'cause you're the reason to be jolly\n" +
                "Fa la la la la la la, la la la la la la la\n" +
                "Baby girl\n" +
                "\n" +
                "I hear melodies\n" +
                "When your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "\n" +
                "Baby I hear melodies\n" +
                "When your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "I know that it's Christmas time\n" +
                "\n" +
                "Fa la la la la, fa la la la la\n" +
                "Like Christmas\n" +
                "I know that it's Christmas time\n" +
                "Fa la la la la, fa la la la la\n" +
                "\n" +
                "Know that it's Christmas time\n";
        intentactivity(view);
    }
    public  void FLLa(View view)
    {
        Global.lyrics="\"Fa La La (Acapella)\"\n" +
                "(feat. Boyz II Men)\n" +
                "\n" +
                "This is the time of year we can give it,\n" +
                "Give it, give it, give it all\n" +
                "One through the note your list you can get it,\n" +
                "Get it, get it, get it all\n" +
                "Make your wish tonight\n" +
                "When you open your eyes\n" +
                "When the lights go bright girl\n" +
                "I'll be right there\n" +
                "\n" +
                "Baby you de-serve every-thing you want\n" +
                "It's your night, ohhh\n" +
                "Wanna put my ear to your chest girl\n" +
                "Baby I hear melodies when your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "Baby I hear melodies when your heart beats\n" +
                "Baby it sings to me like\n" +
                "(Fa la la la la, fa la la la la)\n" +
                "Know that it's christmas time\n" +
                "\n" +
                "You got on my favourite dress\n" +
                "You're looking, looking, looking good\n" +
                "Snow falling on your hair, and I don't, I don't\n" +
                "Wanna get it off\n" +
                "Even the stars in the sky can't outshine your eyes\n" +
                "Wanna be your biggest gift\n" +
                "\n" +
                "Baby you de-served every-thing you want\n" +
                "It's your night, ohhh\n" +
                "Wanna put my ear to your chest now\n" +
                "Baby I hear melodies when your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "Baby I hear melodies when your heart beats\n" +
                "Baby it sings to me like\n" +
                "(Fa la la la la, fa la la la la)\n" +
                "Know that it's christmas time\n" +
                "\n" +
                "I'll deck your heart with bells of holly (bells of holly)\n" +
                "Fa la la la la la la, fa la la la la la la...\n" +
                "Baby cause you're the reason to be, darling\n" +
                "Fa la la la la la la, la la la la la la la...\n" +
                "\n" +
                "I hear melodies when your heart beats\n" +
                "Baby it sings to me like\n" +
                "Fa la la la la, fa la la la la\n" +
                "Baby I hear melodies when your heart beats\n" +
                "Baby it sings to me like\n" +
                "(Fa la la la la, fa la la la la)\n" +
                "Know that it's christmas time\n" +
                "\n" +
                "Fa la la la la, fa la la la la\n" +
                "Like christmas\n" +
                "Know that it's christmas time\n" +
                "Fa la la la la, fa la la la la\n" +
                "\n" +
                "Know that it's christmas time...";
        intentactivity(view);
    }
    public  void FT(View view)
    {
        Global.lyrics="\"Fairytale\"\n" +
                "(feat. Jaden Smith)\n" +
                "\n" +
                "Dear princess, dear darling\n" +
                "I promise I will be your prince charming\n" +
                "I know that you want the perfect wedding\n" +
                "You deserve a story book ending\n" +
                "You deserve the best baby, oh, yeah, yeah\n" +
                "Tell me where you wanna go, I can take you there\n" +
                "We can fly across the globe baby don't be scared\n" +
                "Don't be scared, baby don't be scared, no, no\n" +
                "\n" +
                "You deserve a story book ending, fairytale, fairytale\n" +
                "You deserve a story book ending, fairytale, fairytale\n" +
                "\n" +
                "[Jaden Smith:]\n" +
                "Let's take a ride, let that air hit you\n" +
                "Look in my eyes, let that stare hit you\n" +
                "Put my hand on your cheek let that fair hit you\n" +
                "Cause you gonna be scared\n" +
                "When you know that I ain't there with you\n" +
                "But girl, when it comes to love it isn't true that less is more\n" +
                "If I'm away girl and you miss me\n" +
                "That's what jets are for, yeah\n" +
                "So just call me if you need me\n" +
                "I can be on a G6 in an hour baby, it's easy for real\n" +
                "Anywhere you wanna go we can go there\n" +
                "If you there, that's cool cause you're there\n" +
                "Got money to blow there, woah there, slow there\n" +
                "That's no fair\n" +
                "I'm no Joe Blow cause I'm so that\n" +
                "\n" +
                "I'm no whisper I am so clear\n" +
                "I spit stars upon that solar\n" +
                "I stay fly, don't go below that, oh yeah\n" +
                "Oh yeah, yeah, oh yeah, oh yeah, yeah\n" +
                "Oh yeah, yeah, oh yeah, oh yeah, yeah\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Rapunzel, Rapunzel, please lay down your hair\n" +
                "Cause the way that you're dropping, it's making me stare and\n" +
                "I know that you're rocking, those jeans that you wear\n" +
                "Them curves got me going insane girl I swear, ha\n" +
                "Anything you wanna do we can do that\n" +
                "When you walk by he's like, \"Who's that?\"\n" +
                "Like, \"Damn, wanna do that\",\n" +
                "Who knew you two would do that\n" +
                "I mean all that\n" +
                "Capture this moment like kodak oh yeah, oh yeah\n" +
                "Tell me where you wanna go, I can take you there\n" +
                "We can fly across the globe baby don't be scared\n" +
                "Don't be scared, baby don't be scared, no, no\n" +
                "\n" +
                "You deserve a story book ending, fairytale, fairytale\n" +
                "You deserve a story book ending, fairytale, fairytale\n" +
                "You know that, you know that, you know that\n" +
                "You deserve a story book ending\n" +
                "You deserve a story book ending\n" +
                "You know that, you know that, you know that\n" +
                "You deserve a story book ending\n" +
                "You deserve a story book ending.\n";
        intentactivity(view);
    }

    public  void  F(View view)
    {Global.lyrics="\"Fall\"\n" +
            "\n" +
            "Whoa, ooh\n" +
            "Well, let me tell you a story\n" +
            "About a girl and a boy\n" +
            "He fell in love with his best friend\n" +
            "When she's around, he feels nothing but joy\n" +
            "But she was already broken, and it made her blind\n" +
            "But she could never believe that love would ever treat her right\n" +
            "\n" +
            "Did you know that I loved you or were you not aware?\n" +
            "You're the smile on my face\n" +
            "And ain't going nowhere\n" +
            "I'm here to make you happy, I'm here to see you smile\n" +
            "I've been wanting to tell you this for a long while\n" +
            "\n" +
            "What's gonna make you fall in love?\n" +
            "I know you got your wall wrapped all the way around your heart\n" +
            "Don't have to be scared at all, oh, my love\n" +
            "But you can't fly unless you let ya\n" +
            "You can't fly unless you let yourself fall\n" +
            "\n" +
            "Well, I can tell you're afraid of what this might do\n" +
            "Cause we got such an amazing friendship and that you don't wanna lose\n" +
            "Well, I don't wanna lose it either\n" +
            "I don't think I can stay sitting around while you're hurting babe, so take my hand\n" +
            "\n" +
            "Well, did you know you're an angel who forgot how to fly?\n" +
            "Did you know that it breaks my heart every time to see you cry\n" +
            "Cause I know that a piece of you's gone\n" +
            "Every time he done wrong I'm the shoulder you're crying on\n" +
            "And I hope by the time that I'm done with this song that I figure out\n" +
            "\n" +
            "What's gonna make you fall in love?\n" +
            "I know you got your wall wrapped all the way around your heart\n" +
            "Don't have to be scared at all, oh, my love\n" +
            "But you can't fly unless you let ya\n" +
            "You can't fly unless you let yourself fall\n" +
            "\n" +
            "I will catch you if you fall\n" +
            "I will catch you if you fall\n" +
            "I will catch you if you fall\n" +
            "\n" +
            "But if you spread your wings\n" +
            "You can fly away with me\n" +
            "But you can't fly unless you let your...\n" +
            "You can't fly unless you let yourself fall\n" +
            "\n" +
            "What's gonna make you fall in love?\n" +
            "I know you got your wall wrapped all the way around your heart\n" +
            "Don't have to be scared at all, oh, my love\n" +
            "But you can't fly unless you let ya\n" +
            "You can't fly unless you let yourself fall,\n" +
            "\n" +
            "So fall in love (in love)\n" +
            "I know you got your wall wrapped all the way around your heart\n" +
            "Don't have to be scared at all (don't have to be scared, don't have to be scared at all), oh, my love\n" +
            "But you can't fly unless you let ya\n" +
            "You can't fly unless you let yourself fall\n" +
            "\n" +
            "I will catch you if you fall\n" +
            "I will catch you if you fall\n" +
            "I will catch you if you fall\n" +
            "\n" +
            "If you spread your wings\n" +
            "You can fly away with me\n" +
            "But you can't fly unless you let your... let yourself fall\n";
        intentactivity(view);

    }
    public  void FG(View view)
    {
        Global.lyrics="\"Favorite Girl\"\n" +
                "\n" +
                "Ah ah ah ah\n" +
                "Ah ah ah ah\n" +
                "Ah ah ah oh\n" +
                "Ah ah ah ah\n" +
                "\n" +
                "I always knew you were the best\n" +
                "The coolest girl I know\n" +
                "So prettier than all the rest\n" +
                "The star of my show\n" +
                "So many times I wished\n" +
                "You'd be the one for me\n" +
                "But never knew you'd get like this\n" +
                "Girl what you do to me\n" +
                "\n" +
                "You're who I'm thinking of\n" +
                "Girl you ain't my runner up\n" +
                "And no matter what you're always number one\n" +
                "\n" +
                "My prize possession\n" +
                "One and only\n" +
                "Adore ya girl I want ya\n" +
                "The one I can't live without\n" +
                "That's you that's you\n" +
                "You're my special little lady\n" +
                "The one that makes me crazy\n" +
                "Of all the girls I've ever known\n" +
                "It's you, it's you\n" +
                "My favorite, my favorite\n" +
                "My favorite, my favorite girl\n" +
                "My favorite girl\n" +
                "\n" +
                "You're used to going out your way\n" +
                "To impress these Mr. Wrongs\n" +
                "But you can be yourself with me\n" +
                "I'll take you as you are\n" +
                "I know they said believe in love\n" +
                "Is a dream that cant be real\n" +
                "So girl let's write a fairytale\n" +
                "And show 'em how we feel\n" +
                "\n" +
                "You're who I'm thinking of\n" +
                "Girl you ain't my runner up\n" +
                "And no matter what you're always number one\n" +
                "\n" +
                "My prize possession\n" +
                "One and only\n" +
                "Adore ya girl I want ya\n" +
                "The one I can't live without\n" +
                "That's you that's you\n" +
                "You're my special little lady\n" +
                "The one that makes me crazy\n" +
                "Of all the girls I've ever known\n" +
                "It's you, it's you\n" +
                "My favorite, my favorite\n" +
                "My favorite, my favorite girl\n" +
                "My favorite girl\n" +
                "Baby it's you\n" +
                "My favorite, my favorite\n" +
                "My favorite, my favorite girl\n" +
                "My favorite girl\n" +
                "\n" +
                "You take my breath away\n" +
                "With everything you say\n" +
                "I just wanna be with you\n" +
                "My baby my baby oh\n" +
                "Promise to play no games\n" +
                "Treat you no other way\n" +
                "Than you deserve 'cause you're the girl of my dreams\n" +
                "\n" +
                "My prize possession\n" +
                "One and only\n" +
                "Adore ya girl I want ya\n" +
                "The one I can't live without\n" +
                "That's you that's you\n" +
                "You're my special little lady\n" +
                "The one that makes me crazy\n" +
                "Of all the girls I've ever known\n" +
                "It's you, it's you\n" +
                "\n" +
                "My prize possession\n" +
                "One and only\n" +
                "Adore ya girl I want ya\n" +
                "The one I can't live without\n" +
                "That's you that's you\n" +
                "You're my special little lady\n" +
                "The one that makes me crazy\n" +
                "Of all the girls I've ever known\n" +
                "It's you, it's you\n" +
                "My favorite, my favorite\n" +
                "My favorite, my favorite girl\n" +
                "My favorite girl\n" +
                "My favorite, my favorite\n" +
                "My favorite, my favorite girl\n" +
                "My favorite girl\n";
        intentactivity(view);
    }
    public  void FD(View view)
    {
        Global.lyrics="\"First Dance\"\n" +
                "(feat. Usher)\n" +
                "\n" +
                "[Usher:]\n" +
                "(It's your chance, take her hand to the floor)\n" +
                "Fellas, it's the moment you've been waiting for\n" +
                "(Girl if you see something you like then let 'em know)\n" +
                "Ladies, I know you're ready\n" +
                "(Cuz you only got one chance for your first dance)\n" +
                "Yeah, yeah, you never forget your first dance\n" +
                "(So take advantage of the slow jam)\n" +
                "Tell 'em JB\n" +
                "\n" +
                "[Justin:]\n" +
                "When I close my eyes\n" +
                "I see me and you at the prom\n" +
                "We've both been waiting so long\n" +
                "For this day to come\n" +
                "Now that it's here\n" +
                "Let's make it special (I'm here tonight)\n" +
                "\n" +
                "So many thoughts in my mind\n" +
                "The DJ is playing my favorite song (favorite song)\n" +
                "Ain't no chaperons (chaperons)\n" +
                "This could be the night of your dreams\n" +
                "\n" +
                "[Chorus:]\n" +
                "Only if you give, give your first dance to me\n" +
                "Girl, I promise I'll be gentle\n" +
                "I know we gotta do it slowly\n" +
                "If you give (give it), give the first dance to me (give it)\n" +
                "I'm gon' cherish every moment\n" +
                "'cause it only happens once, once in a lifetime\n" +
                "\n" +
                "I couldn't ask for more\n" +
                "We're rocking back and forth\n" +
                "Under the disco ball\n" +
                "We're the only ones on the floor (I'm here tonight)\n" +
                "\n" +
                "So many thoughts in my mind\n" +
                "The DJ's playing my favorite song (favorite song)\n" +
                "Now we're all alone (all alone)\n" +
                "Here's the opportunity\n" +
                "\n" +
                "[Chorus:]\n" +
                "Only if you give, give your first dance to me\n" +
                "Girl, I promise I'll be gentle\n" +
                "I know we gotta do it slowly\n" +
                "If you give (give it), give the first dance to me (give it)\n" +
                "I'm gon' cherish every moment\n" +
                "'cause it only happens once, once in a lifetime\n" +
                "\n" +
                "Everybody says we look cute together\n" +
                "Let's make this a night the two of us remember\n" +
                "No teachers around to see us dancing close\n" +
                "I'm telling you our parents will never know\n" +
                "Before the lights go up and the music turns off\n" +
                "That's the perfect time for me to taste your lip gloss\n" +
                "Your glass slippers in my hand right here\n" +
                "We'll make it before the clock strikes nine\n" +
                "\n" +
                "If you just give, give your first dance to me\n" +
                "Girl, I promise I'll be gentle\n" +
                "But we gotta do it slowly\n" +
                "If you give (give), give the first dance to me (give the first dance, baby)\n" +
                "I'm gon' cherish every moment (oh, oh, oh)\n" +
                "'Cause it only happens once, once in a lifetime\n" +
                "\n" +
                "[Usher:]\n" +
                "It's your chance, take her hand\n" +
                "To the floor, to the floor\n" +
                "Girl if you see something you like then let him know\n" +
                "'Cause you only got one chance\n" +
                "Your first dance\n" +
                "So take advantage of the slow jam, yeah, man\n" +
                "\n" +
                "[Justin:]\n" +
                "If you give (give it), give the first dance to me (give it)\n" +
                "I'm gon' cherish every moment\n" +
                "'Cause it only happens once, once in a lifetime";
        intentactivity(view);
    }
    public  void FL(View view)
    {
        Global.lyrics="\"Flatline\"\n" +
                "(originally by Mutya Keisha Siobhan)\n" +
                "\n" +
                "Flatline, flatline, flatline, flatline\n" +
                "Lately you've been busy\n" +
                "Wonderin' if you miss me\n" +
                "Why did you go against me? I just wanna know\n" +
                "How come you act so different?\n" +
                "Talk to me — I'll listen\n" +
                "All the love I'm givin', don't act like you don't know\n" +
                "\n" +
                "I was out there on the road, life out of control\n" +
                "She became a victim to my busy schedule\n" +
                "And I know that it's not fair, that don't mean that I don't care\n" +
                "This one's dedicated to the girl out there\n" +
                "\n" +
                "Girl you always catch me at the bad time (bad time)\n" +
                "When I know you probably think it's a lie (a lie)\n" +
                "And I know I told you last time was the last time (last time)\n" +
                "How could you pull the plug and leave me flatline (flatline)?\n" +
                "Flatline (flatline), flatline (flatline)\n" +
                "How could you pull the plug and leave me flatline (flatline)?\n" +
                "Cause when I hit you, you don't even reply (reply)\n" +
                "How could you pull the plug and leave me flatline?\n" +
                "\n" +
                "Not breathin', what is it that I'm not seein'\n" +
                "Said she's leavin', damn I can't believe it\n" +
                "It's like my heart's bleedin'\n" +
                "Knowin' that you don't need me\n" +
                "Shut my heart down, now I don't know what Imma do now\n" +
                "\n" +
                "I was out there on the road, life out of control\n" +
                "She became a victim to my busy schedule\n" +
                "And I know that it's not fair, that don't mean that I don't care\n" +
                "This one's dedicated to the girl out there\n" +
                "\n" +
                "Girl you always catch me at the bad time (bad time)\n" +
                "When I know you probably think it's a lie (a lie)\n" +
                "And I know I told you last time was the last time (last time)\n" +
                "How could you pull the plug and leave me flatline (flatline)?\n" +
                "Flatline (flatline), flatline (flatline)\n" +
                "How could you pull the plug and leave me flatline (flatline)?\n" +
                "Cause when I hit you, you don't even reply (reply)\n" +
                "How could you pull the plug and leave me flatline?\n" +
                "\n" +
                "Girl you always catch me at the bad time\n" +
                "Girl you always catch me at the bad time\n" +
                "I know I told you last time was the last time\n" +
                "How could you pull the plug and leave me flatline (flatline)?\n" +
                "Flatline, flatline\n" +
                "\n" +
                "Girl you always catch me at the bad time (bad time)\n" +
                "When I know you probably think it's a lie (a lie)\n" +
                "And I know I told you last time was the last time (last time)\n" +
                "How could you pull the plug and leave me flatline (flatline)?\n" +
                "Flatline (flatline), flatline (flatline)\n" +
                "How could you pull the plug and leave me flatline (flatline)?\n" +
                "Cause when I hit you, you don't even reply (reply)\n" +
                "How could you pull the plug and leave me flatline?\n" +
                "\n";
        intentactivity(view);
    }
    public  void FR(View view)
    {
        Global.lyrics="\"Forever\"\n" +
                "\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then speak to me,\n" +
                "\n" +
                "Girl it’s getting late,\n" +
                "The sun's going down,\n" +
                "And it’s about time I shake my way across the town,\n" +
                "But before I go I just wanna say that you stay on my mind each and every day,\n" +
                "\n" +
                "I think I'm starting to like the time that we spent\n" +
                "And when it’s building inside\n" +
                "Then I can’t pretend\n" +
                "No I don’t want to fight it\n" +
                "I don’t want to hide the way I feel so I guess it’s time for me to say\n" +
                "\n" +
                "That I got eyes for you baby,\n" +
                "I want us to be together,\n" +
                "And if you feel it too,\n" +
                "Tell me no one will treat you better,\n" +
                "\n" +
                "Cause on nights like this\n" +
                "It’s good to know that you've got someone by your side like this\n" +
                "The more and more you feel like you can live your life like this\n" +
                "And then you say\n" +
                "Hope this will last forever,\n" +
                "\n" +
                "Don’t know if it's love\n" +
                "It's too early to say\n" +
                "But if it’s something like it I want it to remain\n" +
                "Don’t know if you’re the one that takes a little time\n" +
                "But in the meantime girl you feel just fine,\n" +
                "\n" +
                "Cause the way you look at me never seen that look before\n" +
                "And if it’s a hint of what’s to come then baby can I get some more\n" +
                "Not trying to be too forward but I think it’s best for you to know\n" +
                "\n" +
                "I got eyes for you baby,\n" +
                "I want us to be together, be together\n" +
                "And if you feel it too,\n" +
                "Tell me no one will treat you better (baby no one will treat you better)\n" +
                "\n" +
                "Cause on nights like this\n" +
                "It’s good to know that you've got someone by your side like this\n" +
                "The more and more you feel like you can live your life like this\n" +
                "And then you say\n" +
                "Hope this will last forever,\n" +
                "\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then speak to me,\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then speak to me,\n" +
                "\n" +
                "I got eyes for you baby,\n" +
                "I want us to be together, be together\n" +
                "And if you feel it too,\n" +
                "Tell me no one will treat you better,\n" +
                "\n" +
                "Cause on nights like this\n" +
                "It’s good to know that you've got someone by your side like this\n" +
                "The more and more you feel like you can live your life like this\n" +
                "And then you say\n" +
                "Hope this will last forever,\n" +
                "\n" +
                "I got eyes for you baby,\n" +
                "I want us to be together, be together\n" +
                "And if you feel it too,\n" +
                "Tell me no one will treat you better,\n" +
                "\n" +
                "Cause on nights like this\n" +
                "It’s good to know that you've got someone by your side like this\n" +
                "The more and more you feel like you can live your life like this\n" +
                "And then you say\n" +
                "Hope this will last forever,\n" +
                "\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then speak to me,\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then holla,\n" +
                "I think I found my girl if it’s you then speak to me\n" +
                "\n";
        intentactivity(view);
    }
    public  void FE(View view)
    {
        Global.lyrics="\"Future\"\n" +
                "(with Khalil & Kehlani)\n" +
                "\n" +
                "[Khalil:]\n" +
                "(It's too easy)\n" +
                "Future, such a great future\n" +
                "Oh, baby, we'll see what the future holds for us\n" +
                "Oh no\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "When it's raining, it's pouring, how do I always end up the enemy?\n" +
                "How do I wake up in the morning? You're not right next to me\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "How could we throw it all away?\n" +
                "Guess I'll move on to better days\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Maybe there's a future, such a great future\n" +
                "(See what the future holds)\n" +
                "Maybe yes, next time, what if there's no next time?\n" +
                "(I don't know what the future knows)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Future, future\n" +
                "(Is it that bad? Is it that bad?)\n" +
                "Future, future\n" +
                "(Live this moment, we'll enjoy it)\n" +
                "\n" +
                "[Kehlani:]\n" +
                "When our love has been broken, we can barely even speak\n" +
                "One minute we're so red, the next we're knocked right up our feet\n" +
                "\n" +
                "[Kehlani:]\n" +
                "How did we throw it all away?\n" +
                "Guess we'll move on to better days, yeah\n" +
                "\n" +
                "[Justin Bieber & Kehlani & Khalil:]\n" +
                "Maybe there's a future, such a great future\n" +
                "(See what the future holds)\n" +
                "Maybe yes, next time, what if there's no next time?\n" +
                "(I don't know what the future knows)\n" +
                "Maybe there's a future, such a great future\n" +
                "See what the future holds\n" +
                "Don't know what the future knows\n" +
                "Maybe yes, next time, what if there's no next time?\n" +
                "(I don't know what the future knows)\n" +
                "\n" +
                "[Justin Bieber & Kehlani:]\n" +
                "Future, future\n" +
                "(Is it that bad? Is it that bad?)\n" +
                "Future, future\n" +
                "(Live this moment, we'll enjoy it)";
        intentactivity(view);
    }
    public  void  GUTI(View view)
    {
        Global.lyrics="\"Get Used To It\"\n" +
                "\n" +
                "Subjected to my system, reflecting on the days\n" +
                "When we used to be just friends\n" +
                "Protected both our interests, our trust was in a bank\n" +
                "That's where our hearts were safe\n" +
                "And then we got closer\n" +
                "Separated from my ex 'til we got closure\n" +
                "Ooh, on every visit, feelings got stronger\n" +
                "Now this is out of our hands, our love is here to stay\n" +
                "\n" +
                "So get used to me checking in all day\n" +
                "Get used to me falling through just to see your face\n" +
                "There ain't a moment I won't need your brace\n" +
                "Get used to me touching you, get used to me loving you\n" +
                "Oh, get used to it, hey\n" +
                "Oh, get used to it, hey\n" +
                "Oh, get used to it, oh, it\n" +
                "Oh, used to me holding you, used to me wowing you,\n" +
                "Oh, get used to it\n" +
                "\n" +
                "And Imma April-shower you forever if I may\n" +
                "'Til your flowers bloom in June\n" +
                "Make sure that our fireworks be your Fourth of July for life\n" +
                "As long as you stand right by my side\n" +
                "Keep coming closer throughout October\n" +
                "Oh, counting down, it's almost Christmas eve\n" +
                "Oh, seven days shy of a New Year's eve\n" +
                "Then we'll be celebrating\n" +
                "\n" +
                "So get used to me checking in all day\n" +
                "Used to me falling through just to see your face\n" +
                "There ain't a moment I won't need your brace\n" +
                "Get used to me touching you, get used to me loving you\n" +
                "Oh, get used to it, hey\n" +
                "Oh, get used to it, hey\n" +
                "Oh, get used to it, oh, it\n" +
                "Oh, used to be holding you, used to me wowing you,\n" +
                "Oh, get used to it\n" +
                "\n" +
                "I ain't goin' nowhere, I ain't going nowhere\n" +
                "Oh, no\n" +
                "I ain't goin' nowhere, I ain't going nowhere\n" +
                "Oh, no\n" +
                "\n" +
                "Put your faith in me\n" +
                "I'll be all you need, I swear\n" +
                "Yeah, yeah\n" +
                "I'm gonna be right here\n" +
                "Yeah\n" +
                "\n" +
                "So get used to me checking in all day\n" +
                "Used to me falling through just to see your face\n" +
                "There ain't the moment I won't need your grace\n" +
                "Get used to me touching you, get used to me loving you\n" +
                "Oh, get used to it, hey\n" +
                "Oh, get used to it, hey\n" +
                "Oh, get used to it, oh, it\n" +
                "Oh, used to be holding you, used to me wowing you,\n" +
                "Oh, get used to it\n" +
                "\n" +
                "You better get used to it\n" +
                "You better get used to it\n" +
                "Get used to it\n" +
                "You better get used to it\n" +
                "You better get used to it\n" +
                "Get used to it";
        intentactivity(view);
    }
    public  void HNY(View view)
    {
        Global.lyrics="\"Happy New Year\"\n" +
                "(with Jaden Smith)\n" +
                "\n" +
                "[Jaden Smith]\n" +
                "Girl it's almost the new year, and its too clear, me you and a RootBeer, Float\n" +
                "In my house 'bout to count down cause we got the whole crew here\n" +
                "Yo they bout to party hardy. lookin for a hottie with a nice body\n" +
                "Ooh ya'll have fun with that we don't need the mistletoe we was under that like 20 minutes ago\n" +
                "And if you give me all your love you better give me some more\n" +
                "The new years commin you ain't trippin no more\n" +
                "So I don't need music bout to listen to yo'h-h-h-h-h heart beat\n" +
                "Try to stop me if you want to but you know you don't want to\n" +
                "So don't do it, don't ruin the moment I put me and you in\n" +
                "\n" +
                "[Justin Bieber]\n" +
                "It's the start of the new year, baby, baby yeah\n" +
                "And I know what to do with it, baby baby yeah\n" +
                "I'm gonna make your cheeks red when I kiss your neck\n" +
                "Girl I'm never leavin cause you are the best baby\n" +
                "\n" +
                "Yeah yeah. I wanna give you everything\n" +
                "Never feel 'cause girl you're coming home with me, yeah\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n" +
                "\n" +
                "Its the new year me and you girl yeah I know this love is true\n" +
                "I remember when you moved here everything was oh so new and\n" +
                "Yeah I promise to be true and ill give all my love to you\n" +
                "Jaden smith is to my right that's the cougar and hes got a root beer\n" +
                "\n" +
                "[Jaden Smith]\n" +
                "Uh got friends I called em all\n" +
                "Cause 2012 is the year of the love\n" +
                "And we gon' start it off\n" +
                "We can get a plane today and get a car toma'\n" +
                "We don't do it small at all\n" +
                "No girl tell me what I gotta to do\n" +
                "I can be the beat that you rockin to\n" +
                "I can do anything nothing is impossible especially with you girl\n" +
                "And I never need a new girl\n" +
                "This love is true girl\n" +
                "Aye welcome to the crew girl\n" +
                "2012 I'm so excited\n" +
                "The mayans was lien nobodys dyin'\n" +
                "Yeah girl but you knew that\n" +
                "Knockin' at your door like Who's That?\n" +
                "Yes I love you, you say true dat\n" +
                "Guys they want you I say too bad\n" +
                "\n" +
                "[Justin Bieber]\n" +
                "It's the year, I wanna give you everything\n" +
                "Never feel cause girl you're coming home with me yeah\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n" +
                "\n" +
                "If you got a girl put your hand up\n" +
                "Ladies if you got a man put your hands up\n" +
                "If you got a girl put your hand up\n" +
                "Ladies if you got a man put your hands up\n" +
                "\n" +
                "Girl 2012 is the year to be\n" +
                "Better\n" +
                "Stronger\n" +
                "Closer to the people around you\n" +
                "So grab someone special\n" +
                "And just\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n" +
                "\n" +
                "5,4,3,2,1\n" +
                "Kiss me\n" +
                "Kiss me\n";
        intentactivity(view);
    }
    public  void HFR(View view)
    {
        Global.lyrics="\"Hard 2 Face Reality\"\n" +
                "(2014 Version)\n" +
                "(feat. Poo Bear)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Sometimes it's hard to face reality (oh, oh)\n" +
                "Even though you might get mad at me (oh, oh)\n" +
                "Sometimes it's hard to face reality\n" +
                "\n" +
                "Don't be afraid to stand alone\n" +
                "Don't be afraid to stand outside the door alone\n" +
                "I know it's hard away from home\n" +
                "And it ain't easy all alone\n" +
                "Relationships over the phone\n" +
                "Talkin' to your significant other all night long\n" +
                "\n" +
                "Sometimes it's hard to face reality (oh, oh)\n" +
                "Even though you might get mad at me (oh, oh)\n" +
                "Sometimes it's hard to face reality\n" +
                "\n" +
                "[Poo Bear:]\n" +
                "Should've been adjusted to my life\n" +
                "Any opportunity to stay away for the last time\n" +
                "Now you're standin' right in front of me\n" +
                "It is meaning though, that life\n" +
                "Tryna protect your feelins\n" +
                "You read in-between the lines\n" +
                "Hope your heart has started healin' (whoa, whoa)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Sometimes it's hard to face reality (oh, oh)\n" +
                "Even though you might get mad at me (oh, oh)\n" +
                "Sometimes it's hard to face reality\n";
        intentactivity(view);
    }
    public  void  H(View view)
    {
        Global.lyrics="\"Heartache\"\n" +
                "\n" +
                "What? \n" +
                "W..Wait\n" +
                "But yesterday we were..\n" +
                "I don't understand\n" +
                "\n" +
                "We started out it was perfect\n" +
                "Nothing but fun\n" +
                "And my heart was convinced to say \n" +
                "that you're the one\n" +
                "And I thought it would last \n" +
                "for the rest of our lives \n" +
                "Boy was I in for a big surprise\n" +
                "\n" +
                "With no doubt looking round \n" +
                "thinking that I'm so cool.\n" +
                "Same place same time every day of my life \n" +
                "could we meet after school\n" +
                "Finally if I didn't make her cry\n" +
                "She wouldn't be with another guy \n" +
                "\n" +
                "Nothing can cure my \n" +
                "headache cause I'm experiencing \n" +
                "what they call heartbreak \n" +
                "it's going to hurt worse \n" +
                "as long as I stay here \n" +
                "I know but man just let me lay here \n" +
                "\n" +
                "Cause this is something that I can't shake\n" +
                "I must be experiencing what they call heartbreak \n" +
                "they say it's only just as worse as you make it\n" +
                "I know but man just let me lay here \n" +
                "\n" +
                "Now I'm all tore up taking back when I was at your door \n" +
                "The first time when you said forever I'll be yours\n" +
                "Started walking your hand in my hand feelings got stronger\n" +
                "We made a promise\n" +
                "\n" +
                "And whenever I leave it feels like your still with me\n" +
                "But it all came crashing down\n" +
                "Sitting in my room I gotta get out of here \n" +
                "what am I to do when I look up and your not there\n" +
                "(Woaah)\n" +
                "\n" +
                "Nothing can cure my headache\n" +
                "Cause I'm experiencing what they call heartbreak\n" +
                "It's going to hurt worse as long as I stay here (as long as I stay here) \n" +
                "I know but man just let me lay here\n" +
                "\n" +
                "Cause this is something I can't shake \n" +
                "I must be experiencing what they call heartbreak\n" +
                "They say it's only just as worse as you make it \n" +
                "I know but man just let me lay here\n" +
                "\n" +
                "Say I'm too young for love \n" +
                "I got so much life to live ahead \n" +
                "but, if only this is love I could get over\n" +
                "I know I have to deal with the pain\n" +
                "\n" +
                "(Nothing can, cure my headache)\n" +
                "Nothing can Cure my headache \n" +
                "Cause I'm experiencing what they call heartbreak \n" +
                "It's going to hurt worse as long as I stay here(as long as I stay here)\n" +
                "I know but man just let me lay here \n" +
                "\n" +
                "Cause this is something that I can't shake (can't shake)\n" +
                "I must be experiencing what they call heartbreak \n" +
                "they say it's only just as worse as you make it (make it yeah) \n" +
                "I know but man just let me lay here (just let me lay here)\n";
        intentactivity(view);
    }
    public  void  HB(View view)
    {
        Global.lyrics="\"Heartbreaker\"\n" +
                "\n" +
                "Girl you don't know how I feel (how I really feel)\n" +
                "Since you've been away, oh baby\n" +
                "Any chance that you could take my call (take my call)\n" +
                "If I got you today, oh?\n" +
                "\n" +
                "Girl you say, that you don't wanna talk but it's cool\n" +
                "I've been thinking 'bout you all day long\n" +
                "Hoping you'll pick up your phone\n" +
                "Girl I know, that I don't wanna lose your love\n" +
                "Oh baby (oh baby), oh baby\n" +
                "\n" +
                "Oh girl I got a secret place that we can go\n" +
                "'Cause I really wanna be alone\n" +
                "Baby nobody else gotta know\n" +
                "Just meet me later on the low\n" +
                "\n" +
                "Don't tell me you're my heartbreaker\n" +
                "'Cause girl my heart's breaking\n" +
                "Don't tell me you're my heartbreaker\n" +
                "'Cause girl my heart's breaking\n" +
                "\n" +
                "(Hey girl)\n" +
                "\n" +
                "Girl you see me standing here (standing here)\n" +
                "Standing in the rain, oh baby\n" +
                "Any chance that you could stay right here?\n" +
                "And never go away?\n" +
                "\n" +
                "Girl you say that you don't wanna talk but it's cool\n" +
                "I've been thinking 'bout you all day long\n" +
                "Hoping you'll pick up your phone\n" +
                "Girl I know that I don't wanna lose your love\n" +
                "Oh baby (oh baby), oh baby\n" +
                "\n" +
                "Oh girl I got a secret place that we can go (secret place that we can go)\n" +
                "'Cause I really wanna be alone (I really wanna be alone)\n" +
                "Baby nobody else gotta know (nobody else)\n" +
                "Just meet me later on the low (would you meet me on the low, girl?)\n" +
                "\n" +
                "Don't tell me you're my heartbreaker (baby don't tell me, no)\n" +
                "Girl my heart's breaking\n" +
                "Don't tell me you're my heartbreaker\n" +
                "'Cause girl my heart's breaking (heart is breaking, whoa)\n" +
                "\n" +
                "So what I'm really tryna say is\n" +
                "And what I hope you understand\n" +
                "Is despite of all the imperfections of who I am\n" +
                "I still wanna be your man\n" +
                "I know it hasn't been easy for us to talk with everyone being around\n" +
                "But this is personal, this is for me and you\n" +
                "And I want you to know that I still love you\n" +
                "I know the seasons may change\n" +
                "And sometimes love goes from sunshine to rain\n" +
                "And I'm under this umbrella and I'm calling your name\n" +
                "And you know I don't wanna lose that\n" +
                "I still believe in us\n" +
                "\n" +
                "I still believe in love\n" +
                "I still believe in us\n" +
                "I hope you believe in us\n" +
                "The way I believe in us\n" +
                "You don't see\n" +
                "'Cause what you don't see is when we don't speak\n" +
                "I really don't sleep, I wanna talk to ya\n" +
                "And if I had the world in my hands, I'd give it all to ya\n" +
                "I wanna know if you're feeling, the way that I'm feeling\n" +
                "I wanna know if you're feeling, the way that I, the way that I\n" +
                "\n" +
                "You told me to be careful with your heart, your heart\n" +
                "You told me to be careful with your heart, your heart\n" +
                "With your heart";
        intentactivity(view);
    }
    public  void  HG(View view)
    {
        Global.lyrics="\"Hey Girl\"\n" +
                "\n" +
                "Oh, oh, oh, oh, oh, oh, oh\n" +
                "Walkin' on the beach, with my backpack on\n" +
                "And my snapback on, with the rap back on, uh-uh\n" +
                "Lookin' for a girl wearing high heels\n" +
                "That's how I feel, I feel, I, uh-uh\n" +
                "\n" +
                "That’s when you walk by\n" +
                "Like damn you fly,\n" +
                "And I was like uhuh\n" +
                "Ask me where I’m from\n" +
                "And I say C-C-Canada, uhuh\n" +
                "\n" +
                "Oh, oh, oh, oh, oh, oh, oh\n" +
                "Uhuh, uhuh, yeah\n" +
                "Uhuh, uhuh, oh yeah\n" +
                "Uhuh, uhuh, oh yeah\n" +
                "\n" +
                "Hey girl, hey girl, hey girl [X5]\n" +
                "Oh yeah [X4]\n" +
                "\n" +
                "Louis Vuittons on your feet\n" +
                "Take them off and make me say, uhuh\n" +
                "Oh them curves got me going crazy, crazy, crazy, crazy, uhuh\n" +
                "Let me ask you girl where your mind is\n" +
                "Let me just tell you’re the fliest, fliest, uhuh\n" +
                "\n" +
                "Uhuh, uhuh, yeah\n" +
                "Uhuh, uhuh, oh yeah\n" +
                "Uhuh, uhuh, oh yeah [X4]\n" +
                "\n" +
                "Hey girl, hey girl, hey girl [X5]\n" +
                "Oh yeah [X4]\n" +
                "\n" +
                "(Let's go!)";
        intentactivity(view);
    }
    public  void HTG(View view)
    {
        Global.lyrics="\"Hit The Ground\"\n" +
                "\n" +
                "I close my eyes, I take it slow\n" +
                "Lay on down and let me rest my soul\n" +
                "I've been so high, I've been so low\n" +
                "I'm just tryna find my way back home\n" +
                "Can't help but roam\n" +
                "My signal's gone\n" +
                "Guess this journey's left me on my own\n" +
                "I don't care why I'm alone, alone, alone\n" +
                "\n" +
                "And if I could\n" +
                "Forget about the way you love me\n" +
                "Forget about the world, we're set in stone\n" +
                "I'm dreaming with my eyes wide open now\n" +
                "If only I could hit the ground\n" +
                "I never thought that I'd be broken\n" +
                "I never thought I'd be this far from home\n" +
                "I'm dreaming with my eyes wide open now\n" +
                "If only I could hit the ground\n" +
                "If only I could hit the ground\n" +
                "If only I could hit the ground\n" +
                "\n" +
                "I close my eyes, I take it slow\n" +
                "Lay on down and let me rest my soul\n" +
                "I've been so high, I've been so low\n" +
                "I'm just tryna find my way back home\n" +
                "Can't help but roam\n" +
                "My signal's gone\n" +
                "Guess this journey's left me on my own\n" +
                "I don't care why I'm alone, alone, alone\n" +
                "\n" +
                "And if I could\n" +
                "Forget about the way you love me\n" +
                "Forget about the world, we're set in stone\n" +
                "I'm dreaming with my eyes wide open now\n" +
                "If only I could hit the ground\n" +
                "I never thought that I'd be broken\n" +
                "I never thought I'd be this far from home\n" +
                "I'm dreaming with my eyes wide open now\n" +
                "If only I could hit the ground\n" +
                "If only I could hit the ground\n" +
                "If only I could hit the ground\n" +
                "\n" +
                "Take it one day at a time\n" +
                "Reach for the stars now\n" +
                "Ooh just leave the past behind\n" +
                "It's a part of living\n" +
                "It's a part of living\n" +
                "\n" +
                "If only I could hit the ground\n" +
                "If only I could\n" +
                "If only I could hit the ground\n" +
                "I could hit the ground, right now\n" +
                "If only I could hit the ground\n" +
                "If I could hit the ground\n" +
                "Then I'd be falling down\n" +
                "If only I could hit the ground\n" +
                "If I could hit the ground\n" +
                "Then I'd be touching down\n" +
                "If only I could hit the ground\n";
        intentactivity(view);
    }
    public  void HT(View view)
    {
        Global.lyrics="\"Hold Tight\"\n" +
                "\n" +
                "Happy birthday, happy birthday\n" +
                "\n" +
                "They hold on tight\n" +
                "Yeah, they hold on tight\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go\n" +
                "(Lips won’t let me go, lips won’t let me go, oh)\n" +
                "\n" +
                "They hold on tight (they hold on tight)\n" +
                "Yeah, they hold on tight (they hold on tight)\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go\n" +
                "(Lips won’t let me go, lips won’t let me go, oh)\n" +
                "\n" +
                "Don’t let this go to your head\n" +
                "But you’re the best I’ve ever had\n" +
                "Not to mention\n" +
                "That thing is swollen\n" +
                "You got me, oh, so in a trance\n" +
                "\n" +
                "Something like a zip lock, but a lip lock\n" +
                "Want you wrapped 'round my arm like a wrist watch\n" +
                "Oh, so hard walking out\n" +
                "Got me stuck like crazy glue, ooh\n" +
                "\n" +
                "They hold on tight\n" +
                "Yeah, they hold on tight\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go\n" +
                "(Lips won’t let me go, lips won’t let me go, oh)\n" +
                "\n" +
                "They hold on tight (they hold on tight)\n" +
                "Yeah, they hold on tight (they hold on tight)\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go\n" +
                "\n" +
                "Got me tossing, turning in the bed\n" +
                "Your place is where I'd rather be instead\n" +
                "You don’t know your strength\n" +
                "Missing you is like adrenaline\n" +
                "\n" +
                "Oh, when you got me in a grid lock\n" +
                "What a great spot\n" +
                "Yeah, that turned up kind of love and it just won’t stop\n" +
                "No, so hard walking out\n" +
                "Got me stuck like crazy glue, ooh babe\n" +
                "\n" +
                "They hold on tight\n" +
                "Yeah, they hold on tight\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go\n" +
                "(Lips won’t let me go, lips won’t let me go, oh)\n" +
                "\n" +
                "They hold on tight (they hold on tight)\n" +
                "Yeah, they hold on tight (they hold on tight)\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go, oh, baby\n" +
                "\n" +
                "Holding back the faces I would make\n" +
                "I’m a fan and you’re the rock star\n" +
                "Making it hard on me\n" +
                "Visualize a monster\n" +
                "‘Cause you’re too bad for me\n" +
                "Shot that arrow, I’m hit\n" +
                "Need you right near me\n" +
                "Trying to maintain, so don’t mind if I turn away (no, no)\n" +
                "I try to maintain, so don’t mind if I turn away, ooh\n" +
                "\n" +
                "They hold on tight\n" +
                "They hold on tight\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go\n" +
                "(Lips won’t let me go, lips won’t let me go, oh)\n" +
                "\n" +
                "They hold on tight (they hold on tight)\n" +
                "Yeah, they hold on tight (they hold tight)\n" +
                "Ooh, they hold on tight\n" +
                "Them lips won’t let me go, no";
        intentactivity(view);
    }
    public void HTC(View view)
    {
        Global.lyrics="\"Home This Christmas\"\n" +
                "(feat. The Band Perry)\n" +
                "\n" +
                "Looking out the window\n" +
                "Waiting for your headlights\n" +
                "To pull up in the driveway\n" +
                "It's really coming down tonight\n" +
                "\n" +
                "You're scared that I won't make it through the storm\n" +
                "You should be here with me, safe and warm\n" +
                "\n" +
                "I'll be waiting under the mistletoe\n" +
                "While you're driving here through the winter snow\n" +
                "Baby think of me if it helps to get you home\n" +
                "When the only gift that I really need\n" +
                "Is to have your arms wrapped around me\n" +
                "Baby think of me if it helps to get you home\n" +
                "Home this christmas\n" +
                "\n" +
                "Pacing down the hallway\n" +
                "Trying to fight the urge to call\n" +
                "I could almost hear a pindrop\n" +
                "Cept for the clock on the wall\n" +
                "\n" +
                "And I'm scared that you won't make it through the storm\n" +
                "You should be here with me, safe and warm\n" +
                "\n" +
                "I'll be waiting under the mistletoe\n" +
                "While you're driving here through the winter snow\n" +
                "Baby think of me if it helps to get you home\n" +
                "When the only gift that I really need\n" +
                "Is to have your arms wrapped around me\n" +
                "Baby think of me if it helps to get you home\n" +
                "Home this christmas\n" +
                "\n" +
                "I'm praying that you make it home tonight\n" +
                "So we can lay down by the fireside\n" +
                "You and I\n" +
                "Till christmas morning\n" +
                "There's nothing else that I want this year\n" +
                "More than just to have you here\n" +
                "I'll be waiting\n" +
                "\n" +
                "Waiting under the mistletoe\n" +
                "While you're driving here through the winter snow\n" +
                "Baby think of me if it helps to get you home\n" +
                "When the only gift that I really need\n" +
                "Is to have your arms wrapped around me\n" +
                "Baby think of me if it helps to get you home\n" +
                "Home this christmas\n" +
                "\n" +
                "Looking out the window\n" +
                "Waiting for your head lights\n" +
                "To pull up in the driveway\n" +
                "It's really coming down tonight";
        intentactivity(view);
    }
    public  void HTM(View view)
    {
        Global.lyrics="\"Home To Mama\"\n" +
                "(with Cody Simpson)\n" +
                "\n" +
                "[Cody Simpson:]\n" +
                "I don't work hard when it's easy\n" +
                "I put in work when it's hard\n" +
                "Girl I never believed in love until I had yours\n" +
                "This is more than a season\n" +
                "And I'm not just sprung\n" +
                "I'm not afraid to tell you that you're the one\n" +
                "\n" +
                "The one I wake up thinking about\n" +
                "The one I can run to when I'm feeling down\n" +
                "Life is all good when you're around\n" +
                "Girl nobody from the past is beating you right now\n" +
                "\n" +
                "'Cause I take you home to mama\n" +
                "Let you meet my friends\n" +
                "'Cause you don't come with drama\n" +
                "So I want you 'til the world ends\n" +
                "\n" +
                "You're way more than worth it\n" +
                "But I don't feel like I deserve it\n" +
                "You got the pieces\n" +
                "You're my kind of perfect\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "I don't work hard when it's easy\n" +
                "I put in work when it's hard\n" +
                "And girl I never believed in love until I had yours\n" +
                "This is more than a season\n" +
                "And I'm not just sprung\n" +
                "I'm not afraid to tell you that you're the one\n" +
                "\n" +
                "I'm the one you wake up thinking about\n" +
                "The one I can run to when I'm feeling down\n" +
                "Life is all good when you're around\n" +
                "Girl nobody from the past is beating you right now\n" +
                "\n" +
                "'Cause I'll take you home to mama\n" +
                "I'll let you meet my friends\n" +
                "'Cause you don't come with drama\n" +
                "So I want you 'til the world ends\n" +
                "\n" +
                "You're way more than worth it\n" +
                "And I don't feel like I deserve it\n" +
                "You got the pieces\n" +
                "You're my kind of perfect\n" +
                "You're my kind of perfect\n" +
                "\n" +
                "I take you home, home, home to mama\n";
        intentactivity(view);
    }
    public  void  HBr(View view)
    {
        Global.lyrics="\"Hotline Bling (Remix)\"\n" +
                "(originally by Drake)\n" +
                "\n" +
                "What do you mean it's not like that?\n" +
                "Oh you're sorry?\n" +
                "But where are you now that I need you?\n" +
                "Girl let me tell you something\n" +
                "\n" +
                "I know you called him on his cell phone\n" +
                "When you couldn't reach my love\n" +
                "Called him on his cell phone\n" +
                "When you couldn't reach my love\n" +
                "I know when that hotline bling\n" +
                "Sure I'm not your only flame\n" +
                "I know when that hotline bling\n" +
                "Sure I'm not your only flame\n" +
                "\n" +
                "Every time I leave the city you\n" +
                "Been hangin' out with him like I don't know\n" +
                "Stay away from places that we always go\n" +
                "Tellin' him that we don't even talk no more\n" +
                "Every time he leave the city, you\n" +
                "Try to run game on me like it's just us\n" +
                "But I seen you in a Snapchat on his tour bus\n" +
                "When you hit my line, it don't mean that much\n" +
                "\n" +
                "I know you called him on his cell phone\n" +
                "When you couldn't reach my love\n" +
                "Called him on his cell phone\n" +
                "When you couldn't reach my love\n" +
                "I know when that hotline bling\n" +
                "Sure I'm not your only flame\n" +
                "I know when that hotline bling\n" +
                "Sure I'm not your only flame\n" +
                "\n" +
                "Every time I leave the city you, you, you\n" +
                "Tell me where he like to shop when you're up under him\n" +
                "But you're lyin' 'bout being with your girlfriends\n" +
                "When you take advantage of me bein' absent\n" +
                "Take advantage, yeah\n" +
                "And I really tried taking you serious baby, it’s really your loss\n" +
                "You had the chance being the only girl, my heart is crushed\n" +
                "Wanted to hold you down for a while\n" +
                "Keep you smiling, no matter the cost\n" +
                "Would I double cross?\n" +
                "\n" +
                "We could be talking on my cell phone\n" +
                "Right now when you need my love\n" +
                "Lose the number to my cell phone\n" +
                "Cause you don't really care about my love\n" +
                "Call me on that hotline bling\n" +
                "If you wanna be with me\n" +
                "Call me on that hotline bling, right now\n" +
                "If you wanna be with me\n";
        intentactivity(view);
    }
    public  void HTLr(View view)
    {
        Global.lyrics="\"How To Love (Remix)\"\n" +
                "(originally by Lil' Wayne)\n" +
                "\n" +
                "[Chorus]\n" +
                "See you had a lot of crooks tryna steal your heart\n" +
                "Never really had luck, couldn’t never figure out\n" +
                "How to love\n" +
                "How to love\n" +
                "You had a lot of moments that didn’t last forever\n" +
                "Now you in the corner tryna put it together\n" +
                "How to love\n" +
                "How to love\n" +
                "For a second you were here\n" +
                "Now you over there?\n" +
                "It's hard not to stare the way you moving your body\n" +
                "Like you never had a love\n" +
                "Had a love\n" +
                "\n" +
                "[Verse 1]\n" +
                "When you was just a young’un you’re looks but so precious\n" +
                "But now your grown up\n" +
                "So fly it's like a blessing but you can’t have a man look at you for 5 seconds\n" +
                "Without you being insecure\n" +
                "You never credit yourself so when you got older\n" +
                "It’s seems like you came back 10 times over\n" +
                "Now you’re sitting here in this damn corner\n" +
                "Looking through all your thoughts and looking over your shoulder\n" +
                "\n" +
                "[Chorus]\n" +
                "See you had a lot of crooks tryna steal your heart\n" +
                "Never really had luck, couldn’t never figure out\n" +
                "How to love\n" +
                "How to love\n" +
                "\n" +
                "[Original Rap Verse]\n" +
                "I just wanna take my time\n" +
                "I just wanna do my thing\n" +
                "Maybe we press rewind\n" +
                "Maybe I buy that ring\n" +
                "We could grow old together\n" +
                "Just share our soul together\n" +
                "Find out how to love, kiss and hug\n" +
                "How to roll together\n" +
                "I just need you by my side\n" +
                "Baby we could be alright\n" +
                "I just want to hold you right\n" +
                "We could go into the night\n" +
                "You're the one I need\n" +
                "\n" +
                "[Chorus]\n" +
                "See you had a lot of crooks tryna steal your heart\n" +
                "Never really had luck, couldn’t never figure out\n" +
                "How to love\n" +
                "How to love\n" +
                "You had a lot of moments that didn’t last forever\n" +
                "Now you in the corner tryna put it together\n" +
                "How to love\n" +
                "How to love\n" +
                "For a second you were here\n" +
                "Why you over there?\n" +
                "It's hard not to stare the way you moving your body\n" +
                "Like you never had a love\n" +
                "Had a love\n" +
                "\n" +
                "[Verse 2]\n" +
                "You had a lot of dreams that transform to visions\n" +
                "The fact that you saw the world affected all your decisions\n" +
                "But it wasn’t your fault\n" +
                "Wasn’t in your intentions\n" +
                "\n" +
                "You the one here talking to me\n" +
                "You don’t wanna listen\n" +
                "But I admire your popping bottles and dippin’\n" +
                "Just as much as you admire bartending and stripping\n" +
                "Baby, so don’t be mad\n" +
                "Nobody else tripping\n" +
                "You see a lot of crooks and the crooks still crook\n" +
                "\n" +
                "[Chorus]\n" +
                "See you had a lot of crooks tryna steal your heart\n" +
                "Never really had luck, couldn’t never figure out\n" +
                "How to love\n" +
                "How to love\n" +
                "You had a lot of moments that didn’t last forever\n" +
                "Now you in the corner tryna put it together\n" +
                "How to love\n" +
                "How to love\n" +
                "For a second you were here\n" +
                "Why you over there?\n" +
                "It's hard not to stare the way you moving your body\n" +
                "Like you never had a love\n" +
                "Had a love\n" +
                "\n" +
                "I just want you to know...\n";
        intentactivity(view);
    }
    public  void IW(View view)
    {
        Global.lyrics="\"I Would\"\n" +
                "\n" +
                "If I could take away the pain\n" +
                "And put a smile on your face\n" +
                "Baby, I would, baby, I would\n" +
                "If I could make a better way\n" +
                "So you could see a better day\n" +
                "Baby, I would, baby, I would\n" +
                "\n" +
                "I would build a doorway to the sky and hand you the keys\n" +
                "Let you know that you're always welcome so that you never leave\n" +
                "Buy you all those fancy things that you only see on TV\n" +
                "Run away to a hideaway, we'd be living the American Dream\n" +
                "\n" +
                "And I know it's never gonna be that easy\n" +
                "But I know that it won't hurt us to try\n" +
                "\n" +
                "If I could take away the pain\n" +
                "And put a smile on your face\n" +
                "Baby, I would, baby, I would\n" +
                "If I could make a better way\n" +
                "So you could see a better day\n" +
                "Baby, I would, baby, I would\n" +
                "Just to hear you say\n" +
                "\n" +
                "Baby, I would\n" +
                "\n" +
                "I would build the love a river wide\n" +
                "So that it never runs dry\n" +
                "Anytime you ask me why\n" +
                "I'm smiling, say that I'm satisfied\n" +
                "\n" +
                "You got your flaws and so do I\n" +
                "Past lovers that made you cry\n" +
                "And though I wanna make it right\n" +
                "I just can't read your mind, no\n" +
                "\n" +
                "And I know it's never gonna be that easy\n" +
                "But I know that it won't hurt us to try\n" +
                "\n" +
                "If I could take away the pain oh no\n" +
                "And put a smile on your face\n" +
                "Baby, I would, baby, I would\n" +
                "If I could make a better way\n" +
                "So you could see a better day, no\n" +
                "Baby, I would, baby, I would\n" +
                "Just to hear you say\n" +
                "\n" +
                "Baby, I would\n" +
                "\n" +
                "Yeah, it's not about what I want\n" +
                "It's all about what you need\n" +
                "I know that he hurt you\n" +
                "But that wasn't me\n" +
                "And I know, and I know sometimes it's hard to see\n" +
                "That I'm where you need to be\n" +
                "\n" +
                "If I could take away the pain oh no\n" +
                "And put a smile on your face\n" +
                "Baby, I would, baby, I would\n" +
                "If I could make a better way\n" +
                "So you could see a better day, no\n" +
                "Baby, I would, baby, I would\n" +
                "\n" +
                "Baby, I would";
        intentactivity(view);
    }
    public  void IBT(View view)
    {
        Global.lyrics="\"I'll Be There\"\n" +
                "\n" +
                "Crying up above, I'm just here to take you away\n" +
                "Don't worry 'bout a thing, I'm just focused on you today\n" +
                "\n" +
                "You're laid out\n" +
                "You were raised up in a poor town\n" +
                "Roll up, baby roll up\n" +
                "So hard to leave, but I know I gotta go now\n" +
                "Paris and London (on top of the world)\n" +
                "Baby we're so down (will you be my girl?)\n" +
                "Something I wanna say\n" +
                "Yeah, you know I'll be there\n" +
                "\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n" +
                "\n" +
                "I see my phone ring, hope it's you babe\n" +
                "You sent me a picture, well I sent one too\n" +
                "I'm just tryna keep this love on track\n" +
                "Oh babe, I got your heart and I won't give it back\n" +
                "\n" +
                "You're laid out\n" +
                "You were raised up in a poor town\n" +
                "Roll up, baby roll up\n" +
                "So hard to leave, but I know I gotta go now\n" +
                "Paris and London (on top of the world)\n" +
                "Baby we're so down (will you be my girl?)\n" +
                "Something I wanna say\n" +
                "Yeah, you know I'll be there\n" +
                "\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n" +
                "\n" +
                "Holding you close to my heart\n" +
                "Uh, yeah, so I'm laid back in the Maybach\n" +
                "Damn these seats go way back\n" +
                "I was thinking about way back\n" +
                "When we used to say that\n" +
                "I was yours, you were mine\n" +
                "And we fought to pass the time\n" +
                "And I realized, I realized, that we\n" +
                "(Babe) no matter what\n" +
                "(Babe) no matter what\n" +
                "(Babe) no matter what (oh)\n" +
                "Babe, babe, babe, yeah, yeah\n" +
                "\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n" +
                "I'll be there for you, even though I'm gone\n" +
                "Holding you close babe, close to my heart\n";
        intentactivity(view);
    }
    public  void ISY(View view)
    {
        Global.lyrics="\"I'll Show You\"\n" +
                "\n" +
                "My life is a movie and everyone's watching\n" +
                "So let's get to the good part and past all the nonsense\n" +
                "\n" +
                "Sometimes it's hard to do the right thing\n" +
                "When the pressure's coming down like lightning\n" +
                "It's like they want me to be perfect\n" +
                "When they don't even know that I'm hurting\n" +
                "\n" +
                "This life's not easy, I'm not made out of steel\n" +
                "Don't forget that I'm human, don't forget that I'm real\n" +
                "Act like you know me, but you never will\n" +
                "But there's one thing that I know for sure\n" +
                "\n" +
                "I'll show you\n" +
                "I'll show you\n" +
                "I'll show you\n" +
                "I'll show you\n" +
                "\n" +
                "I got to learn things, learn them the hard way\n" +
                "Gotta see what it feels like, no matter what they say\n" +
                "\n" +
                "Sometimes it's hard to do the right thing\n" +
                "When the pressure's coming down like lightning\n" +
                "It's like they want me to be perfect\n" +
                "When they don't even know that I'm hurting\n" +
                "\n" +
                "This life's not easy, I'm not made out of steel\n" +
                "Don't forget that I'm human, don't forget that I'm real\n" +
                "Act like you know me, but you never will\n" +
                "But there's one thing that I know for sure\n" +
                "\n" +
                "I'll show you\n" +
                "I'll show you\n" +
                "I'll show you\n" +
                "I'll show you\n" +
                "\n" +
                "This life's not easy, I'm not made out of steel\n" +
                "Don't forget that I'm human, don't forget that I'm real\n" +
                "Act like you know me, but you never will\n" +
                "But there's one thing that I know for sure\n" +
                "\n" +
                "I'll show you\n" +
                "\n" +
                "I'll show you\n" ;
        intentactivity(view);
    }
    public  void  I(View view)
    {
        Global.lyrics="\"Intertwine\"\n" +
                "(with Lil Twist)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "What's the use of being lonely?\n" +
                "When I'm offering my company\n" +
                "You could be my lover, hold me\n" +
                "I'll give you attention all night, all day\n" +
                "Intertwine, we can intertwine\n" +
                "We can intertwine, we can intertwine\n" +
                "Oh yeah\n" +
                "\n" +
                "[Lil Twist:]\n" +
                "Had the whole hood shook when you moved in\n" +
                "Face like a goddess, body on ten\n" +
                "Had to be back in the crib before the streets lights\n" +
                "That was back when you wasn't allowed to have friends\n" +
                "Now you grown up features all swole up\n" +
                "Seen you at the club had me like hold up\n" +
                "What you doing', who you with, what you sippin' on? (sipping on)\n" +
                "Who you doing, where you being, let me take you home\n" +
                "And if you hungry we can stop at the Waffle House\n" +
                "I'm on that shit it's whatever what you talking 'bout\n" +
                "Take that time to get to know me\n" +
                "Cause baby what's the use of being lonely?\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "What's the use of being lonely?\n" +
                "When I'm offering my company\n" +
                "You could be my lover, hold me\n" +
                "I'll give you attention all night, all day\n" +
                "Intertwine, we can intertwine\n" +
                "We should make some time\n" +
                "So I could intertwine, with you\n" +
                "\n" +
                "[Lil Twist:]\n" +
                "We could intertwine, just let me get behind\n" +
                "And watch me run up in that thang like the finish line\n" +
                "To end it like it's Christmas time\n" +
                "I eat it like it's dinner time\n" +
                "She said let's do it like at 86\n" +
                "I said let's do it like 69\n" +
                "Give her a bit a this it ain't no way she getting tired\n" +
                "Introduced to the molly now she's amp'd and she's wired\n" +
                "Get her back to the room she said Twizzy is who I desire\n" +
                "I said let's get in the shower girl that ass is on fire\n" +
                "I pay you with attention direct a positive wire\n" +
                "That shit don't need even matter as long as love transpires\n" +
                "And after all that, baby you should really know me\n" +
                "Now you ain't got never be lonely\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "What's the use of being lonely?\n" +
                "When I'm offering my company\n" +
                "You could be my lover, hold me\n" +
                "I'll give you attention all night, all day\n" +
                "Intertwine, we can intertwine\n" +
                "We should make some time\n" +
                "So I could intertwine, with you\n" +
                "\n" +
                "[Justin Bieber x2:]\n" +
                "Tell me do you really want it?\n" +
                "Wake up in the morning\n" +
                "Right next to me baby, right next to me baby\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "What's the use of being lonely?\n" +
                "When I'm offering my company\n" +
                "You could be my lover, hold me\n" +
                "I'll give you attention all night, all day\n" +
                "Intertwine, we can intertwine\n" +
                "We can intertwine, we can intertwine\n" +
                "Oh yeah";
        intentactivity(view);
    }
    public  void JLT(View view)
    {
        Global.lyrics="\"Just Like Them\"\n" +
                "\n" +
                "I know it's hard but\n" +
                "Let's go\n" +
                "\n" +
                "There's something different in your eyes baby\n" +
                "You can't seem to look into mine lately\n" +
                "Tell me what is on your mind baby\n" +
                "Or I'm gonna assume that something's wrong\n" +
                "\n" +
                "[Chorus:]\n" +
                "I thought that you were different from the moment that we kissed\n" +
                "'cause all those other women couldn't care less if I lived\n" +
                "And I'm not barely trippin I just can't do this again\n" +
                "Please don't tell me you're just like them\n" +
                "Please don't tell me you're just like them\n" +
                "You're just like them\n" +
                "\n" +
                "I know that it's hard to trust of\n" +
                "But you need the trust that my love\n" +
                "Will never leave you in the dust\n" +
                "\n" +
                "[Chorus]\n" +
                "\n" +
                "Baby you ain't get this love on track\n" +
                "Will you run away gotta wait on after love back\n" +
                "You know that I love you girl so tell me what you're waiting for\n" +
                "You gotta know know know know\n" +
                "Know know know know know know\n" +
                "Know know know know know know";
        intentactivity(view);
    }
    public  void KAT(View view)
    {
        Global.lyrics="\"Kiss & Tell\"\n" +
                "\n" +
                "J-J-J-J-B, yeah, whoa, oh, whoa, no.\n" +
                "\n" +
                "Now I can see it, girl.\n" +
                "You ain't gotta say nothing, no.\n" +
                "Your lips are calling me\n" +
                "Like they wanna do something.\n" +
                "I feel the chemistry.\n" +
                "Yeah, you're into me.\n" +
                "A little kiss is a definite possibility.\n" +
                "\n" +
                "Seen you a couple times,\n" +
                "Had a couple conversations.\n" +
                "Since you've been on my mind\n" +
                "Made a couple observations.\n" +
                "Like you're a fly chick.\n" +
                "You could be my chick.\n" +
                "Play by the rules and you can get what I give.\n" +
                "\n" +
                "Just keep it quiet, keep it on the hush.\n" +
                "And what we do keep it just between us.\n" +
                "I don't wanna see you tweet about J.B.\n" +
                "'Cause the only people that should know is you and me.\n" +
                "\n" +
                "So, baby,\n" +
                "I know that you're cool with rocking with me,\n" +
                "But I can't have you telling everybody\n" +
                "You got me all twisted with your lips like this.\n" +
                "\n" +
                "So, tell me, tell me, are you gonna kiss (kiss), kiss and tell?\n" +
                "Tell me, are you gonna kiss (kiss), kiss and tell?\n" +
                "Tell me, are you gonna kiss me\n" +
                "Then tell everybody\n" +
                "That you got me twisted with your lips, girl?\n" +
                "Are you gonna kiss and tell?\n" +
                "\n" +
                "It's confidential,\n" +
                "No one has to do with it\n" +
                "But you and me, girl.\n" +
                "Telling would ruin it.\n" +
                "Don't need that TMZ\n" +
                "All in our privacy.\n" +
                "Use them lips for kissing, girl,\n" +
                "If you wanna ride with me.\n" +
                "\n" +
                "And if you wanna tell somebody\n" +
                "Then we can call the whole thing off.\n" +
                "No problem.\n" +
                "You can go your way,\n" +
                "And I'll go mine,\n" +
                "But I'd rather spend a little time with you, yeah.\n" +
                "\n" +
                "Just keep it quiet, keep it on the hush.\n" +
                "And what we do keep it just between us.\n" +
                "I don't wanna see you tweet about J.B.\n" +
                "'Cause the only people that should know is you and me.\n" +
                "\n" +
                "So, baby,\n" +
                "I know that you're cool with rocking with me,\n" +
                "But I can't have (good kiss) you telling everybody (everybody)\n" +
                "You got me all twisted with your lips like this.\n" +
                "\n" +
                "So tell me, tell me, are you gonna kiss (kiss), kiss and tell?\n" +
                "Tell me, are you gonna kiss (kiss), kiss and tell?\n" +
                "Tell me, are you gonna kiss me\n" +
                "Then tell everybody\n" +
                "That you got me twisted with your lips, girl?\n" +
                "Are you gonna kiss and tell, tell?\n" +
                "\n" +
                "Said, are you gonna kiss and tell, tell?\n" +
                "Said, are you gonna kiss and tell, tell?\n" +
                "Said, are you gonna kiss and tell, yeah, kiss and tell, oh?\n" +
                "\n" +
                "Don't tell your homies.\n" +
                "Don't tell your mama.\n" +
                "Don't tell your girlfriends.\n" +
                "That'll start some drama.\n" +
                "Stay off that Facebook.\n" +
                "I'll treat you real good.\n" +
                "You keep this private,\n" +
                "And you can get what I give.\n" +
                "\n" +
                "Baby,\n" +
                "I know that you're cool with rocking with me,\n" +
                "But I can't have you telling everybody (Everybody knows.)\n" +
                "You got me all twisted with your lips like this\n" +
                "\n" +
                "So tell me, tell me, are you gonna kiss (kiss), kiss and tell?\n" +
                "Tell me, are you gonna kiss (kiss), kiss and tell?\n" +
                "Tell me, are you gonna kiss me\n" +
                "Then tell everybody\n" +
                "That you got me twisted with your lips, girl?\n" +
                "Are you gonna kiss and tell, oh, kiss and tell?\n" +
                "Whoa, oh\n" +
                "\n" +
                "I'm not about that\n" +
                "If you're gonna kiss and tell.\n" +
                "\n" +
                "No, no, no.\n" +
                "\n" +
                "If you're gonna kiss and tell.\n" +
                "If you're gonna kiss and tell.\n" +
                "That's not me.\n" +
                "\n";
        intentactivity(view);
    }
    public  void LG(View view)
    {
        Global.lyrics="\"Latin Girl\"\n" +
                "\n" +
                "She's my latin girl, she's my latin girl\n" +
                "\n" +
                "I was on the beach yah\n" +
                "I was on vacation\n" +
                "I was doing nothing\n" +
                "I was just sittin' patient\n" +
                "Then you walked by\n" +
                "You caught my eye\n" +
                "I said who's this girl, she's lookin super fly\n" +
                "\n" +
                "Hey miss beautiful\n" +
                "I've never seen you before\n" +
                "And I would like to be the one to show you I am cool enough\n" +
                "Hey little momma what you got on yah\n" +
                "Looking so good that I just want to telephone her\n" +
                "\n" +
                "She's my latin girl\n" +
                "Oooo pretty lady don't you think it's crazy\n" +
                "She's my latin girl\n" +
                "\n" +
                "Oh she tries to fight but she knows she likes it\n" +
                "She's my latin girl\n" +
                "Saw what I see then she's looking at me\n" +
                "She's my latin girl\n" +
                "Yeah yeah yeah\n" +
                "\n" +
                "Hey miss beautiful\n" +
                "I've never seen you before\n" +
                "And I would like to be the one to show you I am cool enough\n" +
                "\n" +
                "Hey little momma would you got on yah\n" +
                "Looking so good that I just want to telephone her\n" +
                "\n" +
                "She's my latin girl\n" +
                "Oooo pretty lady don't you think it's crazy\n" +
                "She's my latin girl\n" +
                "Oh she tries to fight it but she knows she likes it\n" +
                "She's my latin girl\n" +
                "Saw what I see then she's looking at me\n" +
                "\n" +
                "She's my latin girl\n" +
                "Yeah yeah yeah\n" +
                "\n" +
                "She's my latin girl\n" +
                "Oooo pretty lady don't you think it's crazy\n" +
                "She's my latin girl\n" +
                "Oh she tries to fight it but she knows she likes it\n" +
                "She's my latin girl\n" +
                "Saw what I see then she's looking at me\n" +
                "\n" +
                "She's my latin girl\n" +
                "Yeah yeah yeah\n";
        intentactivity(view);
    }
    public  void LMLY(View view)
    {
        Global.lyrics="\"Let Me Love You\"\n" +
                "(feat. Justin Bieber)\n" +
                "\n" +
                "I used to believe\n" +
                "We were burnin' on the edge of somethin' beautiful\n" +
                "Somethin' beautiful\n" +
                "Sellin' a dream\n" +
                "Smoke and mirrors keep us waiting on a miracle\n" +
                "On a miracle\n" +
                "\n" +
                "Say, go through the darkest of days\n" +
                "Heaven's a heartbreak away\n" +
                "Never let you go, never let me down\n" +
                "Oh, it's been a hell of a ride\n" +
                "Driving the edge of a knife\n" +
                "Never let you go, never let me down\n" +
                "\n" +
                "Don't you give up, nah-nah-nah\n" +
                "I won't give up, nah-nah-nah\n" +
                "Let me love you\n" +
                "Let me love you\n" +
                "Don't you give up, nah-nah-nah\n" +
                "I won't give up, nah-nah-nah\n" +
                "Let me love you\n" +
                "Let me love you\n" +
                "Oh, baby, baby\n" +
                "\n" +
                "Don't fall asleep\n" +
                "At the wheel, we've got a million miles ahead of us\n" +
                "Miles ahead of us\n" +
                "All that we need\n" +
                "Is a rude awakening to know we're good enough\n" +
                "Know we're good enough\n" +
                "\n" +
                "Say go through the darkest of days\n" +
                "Heaven's a heartbreak away\n" +
                "Never let you go, never let me down\n" +
                "Oh, it's been a hell of a ride\n" +
                "Driving the edge of a knife\n" +
                "Never let you go, never let me down\n" +
                "\n" +
                "Don't you give up, nah-nah-nah\n" +
                "I won't give up, nah-nah-nah\n" +
                "Let me love you\n" +
                "Let me love you\n" +
                "Don't you give up, nah-nah-nah\n" +
                "I won't give up, nah-nah-nah\n" +
                "Let me love you\n" +
                "Let me love you\n" +
                "Oh, baby, baby\n" +
                "\n" +
                "Never let you go, never let you go go\n" +
                "Never let you go, never let you go go\n" +
                "Never let you go, whoa\n" +
                "No, never let you go, whoa\n" +
                "\n" +
                "Never let you go, never let you go go\n" +
                "Never let you go, never let you go go\n" +
                "Oh, no, no, no\n" +
                "No, never let you go\n" +
                "Yeah, yeah\n" +
                "No, never let you go\n" +
                "\n" +
                "Don't you give up, nah-nah-nah\n" +
                "I won't give up, nah-nah-nah\n" +
                "Let me love you\n" +
                "Let me love you\n" +
                "Don't you give up, nah-nah-nah\n" +
                "I won't give up, nah-nah-nah\n" +
                "Let me love you\n" +
                "Let me love you\n";
        intentactivity(view);
    }
    public  void LIWL(View view)
    {
        Global.lyrics="\"Life Is Worth Living\"\n" +
                "\n" +
                "Ended up on a crossroad\n" +
                "Try to figure out which way to go\n" +
                "It's like you're stuck on a treadmill\n" +
                "Running in the same place\n" +
                "You got your hazard lights on now\n" +
                "Hoping that somebody would slow down\n" +
                "Praying for a miracle\n" +
                "Who'll show you grace?\n" +
                "Had a couple dollars and a quarter tank of gas\n" +
                "With a long journey ahead\n" +
                "Seen a truck pull over\n" +
                "God sent an angel to help you out\n" +
                "He gave you direction\n" +
                "Showed you how to read a map\n" +
                "For that long journey ahead\n" +
                "Said it ain't never over\n" +
                "Oh, even in the midst of doubt\n" +
                "\n" +
                "Life is worth living, ou ou ou ou\n" +
                "Life is worth living, so live another day\n" +
                "The meaning of forgiveness\n" +
                "People make mistakes, doesn't mean you have to give in\n" +
                "Life is worth living again\n" +
                "\n" +
                "Relationship on a ski slope\n" +
                "Avalanche comin' down slow\n" +
                "Do we have enough time to salvage this love?\n" +
                "Feels like a blizzard in April\n" +
                "'Cause my heart is just that cold\n" +
                "Skating on thin ice\n" +
                "But it's strong enough to hold us up\n" +
                "Seen her scream and holler\n" +
                "Put us both on blast\n" +
                "Tearing each other down\n" +
                "When I thought it was over\n" +
                "God sent an angel to help us out, yeah\n" +
                "He gave us direction, showed us how to make it last\n" +
                "For that long journey ahead\n" +
                "Said it ain't never over\n" +
                "No, even in the midst of doubt\n" +
                "\n" +
                "Life is worth living, ou ou ou ou\n" +
                "Life is worth living, so live another day\n" +
                "The meaning of forgiveness\n" +
                "People make mistakes, doesn't mean you have to give in\n" +
                "Life is worth living again, oh whoa oh\n" +
                "Life is worth living again\n" +
                "\n" +
                "What I get from my reflection\n" +
                "Is a different perception\n" +
                "From what the world may see\n" +
                "They try to crucify me\n" +
                "I ain't perfect, won't deny\n" +
                "My reputation's on the line\n" +
                "So I'm working on a better me\n" +
                "\n" +
                "Life is worth living, oh yeah\n" +
                "Life is worth living, so live another day\n" +
                "The meaning of forgiveness\n" +
                "People make mistakes\n" +
                "Only God can judge me\n" +
                "Life is worth living again\n" +
                "Another day\n" +
                "Life is worth living again";
        intentactivity(view);
    }
    public  void  LFY(View view)
    {
        Global.lyrics="\"Looking For You\"\n" +
                "(feat. Migos)\n" +
                "\n" +
                "[Takeoff:] Guala!\n" +
                "[Bieber:] What's up Migos?\n" +
                "[Quavo:] What up JB, it's time to go to the club, time to pull them toys out man\n" +
                "Let's do it (I'm sorry)\n" +
                "\n" +
                "[Verse 1: Justin Bieber]\n" +
                "Hey where the party at? Let's go\n" +
                "Let's ride, let's roll\n" +
                "Yea, everywhere I go, them girls follow\n" +
                "Na, na, na, na, na\n" +
                "Let everybody know that I'm here tonight\n" +
                "As soon as I walk in the door\n" +
                "Pretty lady I think I need you in my life\n" +
                "In fact I know I need you for sure\n" +
                "\n" +
                "[Pre-Hook: Justin Bieber]\n" +
                "Tonight might be the night\n" +
                "You might mess around and fall in love in it\n" +
                "I might be the guy\n" +
                "That'll make you wanna fall in love again\n" +
                "Girl, what's your name, happy that you came\n" +
                "I'm the man in this, stick with me and gain love\n" +
                "And everywhere around the world\n" +
                "Don't you know girl that I'll be looking for you\n" +
                "\n" +
                "[Hook: Quavo]\n" +
                "Is it her looking for you, looking for you?\n" +
                "I'm not Paparazzi or a stalker\n" +
                "(I'll be looking for you)\n" +
                "She right in front of me looking for you, looking for you\n" +
                "Not the feds or a cop\n" +
                "(I'll be looking for you)\n" +
                "\n" +
                "[Verse 2: Justin Bieber]\n" +
                "I got money in my pocket and I ain't afraid to spend it\n" +
                "It ain't a problem, baby girl when you're winning\n" +
                "Tell me what you wanna do, would you make a move now?\n" +
                "Girl you ain't gotta fight the feeling, tell me why you're grinning\n" +
                "(Look at her face)\n" +
                "I think you're liking what I'm saying\n" +
                "Do I really gotta say anymore?\n" +
                "(Say no more)\n" +
                "Need to know I ain't playing\n" +
                "(I ain't playing)\n" +
                "Baby what are we waiting for?\n" +
                "\n" +
                "[Pre-Hook: Justin Bieber]\n" +
                "Tonight might be the night\n" +
                "You might mess around and fall in love in it\n" +
                "I might be the guy\n" +
                "That'll make you wanna fall in love again\n" +
                "Girl, what's your name, happy that you came\n" +
                "I'm the man in this, stick with me and gain love\n" +
                "And everywhere around the world\n" +
                "Don't you know that I'll be looking for you\n" +
                "I'll be looking for you\n" +
                "\n" +
                "[Hook: Quavo]\n" +
                "Is it her looking for you, looking for you?\n" +
                "I'm not Paparazzi or a stalker\n" +
                "(I'll be looking for you)\n" +
                "Looking for you, looking for you\n" +
                "Not the feds or a cop\n" +
                "(I'll be looking for you)\n" +
                "\n" +
                "[Verse 3: Quavo]\n" +
                "Bad bitches in the party, alcohol on me\n" +
                "Tell the waitress put the sparklers on my 20 B-T\n" +
                "I asked her what's her name - I just know she said Hannah\n" +
                "On the way to the mansion, said she loved the Panamera\n" +
                "In the trap with J-B with my phone chirpin' like beepers\n" +
                "Mona Lisa, Anna Mae is in the pot when I beat it\n" +
                "Take her across the country, I got plugs on the Visa\n" +
                "Cut your man off little mama, you don't need him\n" +
                "\n" +
                "[Verse 4: Takeoff]\n" +
                "Yeen never seen a nigga like me (Takeoff)\n" +
                "Hoppin' out the Chevy, steppin' with a mink, gold chain, Mr. T\n" +
                "In the summer, in the beach with hummer, with the leather seats\n" +
                "Would tell you 'bout my huh but I bet they watching me\n" +
                "I'm a vegetarian, all I want is some lettuce and some broccoli\n" +
                "Mansion out in Beverly, your bitch calling me call me your majesty\n" +
                "\n" +
                "[Verse 5: Offset]\n" +
                "My bitch is so gorgeous, I might pay her mortgage\n" +
                "I run to the money like Forrest\n" +
                "My life is historic\n" +
                "Travel 'round the world like I'm in orbit\n" +
                "I take your bitch and dunk her like Ben Gordon\n" +
                "I watch her like a telescope\n" +
                "I beat it and kill it like I'm Lil TerRio\n" +
                "I got your bitch, she watching me like Tyler Perry shows\n" +
                "I'm young and I'm rich ridin' in a Phantom Ghost\n" +
                "I paint a picture for niggas like Michelangelo\n" +
                "\n" +
                "[Pre-Hook: Justin Bieber]\n" +
                "Tonight might be the night\n" +
                "You might mess around and fall in love in it\n" +
                "I might be the guy\n" +
                "That'll make you wanna fall in love again\n" +
                "Girl, what's your name, happy that you came\n" +
                "I'm the man in this, stick with me and gain love\n" +
                "And everywhere around the world\n" +
                "Don't you know girl that I'll be looking for you\n" +
                "I'll be looking for you\n" +
                "\n" +
                "[Hook: Quavo]\n" +
                "Is it her looking for you, looking for you?\n" +
                "I'm not Paparazzi or a stalker\n" +
                "(I'll be looking for you)\n" +
                "She right in front of me looking for you, looking for you\n" +
                "Not the feds or a cop\n" +
                "(I'll be looking for you)";
        intentactivity(view);
    }
    public  void LM(View view)
    {
        Global.lyrics="\"Love Me\"\n" +
                "\n" +
                "(Oh, oh, oh, oh)\n" +
                "\n" +
                "My friends say I'm a fool to think\n" +
                "That you're the one for me\n" +
                "I guess I'm just a sucker for love\n" +
                "\n" +
                "'Cause honestly the truth is that\n" +
                "You know I'm never leaving\n" +
                "'Cause you're my angel sent from above\n" +
                "\n" +
                "Baby, you can do no wrong\n" +
                "My money is yours\n" +
                "Give you little more because I love you, love you\n" +
                "With me, girl, is where you belong\n" +
                "Just stay right here\n" +
                "I promise my dear I'll put nothing above you, above you\n" +
                "\n" +
                "Love me, love me\n" +
                "Say that you love me\n" +
                "Fool me, fool me\n" +
                "Oh, how you do me\n" +
                "Kiss me, kiss me\n" +
                "Say that you miss me\n" +
                "Tell me what I wanna hear\n" +
                "Tell me you (love me)\n" +
                "Love me, love me\n" +
                "Say that you love me\n" +
                "Fool me, fool me\n" +
                "Oh, how you do me\n" +
                "Kiss me, kiss me\n" +
                "Say that you miss me\n" +
                "Tell me what I wanna hear\n" +
                "Tell me you love me\n" +
                "\n" +
                "People try to tell me\n" +
                "But I still refuse to listen\n" +
                "'Cause they don't get to spend time with you\n" +
                "A minute with you is worth more than\n" +
                "A thousand days without your love, oh, your love\n" +
                "\n" +
                "Baby, you can do no wrong\n" +
                "My money is yours\n" +
                "Give you little more because I love you, love you\n" +
                "With me, girl, is where you belong\n" +
                "Just stay right here\n" +
                "I promise my dear I'll put nothing above you, above you\n" +
                "\n" +
                "Love me, love me\n" +
                "Say that you love me\n" +
                "Fool me, fool me\n" +
                "Oh, how you do me\n" +
                "Kiss me, kiss me\n" +
                "Say that you miss me\n" +
                "Tell me what I wanna hear\n" +
                "Tell me you love me.\n" +
                "Love me, love me\n" +
                "Say that you love me\n" +
                "Fool me, fool me\n" +
                "Oh, how you do me\n" +
                "Kiss me, kiss me\n" +
                "Say that you miss me\n" +
                "Tell me what I wanna hear\n" +
                "Tell me you love me.\n" +
                "\n" +
                "My heart is blind but I don't care\n" +
                "'Cause when I'm with you everything has disappeared\n" +
                "\n" +
                "And every time I hold you near\n" +
                "I never wanna let you go, oh\n" +
                "\n" +
                "Love me, love me\n" +
                "Say that you love me\n" +
                "Fool me, fool me\n" +
                "Oh, how you do me\n" +
                "Kiss me, kiss me\n" +
                "Say that you miss me\n" +
                "Tell me what I wanna hear\n" +
                "Tell me you love me.\n" +
                "Love me, love me\n" +
                "Say that you love me\n" +
                "Fool me, fool me\n" +
                "Oh, how you do me\n" +
                "Kiss me, kiss me\n" +
                "Say that you miss me\n" +
                "Tell me what I wanna hear\n" +
                "Tell me you love me\n" ;
        intentactivity(view);
    }
    public  void LMYD(View view)
    {
        Global.lyrics="\"Love Me Like You Do\"\n" +
                "\n" +
                "Love me like you do\n" +
                "Love me like you do\n" +
                "Like you do\n" +
                "Hold me tight and don't let go\n" +
                "\n" +
                "What am I to do\n" +
                "When you love me like you do?\n" +
                "Like you do\n" +
                "Hold me tight and don't let go\n" +
                "\n" +
                "Baby, baby, baby\n" +
                "Teach me, teach me, teach me\n" +
                "Show me, show me, show me\n" +
                "The way to your heart\n" +
                "\n" +
                "Oh, my baby, baby\n" +
                "I'm begging, lady, lady\n" +
                "Put me in the middle\n" +
                "That's where I'ma start\n" +
                "\n" +
                "I like how your eyes complementing your hair\n" +
                "The way that them jeans fit is making me stare\n" +
                "Promise, I'll be here forever, I swear\n" +
                "(Our bodies touching while you)\n" +
                "\n" +
                "Love me like you do\n" +
                "Love me like you do\n" +
                "Like you do\n" +
                "Hold me tight and don't let go\n" +
                "\n" +
                "What am I to do\n" +
                "When you love me like you do?\n" +
                "Like you do\n" +
                "Hold me tight and don't let go\n" +
                "\n" +
                "Baby, baby, baby\n" +
                "Let me, let me, let me\n" +
                "Let me, let me, let me\n" +
                "Be all you desire\n" +
                "\n" +
                "Pretty baby, baby\n" +
                "I'm begging lady, lady\n" +
                "Take me to the top now\n" +
                "And I'll take you higher\n" +
                "\n" +
                "I like how your eyes complementing your hair\n" +
                "The way that them jeans fit is making me stare\n" +
                "Promise, I'll be here forever, I swear\n" +
                "(Kissing on your neck while you)\n" +
                "\n" +
                "Love me like you do\n" +
                "Love me like you do\n" +
                "Like you do\n" +
                "Hold me tight and don't let go\n" +
                "\n" +
                "What am I to do\n" +
                "When you love me like you do?\n" +
                "Like you do\n" +
                "Hold me tight and don't let go\n" +
                "\n" +
                "Alright, ok\n" +
                "Right there, that way\n" +
                "'Cause when you love me, I can feel it\n" +
                "When your heart beats, I can hear it\n" +
                "\n" +
                "Be quiet, don't say a word\n" +
                "Don't say no, girl, I'm all yours\n" +
                "Love me like you do but let me go first\n" +
                "Listen to these words right here\n" +
                "\n" +
                "Love me like you do, love me like it's new\n" +
                "Love me like you love me, like there's nothing left to lose\n" +
                "We'll hop up in a benz, if you're tryna cruise\n" +
                "Hop up in the bed, baby, if you're tryna snooze\n" +
                "Louis V. shoes, look at me, do it\n" +
                "Got a lot of secrets, baby, can you guess clues?\n" +
                "And if you had a choice I know what you'd choose\n" +
                "(You'd choose me, right?)\n" +
                "\n" +
                "Love me like you do\n" +
                "Love me like you do\n" +
                "Like you do\n" +
                "Love me tight and don't let go\n" +
                "\n" +
                "What am I to do\n" +
                "When you love me like you do?\n" +
                "Like you do\n" +
                "Love me tight and don't let go\n" +
                "\n" +
                "What am I to do do do?\n" +
                "Love me like you do, you do\n" +
                "Like you do\n" +
                "Love me tight and don't let go\n" +
                "\n" +
                "What am I to do\n" +
                "When you love me like you do?\n" +
                "Like you do\n" +
                "Love me tight and don't let go\n" +
                "\n" +
                "No no no no, no no no no no no no no no no, yeah.\n" +
                "\n" +
                "Love me like you do, do, do, do, do\n" +
                "Love me like you do, do, do, do, do, do, do...\n" +
                "Yeah, yeah...";
        intentactivity(view);
    }
    public  void LY(View view)
    {
        Global.lyrics="\"Love Yourself\"\n" +
                "\n" +
                "For all the times that you rain on my parade\n" +
                "And all the clubs you get in using my name\n" +
                "You think you broke my heart, oh, girl for goodness' sake\n" +
                "You think I'm crying on my own. Well, I ain't\n" +
                "\n" +
                "And I didn't wanna write a song\n" +
                "'Cause I didn't want anyone thinking I still care. I don't\n" +
                "But you still hit my phone up\n" +
                "And, baby, I'll be movin' on\n" +
                "And I think you should be somethin' I don't wanna hold back\n" +
                "Maybe you should know that\n" +
                "\n" +
                "My mama don't like you and she likes everyone\n" +
                "And I never like to admit that I was wrong\n" +
                "And I've been so caught up in my job\n" +
                "Didn't see what's going on\n" +
                "But now I know\n" +
                "I'm better sleeping on my own\n" +
                "\n" +
                "'Cause if you like the way you look that much\n" +
                "Oh, baby, you should go and love yourself\n" +
                "And if you think that I'm still holdin' on to somethin'\n" +
                "You should go and love yourself\n" +
                "\n" +
                "And when you told me that you hated my friends\n" +
                "The only problem was with you and not them\n" +
                "And every time you told me my opinion was wrong\n" +
                "And tried to make me forget where I came from\n" +
                "\n" +
                "And I didn't wanna write a song\n" +
                "'Cause I didn't want anyone thinking I still care. I don't\n" +
                "But you still hit my phone up\n" +
                "And, baby, I'll be movin' on\n" +
                "And I think you should be somethin' I don't wanna hold back\n" +
                "Maybe you should know that\n" +
                "\n" +
                "My mama don't like you and she likes everyone\n" +
                "And I never like to admit that I was wrong\n" +
                "And I've been so caught up in my job\n" +
                "Didn't see what's going on\n" +
                "But now I know\n" +
                "I'm better sleeping on my own\n" +
                "\n" +
                "'Cause if you like the way you look that much\n" +
                "Oh, baby, you should go and love yourself\n" +
                "And if you think that I'm still holdin' on to somethin'\n" +
                "You should go and love yourself\n" +
                "\n" +
                "For all the times that you made me feel small\n" +
                "I fell in love. Now I feel nothin' at all\n" +
                "And never felt so low when I was vulnerable\n" +
                "Was I a fool to let you break down my walls?\n" +
                "\n" +
                "'Cause if you like the way you look that much\n" +
                "Oh, baby, you should go and love yourself\n" +
                "And if you think that I'm still holdin' on to somethin'\n" +
                "You should go and love yourself\n" +
                "\n" +
                "'Cause if you like the way you look that much\n" +
                "Oh, baby, you should go and love yourself\n" +
                "And if you think (you think) that I'm (that I'm) still holdin' on (holdin' on) to somethin'\n" +
                "You should go and love yourself";
        intentactivity(view);
    }
    public  void MIL(View view)
    {
        Global.lyrics="\"Madly In Love (Bigger Than Life)\"\n" +
                "\n" +
                "Love is in the air\n" +
                "Candles all around us\n" +
                "There's no need to see, nothing, nothing\n" +
                "Baby I'm yours, yours until forever\n" +
                "Cause you know that I would never ever want this to change\n" +
                "\n" +
                "It's all about the magic\n" +
                "All about the madness in your eyes\n" +
                "Madly in love, yeah\n" +
                "It's all about the magic\n" +
                "All about the madness in your eyes\n" +
                "Madly in love\n" +
                "Madly in love babe\n" +
                "Madly in love\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n" +
                "Madly in love\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n" +
                "\n" +
                "Babe, you are the reason to breathe\n" +
                "And babe, you know you're all that I need\n" +
                "Remember when you took my hand\n" +
                "And ran away (it was just us two babe)\n" +
                "And wandered off to Chinatown\n" +
                "Laughing 'bout nothing at all\n" +
                "When I look into your eyes\n" +
                "\n" +
                "It's all about the magic\n" +
                "All about the madness in your eyes\n" +
                "Madly in love, yeah\n" +
                "It's all about the magic\n" +
                "All about the madness in your eyes\n" +
                "Madly in love\n" +
                "Madly in love babe\n" +
                "Madly in love\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n" +
                "Madly in love\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n" +
                "(Madly in love)\n";
        intentactivity(view);
    }
    public void  MYB(View view)
    {
        Global.lyrics="\"Make You Believe\"\n" +
                "\n" +
                "I'll make you believe\n" +
                "\n" +
                "[Verse 1:]\n" +
                "I heard you're looking for somebody to treat you right\n" +
                "'Cause them other guys don't live up to their height.\n" +
                "I heard you're looking for somebody to smack your heart.\n" +
                "Cause they going, they shot before you start.\n" +
                "\n" +
                "[Pre-Chorus:]\n" +
                "You ain't gotta search no further,\n" +
                "I got what you want (right here)\n" +
                "I'm not trying to waste your time by telling you what you want (right here).\n" +
                "They can make you promise in the dark,\n" +
                "I'll make you believe.\n" +
                "\n" +
                "[Chorus:]\n" +
                "(Dance with me girl)\n" +
                "Believe, believe, believe (eeve)\n" +
                "(Dance with me girl)\n" +
                "Believe, believe, believe (eeve)\n" +
                "(Dance with me girl)\n" +
                "Believe, believe, believe (eeve)\n" +
                "They can make you promises, but I\n" +
                "I'll make you believe.\n" +
                "(Believe, believe)\n" +
                "(Believe, believe)\n" +
                "\n" +
                "[Verse 2:]\n" +
                "I heard your looking for somebody to take control\n" +
                "Baby, give me the green light and we'll go.\n" +
                "So let me love you, 'till my heart stops\n" +
                "Let me touch you, when the beat drops.\n" +
                "\n" +
                "Right there.\n" +
                "\n" +
                "[Pre-chorus:]\n" +
                "You ain't gotta search no further,\n" +
                "I got what you want (right here)\n" +
                "I'm not trying to waste your time by telling you what you want (right here).\n" +
                "They can make you promise in the dark,\n" +
                "I'll make you believe.\n" +
                "\n" +
                "[Chorus:]\n" +
                "(Dance with me girl)\n" +
                "Believe, believe, believe (eeve)\n" +
                "(Dance with me girl)\n" +
                "Believe, believe, believe (eeve)\n" +
                "(Dance with me girl)\n" +
                "Believe, believe, believe (eeve)\n" +
                "They can make you promise in the dark, but\n" +
                "I'll make you believe.";
        intentactivity(view);
    }
    public  void  MB(View view)
    {
        Global.lyrics="\"Mama's Boy\"\n" +
                "\n" +
                "Walkin on red dirt no concrete pavement\n" +
                "Navy blue book bag on my back\n" +
                "\n" +
                "Couple miles 'til I'm at the grey hound station\n" +
                "Hope they let me ride away with them\n" +
                "\n" +
                "Got pretty mad at my father today\n" +
                "But I'm still thinkin bout what my mother would say\n" +
                "\n" +
                "As I'm singin an old song she used to sing\n" +
                "When things weren't going the way she wanted them to\n" +
                "\n" +
                "I wanna run away\n" +
                "I do\n" +
                "I wanna run away\n" +
                "I do\n" +
                "I wanna run away\n" +
                "I do\n" +
                "I wanna run away from you\n" +
                "I wanna leave this school\n" +
                "I do\n" +
                "I wanna leave this town\n" +
                "I do\n" +
                "But she'll be worried sick if\n" +
                "I do (if I do)\n" +
                "\n" +
                "Can't run away and leave my mama alone\n" +
                "Cause I'm her boy Mama's boy\n" +
                "Just don't run off and leave my mama at home\n" +
                "Cause I'm her boy mama's boys\n" +
                "Just don't run away, run away\n" +
                "Can't run away and leave my mama alone\n" +
                "Cause I'm her boy Mama's boy\n" +
                "Just don't\n" +
                "\n" +
                "So I turn around and headed to the old run down building\n" +
                "Bells gonna ring before I make it back\n" +
                "\n" +
                "I watch the upper class men drive right past me\n" +
                "Wish they'd let me ride away with them\n" +
                "\n" +
                "Still haven't got over it yet\n" +
                "It's been playin in my ears all mornin I swear\n" +
                "\n" +
                "My iPods the same tune my mother would sing\n" +
                "When things weren't goin the way she wanted them to\n" +
                "\n" +
                "I wanna run away\n" +
                "I do\n" +
                "I wanna run away\n" +
                "I do\n" +
                "I wanna run away\n" +
                "I do\n" +
                "I wanna run away from you\n" +
                "I wanna leave this school\n" +
                "I do\n" +
                "I wanna leave this town\n" +
                "I do\n" +
                "But she'll be worried sick if\n" +
                "I do (if I do)\n" +
                "\n" +
                "Can't run away and leave my mama alone\n" +
                "Cause I'm her boy Mama's boy\n" +
                "Just don't run off and leave my mama at home\n" +
                "Cause I'm her boy mama's boys\n" +
                "Just don't run away, run away\n" +
                "Can't run away and leave my mama alone\n" +
                "Cause I'm her boy Mama's boy\n" +
                "Just don't\n" +
                "\n" +
                "Never get mad enough to walk out\n" +
                "If I do then I won't be gone for long\n" +
                "\n" +
                "Never fed up enough to leave her\n" +
                "No matter what I'll love her just the same\n" +
                "\n" +
                "That's my mama\n" +
                "Yeah\n" +
                "So no matter what I leave unless he's coming soon\n" +
                "\n" +
                "Can't run away and leave my mama alone\n" +
                "Cause I'm her boy Mama's boy\n" +
                "Just don't run off and leave my mama at home\n" +
                "Cause I'm her boy mama's boys\n" +
                "Just don't run away\n" +
                "Run away, yeah\n" +
                "Can't run away and leave my mama alone\n" +
                "Cause I'm her boy Mama's boy\n" +
                "Just don't\n";
        intentactivity(view);
    }

    public  void M(View view)
    {
        Global.lyrics="\"Maria\"\n" +
                "\n" +
                "[Speaking:]\n" +
                "Justin Bieber's—, popstar Justin Bieber (Justin Bieber) denied he fathered a child\n" +
                "There's a lot of good that comes with celebrity you know that\n" +
                "Ya\n" +
                "There is also a pretty white hot spotlight\n" +
                "Of course\n" +
                "And you've found yourself under it recently\n" +
                "Ya\n" +
                "Some headlines\n" +
                "Set the record straight none of it is true\n" +
                "Do you know this woman?\n" +
                "Never met the woman\n" +
                "No\n" +
                "So\n" +
                "Alright well obviously this is what comes along with, uh\n" +
                "Exactly\n" +
                "Life in the fast lane as they say\n" +
                "\n" +
                "She says she met me on the tour\n" +
                "She keeps knocking on my door\n" +
                "She won't leave me, leave me alone\n" +
                "This girl, she wouldn't stop\n" +
                "Almost had to call the cops\n" +
                "She was scheming, ooh, she was wrong\n" +
                "\n" +
                "'Cause she wanted all my attention\n" +
                "And she was dragging my name through the dirt, no\n" +
                "She was dying for my affection\n" +
                "But she got mad 'cause I didn't give it to her\n" +
                "I'm talking to you\n" +
                "\n" +
                "Maria, why you wanna do me like that?\n" +
                "That ain't my baby, that ain't my girl\n" +
                "Maria, why you wanna play me like that?\n" +
                "She ain't my baby, she ain't my girl\n" +
                "\n" +
                "'Cause she talking it and she needs to quit\n" +
                "'Cause I never hit it, so I know she's not mine\n" +
                "That ain't my baby, that ain't my girl\n" +
                "'Cause she wilding out when she talk about\n" +
                "Let me tell you now this girl she's not mine\n" +
                "She ain't my baby, she ain't my girl\n" +
                "\n" +
                "Now she's in the magazines\n" +
                "On TV, making a scene\n" +
                "Oh she's crazy, crazy in love\n" +
                "And she's all over the news\n" +
                "Saying everything but the truth\n" +
                "She's faking, faking it all\n" +
                "\n" +
                "'Cause she wanted all my attention\n" +
                "And she was dragging my name through the dirt, no\n" +
                "She was dying for my affection\n" +
                "But she got mad 'cause I didn't give it to her\n" +
                "I'm talking to you\n" +
                "\n" +
                "Maria, why you wanna do me like that?\n" +
                "That ain't my baby, that ain't my girl\n" +
                "Maria, why you wanna play me like that?\n" +
                "She ain't my baby, she ain't my girl\n" +
                "\n" +
                "'Cause she talking it and she needs to quit\n" +
                "'Cause I never hit it, so I know she's not mine\n" +
                "That ain't my baby, that ain't my girl\n" +
                "'Cause she wilding out when she talk about\n" +
                "Let me tell you now this girl she's not mine\n" +
                "She ain't my baby, she ain't my girl\n" +
                "\n" +
                "Why are you trying, trying to lie, girl\n" +
                "When I ain't never met you at all?\n" +
                "Saying goodbye, but how could ya?\n" +
                "You do this, you prove this\n" +
                "Your foolness seduces\n" +
                "\n" +
                "Maria, why you wanna do me like that?\n" +
                "That ain't my baby, that ain't my girl\n" +
                "Maria, why you wanna play me like that?\n" +
                "She ain't my baby, she ain't my girl\n" +
                "\n" +
                "'Cause she talking it and she needs to quit\n" +
                "'Cause I never hit it, so I know she's not mine\n" +
                "That ain't my baby, that ain't my girl\n" +
                "'Cause she wilding out when she talk about\n" +
                "Let me tell you now this girl she's not mine\n" +
                "She ain't my baby, she ain't my girl\n" +
                "\n" +
                "That ain't my baby, that ain't my girl\n" +
                "She ain't my baby, she ain't my girl\n" +
                "She ain't my baby, she ain't my girl\n" +
                "She ain't my baby, she's not my girl";
        intentactivity(view);
    }

    public  void MMW(View view)
    {
        Global.lyrics="\"Mark My Words\"\n" +
                "\n" +
                "Mark my words, that's all that I have\n" +
                "Mark my words, give you all I got\n" +
                "In every way I will\n" +
                "You're the only reason why\n" +
                "Oh I don't wanna live a lie\n" +
                "Mark my words\n" +
                "Mark my words\n" +
                "\n" +
                "So you heard it all before\n" +
                "Falling in and out of trust\n" +
                "Trying to rekindle us\n" +
                "Only to lose yourself\n" +
                "But I won't let me lose you\n" +
                "And I won't let us just fade away\n" +
                "After all that we've been through\n" +
                "I'mma show you more than I ever could say\n" +
                "\n" +
                "Mark my words, that's all that I have\n" +
                "Mark my words, give you all I got\n" +
                "In every way I will\n" +
                "You're the only reason why\n" +
                "Oh I don't wanna live a lie\n" +
                "Mark my words\n" +
                "Mark my words\n" +
                "\n" +
                "Oh-oh ooh oooooha\n" +
                "Ooh-oh ah";
        intentactivity(view);
    }
    public  void MP(View view)
    {
        Global.lyrics="\"Memphis\"\n" +
                "(feat. Big Sean)\n" +
                "\n" +
                "love you, need you\n" +
                "I need you here to stay\n" +
                "\n" +
                "Girl you're on my mind like 24/7\n" +
                "Every single time that I'm not with you (woop woop woop)\n" +
                "If you spend the night, baby it could be heaven\n" +
                "Hit me on my line if you're tryna come through\n" +
                "\n" +
                "I feel my heartbeat bumpin' to the bass (boom, boom, boom, boom)\n" +
                "She give me butterflies and they won't go away (away away)\n" +
                "Under the stars, she took my hand and said,\n" +
                "\"Love you, need you, need you here to stay.\"\n" +
                "\n" +
                "I'd like to give you what you need\n" +
                "I try but you're makin' it hard for me\n" +
                "How do I make you believe?\n" +
                "Cause I love you, need you, need you here to stay\n" +
                "\n" +
                "I'd like to give you what you need\n" +
                "I try but you're makin' it hard for me\n" +
                "How do I make you believe?\n" +
                "Cause I love you, need you, need you here to stay\n" +
                "\n" +
                "Every time you're distant, girl somethin' is missin'\n" +
                "And wish that I could fix it, I wish things were different\n" +
                "What else, what else, if you love me, girl then say it\n" +
                "Say what else, what else, if you wanna be my baby\n" +
                "\n" +
                "I feel my heartbeat bumpin' to the bass (boom, boom, boom, boom)\n" +
                "She give me butterflies and they won't go away (away, away)\n" +
                "Under the stars, she took my hand and said,\n" +
                "\"Love you, need you, need you here to stay.\"\n" +
                "\n" +
                "I'd like to give you what you need\n" +
                "I try but you're makin' it hard for me\n" +
                "How do I make you believe?\n" +
                "Cause I love you, need you, need you here to stay\n" +
                "\n" +
                "I'd like to give you what you need\n" +
                "I try but you're makin' it hard for me\n" +
                "How do I make you believe?\n" +
                "Cause I love you, need you, need you here to stay\n" +
                "\n" +
                "[Sean]\n" +
                "Is this what you want? The baddest, the baddest\n" +
                "I know what you want, without askin'\n" +
                "I hit once, have to have it, I hit it twice, it's a habit, don't get caught up in traffic\n" +
                "I heard that it's hazardous the stormin' outside, let's do that on the mattress\n" +
                "I just keep asking, is it real, is it real? Look, tell me, is it real?\n" +
                "Yep, real enough to go and get it tatted?\n" +
                "Give you flowers, now you look like you won a pageant\n" +
                "I can take you to the crib, condo, or the cabin, what's up?\n" +
                "If you make it, I can make it happen, I can grant it\n" +
                "Don't you take my \"grant it\" though for granted\n" +
                "I know that's not your intent, we ain't even campin'\n" +
                "And to leave this bed I'mma need a fuckin' ransom\n" +
                "Man I got her screamin' \"Finally Famous!\" when we fly around\n" +
                "Never lie to you 'less I lie you down (swerv)\n" +
                "I put the writin' on the wall, but you don't understand it all like we in Chinatown\n" +
                "We one and one, both one of ones, and when you put the twos together\n" +
                "That's not twenty-two, it's forever, I promise 20-20 couldn't even make it clearer\n" +
                "I swear, Sean Don\n" +
                "\n" +
                "I'd like to give you what you need\n" +
                "I try but you're makin' it hard for me\n" +
                "How do I make you believe?\n" +
                "Cause I love you, need you, need you here to stay\n" +
                "\n" +
                "I'd like to give you what you need\n" +
                "I try but you're makin' it hard for me\n" +
                "How do I make you believe?\n" +
                "Cause I love you, need you, need you here to stay";
        intentactivity(view);
    }
    public void MA(View view)
    {
        Global.lyrics="\"Mi Amor\"\n" +
                "\n" +
                "Travelled all across the world,\n" +
                "Seen a lot of fancy things,\n" +
                "But I never seen a beauty quite like this, (no)\n" +
                "This must be a dream!\n" +
                "So I pinch myself ouch, it hurts man,\n" +
                "Well I guess this must be real\n" +
                "So I'm gonna cease the moment\n" +
                "And tell her how I feel.\n" +
                "\n" +
                "Let me take you to Chile or Costa Rica,\n" +
                "Puerto Rico or Colombia,\n" +
                "We can dance under the sky,\n" +
                "Use the moon as our spotlight.\n" +
                "Two step with the right man,\n" +
                "I can teach you how to dougie in the white sand,\n" +
                "Just take a chance and runaway,\n" +
                "Won't you listen when I say?\n" +
                "\n" +
                "Will you be mi amor?\n" +
                "Just what I'm looking for,\n" +
                "Don't be afraid to fly\n" +
                "Across the sky!\n" +
                "So let's go, let's go\n" +
                "Baby you can let the rest know, rest know\n" +
                "Yup yup, girl, let's go, let's go\n" +
                "Baby you can let the rest know\n" +
                "That you are mi amor\n" +
                "\n" +
                "I got fans from coast to coast\n" +
                "They show love everywhere I stay\n" +
                "Everybody yell hola when the shows over\n" +
                "Still wanna see your face\n" +
                "Baby I need bonita, numero uno chica\n" +
                "Sing to you acapella, let's fly away\n" +
                "\n" +
                "Let me take you to Chile or Costa Rica\n" +
                "Puerto Rico or Colombia\n" +
                "We can dance under the sky\n" +
                "Use the moon as our spotlight\n" +
                "Two step with the right man,\n" +
                "I can teach you how to dougie in the white sand,\n" +
                "Just take a chance and runaway,\n" +
                "Won't you listen when I say?\n" +
                "\n" +
                "Will you be mi amor?\n" +
                "Just what I'm looking for,\n" +
                "Don't be afraid to fly across the sky!\n" +
                "So let's go, let's go\n" +
                "Baby you can let the rest know, rest know\n" +
                "Yup yup, girl, let's go let's go\n" +
                "Baby you can let the rest know\n" +
                "That you are mi amor\n" +
                "\n" +
                "Ven comigo vamanos\n" +
                "Senorita we can go\n" +
                "Wherever you wanna as long as with me\n" +
                "Mi amor, mi amor\n" +
                "We can get away\n" +
                "All you gotta say\n" +
                "Is yes\n" +
                "Take my hand and let me lead the way, lead the way, let me lead the way\n" +
                "Take my hand and let me lead the way, lead the way, lead the way\n" +
                "Take my hand and let me lead the way\n" +
                "\n" +
                "Oh,\n" +
                "Will you be mi amor?\n" +
                "Just what I'm looking for\n" +
                "Don't be afraid to fly\n" +
                "Across the sky\n" +
                "So let's go, let's go\n" +
                "Baby you can let the rest know, rest know\n" +
                "Yup yup, girl, let's go let's go\n" +
                "Baby you can let the rest know\n" +
                "That you are mi amor\n" +
                "\n" +
                "Will you be mi amor?\n" +
                "Just what I'm looking for\n" +
                "Don't be afraid to fly\n" +
                "Across the sky\n" +
                "So let's go, let's go\n" +
                "Baby you can let the rest know, rest know\n" +
                "Yup yup, girl, let's go let's go\n" +
                "Baby you can let the rest know\n" +
                "That you are mi amor\n" +
                "\n";
        intentactivity(view);
    }
    public  void MT(View view)
    {
        Global.lyrics="\"Mistletoe\"\n" +
                "\n" +
                "It’s the most beautiful time of the year\n" +
                "Lights fill the streets spreading so much cheer\n" +
                "I should be playing in the winter snow\n" +
                "But I'mma be under the mistletoe\n" +
                "\n" +
                "I don’t wanna miss out on the holiday\n" +
                "But I can’t stop staring at your face\n" +
                "I should be playing in the winter snow\n" +
                "But I’mma be under the mistletoe\n" +
                "\n" +
                "With you, shawty with you\n" +
                "With you, shawty with you\n" +
                "With you under the mistletoe\n" +
                "\n" +
                "Everyone's gathering around the fire\n" +
                "Chestnuts roasting like a hot July\n" +
                "I should be chilling with my folks, I know\n" +
                "But I’mma be under the mistletoe\n" +
                "\n" +
                "Word on the street Santa's coming tonight,\n" +
                "Reindeer's flying through the sky so high\n" +
                "I should be making a list, I know\n" +
                "But I’mma be under the mistletoe\n" +
                "\n" +
                "With you, shawty with you\n" +
                "With you, shawty with you\n" +
                "With you under the mistletoe\n" +
                "\n" +
                "With you, shawty with you\n" +
                "With you, shawty with you\n" +
                "With you under the mistletoe\n" +
                "\n" +
                "Aye, love, the wise men followed the star\n" +
                "The way I followed my heart\n" +
                "And it led me to a miracle\n" +
                "\n" +
                "Aye, love, don't you buy me nothing\n" +
                "'cause I am feeling one thing, your lips on my lips\n" +
                "That’s a merry, merry Christmas\n" +
                "\n" +
                "It’s the most beautiful time of the year\n" +
                "Lights fill the streets spreading so much cheer\n" +
                "I should be playing in the winter snow\n" +
                "But I’mma be under the mistletoe\n" +
                "\n" +
                "I don’t wanna miss out on the holiday\n" +
                "But I can’t stop staring at your face\n" +
                "I should be playing in the winter snow\n" +
                "But I’mma be under the mistletoe\n" +
                "\n" +
                "With you, shawty with you\n" +
                "With you, shawty with you\n" +
                "With you under the mistletoe\n" +
                "\n" +
                "With you, shawty with you\n" +
                "With you, shawty with you\n" +
                "With you, under the mistletoe, under the mistletoe\n" +
                "\n" +
                "Kiss me underneath the mistletoe\n" +
                "Show me baby that you love me so-oh-oh\n" +
                "Oh, oh, ohhh\n" +
                "\n" +
                "Kiss me underneath the mistletoe,\n" +
                "Show me baby that you love me so-oh-oh\n" +
                "Oh, oh, ohhh\n";
        intentactivity(view);
    }
    public  void NLYG(View view)
    {
        Global.lyrics="\"Never Let You Go\"\n" +
                "\n" +
                "Oh, no,\n" +
                "Oh, no, oh\n" +
                "\n" +
                "They say that hate has been sent\n" +
                "So let loose the talk of love, of love, of love\n" +
                "Before they outlaw the kiss\n" +
                "Baby, give me one last hug, one last hug, one last hug\n" +
                "\n" +
                "There's a dream that I've been chasing\n" +
                "Want so badly for it to be reality, reality, reality\n" +
                "And when you hold my hand\n" +
                "Then I understand\n" +
                "That it's meant to be.\n" +
                "'Cause, baby, when you're with me...\n" +
                "\n" +
                "It's like an angel came by\n" +
                "And took me to heaven\n" +
                "Like you took me to heaven, girl\n" +
                "'Cause when I stare in your eyes\n" +
                "It couldn't be better\n" +
                "I don't want you to go, oh, no\n" +
                "\n" +
                "So, let the music blast\n" +
                "We gon' do our dance\n" +
                "Bring the doubters on\n" +
                "They don't matter at all\n" +
                "'Cause this life's too long\n" +
                "And this love's too strong\n" +
                "So, baby, know for sure\n" +
                "That I'll never let you go\n" +
                "\n" +
                "I got my favourite girl\n" +
                "Not feeling no pain, no fear, no fear, no fear\n" +
                "Don't have a care in the world\n" +
                "Why would I when you are here, are here, are here?\n" +
                "\n" +
                "There's a moment I've been chasing\n" +
                "And I finally caught it out on this floor.\n" +
                "Baby, there's no hesitation\n" +
                "No reservation\n" +
                "By taking a chance and more,\n" +
                "Oh, no, because...\n" +
                "\n" +
                "It's like an angel came by\n" +
                "And took me to heaven\n" +
                "Like you took me to heaven, girl\n" +
                "'Cause when I stare in your eyes\n" +
                "It couldn't be better\n" +
                "I don't want you to go, oh, no\n" +
                "\n" +
                "So, let the music blast\n" +
                "We gon' do our dance\n" +
                "Bring the doubters on\n" +
                "They don't matter at all\n" +
                "'Cause this life's too long\n" +
                "And this love's too strong\n" +
                "So, baby, know for sure\n" +
                "That I'll never let you go\n" +
                "\n" +
                "It's like an angel came by\n" +
                "And took me to heaven\n" +
                "Like you took me to heaven, girl\n" +
                "'Cause when I stare in your eyes\n" +
                "It couldn't be better\n" +
                "I don't want you to go, oh, no\n" +
                "\n" +
                "So, take my hand\n" +
                "Let's just dance\n" +
                "Watch my feet\n" +
                "Follow me\n" +
                "Don't be scared,\n" +
                "Girl, I'm here\n" +
                "If you didn't know,\n" +
                "This is love\n" +
                "\n" +
                "Let the music blast\n" +
                "We gon' do our dance\n" +
                "Bring the doubters on\n" +
                "They don't matter at all\n" +
                "Oh, baby\n" +
                "'Cause this life's too long\n" +
                "And this love's too strong\n" +
                "So, baby, know for sure\n" +
                "That I'll never let you go\n" +
                "\n" +
                "So don't fear.\n" +
                "Don't you worry about a thing.\n" +
                "I am here, right here\n" +
                "I'll never let you go\n" +
                "\n" +
                "Don't shed a tear.\n" +
                "Whenever you need me,\n" +
                "I'll be here\n" +
                "I'll never let you go\n" +
                "\n" +
                "Oh, no, oh, no, oh...\n" +
                "I'll never let you go\n" +
                "Oh, no, oh, no, oh...\n" +
                "I'll never let you go" ;
        intentactivity(view);
    }
    public  void NSN(View view)
    {
        Global.lyrics="\"Never Say Never\"\n" +
                "(feat. Jaden Smith)\n" +
                "\n" +
                "(Never say never)\n" +
                "(Pick it up this, pick it up)\n" +
                "Yeah, yeah.\n" +
                "(Pick it up this, pick it up)\n" +
                "Never, never, never, never, never, never.\n" +
                "(Pick it up this, pick it up)\n" +
                "\n" +
                "See I never thought that I could walk through fire\n" +
                "I never thought that I could take the burn\n" +
                "I never had the strength to take it higher\n" +
                "Until I reached the point of no return\n" +
                "\n" +
                "And there's just no turning back\n" +
                "When your heart's under attack\n" +
                "Gonna give everything I have\n" +
                "It's my destiny\n" +
                "\n" +
                "I will never say never! (I will fight)\n" +
                "I will fight till forever! (make it right)\n" +
                "Whenever you knock me down\n" +
                "I will not stay on the ground\n" +
                "Pick it up\n" +
                "Pick it up\n" +
                "Pick it up\n" +
                "Pick it up up up\n" +
                "And never say never\n" +
                "\n" +
                "Ne-never say never (never)\n" +
                "Ne-never say never (never)\n" +
                "Ne-never say never (never)\n" +
                "Never say it, never, never say it\n" +
                "\n" +
                "I never thought that I could feel this power\n" +
                "I never thought that I could feel this free\n" +
                "I'm strong enough to climb the highest tower\n" +
                "And I'm fast enough to run across the sea\n" +
                "\n" +
                "And there's just no turning back\n" +
                "When your heart's under attack\n" +
                "Gonna give everything I have\n" +
                "'cause this is my destiny\n" +
                "\n" +
                "I will never say never! (I will fight)\n" +
                "I will fight till forever! (make it right)\n" +
                "Whenever you knock me down\n" +
                "I will not stay on the ground\n" +
                "Pick it up\n" +
                "Pick it up\n" +
                "Pick it up\n" +
                "Pick it up, up, up\n" +
                "And never say never\n" +
                "\n" +
                "Here we go!\n" +
                "Guess who?\n" +
                "JSmith and JB! (Uh-huh!)\n" +
                "I gotcha little bro\n" +
                "I can handle him\n" +
                "Hold up, aight?\n" +
                "I can handle him\n" +
                "\n" +
                "Now he's bigger than me\n" +
                "Taller than me\n" +
                "And he's older than me\n" +
                "And stronger than me\n" +
                "And his arms a little bit longer than me\n" +
                "But he ain't on a JB song with me!\n" +
                "\n" +
                "I be trying a chill\n" +
                "They be trying to sour the thrill\n" +
                "No pun intended, was raised by the power of Will\n" +
                "\n" +
                "Like Luke with the force, when push comes to shove\n" +
                "Like Kobe in the 4th, ice water with blood\n" +
                "Let's go\n" +
                "I gotta be the best, and yes\n" +
                "We're the flyest\n" +
                "Like David and Goliath\n" +
                "I conquered the giant\n" +
                "So now I got the world in my hand\n" +
                "I was born from two stars\n" +
                "So the moon's where I land (I'm gone!)\n" +
                "\n" +
                "I will never say never! (never say it, never, never say it) (I will fight)\n" +
                "I will fight till forever! (OK) (make it right)\n" +
                "Whenever you knock me down\n" +
                "I will not stay on the ground\n" +
                "Pick it up\n" +
                "Pick it up\n" +
                "Pick it up\n" +
                "Pick it up, up, up\n" +
                "And never say never\n" +
                "\n" +
                "I will never say never! (I will fight)\n" +
                "I will fight till forever! (make it right)\n" +
                "Whenever you knock me down\n" +
                "I will not stay on the ground\n" +
                "Pick it up\n" +
                "Pick it up\n" +
                "Pick it up,\n" +
                "Pick it up, up, up\n" +
                "And never say never\n" +
                "Ne-never say never (never say it)\n" +
                "Ne-never say never (never say it)\n" +
                "Ne-never say never (never say it)\n" +
                "And never say never\n" +
                "Ne-never say never\n" +
                "Ne-never say never\n" +
                "Ne-never say never\n" +
                "And never say never.";
        intentactivity(view);
    }
    public  void  NP(View view)
    {
        Global.lyrics="\"No Pressure\"\n" +
                "(feat. Big Sean)\n" +
                "\n" +
                "You ain't gotta answer none of my calls\n" +
                "I'm believing you'll pick up one day\n" +
                "I don't wanna add to your pain at all\n" +
                "I'm praying that time makes a change in your life\n" +
                "I'm realizing how much you made a change in my life\n" +
                "And I don't wanna spend it with nobody else\n" +
                "Hear me? Don't nobody deserve myself\n" +
                "Oh, no, baby, what I'm saying is\n" +
                "\n" +
                "You ain't gotta make your mind up\n" +
                "You ain't gotta make your mind up right now\n" +
                "Right now, don't rush, no pressure\n" +
                "You ain't gotta make your mind up\n" +
                "You ain't gotta make your mind up right now\n" +
                "Calm down, don't rush, no pressure\n" +
                "\n" +
                "Thought that you were in it for the paper\n" +
                "Never thought I'd take you serious\n" +
                "Now I need you, not a moment later\n" +
                "Losin' it, I'm so delirious\n" +
                "And I'mma put up a fight for it\n" +
                "Never give up a love like this\n" +
                "Finally I found someone\n" +
                "That can do me like no other\n" +
                "Talking to my conscience\n" +
                "I made a few mistakes\n" +
                "I did it to myself\n" +
                "I'm the only one to blame\n" +
                "I know you need a little while to believe again\n" +
                "To love again\n" +
                "\n" +
                "You ain't gotta make your mind up\n" +
                "You ain't gotta make your mind up right now\n" +
                "Right now, don't rush, no pressure\n" +
                "You ain't gotta make your mind up\n" +
                "You ain't gotta make your mind up right now\n" +
                "I'll be waiting for you\n" +
                "Don't rush, no pressure\n" +
                "You ain't gotta make your mind up\n" +
                "You ain't gotta make your mind up right now\n" +
                "Right now, don't rush, no pressure\n" +
                "You ain't gotta make your mind up\n" +
                "You ain't gotta make your mind up right now\n" +
                "I'll still\n" +
                "Don't rush, no pressure\n" +
                "\n" +
                "Put my key in the ignition\n" +
                "Don't rush it girl, just stretch it out for me\n" +
                "I know that you ain't got no place to leave\n" +
                "Girl I need your attention\n" +
                "And every time I see you make that face\n" +
                "I wanna love you all over the place\n" +
                "Don't do it, baby\n" +
                "Don't do it to me, no, no\n" +
                "\n" +
                "[Big Sean:]\n" +
                "Look, I know you don't wanna talk, right\n" +
                "We've been on and off like the crosslights\n" +
                "You heard I'm playin' with them hoes like I golf, right?\n" +
                "When I touch you, I get frostbite\n" +
                "Girl you're so cold, so cold, so cold\n" +
                "How we so young but livin' so old?\n" +
                "In the bed together but we sleepin' solo\n" +
                "That could drive you loco\n" +
                "You supposed to be my uno, Yoko Ono\n" +
                "Oh, no, round two again\n" +
                "We've been fighting more than Ryu and Ken\n" +
                "Last time we argued eight straight days\n" +
                "I learned my lesson, I got straight As\n" +
                "And I know it's deeper than masseuses\n" +
                "Oh, you know I eat the cookie like I'm Lucious\n" +
                "Go ahead and take the time\n" +
                "But it's a waste of time if your waist ain't on mine\n" +
                "Think about it\n" +
                "\n" +
                "You ain't gotta make your mind up\n" +
                "(make your mind up)\n" +
                "You ain't gotta make your mind up right now\n" +
                "Right now, don't rush, no pressure\n" +
                "(there ain't no pressure)\n" +
                "You ain't gotta make your mind up\n" +
                "(no, oh)\n" +
                "You ain't gotta make your mind up right now\n" +
                "I'll be waiting for you\n" +
                "Don't rush, no pressure\n" +
                "(baby, don't rush)\n" +
                "You ain't gotta make your mind up\n" +
                "(make your mind up)\n" +
                "You ain't gotta make your mind up right now, right now\n" +
                "Don't rush, no pressure\n" +
                "(You can take it easy now)\n" +
                "You ain't gotta make your mind up\n" +
                "You ain't gotta make your mind up right now\n" +
                "(And I'll still be right here)\n" +
                "Don't rush, no pressure, yeah\n" +
                "\n" +
                "Say yeah, say yeah\n" +
                "You ain't gotta make your mind up right now\n" +
                "Know I did you wrong\n" +
                "Let your heart heal\n" +
                "Don't rush, no pressure\n";
        intentactivity(view);
    }
    public  void NS(View view)
    {
        Global.lyrics="\"No Sense\"\n" +
                "(feat. Travis Scott)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Yeah, yeah\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "\n" +
                "Alright\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "The sun don't set the same 'less you're watching it go down with me\n" +
                "The bed won't sleep the same 'less you're waking up in here with me\n" +
                "Oh, my heart's a vacant house when you're gone away, it's so empty\n" +
                "And love don't make sense when it's empty (oh, no)\n" +
                "\n" +
                "I've driven almost every car\n" +
                "It ain't the same when I'm without you, boo\n" +
                "Been around a million stars\n" +
                "None of them shine brighter than you\n" +
                "The sky be so dark now without you\n" +
                "Yeah, ooh, baby\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "Oh, been around the world ain't the same without you\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Focus ain't the same if the picture ain't got you in it\n" +
                "In every line my\n" +
                "Emotions ain't the same if it ain't about you, I don't get it\n" +
                "Ever since the beginning now\n" +
                "You had that effect on me\n" +
                "All I wanna do is you, boo\n" +
                "I mean that so literally\n" +
                "Don't nobody go harder than you\n" +
                "All of the angels must be lonely now, without you, whoa\n" +
                "\n" +
                "[Justin Bieber (Travis Scott):]\n" +
                "It don't make sense, no\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "'less I'm doing it with you, baby\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "I only want to hear your voice, yeah\n" +
                "Oh, been around the world, ain't the same without you\n" +
                "Had to find out the hard way\n" +
                "It don't make sense, no\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "(going way up, way up)\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "(way up, way up, way up)\n" +
                "(yeah, slow down stay up, stay up, stay up)\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "\n" +
                "[Travis Scott:]\n" +
                "Time and time again I break a plan\n" +
                "Without you girl I ain't the man\n" +
                "Could never be all I could be\n" +
                "You overstand, I'm incomplete apparently\n" +
                "Gotta know I hate that\n" +
                "How am I supposed to take that?\n" +
                "Boo'd up, missing all of that\n" +
                "Gotta be laying in that\n" +
                "Rolled up, put a flame to that\n" +
                "Thought by now you would have made it back\n" +
                "Be patient\n" +
                "Won't you pull up to me now?\n" +
                "Live forever young\n" +
                "It's amazing\n" +
                "I don't want to sleep 'less you at home\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "It don't make sense, no\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "No, it don't make sense\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "No, it don't make sense, it don't make sense\n" +
                "It don't make no sense 'less I'm doing it with you\n" +
                "(alright, yeah, alright)";
        intentactivity(view);

    }
    public  void NLU(View view)
    {
        Global.lyrics="\"Nothing Like Us\"\n" +
                "\n" +
                "Lately I've been thinkin'\n" +
                "Thinkin' 'bout what we had\n" +
                "I know it was hard\n" +
                "It was all that we knew\n" +
                "\n" +
                "Have you been drinkin'\n" +
                "To take all the pain away?\n" +
                "I wish that I could give you what you deserve\n" +
                "\n" +
                "'Cause nothing can ever\n" +
                "Ever replace you\n" +
                "Nothing can make me feel like you do\n" +
                "You know there's no one\n" +
                "I can relate to\n" +
                "And know we won't find a love that's so true\n" +
                "\n" +
                "There's nothing like us\n" +
                "There's nothing like you and me\n" +
                "Together through the storm\n" +
                "There's nothing like us\n" +
                "There's nothing like you and me\n" +
                "Together\n" +
                "\n" +
                "I gave you everything, baby\n" +
                "Well, everything I had to give\n" +
                "Girl, why would you push me away?\n" +
                "Lost in confusion\n" +
                "Like an illusion\n" +
                "You know I'm used to making your day\n" +
                "\n" +
                "But that is the past now\n" +
                "We didn't last now\n" +
                "I guess that this is meant to be\n" +
                "Tell me, was it worth it?\n" +
                "We were so perfect\n" +
                "But, baby, I just want you to see\n" +
                "\n" +
                "There's nothing like us\n" +
                "There's nothing like you and me\n" +
                "Together through the storm\n" +
                "There's nothing like us\n" +
                "There's nothing like you and me\n" +
                "Together\n" +
                "\n" +
                "There's nothing like us\n" +
                "There's nothing like you and me\n" +
                "Together through the storm\n" +
                "There's nothing like us\n" +
                "There's nothing like you and me\n" +
                "Together\n";
        intentactivity(view);
    }
    public  void OG(View view)
    {
        Global.lyrics="\" Oh Girl lyrics\"\n" +
                "[Verse]\n" +
                "Take my hand and put it on your chest\n" +
                "Cause I need your, your love, yeah\n" +
                "Would you come right here and do it, baby?\n" +
                "Cause I need you to do it, baby\n" +
                "Your love is keeping me warm, warm, warm\n" +
                "\n" +
                "[Pre-Chorus]\n" +
                "You been gone far away, I just need to hold you babe\n" +
                "Can't believe I'm with you, cause you got me open, baby\n" +
                "I'm loving everything you do\n" +
                "I'm thankful that I'm here with you\n" +
                "You make me wanna say\n" +
                "\n" +
                "[Chorus]\n" +
                "Oh girl, your body is so insane, making me call your name, girl\n" +
                "Oh girl, yeah it's like a rush every single time we touch, girl\n" +
                "Oh girl, your body is so insane, making me call your name\n" +
                "Oh girl, yeah it's like a rush every single time we touch\n" +
                "\n" +
                "[Verse]\n" +
                "Take my hand and put it on your chest\n" +
                "[Lyrics from: https:/lyrics.az/justin-bieber/-/oh-girl.html]\n" +
                "Cause I need your, your love, yeah\n" +
                "Would you come right here and do it, baby?\n" +
                "Cause I need you to do it, baby\n" +
                "Your love is keeping me warm, warm, warm\n" +
                "\n" +
                "[Pre-Chorus]\n" +
                "You been gone far away, I just need to hold you babe\n" +
                "Can't believe I'm with you, cause you got me open, baby\n" +
                "I'm loving everything you do\n" +
                "I'm thankful that I'm here with you\n" +
                "You make me wanna say\n" +
                "\n" +
                "[Chorus]\n" +
                "Oh girl, your body is so insane, making me call your name, girl\n" +
                "Oh girl, yeah it's like a rush every single time we touch, girl\n" +
                "Oh girl, your body is so insane, making me call your name\n" +
                "Oh girl, yeah it's like a rush every single time we touch, girl\n" +
                "\n" +
                "[Outro]\n" +
                "Oh girl, your body is so insane, making me call your name, girl\n" +
                "Oh girl, I just need to hold you tight\n" +
                "Oh girl, cause you're all mine";
        intentactivity(view);
    }
    public  void  OSF(View view)
    {
        Global.lyrics="\"Old School Flow\"\n" +
                "\n" +
                "Let me start off with the old school flow [x2]\n" +
                "Snap back, backpack, rat-a-tat, go\n" +
                "Swagger at the knapsack, who know I could rap that?\n" +
                "Tell me where the cash at I'll tell you where the smash at\n" +
                "Number one hits I got number one flicks and the number one kicks and number one chicks \n" +
                "Fast like Gordan and my jams like Jordan and my Tims like Hortons and my jets all aboard in and my wheels are like a fortune and it feels like extortion\n" +
                "Is it for the fame or for the fortune? \n" +
                "Like this, mic this so I can re-sight this \n" +
                "People in their basements say that I didn't write this \n" +
                "People say I'm white so I couldn't do it like this \n" +
                "Checks like Nike let me give you a good night kiss \n" +
                "Well I'm a little bit sick of it, listening to bickering like picking on a little kid like taking all his licorice \n" +
                "I hate it when they littering I hate to be illiterate \n" +
                "I literally am doing deeds, riddling\n" +
                "Cheese like Gouda and my soul like Buddha and Imma go right threw ya and I'm so much cooler and I don't need Luda to know that I'm the ruler and \n" +
                "I'm so much cooler you should call me Ferris Bueller.\n";
        intentactivity(view);
    }
    public  void OM(View view)
    {
        Global.lyrics="\"Omaha Mall\"\n" +
                "(feat. DJ Tay James, Ryan Good)\n" +
                "\n" +
                "Kenny Hamilton, tell 'em how it is\n" +
                "\n" +
                "[DJ Tay James]\n" +
                "Okay, we better do this again, the official version\n" +
                "This ain't none of that Youtube stuff man\n" +
                "DJTayJames, weknowthedj.com\n" +
                "Shout out to my homeboy JB, it's Kenny Mac\n" +
                "We better do this, Omaha Mall 2010\n" +
                "Let's show you how we 'bout to get in, hey\n" +
                "Let's go\n" +
                "\n" +
                "[Justin]\n" +
                "Omaha Mall, Omaha Mall\n" +
                "You know that we ball at the Omaha Mall\n" +
                "Omaha Mall, Omaha Mall\n" +
                "You know that we ball at the Omaha Mall\n" +
                "Mall, mall, mall, m-m-mall\n" +
                "\n" +
                "Yeah I ball, Omaha Mall\n" +
                "Five feet tall but I still do it all\n" +
                "Yeah I get it in, get the Benjamins\n" +
                "Then I spend it all at the Omaha Mall\n" +
                "Yeah we're in the mall \n" +
                "We are doin' it huge\n" +
                "We are spending cash looking for some sick shoes\n" +
                "Yeah we're at the mall\n" +
                "Yeah we're in my world\n" +
                "Yeah we got some shoes and now we looking for some girls\n" +
                "Omaha Mall, yeah this beat rocks\n" +
                "Now we rollin' down the mall tryin'a find a G-shock\n" +
                "\n" +
                "Yo, there's some girls, they look good from afar\n" +
                "But you never know at the Omaha Mall\n" +
                "I've been to LA, New York, I've done it all\n" +
                "But none of it compares to the Omaha Mall\n" +
                "\n" +
                "Omaha Mall, Omaha Mall\n" +
                "You know that we ball at the Omaha Mall\n" +
                "You know I'm a star, you know I'm a star\n" +
                "You know that we ball at the Omaha Mall\n" +
                "You know I'm a star, you know I'm a star\n" +
                "You know that we ball at the Omaha Mall\n" +
                "\n" +
                "[DJ Tay James]\n" +
                "You ain't know what it is\n" +
                "Weknowthedj.com, DJTayJames\n" +
                "Ry Good, tell 'em what it is shawty\n" +
                "\n" +
                "[Ryan Good]\n" +
                "Omaha Mall, Omaha Mall\n" +
                "See how we ball at the Omaha Mall\n" +
                "Now we at the food court \n" +
                "Tryna get some Sparro's,\n" +
                "Hey there Justin you got a dollar I can borrow?\n" +
                "Maybe get a burger \n" +
                "A sweet and sour chicken\n" +
                "Now I'm walkin' out \n" +
                "'Cause it's so finger lickin'\n" +
                "Hey girl we're ballin'\n" +
                "yeah girl we're ballin'\n" +
                "What did I just say? \n" +
                "Yeah we're Omaha Mallin'\n" +
                "\n" +
                "Shift my attention \n" +
                "Now I'm 'bout to go to Baby Gap\n" +
                "Get my little sister something\n" +
                "Maybe a sweet Baby Gap cap\n" +
                "Wait wait wait, hold on, hold on yo\n" +
                "We might as well just go to Lids\n" +
                "\n" +
                "[Justin]\n" +
                "Omaha Mall, Omaha Mall\n" +
                "You know that we ball at the Omaha Mall\n" +
                "Omaha Mall, Omaha Mall\n" +
                "You know that we ball at the Omaha Mall\n" +
                "Mall, mall, mall, m-m-mall\n" +
                "Ball, ball, ball, b-b-ball.\n" ;
        intentactivity(view);
    }
    public void OLLG(View view)
    {
        Global.lyrics="\"One Less Lonely Girl\"\n" +
                "\n" +
                "Alright, let's go\n" +
                "\n" +
                "There's gonna be one less lonely girl\n" +
                "One less lonely girl\n" +
                "One less lonely girl\n" +
                "One less lonely girl\n" +
                "There's gonna be one less lonely girl\n" +
                "One less lonely girl\n" +
                "One less lonely girl\n" +
                "\n" +
                "How many \"I told yous\" and \"start overs\" and shoulders have you cried on before?\n" +
                "How many promises? Be honest, girl\n" +
                "How many tears you let hit the floor?\n" +
                "\n" +
                "How many bags you packed\n" +
                "Just to take them back?\n" +
                "Tell me that how many \"either ors\"?\n" +
                "But no more if you let me inside of your world\n" +
                "There'll be one less lonely girl\n" +
                "\n" +
                "Saw so many pretty faces before I saw you (you)\n" +
                "Now all I see is you\n" +
                "I'm coming for you (I'm coming for you)\n" +
                "\n" +
                "(No no) Don't need these other pretty faces like I need you\n" +
                "And when you're mine, in the world\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "(I'm coming for you)\n" +
                "I'm gonna put you first\n" +
                "(I'm coming for you)\n" +
                "I'll show you what you're worth\n" +
                "That's what I'm gonna do\n" +
                "If you let me inside of your world\n" +
                "There'll be one less lonely girl\n" +
                "\n" +
                "Christmas wasn't merry, 14th of February not one of them spent with you\n" +
                "How many dinner dates, set dinner plates\n" +
                "And he didn't even touch his food\n" +
                "\n" +
                "How many torn photographs are you taping back?\n" +
                "Tell me that you couldn't see an open door\n" +
                "But no more if you let me inside of your world\n" +
                "There'll be one less lonely girl\n" +
                "\n" +
                "Saw so many pretty faces before I saw you (you)\n" +
                "Now all I see is you\n" +
                "I'm coming for you (I'm coming for you)\n" +
                "\n" +
                "(No no) Don't need these other pretty faces like I need you\n" +
                "And when you're mine in this world\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "(I'm coming for you)\n" +
                "I'm gonna put you first\n" +
                "(I'm coming for you)\n" +
                "I'll show you what you're worth\n" +
                "That's what I'm gonna do\n" +
                "If you let me inside of your world\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "I can fix up your broken heart (heart)\n" +
                "I can give you a brand new start (start)\n" +
                "I can make you believe (ya)\n" +
                "I just wanna set one girl free to fall (free to fall)\n" +
                "She's free to fall (fall in love)\n" +
                "With me\n" +
                "\n" +
                "Her heart's locked and know what I got the key\n" +
                "I'll take her and leave the world with one less lonely girl\n" +
                "\n" +
                "There's gonna be one less lonely girl\n" +
                "One less lonely girl\n" +
                "One less lonely girl\n" +
                "One less lonely girl\n" +
                "There's gonna be one less lonely girl\n" +
                "One less lonely girl\n" +
                "One less lonely girl\n" +
                "\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "(I'm coming for you)\n" +
                "I'm gonna put you first\n" +
                "(I'm coming for you)\n" +
                "I'll show you what you're worth\n" +
                "That's what I'm gonna do\n" +
                "If you let me inside of your world\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "I'm coming for you, one less lonely girl\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "(I'm coming for you)\n" +
                "I'm gonna put you first\n" +
                "(I'm coming for you)\n" +
                "I'll show you what you're worth\n" +
                "That's what I'm gonna do\n" +
                "If you let me inside of your world\n" +
                "There's gonna be one less lonely girl\n" +
                "\n" +
                "Only you, shawty";
        intentactivity(view);

    }
    public  void OL(View view)
    {
        Global.lyrics="\"One Life\"\n" +
                "\n" +
                "So girl\n" +
                "You just be honest with me, I know we can make this work\n" +
                "I love you\n" +
                "\n" +
                "I know that you afraid, babe\n" +
                "But you don't need to be saved, babe\n" +
                "You just need someone who understands\n" +
                "And I think I need the same, babe\n" +
                "Show me where you at, let's keep it honest\n" +
                "Home is where you at and that's a promise\n" +
                "Open up and never keep it from us\n" +
                "Nothing left between us, baby, nothing\n" +
                "Tell me what you want, let's keep it gangsta\n" +
                "Tell me who created you, I'd thank her\n" +
                "Open up and never keep it from us\n" +
                "Nothing left between us, baby\n" +
                "\n" +
                "Hopefully you'll give me a chance\n" +
                "All I want is love and romance\n" +
                "I wanna give it all, give it all to you\n" +
                "\n" +
                "I wanna dream what you dream\n" +
                "Go where you're going\n" +
                "I only have one life\n" +
                "And I only wanna live it with you\n" +
                "I wanna sleep where you sleep\n" +
                "Connect with your soul\n" +
                "The only thing I want in life\n" +
                "I only wanna live it with you\n" +
                "Oh yeah, oh yeah\n" +
                "I only wanna live it with you\n" +
                "Only wanna live it with you\n" +
                "\n" +
                "Tell me what you want, I can't believe it\n" +
                "I know that if we make it there's a reason\n" +
                "Sometimes the sun shines, baby\n" +
                "Sometimes it ain't breezy\n" +
                "I hope that maybe this time it may be different\n" +
                "I told you I'mma make it, that commitment\n" +
                "Yeah, you took your shot and didn't miss it\n" +
                "Ain't nothing more attractive than ambition\n" +
                "\n" +
                "Hopefully you'll give me a chance\n" +
                "All I want is love and romance\n" +
                "I wanna give it all, give it all to you\n" +
                "\n" +
                "I wanna dream what you dream\n" +
                "Go where you're going\n" +
                "I only have one life\n" +
                "And I only wanna live it with you\n" +
                "I wanna sleep where you sleep\n" +
                "Connect with your soul\n" +
                "The only thing I want in life\n" +
                "I only wanna live it with you\n" +
                "Oh yeah, oh yeah\n" +
                "I only wanna live it with you\n" +
                "Only wanna live it with you\n" +
                "\n" +
                "If I came to your crib would you open the door?\n" +
                "I don't wanna go down that road no more\n" +
                "Said you wanted it bad, but girl I wanted it more\n" +
                "You're the only one I wanna be with, yeah, yeah\n" +
                "\n" +
                "I wanna dream what you dream\n" +
                "Go where you're going\n" +
                "I only have one life\n" +
                "And I only wanna live it with you\n" +
                "I wanna sleep where you sleep\n" +
                "Connect with your soul\n" +
                "The only thing I want in life\n" +
                "I only wanna live it with you\n" +
                "Oh yeah, oh yeah\n" +
                "I only wanna live it with you\n" +
                "Only wanna live it with you\n";
        intentactivity(view);
    }
    public  void OLL(View view)
    {
        Global.lyrics="\"One Love\"\n" +
                "\n" +
                "Yeah, yeah, yeah, yeah\n" +
                "\n" +
                "I won’t let the night stand in my way\n" +
                "I know what I want, I know what I get, yeah\n" +
                "I’m only here to find you, you\n" +
                "All I need is you by my side\n" +
                "All I wanna do is lay down next to you\n" +
                "\n" +
                "'Cause all I need is one love, one love, one heart\n" +
                "'Cause all I need is one love, one love, one heart\n" +
                "Baby give it to me\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody has got what I need\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody has got what I need tonight\n" +
                "\n" +
                "See I’ve made mistakes time after time, time, time\n" +
                "But no not today, won’t leave 'til I find what I’m looking for\n" +
                "I’m only here to find you, you\n" +
                "All I need is you by my side\n" +
                "All I wanna do is dance under the moon\n" +
                "\n" +
                "'Cause all I need is one love, one love, one heart\n" +
                "'Cause all I need is one love, one love, one heart\n" +
                "Baby give it to me\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody has got what I need\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody has got what I need tonight\n" +
                "\n" +
                "Your love is like a roller-coaster\n" +
                "The way that you take my breath away\n" +
                "It feels like I’m slowly falling deeper and deeper, deeper and deeper\n" +
                "\n" +
                "'Cause all I need is one love, one love, one heart\n" +
                "'Cause all I need is one love, one love, one heart\n" +
                "Baby give it to me\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody has got what I need\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody can give it to me\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody has got what I need\n" +
                "'Cause I don’t want-want nobody when I got-got your body\n" +
                "Baby no no nobody has got what I need tonight.\n";
        intentactivity(view);
    }
    public  void OT(View view)
    {
        Global.lyrics="\"One Time\"\n" +
                "\n" +
                "Aye, aye, aye, aye, aye, aye, aye, aye\n" +
                "Me plus you (I'ma tell you one time)\n" +
                "Me plus you (One time, I'ma tell you one time)\n" +
                "Me plus you (One time, I'ma tell you one time)\n" +
                "One time (one time) one time\n" +
                "\n" +
                "When I met you girl my heart went knock knock\n" +
                "Now them butterflies in my stomach won't stop stop\n" +
                "And even though it's a struggle love is all we got\n" +
                "So we going keep keep climbin' to the mountain top\n" +
                "\n" +
                "Your world is my world\n" +
                "And my fight is your fight\n" +
                "My breath is your breath\n" +
                "When you're hurt, I'm not right\n" +
                "\n" +
                "[Chorus]\n" +
                "You're my one love, my one heart, my one life for sure\n" +
                "Let me tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "I'ma tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "And I'ma be your one guy\n" +
                "You'll be my number one girl\n" +
                "Always making time for you\n" +
                "I'ma tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "I'ma tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "\n" +
                "You look so deep\n" +
                "You know that it humbles me\n" +
                "You're by my side and troubles -- they don't trouble me\n" +
                "Many have called but the chosen is you\n" +
                "Whatever you want shawty I'll give it to you\n" +
                "\n" +
                "Your world is my world\n" +
                "And my fight is your fight\n" +
                "My breath is your breath\n" +
                "When you're hurt, I'm not right\n" +
                "\n" +
                "[Chorus]\n" +
                "You're my one love, my one heart, my one life for sure\n" +
                "Let me tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "I'ma tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "And I'ma be your one guy\n" +
                "You'll be my number one girl\n" +
                "Always makin' time for you\n" +
                "I'ma tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "I'ma tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "\n" +
                "Shawty right there\n" +
                "She's got everything I need\n" +
                "And I'ma tell her one time\n" +
                "(One time, one time)\n" +
                "Give you everything you need, down to my last dime\n" +
                "She makes me happy, I know where I'll be\n" +
                "Right by her side 'cause she is the one for me\n" +
                "\n" +
                "[Chorus]\n" +
                "And girl you're my one love\n" +
                "My one heart my one life for sure\n" +
                "Let me tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "I'ma tell you one time\n" +
                "(girl I love, girl I love you)\n" +
                "And I'ma be your one, guy\n" +
                "You'll be my number one, girl, always makin' time for you\n" +
                "I'ma tell you one time (one time)\n" +
                "I'ma tell you one time (one time)\n" +
                "\n" +
                "Me plus you (I'ma tell you one time)\n" +
                "Me plus you (One time, I'ma tell you one time)\n" +
                "Me plus you (One time, I'ma tell you one time)\n" +
                "One time (one time) one time\n";
        intentactivity(view);
    }
    public  void OTEGC(View view)
    {
        Global.lyrics="\"Only Thing I Ever Get For Christmas\"\n" +
                "\n" +
                "If you're the only thing I ever get for christmas\n" +
                "Then everything I wished for has come true\n" +
                "You're the single item on my list \n" +
                "You're my one and only christmas wish\n" +
                "The mistletoe is where I'll be waiting, meet me there\n" +
                "\n" +
                "I know someone out there knows what I'm saying\n" +
                "Baby you're a girl who's wishing just like me (yeah, yeah)\n" +
                "There is one, and you know who you are\n" +
                "My gift to you is all my heart\n" +
                "Make my holiday, and hear me when I say\n" +
                "\n" +
                "If you're the only thing I ever get for christmas\n" +
                "Then everything I wished for has come true\n" +
                "You're the single item on my list\n" +
                "You're my one and only christmas wish\n" +
                "The mistletoe is where I'll be waiting, meet me there\n" +
                "\n" +
                "In the morning I know everybody's rushing\n" +
                "To see what's underneath the christmas tree\n" +
                "Know what I mean, cuz I don't find it there\n" +
                "Underneath the mistletoe is where\n" +
                "You make my holidays, so hear me when I say\n" +
                "\n" +
                "If you're the only thing I ever get for christmas\n" +
                "\n" +
                "Then everything I wished for has come true\n" +
                "You're the single item on my list\n" +
                "You're my one and only christmas wish\n" +
                "The mistletoe is where I'll be waiting, meet me there\n" +
                "\n" +
                "Only you can make this... a merry merry christmas\n" +
                "\n" +
                "There is one, and you know who you are\n" +
                "My gift to you is all my heart\n" +
                "Make my holiday, and hear me when I say\n" +
                "\n" +
                "If you're the only thing I ever get for christmas\n" +
                "Then everything I wished for has come true\n" +
                "You're the single item on my list \n" +
                "You're my one and only christmas wish\n" +
                "The mistletoe is where I'll be waiting, meet me there\n" +
                "\n" +
                "All I ever wanted was you, this christmas\n" +
                "Yeah yeah yeah\n" +
                "I need you baby\n" +
                "\n" +
                "You're the single item on my list \n" +
                "You're my one and only christmas wish\n" +
                "The mistletoe is where I'll be waiting, kiss me there\n" +
                "\n" +
                "I'll be waiting, kiss me there...";
        intentactivity(view);
    }
    public  void O(View view)
    {
        Global.lyrics="\"Otis (Freestyle)\"\n" +
                "\n" +
                "Justin Bieber\n" +
                "Damn damn J.B, where the hell you been\n" +
                "Yeah I got a new necklace, diamonds\n" +
                "2 big face Rollies, no I ain’t lyin’\n" +
                "Making momma so proud that she cryin’\n" +
                "Yeah you say I’m crazy? Guess that makes two\n" +
                "But I never knew that dreams really came true\n" +
                "Started playing drums, when I was only 2\n" +
                "Now we kick it in Japan, kung-fu\n" +
                "So I’m heading for the gold, I’m sweating\n" +
                "I swear Otis Redding will be oh-so ready\n" +
                "I already got ahead-y of the game, I’m with Kenny\n" +
                "And we steady getting many, I mean money\n" +
                "Riding in an all-black Benz with the all black rims\n" +
                "And we looking at some 10s through our all-black lenses\n" +
                "\n" +
                "Wait…I’m not done\n" +
                "\n" +
                "I thanked Jesus at the awards I’m never going to hell\n" +
                "Call me Zack Morris I’m saving you by the bell\n" +
                "My girl says I’m perfect she just loves an imperfect person\n" +
                "Perfectly personally I think she is perfectly perfect\n" +
                "Get it done abundantly, she wants to get up under me\n" +
                "I swear that I got honey bee’s cause baby I’m a money tree\n" +
                "So be my little honey bee my little-bitty bunny\n" +
                "I got honeys all up on me baby I just get it done-y\n" +
                "Possibly your probably thinking this type of swag's impossible\n" +
                "And logically well probably but you just take me lyrically\n" +
                "Try to feel me spiritually, get out your mind literally\n" +
                "There’s a bigger me inside this little me\n" +
                "Screaming out I should make history\n" +
                "I am like a mystery, hated by jealousy cause they envy me\n" +
                "Run up all my enemies see if they remember me\n" +
                "Soon as they remember me I wipe away their memory\n" +
                "Can’t you see the private jets flying over you?\n" +
                "I ain’t even notice but my focus on my photos\n" +
                "Might be bogus, no they shouldn’t be a photoshoot\n" +
                "It’s funny how you wanna take my picture and it’s like your first time\n" +
                "Playing with camera claiming that “It’s not mine”\n" +
                "Just calm down, you don’t gotta hurry\n" +
                "Don’t be nervous, you don’t gotta worry\n" +
                "And my fans are like my glasses, yeah without them I’d be blurry";
        intentactivity(view);
    }
    public  void OTG(View view)
    {
        Global.lyrics="\"Out Of Town Girl\"\n" +
                "\n" +
                "If you wanna know I like an out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "Put your hands up if you out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "\n" +
                "Hey baby girl I love your accent-cent-cent\n" +
                "I think I like you more because your different-ferent-ferent-ferent\n" +
                "Oh, I ain't gotta ask I can tell you ain't from here, here, here, here\n" +
                "Oh, what I gotta do just to show you that I want you near, near, near, near, near\n" +
                "\n" +
                "All you gotta do is read the signs\n" +
                "The exit is to the right,\n" +
                "I don't know your name\n" +
                "But love your smile,\n" +
                "I love the way you put it down, down, down\n" +
                "\n" +
                "If you wanna know I like an out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "Put your hands up if you out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "You know I gotta hold it down for my out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "You can tell, you can tell, she's an out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "\n" +
                "If you feeling me, let me know, we gon' ride the flow-ow-ow\n" +
                "I can be your passport, tell me where you wanna go-oh-oh\n" +
                "Girl don't be shy you won't know if you never try-try-try\n" +
                "When you walk by you're the only one that catches my eye-eye-eye\n" +
                "\n" +
                "All you gotta do is read the signs\n" +
                "The exit is to the right,\n" +
                "I don't know your name\n" +
                "But love your smile,\n" +
                "I love the way you put it down, down, down\n" +
                "\n" +
                "If you wanna know I like an out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "Put your hands up if you out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "You know I gotta hold it down for my out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "You can tell, you can tell, she's an out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "\n" +
                "All you gotta do is swag\n" +
                "All you gotta do is swag, yeah\n" +
                "All you gotta do is swag, swag, swag, yeah\n" +
                "All you gotta do is swag\n" +
                "All you gotta do is swag\n" +
                "All you gotta do is swag, swag, swag\n" +
                "\n" +
                "If you wanna know I like an out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "Put your hands up if you out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "You know I gotta hold it down for my out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "You can tell, you can tell, she's an out of town girl, girl, girl, yeah, yeah, yeah\n" +
                "\n" +
                "Oh, no, no she's my out of town girl, girl, girl\n" +
                "She's my out of town girl, girl, girl\n" +
                "She's my out of town girl, yeah";
        intentactivity(view);
    }
    public void OB(View view)
    {
        Global.lyrics="\"Overboard\"\n" +
                "(feat. Jessica Jarrell)\n" +
                "\n" +
                "[Jessica Jarrell:]\n" +
                "It feels like we've been out at sea:\n" +
                "So back and forth – that's how it seems.\n" +
                "And when I wanna talk you say to me\n" +
                "That if it's meant to be it will be.\n" +
                "\n" +
                "So crazy is this thing we call \"love\".\n" +
                "And now that we've got it, we just can't give up.\n" +
                "I'm reaching out for you.\n" +
                "Got me out here in the water, and I...\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "I'm overboard,\n" +
                "And I need your love to pull me up.\n" +
                "I can't swim on my own.\n" +
                "It's too much.\n" +
                "Feels like I'm drowning without your love.\n" +
                "So, throw yourself out to me, my lifesaver.\n" +
                "\n" +
                "Life saver, oh, life saver.\n" +
                "My life saver.\n" +
                "Life saver, oh, life saver.\n" +
                "\n" +
                "Never understood you when you'd say\n" +
                "You wanted me to meet you halfway.\n" +
                "I felt like I was doing my part.\n" +
                "You kept thinking you were coming up short.\n" +
                "It's funny how things change 'cause now I see.\n" +
                "\n" +
                "So crazy is this thing we call \"love\".\n" +
                "And now that we've got it, we just can't give up.\n" +
                "I'm reaching out for you.\n" +
                "Got me out here in the water and I...\n" +
                "\n" +
                "[Justin Bieber (Jessica Jarrell):]\n" +
                "I'm overboard. (Overboard.)\n" +
                "And I need your love (your love) to pull me up (to pull me up).\n" +
                "I can't swim on my own.\n" +
                "It's too much. (It's too much.)\n" +
                "Feels like I'm drowning without your love (your love).\n" +
                "So, throw yourself out to me, my lifesaver.\n" +
                "\n" +
                "[Justin Bieber and Jessica Jarrell:]\n" +
                "It's supposed to be some give and take, I know.\n" +
                "But you're only taking and not giving anymore.\n" +
                "So, what do I do? (So, what do I do?)\n" +
                "'Cause I still love you. (Still love you, baby.)\n" +
                "And you're the only one who can save me.\n" +
                "\n" +
                "I'm overboard.\n" +
                "And I need your love to pull me up (pull me up).\n" +
                "I can't swim on my own.\n" +
                "It's too much. (It's too much.)\n" +
                "Feels like I'm drowning without your love.\n" +
                "(I'm drowning, baby, I'm drowning.)\n" +
                "So, throw yourself out to me (can't swim), my life saver.\n" +
                "\n" +
                "Life saver, oh, life saver.\n" +
                "My life saver.\n" +
                "(It's crazy, crazy, crazy.)\n" +
                "Life saver, oh, life saver.\n" +
                "\n" +
                "Life saver, oh, life saver.\n" +
                "My life saver.\n" +
                "Life saver, oh, life saver, yeah.\n";
        intentactivity(view);
    }
    public  void OBl(View view)
    {
        Global.lyrics="\"Overboard (Live)\"\n" +
                "(feat. Miley Cyrus)\n" +
                "\n" +
                "Ohh Ohh\n" +
                "\n" +
                "Hello everybody!\n" +
                "\n" +
                "It feels like we've been out at sea\n" +
                "So back and forth that's how it's seems\n" +
                "Whoa and when I want to talk\n" +
                "You say to me\n" +
                "That if it's meant to be, it will be\n" +
                "So crazy in this thing we call love\n" +
                "The love that we got that we just can't give up\n" +
                "I'm reaching out for you tell me\n" +
                "Out here in the water and I\n" +
                "\n" +
                "I'm overboard and I need your love\n" +
                "Pull me up\n" +
                "I can't swim on my own\n" +
                "It's to much\n" +
                "Feels like I'm drowning without your love\n" +
                "So throw yourself out to me\n" +
                "My life saver\n" +
                "Life saver\n" +
                "Oh life saver\n" +
                "My life saver\n" +
                "Life saver\n" +
                "Oh life saver oh wow\n" +
                "\n" +
                "Never understand you when you say\n" +
                "Wanting me to met you half way.\n" +
                "Felt like I was doing my part\n" +
                "Get bringing your coming up short\n" +
                "Funny how these thing change\n" +
                "Cause now I see\n" +
                "\n" +
                "So crazy in this love we call love\n" +
                "And now that we got it\n" +
                "We just can't give up\n" +
                "I'm reaching out for ya\n" +
                "\n" +
                "Got me out here in the water and I\n" +
                "\n" +
                "I'm overboard\n" +
                "And I need your love\n" +
                "Pull me up (Pull me up)\n" +
                "I can't swim on my own\n" +
                "It's to much (It's to much)\n" +
                "Feels like I'm drowning without your love\n" +
                "So throw yourself out to me\n" +
                "My life saver\n" +
                "\n" +
                "It's supposed to be some give and take I know.\n" +
                "Your only taking and not given any more\n" +
                "So what will I do? (So what will I do?)\n" +
                "Cause I still love you. (Still love you Baby)\n" +
                "You're the only one who can save me\n" +
                "\n" +
                "I'm overboard\n" +
                "And I need your love\n" +
                "Pull me up (Pull me up)\n" +
                "I can't swim on my own\n" +
                "It's to much (It's to much)\n" +
                "Feels like I'm drowning (I'm drowning baby I'm drowning) without your love\n" +
                "So throw yourself out to me (Can't swim)\n" +
                "My life saver\n" +
                "Life saver\n" +
                "Oh life saver\n" +
                "My life saver\n" +
                "(It's crazy, crazy crazy, yeah) Life saver\n" +
                "Oh life saver\n" +
                "Oh life saver\n" +
                "Oh life saver\n" +
                "Oh life saver\n" +
                "Yeah";
        intentactivity(view);
    }
    public  void PM(View view)
    {
        Global.lyrics="\"Pick Me\"\n" +
                "\n" +
                "You're the finest girl I've ever seen\n" +
                "And I wonder do you notice\n" +
                "That every guy you meet winds up catching feelings for ya\n" +
                "And you can have any of 'em\n" +
                "You can take your pick\n" +
                "But you need to check with me\n" +
                "Girl I promise, I'm legit\n" +
                "\n" +
                "Yes, we be going to the movies\n" +
                "In a theatre holdin' hands\n" +
                "I'll walk you home from school\n" +
                "I'll walk you to your classes\n" +
                "Playing my 360 yes you'll be my best friend\n" +
                "But most of all baby doll you'll be my love love love\n" +
                "\n" +
                "You should pick me\n" +
                "So tell me can you dig it\n" +
                "I'm everything you need girl\n" +
                "So tell me can you dig it\n" +
                "I'll always be your number one number one fan, dig that\n" +
                "And I should be your one and only man\n" +
                "You should pick me\n" +
                "Tell me can you dig it\n" +
                "Think of how good it could be, girl\n" +
                "So tell me can you dig it\n" +
                "I'll always be your number one number one fan, dig that\n" +
                "And I should be your one and only man\n" +
                "You should pick me\n" +
                "\n" +
                "Yeah, you should pick me girl\n" +
                "\n" +
                "You're my favorite part of the day\n" +
                "And every morning I look forward to me seeing your face\n" +
                "I just need to see it some more\n" +
                "Baby I'm the kind of guy who can appreciate a girl as amazing as you\n" +
                "So you gotta be my baby\n" +
                "\n" +
                "'Cause if you feel me, already we chilling at the beach\n" +
                "I'll take you on a cruise watch the sunset while we eating\n" +
                "You can have anything you want 'cause I'll be your best friend\n" +
                "But most of all baby doll you'll be my love love love love\n" +
                "\n" +
                "You should pick me\n" +
                "So tell me can you dig it\n" +
                "I'm everything you need girl\n" +
                "So tell me can you dig it\n" +
                "I'll always be your number one number one fan\n" +
                "Dig that\n" +
                "And I should be your one and only man\n" +
                "You should pick me\n" +
                "Tell me can you dig it\n" +
                "Think of how good it could be girl\n" +
                "So tell me can you dig it\n" +
                "I'll always be your number one number one fan\n" +
                "Dig that\n" +
                "And I should be your one and only man\n" +
                "You should pick me\n" +
                "\n" +
                "You should pick the guy that makes you happy\n" +
                "Pick the flyest of 'em\n" +
                "Pick the one that's got swagger\n" +
                "Pick the one that makes you laugh\n" +
                "The one that always got your back\n" +
                "Who would rather die than to make you sad\n" +
                "\n" +
                "That's why you should pick me\n" +
                "Tell me can you dig it\n" +
                "I'm everything you need girl\n" +
                "So tell me can you dig it\n" +
                "I'll always be your number one number one fan\n" +
                "Dig that\n" +
                "And I should be your one and only man\n" +
                "\n" +
                "You should pick me\n" +
                "Tell me can you dig it\n" +
                "Think of how good it could be girl\n" +
                "I'm everything you need\n" +
                "I'll always be your number one number one fan\n" +
                "Dig that\n" +
                "And I should be your one and only man\n" +
                "You should pick me\n" +
                "\n" +
                "You should pick me\n";
        intentactivity(view);
    }
    public  void PT(View view)
    {
        Global.lyrics="\"Playtime\"\n" +
                "(with Khalil)\n" +
                "\n" +
                "JB... Khalil...\n" +
                "\n" +
                "[Hook - Justin Bieber:]\n" +
                "Playtime is over, over (say what)\n" +
                "I got no time to play no games with you\n" +
                "Playtime is over, over\n" +
                "I got no time to play no games with you\n" +
                "\n" +
                "[Verse 1 - Justin Bieber:]\n" +
                "No more playing games\n" +
                "No more arguing, asking me where I'm gonna be\n" +
                "Such a waste of time\n" +
                "There's no need to fight (there's no need to fight)\n" +
                "I want to spend that time laughing out loud\n" +
                "Cause there ain't really no time for arguing no\n" +
                "\n" +
                "[Khalil & Justin Bieber:]\n" +
                "Playtime is over, over\n" +
                "I got no time to play no games with you\n" +
                "I got no time to play no games with you\n" +
                "Playtime is over, over (over)\n" +
                "I got no time to play no games with you\n" +
                "\n" +
                "[Bridge - Khalil & Justin Bieber:]\n" +
                "I don't want to move on\n" +
                "So don't push me away, to get to my heart\n" +
                "Don't play no games (don't play no games)\n" +
                "I got no time to play no games with you\n" +
                "\n" +
                "[Verse 2 - Khalil:]\n" +
                "I won't say no names, I won't say no names\n" +
                "But you're playing games\n" +
                "See lately, baby girl it just ain't been the same (oh no)\n" +
                "Just saying what's on my mind, I hope you feel my pain\n" +
                "Well girl I guess it's just a part of love\n" +
                "But I hope you know that you're the one I'm dreaming of\n" +
                "\n" +
                "[Hook - Justin Bieber:]\n" +
                "Playtime is over, over\n" +
                "I got no time to play no games with you\n" +
                "Playtime is over, over\n" +
                "I got no time to play no games with you\n" +
                "\n" +
                "[Bridge - Justin Bieber:]\n" +
                "Hard to move on\n" +
                "So don't push me away to get to my heart\n" +
                "Don't play no games\n" +
                "Playtime is over, over (over)\n" +
                "I got no time to play no games with you (games with you)";
        intentactivity(view);
    }
    public  void P(View view)
    {
        Global.lyrics="\"Pray\"\n" +
                "\n" +
                "And I pray\n" +
                "\n" +
                "I just can't sleep tonight\n" +
                "Knowing that things ain't right.\n" +
                "It's in the papers, it's on the TV, it's everywhere that I go:\n" +
                "Children are crying,\n" +
                "Soldiers are dying,\n" +
                "Some people don't have a home.\n" +
                "\n" +
                "But I know there's sunshine beyond that rain.\n" +
                "I know there's good times beyond that pain.\n" +
                "Hey, can you tell me how I can make a change?\n" +
                "\n" +
                "I close my eyes and I can see a better day.\n" +
                "I close my eyes and pray.\n" +
                "I close my eyes and I can see a better day.\n" +
                "I close my eyes and pray.\n" +
                "\n" +
                "I lose my appetite\n" +
                "Knowing kids starve tonight.\n" +
                "Am I a sinner\n" +
                "'Cause half my dinner\n" +
                "Is still there on my plate?\n" +
                "Ooh, I got a vision to make a difference.\n" +
                "And it's starting today.\n" +
                "\n" +
                "'Cause I know there's sunshine beyond that rain.\n" +
                "I know there's good times beyond that pain.\n" +
                "Heaven, tell me I can make a change.\n" +
                "\n" +
                "I close my eyes and I can see a better day.\n" +
                "I close my eyes and pray.\n" +
                "I close my eyes and I can see a better day.\n" +
                "I close my eyes and...\n" +
                "\n" +
                "I pray for the broken-hearted.\n" +
                "I pray for the life not started.\n" +
                "I pray for all the lungs not breathing.\n" +
                "I pray for all the souls that need a break.\n" +
                "Can you give 'em one today?\n" +
                "\n" +
                "I just can't sleep tonight.\n" +
                "Can someone tell me how to make a change?\n" +
                "\n" +
                "I close my eyes and I can see a better day.\n" +
                "I close my eyes and pray.\n" +
                "I close my eyes and I can see a better day.\n" +
                "I close my eyes and I pray.\n" +
                "\n" +
                "I pray.\n" +
                "I pray.\n" +
                "\n" +
                "I close my eyes and pray.";
        intentactivity(view);
    }
    public void PP(View view)
    {
        Global.lyrics="\"Purpose\"\n" +
                "\n" +
                "Feeling like I'm breathing my last breath\n" +
                "Feeling like I'm walking my last steps\n" +
                "Look at all of these tears I've wept\n" +
                "Look at all the promises that I've kept\n" +
                "\n" +
                "I put my all into your hands\n" +
                "Here's my soul to keep\n" +
                "I let you in with all that I can\n" +
                "You're not hard to reach\n" +
                "And you've blessed me with the best gift\n" +
                "That I've ever known\n" +
                "You give me purpose\n" +
                "Yeah, you've given me purpose\n" +
                "\n" +
                "Thinking my journey's come to an end\n" +
                "Sending out a farewell to my friends, for inner peace\n" +
                "Ask you to forgive me for my sins, oh would you please?\n" +
                "I'm more than grateful for the time we spent, my spirit's at ease\n" +
                "\n" +
                "I put my heart into your hands\n" +
                "Learn the lessons you teach\n" +
                "No matter when, wherever I am\n" +
                "You're not hard to reach\n" +
                "And you've given me the best gift\n" +
                "That I've ever known\n" +
                "You give me purpose everyday\n" +
                "You give me purpose in every way\n" +
                "\n" +
                "Oh, you are my everything\n" +
                "Oh, you are my everything\n" +
                "\n" +
                "[Spoken:]\n" +
                "I don't know if this is wrong because someone else is telling me that it's wrong but I feel this so let me just like, try my best not to let this happen again. We weren't necessarily put in the best position to make the best decisions.\n" +
                "\n" +
                "You can't be hard on yourself for these were the cards that you were given. So you have to understand that these, like... that's not who you are. You know you're trying to be the best you can be, but that's all you can do. If you don't give it all you got, you're only cheating yourself. Give it all you got, but if it ends up happening, it ends up happening.\n" +
                "\n" +
                "That's what—that's what's happening with me. It's like \"God, I'm giving it all I got, sometimes I'm weak and I'm gonna do it\". And it's like I'm not giving myself grace, I'm just like understanding, that's just how it is.";
        intentactivity(view);
    }
    public void PYD(View view)
    {
        Global.lyrics="\"PYD\"\n" +
                "(feat. R. Kelly)\n" +
                "\n" +
                "(PYD, PYD, PYD, PYD, PYD, PYD, PYD)\n" +
                "I'mma put you down\n" +
                "(PYD, PYD, PYD)\n" +
                "Down (PYD, PYD, PYD)\n" +
                "I'mma put you down (PYD, PYD, PYD)\n" +
                "All the way down (whoa)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "From the door to the wall\n" +
                "Coffee table, girl, get ready\n" +
                "I'mma put you down (PYD PYD PYD)\n" +
                "All the way down (PYD PYD PYD)\n" +
                "From the stove to the counter top\n" +
                "Dining room table, are you ready?\n" +
                "I'mma put you down\n" +
                "(PYD PYD PYD, PYD PYD PYD)\n" +
                "\n" +
                "Up the stairs to my bedroom\n" +
                "Light a few candles, prepare yourself\n" +
                "I'mma put you down (PYD PYD PYD)\n" +
                "All the way down (PYD PYD PYD)\n" +
                "On a plane, a train, an automobile doesn't matter\n" +
                "I'mma put you down (PYD PYD PYD)\n" +
                "All the way down (PYD PYD PYD)\n" +
                "\n" +
                "[Chorus - Justin Bieber:]\n" +
                "And it don't make no sense to be that bad\n" +
                "Im'ma take it out on you, babe (PYD PYD PYD)\n" +
                "Put you down (PYD PYD PYD)\n" +
                "This will show you how much I love you\n" +
                "Form of appreciation\n" +
                "I'mma put you down (PYD PYD PYD PYD PYD PYD PYD)\n" +
                "Oh, 'cause you deserve the best\n" +
                "And nothing but the best\n" +
                "So I'll give you the best you ever had\n" +
                "I'mma put you down (PYD PYD PYD PYD PYD PYD PYD)\n" +
                "I'mma put you down\n" +
                "\n" +
                "[R. Kelly:]\n" +
                "On the roof (baby), balcony (baby), we don't care (baby) who sees\n" +
                "Girl, I'mma put you down (PYD PYD PYD)\n" +
                "All the way down, down, down (PYD PYD PYD)\n" +
                "After the club, in the parking lot\n" +
                "I don't care anywhere you could pick the spot, whatever\n" +
                "I'mma put you down, yeah (PYD PYD PYD)\n" +
                "All the way down, yeah (PYD PYD PYD)\n" +
                "'Cause I've been doing forensics\n" +
                "On your body in this club\n" +
                "I can tell the way you walk\n" +
                "Your body ain't been touched the right way\n" +
                "\n" +
                "It seems your man been treating you like a step-child\n" +
                "Sub him out, sub me in\n" +
                "And I'm a get on the floor\n" +
                "And shut the whole game down\n" +
                "Until I hear you cheering, babe\n" +
                "Have you spellin' out my name, babe\n" +
                "See, I wanna give my love\n" +
                "Be your dope man in the bedroom\n" +
                "You can make me your drug, babe\n" +
                "\n" +
                "[Chorus - R. Kelly:]\n" +
                "And it don't make no sense to be that bad\n" +
                "Oh no, baby (PYD PYD PYD),\n" +
                "I'm gonna put you down\n" +
                "Gonna show you how much I love you\n" +
                "Form of appreciation, yeah no ooh\n" +
                "(PYD PYD PYD, PYD PYD PYD)\n" +
                "Oh, 'cause you deserve the best\n" +
                "And nothing but the best\n" +
                "So I'll give you the best you've ever had\n" +
                "I'm gonna put you down (PYD PYD PYD PYD PYD PYD)\n" +
                "I'm gonna put you down, all the way down\n" +
                "\n" +
                "[Both:]\n" +
                "Oh, 'cause you deserve the best\n" +
                "And nothing but the best\n" +
                "So I'll give you the best you've ever had\n" +
                "I'mma put you down, I'mma put you down, I'mma put you down\n" +
                "I'mma put you down, I'mma put you down, I'mma put you down\n" +
                "\n" +
                "Put you down, put you down, put you down, put you down down\n" +
                "Put you down, put you down, put you down, put you down down\n" +
                "I'mma put you down\n" +
                "Put you down, put you down, put you down, put you down down\n" +
                "All the way down\n" +
                "Put you down, put you down, put you down, put you down down\n" +
                "PYD, PYD, PYD PYD PYD PYD\n" +
                "I'mma put you down\n" +
                "PYD PYD PYD PYD PYD\n";
        intentactivity(view);
    }
    public  void R(View view)
    {Global.lyrics="\"Recovery\"\n" +
            "\n" +
            "First I'll acknowledge\n" +
            "Your trust has been broken now\n" +
            "A successful recovery\n" +
            "I pray for us at night\n" +
            "\n" +
            "Blessed me with a second chance\n" +
            "Never thought I'd see your face again\n" +
            "Learned a lot through trial and error\n" +
            "Tryna make it right\n" +
            "\n" +
            "Make it right\n" +
            "Make it right\n" +
            "Make it right\n" +
            "It's time to do ya right\n" +
            "Woooooooah woah, wooooooooaaah\n" +
            "\n" +
            "Missin' ya good intentions\n" +
            "Missin' ya from a distance\n" +
            "Hope ya did the same\n" +
            "\n" +
            "I know that I caused a problem\n" +
            "I Know that I left you livid\n" +
            "Pushed you far away\n" +
            "\n" +
            "Learned it don't pay to lie\n" +
            "Costs more to see you cry\n" +
            "Sayin' nothing gets you nowhere fast\n" +
            "Imma hold it back inside\n" +
            "\n" +
            "Well now that I'm back around ya\n" +
            "Nothing else really matters\n" +
            "Hope ya feel the same\n" +
            "\n" +
            "First I'll acknowledge\n" +
            "Your trust has been broken now\n" +
            "A successful recovery\n" +
            "I pray for us at night\n" +
            "\n" +
            "Blessed me with a second chance\n" +
            "Never thought I'd see your face again\n" +
            "Learned a lot through trial and error\n" +
            "Tryna make it right\n" +
            "\n" +
            "Make it right\n" +
            "Make it right\n" +
            "Make it right\n" +
            "It's time to do ya right\n" +
            "Woooooooah woah, wooooooooaaah\n" +
            "\n" +
            "Goin' through all the motions\n" +
            "Tryna find a reason\n" +
            "Why we ended that way\n" +
            "\n" +
            "Nothin' in life is perfect\n" +
            "When you're changing like the seasons\n" +
            "That's what they used to say\n" +
            "\n" +
            "Cause goin' to sleep alone at night\n" +
            "I don't wanna close my eyes\n" +
            "Wanna give you all I have to give\n" +
            "No more holdin' back this time\n" +
            "\n" +
            "Now that I'm back around ya\n" +
            "Nothin' around me matters\n" +
            "Hope ya feel the same\n" +
            "\n" +
            "First I'll acknowledge\n" +
            "Your trust has been broken now\n" +
            "A successful recovery\n" +
            "I pray for us at night\n" +
            "\n" +
            "Blessed me with a second chance\n" +
            "Never thought I'd see your face again\n" +
            "Learned a lot through trial and error\n" +
            "Tryna make it right\n" +
            "\n" +
            "Make it right (make it right, make it right)\n" +
            "Make it right (make it right, make it right)\n" +
            "Make it right (make it right, make it right)\n" +
            "It's time to do ya right\n" +
            "Woooooooah woah, wooooooooaaah\n" +
            "\n" +
            "You know Imma do you right\n" +
            "You know Imma do you right\n" +
            "You know Imma do you right\n" +
            "You know Imma do you right\n" +
            "Imma do you right\n" +
            "You know Imma do you right\n";
        intentactivity(view);
    }
    public void RE(View view)
    {
        Global.lyrics="\"Ride\"\n" +
                "\n" +
                "Ride, I-I wanna ride\n" +
                "Ride I wanna ride\n" +
                "Ride, I-I wanna ride\n" +
                "\n" +
                "When I wake up, I first think of you\n" +
                "I really like you, and I hope you like me too\n" +
                "The sky is the limit for me and you\n" +
                "I could be your queen, but you could be my boo\n" +
                "We could go anywhere, to the moon and through the air\n" +
                "We could go to the movies or the mall, baby I don't care\n" +
                "Yeah this is true, wanna be with you\n" +
                "And I just wanna ride with you\n" +
                "I wanna ride\n" +
                "Yeah I-I wanna ride\n" +
                "(by the ocean side)\n" +
                "I wanna ride\n" +
                "I-I wanna ride with you\n" +
                "I-I wanna ride\n" +
                "I wanna ride\n" +
                "I just wanna ride with you\n" +
                "\n" +
                "Whenever I'm with you, you make me feel special\n" +
                "And all my problems, they go right through the door\n" +
                "I love it when you call me baby\n" +
                "(baby)\n" +
                "It's you I adore\n" +
                "(adore)\n" +
                "\n" +
                "We could go to the moon, and through the air\n" +
                "We could go to the movies or the mall, baby I don't care\n" +
                "Yeah this is true, wanna be with you\n" +
                "And I just wanna ride with you\n" +
                "I wanna ride\n" +
                "Yeah I-I wanna ride\n" +
                "(by the ocean side)\n" +
                "I wanna ride\n" +
                "I-I wanna ride with you\n" +
                "I-I wanna ride\n" +
                "I wanna ride\n" +
                "I just wanna ride with you\n" +
                "\n" +
                "So lets go right now\n" +
                "Go slow right now\n" +
                "Let the base flow out with that boom boom pow\n" +
                "So lets go right now\n" +
                "Go slow right now\n" +
                "Let the base flow out with that boom boom pow\n" +
                "\n" +
                "I wanna ride\n" +
                "Yeah I-I wanna ride\n" +
                "I wanna ride\n" +
                "I-I wanna ride with you\n" +
                "I-I wanna ride\n" +
                "I wanna ride\n" +
                "I just wanna ride with you\n" +
                "I wanna ride\n" +
                "Yeah I-I wanna ride\n" +
                "I wanna ride\n" +
                "I-I wanna ride with you\n" +
                "I-I wanna ride\n" +
                "I wanna ride\n" +
                "I just wanna ride with you\n" +
                "I wanna ride\n" +
                "I wanna ride\n" +
                "I-I ohhhh whoaaa\n" +
                "I wanna ride\n" +
                "I wanna ride\n" +
                "I just wanna ride with you\n" ;
        intentactivity(view);
    }
    public void RH(View view)
    {
        Global.lyrics="\"Right Here\"\n" +
                "(feat. Drake)\n" +
                "\n" +
                "Baby, I'm here, I'm here to stay\n" +
                "I ain't going nowhere\n" +
                "I know you're scared cause you've been hurt\n" +
                "Baby, it's alright\n" +
                "Lost in your eyes every time that you look in mine\n" +
                "I promise to be all that you need\n" +
                "I won't leave you, baby\n" +
                "No, cause I just wanna love you\n" +
                "I would never ever put nobody up above you\n" +
                "I just wanna kiss you baby, I just wanna hug you till the end, baby till the end\n" +
                "\n" +
                "And I'm right here, ain't nobody gotta hold you\n" +
                "Cause I'm right here, ain't nobody gon' control you\n" +
                "Cause I'm right, right here\n" +
                "Yeah\n" +
                "I'm right here, I'm right here, I'm right here, I'm right here\n" +
                "Yeah\n" +
                "\n" +
                "Right here, right here, yeah\n" +
                "Right here, right here, yeah\n" +
                "\n" +
                "[Drake:]\n" +
                "Say you'll be mine, say we'll be fine\n" +
                "Say we'll be together\n" +
                "Selfish of me to ask since I be the reason we don't last forever\n" +
                "Wish that you knew all that I do to make this thing go right\n" +
                "Promise to be all that you need\n" +
                "I won't leave you, baby\n" +
                "No cause I just wanna love you\n" +
                "I would never ever put nobody else above you\n" +
                "I just wanna kiss you baby, I just wanna hug you till the end, baby till the end\n" +
                "\n" +
                "And I'm right here, ain't nobody gotta hold you\n" +
                "Cause I'm right here, ain't nobody gon' control you\n" +
                "Cause I'm right, right here\n" +
                "Yeah\n" +
                "I'm right here, I'm right here, I'm right here, I'm right here\n" +
                "Yeah\n" +
                "\n" +
                "Right here, right here, yeah\n" +
                "Right here, right here, yeah\n" +
                "\n" +
                "[Drake:]\n" +
                "And I say, good girl got her mind right\n" +
                "She been raised right, being patient, I know you waiting\n" +
                "Waiting on a good thing, when the time's right\n" +
                "You should let me get to know you, baby\n" +
                "\n" +
                "I just wanna put it on you\n" +
                "If you want to, baby, tell me what you gon' do, girl\n" +
                "I can make you feel perfect, girl you're worth it\n" +
                "I just need to see you work it, girl\n" +
                "\n" +
                "And I'm right here, ain't nobody gotta hold you\n" +
                "Cause I'm right here, ain't nobody gon' control you\n" +
                "Cause I'm right, right here\n" +
                "Yeah\n" +
                "I'm right here, I'm right here, I'm right here, I'm right here\n" +
                "Yeah\n" +
                "\n" +
                "Right here, right here, yeah\n" +
                "Right here, right here, yeah\n" +
                "Right here, right here, yeah, yeah, yeah, oh, oh, yeah";
        intentactivity(view);
    }
    public void RC(View view)
    {
        Global.lyrics="\"Roller Coaster\"\n" +
                "\n" +
                "Come here\n" +
                "I don't know what happened\n" +
                "\n" +
                "Where did they go?\n" +
                "Nights like this don't happen anymore oh girl\n" +
                "I need to know\n" +
                "Is it me, and did I lose control?\n" +
                "(oh babe slow it down)\n" +
                "\n" +
                "Lonely overseas\n" +
                "Only memories\n" +
                "Wish I had the key to your heart\n" +
                "People come and go\n" +
                "Baby, they don't know\n" +
                "What we had before\n" +
                "But it fell before our eyes\n" +
                "\n" +
                "Roller coaster, roller coaster\n" +
                "Spinning all around and around for a while baby\n" +
                "Roller coaster, roller coaster\n" +
                "For a minute we were up, but the next we were falling down\n" +
                "\n" +
                "It's been difficult\n" +
                "I'm just happy there's no fights no more\n" +
                "But it's nights like this that I never ever missed you more\n" +
                "If there's a reason what this happened for\n" +
                "(But I can't help but feel like)\n" +
                "\n" +
                "Lonely overseas\n" +
                "Only memories\n" +
                "Wish I had the key to your heart\n" +
                "People come and go\n" +
                "Baby, they don't know\n" +
                "What we had before\n" +
                "But it fell before our eyes\n" +
                "\n" +
                "Roller coaster, roller coaster\n" +
                "Spinning all around and around for a while baby\n" +
                "Roller coaster, roller coaster\n" +
                "For a minute we were up, but the next we were falling down\n" +
                "\n" +
                "Bounce\n" +
                "\n" +
                "Lonely overseas\n" +
                "Only memories\n" +
                "Wish I had the key to your heart\n" +
                "People come and go\n" +
                "Baby, they don't know\n" +
                "What we had before\n" +
                "But it fell before our eyes\n" +
                "\n" +
                "Roller coaster, roller coaster\n" +
                "Spinning all around and around for a while baby\n" +
                "Roller coaster, roller coaster\n" +
                "For a minute we were up, but the next we were falling down\n";
        intentactivity(view);
    }
    public void RL(View view)
    {
        Global.lyrics="\"Runaway Love\"\n" +
                "\n" +
                "You see my baby up and hit the road\n" +
                "Where she's going that's what nobody knows\n" +
                "I need to find her before another man does\n" +
                "I wouldn't want him to steal my love\n" +
                "\n" +
                "I'm just trying to be cool, cool, cool\n" +
                "Trying to be cool\n" +
                "What you expect me to do?\n" +
                "I'm just trying to find, find, find\n" +
                "The sweet love of mine\n" +
                "I'm running out of time\n" +
                "Where is my runaway love?\n" +
                "Searching low and high\n" +
                "Know that I'm not giving up\n" +
                "I'd give it all up for us\n" +
                "But it'll never be enough\n" +
                "I won't stop until I find\n" +
                "My runaway love\n" +
                "\n" +
                "See my baby really needs some help\n" +
                "Cause she can never stay at home by herself\n" +
                "She says she needs a little company\n" +
                "Even if she's not always with me, yeah\n" +
                "\n" +
                "I'm just trying to be cool, cool, cool\n" +
                "What you expect me to do?\n" +
                "I'm just trying to find, find, find\n" +
                "The sweet love of mine\n" +
                "I'm running out of time\n" +
                "Where is my runaway love?\n" +
                "Searching low and high\n" +
                "Know that I'm not giving up\n" +
                "I'd give it all up for us\n" +
                "But it'll never be enough\n" +
                "I won't stop until I find\n" +
                "My runaway love\n" +
                "\n" +
                "Why can't I find you love of mine\n" +
                "When you're standing in front of my face?\n" +
                "Oh I, I must be blind\n" +
                "How did I let you get away? (Yeah, yeah)\n" +
                "\n" +
                "I'm running out of time\n" +
                "Where is my runaway love?\n" +
                "Searching low and high\n" +
                "Know that I'm not giving up\n" +
                "I'd give it all up for us\n" +
                "But it'll never be enough\n" +
                "I won't stop until I find\n" +
                "My runaway love\n" +
                "\n" +
                "I'm running out of time\n" +
                "Where is my runaway love?\n" +
                "Searching low and high\n" +
                "Know that I'm not giving up\n" +
                "I'd give it all up for us\n" +
                "But it'll never be enough\n" +
                "I won't stop until I find\n" +
                "My runaway love";
        intentactivity(view);
    }
    public  void RLr(View view)
    {
        Global.lyrics="\"Runaway Love (Remix)\"\n" +
                "(feat. Raekwon & Kanye West)\n" +
                "\n" +
                "[Raekwon:]\n" +
                "Visual, visual, JB\n" +
                "Yo, Ye, what up? Raekwon\n" +
                "\n" +
                "You got stacks like the International House of Pancakes\n" +
                "All alone, ready to phone me and your hand shakes\n" +
                "Palms is wet, a don's regret\n" +
                "Never to walk miles for love, I sit in the starter's deck\n" +
                "It just happened I was floating, you seen the captain?\n" +
                "Blinked at me then I threw him my thinking cap\n" +
                "Take her, then we could slide to Jamaica\n" +
                "Shop for like a year or two, stop in Diego\n" +
                "It's obvious, I want to see who your mami is\n" +
                "We just friends so she can't Clyde, Bonnie this\n" +
                "Fly walls, dining in fly halls\n" +
                "Come to the master suite, leave every piece in the master hall\n" +
                "All my money tied in knots\n" +
                "Stand over there, that's why I make it happen on blocks\n" +
                "Brazil cut sweater, patent leather\n" +
                "Playing the field, trying to outslick Baretta\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "You see, my baby up and hit the road\n" +
                "Where she's going? That's what nobody knows\n" +
                "I need to find her before another man does\n" +
                "I wouldn't want him to steal my love\n" +
                "\n" +
                "I'm just tryna be cool, cool, cool, tryna be cool, what you expect me to do?\n" +
                "I'm just tryna find, find, find this sweet love of mine\n" +
                "\n" +
                "I'm running out of time, where is my runaway love?\n" +
                "Searching low and high, know that I'm not letting up\n" +
                "I'd give it all up for us, but it'll never be enough\n" +
                "I won't stop until I find my runaway love\n" +
                "\n" +
                "[Kanye West:]\n" +
                "Last name West and my teeth diamonds\n" +
                "She said \"Yo what's your occupation, crazy rhyming?\"\n" +
                "Listen to Wu-Tang, trying suits on\n" +
                "Accoutrements is Grey Poupon\n" +
                "Stunting in a high top Louis', shorts is the Coogis\n" +
                "Open up the door when you take her to the movies\n" +
                "When you meet the parents, you tell De Niro\n" +
                "Her boyfriend a zero, she need to cut the weirdo\n" +
                "Next show they gotta up the zeros\n" +
                "Nobody rocking like this 16 years old\n" +
                "The hard drums and the Wally's something that caught me\n" +
                "I'm telling you what Wu-Tang taught me\n" +
                "The young youth, rocking the gold tooth\n" +
                "Pull up in a drop top, old school bumping to Cash Rules\n" +
                "No question we the reason why the summer's blazing\n" +
                "Then say, \"You looking good fly coloured Asian\"\n" +
                "Raw I give it to you, no trivia\n" +
                "She used to roll with my G-Unit like Olivia\n" +
                "Until she caught me getting numbers and hugs\n" +
                "I guess that's the day she became a runaway love, sweet love of mine\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "I'm running out of time, where is my runaway love?\n" +
                "Searching low and high, know that I'm not letting up\n" +
                "I'd give it all up for us, but it'll never be enough\n" +
                "I won't stop until I find my runaway love\n" +
                "\n" +
                "Why can't I find you, love of mine?\n" +
                "When you're standing in front of my face\n" +
                "Oh why, I must be blind\n" +
                "How did I let you get away?\n" +
                "\n" +
                "[Raekwon:]\n" +
                "Leave it up to the most high, sitting in a ghost fly\n" +
                "Chilling with two of my brothers\n" +
                "We both live on deck grabbing 'em on set\n" +
                "This is how we roll in the business, she a go I'mma go get\n" +
                "Take that queen or shorty up\n" +
                "We can live it up every month baby girl, just call me up\n" +
                "Waking up resting in cold sweats\n" +
                "Thinking of this bitch, the videotapes, even the stress\n" +
                "My mind is a terrible thing to waste\n" +
                "No love lost, I know I'm going crazy, I can't floss\n" +
                "Me, my lady left my homies it's all baloney\n" +
                "Just like rocking the old Pony's\n" +
                "So when I'm chilling, I'm just lost no more feeling\n" +
                "I need my honey in my life get that feel me\n" +
                "Take your time, readjust and ya you shine\n" +
                "My runaway love didn't mind, come on\n" +
                "\n" +
                "[Justin Bieber x2:]\n" +
                "I'm running out of time, where is my runaway love?\n" +
                "Searching low and high, know that I'm not letting up\n" +
                "I'd give it all up for us, but it'll never be enough\n" +
                "I won't stop until I find my runaway love\n";
        intentactivity(view);
    }
    public void SCT(View view)
    {
        Global.lyrics="\"Santa Claus Is Coming To Town\"\n" +
                "\n" +
                "Santa's coming girl\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "You better watch out\n" +
                "You better not cry\n" +
                "You better not pout\n" +
                "I'm telling you why\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "He's making a list\n" +
                "He's checking it twice;\n" +
                "He's gonna find out\n" +
                "Who's naughty and nice\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "He sees you when you're sleeping\n" +
                "He knows when you're awake\n" +
                "He knows when you've been bad or good\n" +
                "So be good for goodness sake!\n" +
                "\n" +
                "You better watch out!\n" +
                "You better not cry\n" +
                "You better not pout\n" +
                "I'm telling you why\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "You better watch out!\n" +
                "You better not cry\n" +
                "You better not pout\n" +
                "I'm telling you why\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "He's making a list\n" +
                "And checking it twice;\n" +
                "He's gonna find out\n" +
                "Who's naughty and nice\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "He sees you when you're sleeping\n" +
                "He knows when you're awake\n" +
                "He knows when you've been bad or good\n" +
                "So be good for goodness sake!\n" +
                "\n" +
                "You better watch out!\n" +
                "You better not cry\n" +
                "You better not pout\n" +
                "I'm telling you why\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "\"So it's that time of the year\n" +
                "When you let all your problems go\n" +
                "And you know, you just...\"\n" +
                "\n" +
                "Shake it, shake it, baby!\n" +
                "Shake it, shake it, baby!\n" +
                "Ooooh...\n" +
                "Shake it, shake it, baby!\n" +
                "Shake it, shake it, baby!\n" +
                "Ooooh...\n" +
                "\n" +
                "He sees you when you're sleeping\n" +
                "He knows when you're awake\n" +
                "He knows when you've been bad or good\n" +
                "So be good for goodness sake!\n" +
                "\n" +
                "You better watch out!\n" +
                "You better not cry\n" +
                "You better not pout\n" +
                "I'm telling you why\n" +
                "Santa Claus is coming to town\n" +
                "\n" +
                "He's making a list\n" +
                "And checking it twice;\n" +
                "He's gonna find out\n" +
                "Who's naughty and nice\n" +
                "Santa Claus is coming\n" +
                "Santa Claus is coming\n" +
                "Santa Claus is coming to town\n" +
                "Santa Claus is coming to town...\n" +
                "Santa Claus is coming to town...\n" +
                "Santa Claus is coming to town...";
        intentactivity(view);
    }
    public void SPYT(View view)
    {
        Global.lyrics="\"Set A Place At Your Table\"\n" +
                "\n" +
                "Things seemed strange this morning\n" +
                "As I packed my bag for school\n" +
                "The smiles I'm used to seeing just weren't there\n" +
                "I heard my father talking\n" +
                "To my mother down the hallway\n" +
                "Above the whispers all that I could hear... was\n" +
                "\n" +
                "[Chorus]\n" +
                "Set a place at the table for someone who might need it\n" +
                "Set a place at the table for someone to sit down and eat\n" +
                "Kick their shoes off, put their feet up\n" +
                "Forget about their troubles for awhile\n" +
                "When there's a place at your table\n" +
                "There's a little hope for you and I\n" +
                "\n" +
                "I was feeling kinda' helpless\n" +
                "About the words that I just heard\n" +
                "Could it be the family 2 doors down?\n" +
                "They said a couple months of bad luck\n" +
                "Had them up against the wall\n" +
                "And though it may seem small\n" +
                "I know there's somethin' I can do\n" +
                "\n" +
                "[Chorus]\n" +
                "Set a place at the table for someone who might need it\n" +
                "Set a place at the table for someone to sit down and eat\n" +
                "Kick their shoes off, put their feet up\n" +
                "Forget about their troubles for awhile\n" +
                "When there's a place at your table\n" +
                "There's a little hope for you and I\n" +
                "\n" +
                "Make room at your table for your friends and family\n" +
                "Take the time to share your day, just laugh, talk and eat\n" +
                "\n" +
                "[Chorus]\n" +
                "Set a place at the table for someone who might need it\n" +
                "Set a place at your table for someone to sit down and eat\n" +
                "Kick their shoes off, put their feet up\n" +
                "Forget about their troubles for awhile\n" +
                "When there's a place at your table\n" +
                "There's a little hope for you and I\n" +
                "\n" +
                "...there's a little hope for you and";
        intentactivity(view);
    }
    public void SLTa(View view)
    {
        Global.lyrics="\"She Don't Like The Lights (Acoustic Version)\"\n" +
                "\n" +
                "She don't like the flash, wanna keep us in the dark\n" +
                "She don't like the fame, hate it when we're miles apart\n" +
                "And she getting to the point where it's too much for her\n" +
                "And throw us all away 'cause it's too much for her\n" +
                "She don't wanna hide 'cause the world knows who we are\n" +
                "\n" +
                "She don't like the lights\n" +
                "She don't, she don't\n" +
                "She don't like the lights\n" +
                "She don't, she don't\n" +
                "\n" +
                "Don't wanna share with no one else, want me to herself\n" +
                "Don't want no love in front of the camera\n" +
                "\n" +
                "She don't like the lights\n" +
                "She don't, she don't\n" +
                "She don't like the lights\n" +
                "\n" +
                "She's giving ultimatums, she don't like this life\n" +
                "She said if I loved her, I'd give it up won't think twice\n" +
                "I can't do that\n" +
                "And it's getting to the point where it's too much for her\n" +
                "Wanna throw it all away, 'cause it's too much for her\n" +
                "She don't wanna live this life, \n" +
                "\n" +
                "She don't like the lights\n" +
                "She don't, she don't \n" +
                "She don't like the lights\n" +
                "She don't, she don't\n" +
                "\n" +
                "Don't wanna share with no one else, want me to herself\n" +
                "Don't want no love in front of the camera\n" +
                "\n" +
                "She don't like the lights\n" +
                "She don't, she don't\n" +
                "She don't like the lights\n" +
                "\n" +
                "How can I choose between the two\n" +
                "When all the lights are all I know?\n" +
                "I wish she could see, how good this can be\n" +
                "I hope that she waits a little bit longer\n" +
                "'Cause I don't wanna live life, without her by my side\n" +
                "'Cause she gives the light that's in me\n" +
                "But she don't know\n" +
                "\n" +
                "She don't like the lights\n" +
                "She don't like the lights, the lights, the lights, the lights\n" +
                "She don't like the lights\n" +
                "She don't like the lights\n";
        intentactivity(view);
    }
    public void SN(View view)
    {
        Global.lyrics="\"Silent Night\"\n" +
                "\n" +
                "Silent night, holy night!\n" +
                "All is calm, all is bright\n" +
                "Round yon virgin, mother and child\n" +
                "Holy infant so tender and mild,\n" +
                "Sleep in heavenly peace,\n" +
                "Sleep in heavenly peace.\n" +
                "\n" +
                "Silent night, holy night!\n" +
                "Son of god, love's pure light\n" +
                "Radiant beams from thy holy face,\n" +
                "With the dawn of redeeming grace,\n" +
                "Jesus lord at thy birth;\n" +
                "Jesus lord at thy birth.";
        intentactivity(view);
    }
    public  void SSc(View view)
    {
        Global.lyrics="Mmm, mmm, yeah\n" +
                "Do, do, do, do, do, do, do-do, oh yeah\n" +
                "\n" +
                "Gotta change my answering machine\n" +
                "Now that I'm alone\n" +
                "'Cause right now it says that we can't come to the phone\n" +
                "And I know it makes no sense\n" +
                "\n" +
                "'Cause you walked out the door\n" +
                "But it's the only way I hear your voice anymore\n" +
                "It's ridiculous, it's been months\n" +
                "And for some reason I just can't get over us\n" +
                "\n" +
                "And I'm stronger than this\n" +
                "Enough is enough\n" +
                "No more walkin' round with my head down\n" +
                "I'm so over being blue cryin' over you\n" +
                "\n" +
                "And I'm so sick of love songs, so tired of tears\n" +
                "So done with wishing you were still here\n" +
                "Said I'm so sick of love songs so sad and slow\n" +
                "So why can't I turn off the radio?\n" +
                "\n" +
                "Gotta fix that calender I have\n" +
                "That's marked July 15th\n" +
                "Because since there's no more you\n" +
                "There's no more anniversary\n" +
                "\n" +
                "I'm so fed up with my thoughts of you\n" +
                "And your memory\n" +
                "And how every song reminds me\n" +
                "Of what used to be\n" +
                "\n" +
                "That's the reason I'm so sick of love songs, so tired of tears\n" +
                "So done with wishing you were still here\n" +
                "Said I'm so sick of love songs so sad and slow\n" +
                "So why can't I turn off the radio?\n" +
                "\n" +
                "Leave me alone\n" +
                "Leave me alone, stupid love songs\n" +
                "Don't make me think about her smile\n" +
                "I'm letting go, turning off the radio\n" +
                "\n" +
                "'Cause I'm so sick of love songs, so tired of tears\n" +
                "So done with wishing you was still here\n" +
                "Said I'm so sick of love songs so sad and slow\n" +
                "So why can't I turn off the radio?\n" +
                "Why can't I turn off the radio?\n" +
                "\n" +
                "Said I'm so sick of love songs, so tired of tears\n" +
                "So done with wishing you was still here\n" +
                "Said I'm so sick of love songs so sad and slow\n" +
                "So why can't I turn off the radio?\n" +
                "Why can't I turn off the radio?\n" +
                "\n" +
                "And I'm so sick of love songs, so tired of tears\n" +
                "So done with wishin' you were still here\n" +
                "Said I'm so sick of love songs so sad and slow\n" +
                "Why can't I turn off the radio?\n" +
                "Why can't I turn off the radio?\n" +
                "Why can't I turn off the radio?";
        intentactivity(view);
    }
    public void STL(View view)
    {
        Global.lyrics="\"Somebody To Love\"\n" +
                "\n" +
                "For you I'd write a symphony,\n" +
                "I'd tell the violin,\n" +
                "It's time to sink or swim,\n" +
                "Watch them play for ya,\n" +
                "For you I'd be, (whoa oh)\n" +
                "Running a thousand miles,\n" +
                "Just to get to where you are.\n" +
                "\n" +
                "Step to the beat of my heart,\n" +
                "I don't need a whole lot,\n" +
                "But for you I admit I,\n" +
                "I'd rather give you the world,\n" +
                "Or we can share mine,\n" +
                "I know I won't be the first one,\n" +
                "giving you all this attention,\n" +
                "Baby listen,\n" +
                "I just need somebody to love,\n" +
                "I don't need too much, just somebody to love,\n" +
                "Somebody to love.\n" +
                "I don't need nothing else,\n" +
                "I promise girl I swear,\n" +
                "I just need somebody to love.\n" +
                "I need somebody, I need somebody,\n" +
                "I need somebody, I need somebody\n" +
                "\n" +
                "Every day,\n" +
                "I bring the sun around,\n" +
                "I sweep away the clouds,\n" +
                "Smile for me.\n" +
                "I would take,\n" +
                "Every second, every single time,\n" +
                "Spend it like my last dime.\n" +
                "\n" +
                "Step to the beat of my heart,\n" +
                "I don't need a whole lot,\n" +
                "But for you I admit I,\n" +
                "I'd rather give you the world,\n" +
                "Or we can share mine,\n" +
                "I know I won't be the first one,\n" +
                "Givin' you all this attention,\n" +
                "Baby listen,\n" +
                "I just need somebody to love,\n" +
                "I don't need too much, just somebody to love,\n" +
                "Somebody to love.\n" +
                "I don't need nothing else,\n" +
                "I promise girl I swear,\n" +
                "I just need somebody to love.\n" +
                "I need somebody, I need somebody,\n" +
                "I need somebody, I need somebody\n" +
                "Somebody to love.\n" +
                "I need somebody, I need somebody,\n" +
                "I need somebody, I need somebody\n" +
                "I just need somebody to love.\n" +
                "\n" +
                "And you can have it all,\n" +
                "Anything you want,\n" +
                "I can bring; give you the finer things, yeah\n" +
                "But what I really want,\n" +
                "I can't find cause,\n" +
                "Money can't find me,\n" +
                "Somebody to love (oh, oh)\n" +
                "Find me somebody to love (whoah ohh)\n" +
                "\n" +
                "I need somebody to love,\n" +
                "I don't need too much, just somebody to love,\n" +
                "Somebody to love.\n" +
                "I don't need nothing else,\n" +
                "I promise girl I swear,\n" +
                "I just need somebody to love.\n" +
                "I need somebody, I need somebody,\n" +
                "I need somebody, I need somebody\n" +
                "Somebody to love.\n" +
                "I need somebody, I need somebody,\n" +
                "I need somebody, I need somebody\n" +
                "I just need somebody to love.\n" +
                "\n" +
                "I need somebody, I need somebody,\n" +
                "I need somebody, I need somebody\n" +
                "I need somebody to love.\n" +
                "To love, to love.\n" +
                "Is she out there? [x3]\n" +
                "I just need somebody to love.";
        intentactivity(view);
    }
    public void STLr(View view)
    {
        Global.lyrics="\" Somebody to love remix - single version lyrics\"\n" +
                "Ohh Ohhhhh\n" +
                "For you i'd write a symphony\n" +
                "I'd tell the violins, it's time to sink or swim\n" +
                "Watch 'em play for ya\n" +
                "For you i'd be wooaaah\n" +
                "Running a thousand miles, just get you where you are\n" +
                "Step to the beat of my heart, I don't\n" +
                "Need a whole lot coming from you, I admit i'd\n" +
                "Rather give the world or we could share mine\n" +
                "And I no I won't be the first one giving you all this attention, Baby listen\n" +
                "I just need somebody to love\n" +
                "I-I I don't need to much just somebody to love\n" +
                "Somebody to love\n" +
                "I don't need nothing else, i promise girl i swear\n" +
                "I just need somebody to love\n" +
                "(I need somebody I-I I need somebody x2)\n" +
                "Everyday, I bring the sun around\n" +
                "I sweep away the clouds\n" +
                "Smile for me (Smile for me)\n" +
                "I would take, every second every single time\n" +
                "Spend it like my last dime\n" +
                "Step to the beat of my heart, I don't\n" +
                "Need a whole lot coming from you i admit i'd\n" +
                "Rather give you the world or we could share mine\n" +
                "[Lyrics from: https:/lyrics.az/justin-bieber/-/somebody-to-love-remix-single-version.html]\n" +
                "I know i won't be the first one giving you all this attention\n" +
                "Baby Listen\n" +
                "I just need somebody to love!\n" +
                "I-I I don't need to much just somebody to love\n" +
                "Somebody to love!\n" +
                "I don't need nothing else, I promise girl i swear\n" +
                "I just need somebody to love\n" +
                "(I need somebody I-I I need somebody x2)\n" +
                "(Somebody to love!)\n" +
                "And you can have it all\n" +
                "Anything you want\n" +
                "I can bring, Give you the finer things yeah\n" +
                "But what i really want\n" +
                "I can't find cuz money can't find me\n" +
                "Somebody to love\n" +
                "Find me somebody to love! Woooaah\n" +
                "I need somebody to love\n" +
                "I-I I don't need to much just somebody to love\n" +
                "Somebody to love!\n" +
                "I don't need nothing else i promise girl i swear\n" +
                "I just need somebody to love\n" +
                "(I need somebody I-I need somebody x4)\n" +
                "Is she out there? x4\n" +
                "I just need somebody to love";
        intentactivity(view);
    }
    public  void SAC(View view)
    {
        Global.lyrics="\"Someday At Christmas\"\n" +
                "\n" +
                "Someday at Christmas men won't be boys\n" +
                "Playing with bombs like kids play with toys\n" +
                "One warm December our hearts will see\n" +
                "A world where men are free\n" +
                "\n" +
                "Someday at Christmas there'll be no wars\n" +
                "When we have learned what Christmas is for\n" +
                "When we have found what life's really worth\n" +
                "There'll be peace on earth\n" +
                "\n" +
                "Someday all our dreams will come to be\n" +
                "Someday in a world where men are free\n" +
                "Maybe not in time for you and me\n" +
                "But someday at Christmas time\n" +
                "\n" +
                "Someday at Christmas we'll see a Man\n" +
                "No hungry children and no empty hand\n" +
                "One happy morning people will share\n" +
                "Our world where people care\n" +
                "\n" +
                "Someday at Christmas there'll be no tears\n" +
                "All men are equal and no men have fears\n" +
                "One shining moment my heart ran away\n" +
                "From our world today\n" +
                "\n" +
                "Someday all our dreams will come to be\n" +
                "Someday in a world where men are free\n" +
                "Maybe not in time for you and me\n" +
                "But someday at Christmas time\n" +
                "\n" +
                "Someday at Christmas man will not fail\n" +
                "Take hope because your love will prevail\n" +
                "Someday a new world that we can start\n" +
                "With hope in every heart\n" +
                "\n" +
                "Someday all our dreams will come to be\n" +
                "Someday in a world where men are free\n" +
                "Maybe not in time for you and me\n" +
                "But someday at Christmas time\n" +
                "Someday at Christmas time";
        intentactivity(view);
    }
    public void S(View view)
    {
        Global.lyrics="\"Sorry\"\n" +
                "\n" +
                "You gotta go and get angry at all of my honesty\n" +
                "You know I try but I don't do too well with apologies\n" +
                "I hope I don't run out of time. Could someone call a referee?\n" +
                "'Cause I just need one more shot at forgiveness\n" +
                "\n" +
                "I know you know that I made those mistakes maybe once or twice\n" +
                "And by once or twice I mean maybe a couple of hundred times\n" +
                "So let me, oh, let me redeem, oh, redeem, oh, myself tonight\n" +
                "'Cause I just need one more shot, second chances\n" +
                "\n" +
                "Yeah\n" +
                "Is it too late now to say sorry?\n" +
                "'Cause I'm missing more than just your body, oh\n" +
                "Is it too late now to say sorry?\n" +
                "Yeah, I know-oh-oh, that I let you down\n" +
                "Is it too late to say I'm sorry now?\n" +
                "\n" +
                "I'm sorry yeah\n" +
                "Sorry yeah\n" +
                "Sorry\n" +
                "Yeah, I know that I let you down\n" +
                "Is it too late to say I'm sorry now?\n" +
                "\n" +
                "I'll take every single piece of the blame if you want me to\n" +
                "But you know that there is no innocent one in this game for two\n" +
                "I'll go, I'll go and then you go, you go out and spill the truth\n" +
                "Can we both say the words and forget this?\n" +
                "\n" +
                "Yeah\n" +
                "Is it too late now to say sorry?\n" +
                "'Cause I'm missing more than just your body, oh\n" +
                "Is it too late now to say sorry?\n" +
                "Yeah, I know-oh-oh, that I let you down\n" +
                "Is it too late to say I'm sorry now?\n" +
                "\n" +
                "I'm not just trying to get you back on me (oh, no, no)\n" +
                "'Cause I'm missing more than just your body (your body), oh\n" +
                "Is it too late now to say sorry?\n" +
                "Yeah, I know-oh-oh, that I let you down\n" +
                "Is it too late to say I'm sorry now?\n" +
                "\n" +
                "[2x]\n" +
                "I'm sorry yeah\n" +
                "Sorry, oh\n" +
                "Sorry\n" +
                "Yeah, I know-oh-oh, that I let you down (let you down)\n" +
                "Is it too late to say I'm sorry now?";
        intentactivity(view);
    }
    public void SIT(View view)
    {
        Global.lyrics="\"Speaking In Tongues\"\n" +
                "\n" +
                "Alrite..aha...yeah\n" +
                "Speaking in tongues\n" +
                "yabba dabba dabba da da\n" +
                "daVoala..I'm killin this … caca\n" +
                "Call up Lady Gaga..on my..on my\n" +
                "telephone\n" +
                "Hella dome..yeah..my girl\n" +
                "beats..no metronome\n" +
                "My new chick..she a yellowbone\n" +
                "I buy her yellow stones..cause I\n" +
                "like it when she got that yellow\n" +
                "on\n" +
                "So I'm a raptor..tearin it up like a\n" +
                "tractor\n" +
                "Matter fact..I’m killin this\n" +
                "track..you’re a slacker\n" +
                "Sack like a sacker..hello Mr. Brady\n" +
                "Tell em leave his hair to the guy\n" +
                "who sings “Baby”\n" +
                "Baby..come and try to save me\n" +
                "Lately..Ive been hearing these\n" +
                "things that sound crazy\n" +
                "Like..Speaking in tongues\n" +
                "All right..alrite stop..drop and\n" +
                "roll..Justin Bieber is on fire\n" +
                "Its time to realize its time to call\n" +
                "me Young Sire\n" +
                "You’re the seller..I'm the buyer\n" +
                "You’re the teller..and I'm hired\n" +
                "I'm higher than the highest point\n" +
                "Yes..I am flyer\n" +
                "And I'm wired to the game..stay\n" +
                "dry when it rains\n" +
                "I'm tired of the fame..are you\n" +
                "proud of the pain\n" +
                "Yes..were the same..yes..I'm\n" +
                "insane\n" +
                "And my mane hangs down..I'm a\n" +
                "puppet..got strings\n" +
                "I murdered that..mayne..\n" +
                "Shawty Mane..Shawty Mane..what\n" +
                "you doin..Shawty Mane?\n" +
                "I'm Justin Bieber\n" +
                "You guys might know me as the\n" +
                "guy you know who sings “Baby”\n" +
                "You know..uh..I'm a singer..pop\n" +
                "singer\n" +
                "I'm white\n" +
                "But..um..you know..thats why I do\n" +
                "this\n" +
                "Just to prove that..you know\n" +
                "I got skills..on..on..on the rap\n" +
                "game\n" +
                "So..yeah\n" +
                "What up JulKeyz? Yo..I killed that\n" +
                "All right..peace.\n";
        intentactivity(view);
    }
    public void SG(View view)
    {
        Global.lyrics="\"Strong\"\n" +
                "(feat. Selena Gomez)\n" +
                "\n" +
                "[Selena Gomez:]\n" +
                "There's no sophistication in my lack of patience\n" +
                "I'm just wishing you were better at communication\n" +
                "As I sit here steady waiting\n" +
                "Wishing that you would call my name in\n" +
                "\n" +
                "[(Selena Gomez) Justin Bieber:]\n" +
                "(Wishing I was better with the distance)\n" +
                "It's cause you're the only one I'm really missing\n" +
                "Nobody else would be forgiving\n" +
                "Cause of all the love that you give me\n" +
                "All of the love that you give me\n" +
                "All of the love that you give me, give me\n" +
                "(Wishing I was better at this damn thing\n" +
                "Cause it's just been too long and I can't change)\n" +
                "Wishing I was better at this damn thing\n" +
                "Cause it's just been too long and I can't change\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Gotta be strong, strong, strong\n" +
                "Gotta be strong, strong, strong\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "What should I do? Should I go?\n" +
                "Who do I talk to? Nobody knows\n" +
                "Who knows the answer to all of my questions?\n" +
                "When will I get over this, over this?\n" +
                "\n" +
                "[(Selena Gomez) Justin Bieber:]\n" +
                "(Wishing I was better with the distance)\n" +
                "It's cause you're the only one I'm really missing\n" +
                "Nobody else would be forgiving\n" +
                "Cause of all that love that you give me\n" +
                "All of the love that you give me\n" +
                "All of the love that you give me, give me\n" +
                "(Wishing I was better at this damn thing\n" +
                "Cause it's just been too long and I can't change)\n" +
                "Wishing I was better at this damn thing\n" +
                "Cause it's just been too long and I can't change\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Gotta be strong, strong, strong\n" +
                "Gotta be strong, strong, strong\n";
        intentactivity(view);
    }
    public void SITM(View view)
    {
        Global.lyrics="\"Stuck In The Moment\"\n" +
                "\n" +
                "(With you, with you\n" +
                "I wish we had another time,\n" +
                "I wish we had another place.)\n" +
                "\n" +
                "Now Romeo and Juliet,\n" +
                "Bet they never felt the way we felt.\n" +
                "Bonnie and Clyde,\n" +
                "Never had to hide like we do, we do.\n" +
                "You and I both know it can't work,\n" +
                "It's all fun and games,\n" +
                "'Til someone gets hurt,\n" +
                "And I don't, I won't let that be you\n" +
                "\n" +
                "Now you don't wanna let go,\n" +
                "And I don't wanna let you know\n" +
                "That there might be something real between us two, who knew?\n" +
                "Now we don't wanna fall but,\n" +
                "We're tripping in our hearts and,\n" +
                "It's reckless and clumsy,\n" +
                "Cause I know you can't love me, hey\n" +
                "\n" +
                "I wish we had another time,\n" +
                "I wish we had another place,\n" +
                "But everything we have is stuck in the moment,\n" +
                "And there's nothing my heart can do\n" +
                "To fight with time and space,\n" +
                "'Cause I'm still stuck in the moment with you\n" +
                "\n" +
                "See like Adam and Eve,\n" +
                "Tragedy was our destiny,\n" +
                "Like Sonny and Cher,\n" +
                "I don't care, I've got you baby.\n" +
                "See we both fighting every inch of our fiber,\n" +
                "Cause ain't no way it's gonna end right but,\n" +
                "We are both too foolish to stop.\n" +
                "\n" +
                "Now you don't wanna let go,\n" +
                "And I don't wanna let you know\n" +
                "That there might be something real between us two, who knew?\n" +
                "Now we don't wanna fall but,\n" +
                "We're tripping in our hearts and,\n" +
                "It's reckless and clumsy,\n" +
                "And I know you can't love me, hey\n" +
                "\n" +
                "I wish we had another time,\n" +
                "I wish we had another place,\n" +
                "But everything we have is stuck in the moment,\n" +
                "And there's nothing my heart can do,\n" +
                "To fight with time and space,\n" +
                "Cause I'm still stuck in the moment with you\n" +
                "\n" +
                "See like just because this cold, cruel world\n" +
                "Saying we can't be,\n" +
                "Baby, we both have the right to disagree,\n" +
                "And I ain't with it.\n" +
                "And I don't wanna be so old and gray,\n" +
                "Reminiscing about these better days,\n" +
                "But convention's telling us to let go\n" +
                "So we'll never know\n" +
                "\n" +
                "I wish we had another time,\n" +
                "I wish we had another place,\n" +
                "Cause everything we did,\n" +
                "And everything we have is stuck in the moment\n" +
                "(Yeah oh no no no)\n" +
                "\n" +
                "I wish we had another time,\n" +
                "I wish we had another place,\n" +
                "But everything we have is stuck in the moment,\n" +
                "And there's nothing my heart can do (nothing my heart can do)\n" +
                "To fight with time and space (and space).\n" +
                "I'm still stuck in the moment with you";
        intentactivity(view);
    }
    public  void SM(View view)
    {
        Global.lyrics="\n" +
                "\" Swag's Mean lyrics\"\n" +
                "(S-swag's so mean\n" +
                "S-s-swag's so mean\n" +
                "\n" +
                "Swag's mean, Ah-Swag's mean\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her, cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-swag's mean\n" +
                "\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-Swag's mean\n" +
                "\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-Swag's mean\n" +
                "\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "[Lyrics from: https:/lyrics.az/justin-bieber/-/swags-mean.html]\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-Swag's mean\n" +
                "\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-Swag's mean\n" +
                "\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-Swag's mean\n" +
                "\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-Swag's mean\n" +
                "\n" +
                "Yeah, she want me cause my\n" +
                "(Swag's so mean)\n" +
                "I know I want her cause her\n" +
                "(Swag's so mean)\n" +
                "You know you got it when your\n" +
                "(Swag's so mean)\n" +
                "Swag's mean, Ah-Swag's mean";
        intentactivity(view);
    }
    public void SIO(View view)
    {
        Global.lyrics="\"Swap It Out\"\n" +
                "\n" +
                "Open up to me, it's all you gotta do\n" +
                "Give me all your heart, swap mine out with you\n" +
                "Swap it out with you\n" +
                "Swap it out with you\n" +
                "Come into my world\n" +
                "I'll give my world to you\n" +
                "We can swap swap swap it out\n" +
                "\n" +
                "I can show you what I'm talking about\n" +
                "Be obliged just to show you how\n" +
                "Follow my lead, that's what you oughta do\n" +
                "No pressure\n" +
                "Swapping out ain't ever been a crime\n" +
                "If it was then I'd do the time\n" +
                "Throw away the keys as long as I'm here with you\n" +
                "Forever\n" +
                "\n" +
                "Eye for an eye\n" +
                "Remember when I told you\n" +
                "Wipe your pretty eyes, dry 'em on my shoulder\n" +
                "You ain't gotta try, try to get closer\n" +
                "\n" +
                "Fifty-fifty deal, let's make a deposit\n" +
                "Simulate the love\n" +
                "Try it 'fore you knock it\n" +
                "You ain't gotta rush\n" +
                "But you ain't gotta stop it\n" +
                "\n" +
                "Open up to me, it's all you gotta do\n" +
                "Give me all your heart, I'll swap mine out with you\n" +
                "Swap it out with you\n" +
                "Swap it out with you\n" +
                "You come into my world\n" +
                "I gave my world to you\n" +
                "We can swap swap swap it out\n" +
                "\n" +
                "Oh swappin' out will only change your life\n" +
                "But it's worth it the sacrifice\n" +
                "After all what do we have to lose\n" +
                "Nothing\n" +
                "\n" +
                "Don't separate our destiny\n" +
                "By separating you from me\n" +
                "These are the terms\n" +
                "That we're made for each other\n" +
                "\n" +
                "Eye for an eye\n" +
                "Remember what I told you\n" +
                "Wipe your pretty eyes, dry 'em on my shoulder\n" +
                "You ain't gotta try, try to get closer\n" +
                "\n" +
                "Fifty-fifty deal, let's make a deposit\n" +
                "Simulate the love\n" +
                "Try it 'fore you knock it\n" +
                "You ain't gotta rush\n" +
                "But you ain't gotta stop it\n" +
                "\n" +
                "Open up to me, it's all you gotta do\n" +
                "Give me all your heart, I'll swap mine out with you\n" +
                "Swap it out with you\n" +
                "Swap it out with you\n" +
                "You come into my world\n" +
                "I gave my world to you\n" +
                "We can swap swap swap it out\n" +
                "\n" +
                "Don't be afraid darling\n" +
                "I got your back baby\n" +
                "Oh you don't gotta worry, no\n" +
                "You gotta know that baby\n" +
                "\n" +
                "Open up to me\n" +
                "Open up to me, it's all you gotta do\n" +
                "Give me all your heart, I'll swap mine out with you\n" +
                "Swap it out with you\n" +
                "Swap it out with you\n" +
                "You come into my world\n" +
                "I gave my world to you\n" +
                "We can swap swap swap it out\n" +
                "\n" +
                "We can swap out our love, oh\n" +
                "Over and over and over again\n" +
                "Oh you ain't gotta be afraid\n" +
                "Oh your love is in my hands\n" +
                "My hands, your love is in my hands\n" +
                "Oh your love is in my hands\n" +
                "\n";
        intentactivity(view);
    }
    public void TY(View view)
    {
        Global.lyrics="\"Take You\"\n" +
                "\n" +
                "Hey, what's the situation, whoa?\n" +
                "I'm just tryna make a little conversation,\n" +
                "Why the hesitation, whoa?\n" +
                "Tell me what your name is? For your information,\n" +
                "\n" +
                "Don't get me wrong\n" +
                "You know you're right,\n" +
                "Don't be so cold,\n" +
                "We could be fire\n" +
                "Tomorrow we go,\n" +
                "Let's start tonight\n" +
                "You know what it's all about\n" +
                "\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "\n" +
                "I might have a reputation, oh oh,\n" +
                "But there's only me and you in this equation\n" +
                "Promise this occasion, oh oh,\n" +
                "It's a different situation\n" +
                "For your information,\n" +
                "\n" +
                "Don't get me wrong\n" +
                "You know it's right,\n" +
                "Don't be so cold,\n" +
                "We could be fire\n" +
                "Tomorrow we go,\n" +
                "Let's start tonight (tonight)\n" +
                "You know what it's all about\n" +
                "\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "\n" +
                "I can take you out, I can take you home\n" +
                "I can take you out, I can take you home\n" +
                "\n" +
                "Baby, señorita, ma chérie, please be my little lady, my little lady\n" +
                "Mi amor, you're the one I adore, come on be my little lady, my little lady\n" +
                "Baby, señorita, ma chérie, please be my little lady, my little lady\n" +
                "Mi amor, you're the one I adore, come on be my little lady, my little lady\n" +
                "\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "\n" +
                "Hey, what's the situation?\n" +
                "(woah-woah-woah-woah-woah)\n" +
                "\n" +
                "Hey, what's the situation?\n" +
                "(woah-woah-woah-woah-woah)";
        intentactivity(view);
    }
    public void TYa(View view)
    {
        Global.lyrics="\"Take You (Acoustic Version)\"\n" +
                "\n" +
                "Hey, what's the situation, whoa?\n" +
                "I'm just tryna make a little conversation,\n" +
                "Why the hesitation, whoa?\n" +
                "Tell me what your name is? \n" +
                "For your information,\n" +
                "\n" +
                "Don't get me wrong\n" +
                "You know you're right,\n" +
                "Don't be so cold,\n" +
                "We could be fire\n" +
                "Tomorrow we'll go,\n" +
                "Let's start tonight\n" +
                "You know what it's all about\n" +
                "\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "\n" +
                "I might have a reputation, oh oh,\n" +
                "It's only me and you in this equation\n" +
                "Promise this occasion, oh oh,\n" +
                "So different situation\n" +
                "For your information,\n" +
                "\n" +
                "Don't get me wrong\n" +
                "You know you're right,\n" +
                "Don't be so cold,\n" +
                "We could be fire\n" +
                "Tomorrow we'll go,\n" +
                "Let's start tonight\n" +
                "You know what it's all about\n" +
                "\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home\n" +
                "\n" +
                "Baby, señorita, ma chérie, please be my little lady, my little lady\n" +
                "Mi amor, you're the one I adore, come on be my little lady, my little lady\n" +
                "Baby, señorita, ma chérie, please be my little lady, my little lady\n" +
                "Mi amor, you're the one I adore, come on be my little lady, my little lady\n" +
                "\n" +
                "I can take you out, I can take you home\n" +
                "I can take you oh-oh-oh where you wanna go\n" +
                "I can pick it up, we could take it slow\n" +
                "I can take you home oh-oh-oh\n" +
                "I can take you home";
        intentactivity(view);
    }
    public void TSBM(View view)
    {
        Global.lyrics="\"That Should Be Me\"\n" +
                "\n" +
                "Everybody's laughing in my mind\n" +
                "Rumors spreading 'bout this other guy\n" +
                "Do you do what you did when you did with me?\n" +
                "Does he love you the way I can?\n" +
                "Did you forget all the plans that you made with me?\n" +
                "'Cause baby I didn't\n" +
                "\n" +
                "That should be me\n" +
                "Holdin' your hand\n" +
                "That should be me\n" +
                "Makin' you laugh\n" +
                "That should be me\n" +
                "This is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Feelin' your kiss\n" +
                "That should be me\n" +
                "Buyin' you gifts\n" +
                "This is so wrong\n" +
                "I can't go on\n" +
                "'Til you believe that\n" +
                "That should be me\n" +
                "\n" +
                "That should be me\n" +
                "\n" +
                "You said you needed a little time\n" +
                "For my mistakes\n" +
                "It's funny how you use that time\n" +
                "To have me replaced\n" +
                "\n" +
                "Did you think that I wouldn't see you out at the movies?\n" +
                "What you doin' to me?\n" +
                "You're takin' him where we used to go\n" +
                "Now if you're tryna break my heart\n" +
                "It's working 'cause you know that\n" +
                "\n" +
                "That should be me\n" +
                "Holdin' your hand\n" +
                "That should be me\n" +
                "Makin' you laugh\n" +
                "That should be me\n" +
                "This is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Feelin' your kiss\n" +
                "That should be me\n" +
                "Buyin' you gifts\n" +
                "This is so wrong\n" +
                "I can't go on\n" +
                "'Til you believe that\n" +
                "That should be me\n" +
                "\n" +
                "I need to know, should I fight for love or disarm?\n" +
                "It's getting harder to shield this pain in my heart\n" +
                "\n" +
                "That should be me\n" +
                "Holdin' your hand\n" +
                "That should be me\n" +
                "Makin' you laugh\n" +
                "That should be me\n" +
                "This is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Feelin' your kiss\n" +
                "That should be me\n" +
                "Buyin' you gifts\n" +
                "This is so wrong\n" +
                "I can't go on\n" +
                "'Til you believe that\n" +
                "That should be me\n" +
                "\n" +
                "Holding your hand\n" +
                "That should be me\n" +
                "The one making you laugh, oh baby oh\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Giving you flowers\n" +
                "That should be me\n" +
                "Talking for hours\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me\n" +
                "\n" +
                "Never should've let you go\n" +
                "I never should've let you go\n" +
                "That should be me\n" +
                "Never should've let you go\n" +
                "That should be me\n" +
                "Never should've let you go\n" +
                "I never should've let you go\n" +
                "That should be me\n";
        intentactivity(view);
    }
    public void TSBMa(View view)
    {
        Global.lyrics="\"That Should Be Me (Acoustic)\"\n" +
                "\n" +
                "Everybody's laughing in my mind\n" +
                "Rumors spreading 'bout this other guy\n" +
                "Do you do what you did when you\n" +
                "Did with me?\n" +
                "Does he love you the way I can?\n" +
                "Did you forget all the plans\n" +
                "That you made with me?\n" +
                "'cause baby I didn't\n" +
                "\n" +
                "That should be me\n" +
                "Holdin' your hand\n" +
                "That should be me\n" +
                "Makin' you laugh\n" +
                "That should be me\n" +
                "This is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Feelin' your kiss\n" +
                "That should be me\n" +
                "Buyin' you gifts\n" +
                "This is so wrong,\n" +
                "I can't go on,\n" +
                "Till you believe that\n" +
                "That should be me\n" +
                "\n" +
                "That should be me\n" +
                "\n" +
                "You said you needed a little time\n" +
                "For my mistakes\n" +
                "It's funny how you use that time\n" +
                "To have me replaced\n" +
                "But did you think that I wouldn't see you out at the movies\n" +
                "What you doin' to me\n" +
                "You're takin' him where we used to go\n" +
                "Now if you're tryin' to break my heart\n" +
                "It's working 'cause you know that\n" +
                "\n" +
                "[Chorus:]\n" +
                "That should be me\n" +
                "Holdin' your hand\n" +
                "That should be me\n" +
                "Makin' you laugh\n" +
                "That should be me\n" +
                "This is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Feelin' your kiss\n" +
                "That should be me\n" +
                "Buyin' you gifts\n" +
                "This is so wrong,\n" +
                "I can't go on,\n" +
                "Till you believe that\n" +
                "That should be me\n" +
                "\n" +
                "I need to know, should I fight for love or disarm\n" +
                "It's getting harder to shield\n" +
                "This pain in my heart\n" +
                "\n" +
                "[Chorus:]\n" +
                "That should be me\n" +
                "Holdin' your hand\n" +
                "That should be me\n" +
                "Makin' you laugh\n" +
                "That should be me\n" +
                "This is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Feelin' your kiss\n" +
                "That should be me\n" +
                "Buyin' you gifts\n" +
                "This is so wrong,\n" +
                "I can't go on,\n" +
                "Till you believe that\n" +
                "That should be me\n" +
                "Holding your hand\n" +
                "That should be me\n" +
                "The one making you laugh, oh baby\n" +
                "That should be me\n" +
                "That should be me giving you flowers\n" +
                "That should be me\n" +
                "Talking for hours\n" +
                "That should be me,\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Never gonna let you go\n" +
                "I'm never gonna let you go\n" +
                "That should be me\n" +
                "I'm never gonna let you go whoa oh oh\n" +
                "That should be me\n" +
                "Never gonna let you go, hey, yeah\n" +
                "I'm never gonna let you go\n" +
                "That should be me\n" +
                "I never let you go\n" +
                "Oh oh oh oh";
        intentactivity(view);
    }
    public void TSBMr(View view)
    {
        Global.lyrics="\"That Should Be Me (Remix)\"\n" +
                "(feat. Rascal Flatts)\n" +
                "\n" +
                "Everybody's laughing in my mind\n" +
                "Rumors spreading about this other guy\n" +
                "Do you do what you did what you did with me?\n" +
                "Does he love you the way I can?\n" +
                "Did you forget all the plans that you made with me?\n" +
                "Cause baby I didn't\n" +
                "\n" +
                "That should be me holding your hand\n" +
                "That should be me making you laugh\n" +
                "That should be me this is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me feeling your kiss\n" +
                "That should be me buying you gifts\n" +
                "This is so wrong\n" +
                "I can't go on\n" +
                "'Till you believe\n" +
                "That that should be me\n" +
                "That should be me\n" +
                "No.\n" +
                "\n" +
                "You said you needed a little time from my mistakes\n" +
                "It's funny how you used that time to have me replaced\n" +
                "Did you think that I wouldn't see you out at the movies?\n" +
                "What you doin' to me\n" +
                "You're taking him where we used to go\n" +
                "Now if you're trying to break my heart\n" +
                "It's working cause you know\n" +
                "\n" +
                "That should be me holding your hand\n" +
                "That should be me making you laugh\n" +
                "That should be me this is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me feeling your kiss\n" +
                "That should be me buying you gifts\n" +
                "This is so wrong I can't go on\n" +
                "'Till you believe\n" +
                "That should be me\n" +
                "\n" +
                "I need to know should I fight for love\n" +
                "Or disarm\n" +
                "It's getting harder to shield\n" +
                "This pain is my heart\n" +
                "Ooh Ooh\n" +
                "\n" +
                "That should be me holding your hand\n" +
                "That should be me making you laugh\n" +
                "That should be me this is so sad\n" +
                "That should be me\n" +
                "That should be me\n" +
                "That should be me feeling your kiss\n" +
                "That should be me buying you gifts\n" +
                "This is so wrong\n" +
                "I can't go on\n" +
                "'Till you believe\n" +
                "That that should be me\n" +
                "\n" +
                "Holding your hand\n" +
                "That should be me\n" +
                "The one making you laugh (oh baby oh)\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Giving you flowers\n" +
                "That should be me\n" +
                "Talking for hours\n" +
                "That should be me (that should be me)\n" +
                "That should be me\n" +
                "That should be me\n" +
                "Never should've let you go\n" +
                "I never should've let you go\n" +
                "That should be me\n" +
                "I never shoulda let you go\n" +
                "That should be me\n" ;
        intentactivity(view);
    }
    public void TCS(View view)
    {
        Global.lyrics="\"The Christmas Song (Chestnuts Roasting On An Open Fire)\"\n" +
                "(feat. Usher)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Chestnuts roasting on an open fire\n" +
                "Jack Frost nipping at your nose (Yeah)\n" +
                "Yuletide carols being sung by a choir\n" +
                "And folks dressed up like Eskimos\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Everybody knows a turkey and some mistletoe\n" +
                "Help to make the season bright\n" +
                "Tiny tots with their eyes all aglow\n" +
                "Will find it hard to sleep tonight\n" +
                "\n" +
                "[Usher:]\n" +
                "They know that Santa's on his way\n" +
                "He's loaded lots of toys and many goodies on his sleigh\n" +
                "[Both:]\n" +
                "And every mother's child is gonna spy\n" +
                "To see if reindeer really know how to fly\n" +
                "\n" +
                "[Both:]\n" +
                "And so, I'm offering this simple phrase\n" +
                "To kids from one to ninety-two\n" +
                "Although it's been said many times, many ways\n" +
                "Merry Christmas to you\n" +
                "\n" +
                "[Both:]\n" +
                "(Yeah) And so, I'm offering this simple phrase (oh wooah)\n" +
                "To kids from one to ninety-two (Yeah, yeah)\n" +
                "Although it's been said, many times, many ways\n" +
                "Merry Christmas, Merry Christmas (Yeah), Merry Christmas (Oh No)\n" +
                "Merry Christmas to you!\n";
        intentactivity(view);
    }
    public void TF(View view)
    {
        Global.lyrics="\"The Feeling\"\n" +
                "(feat. Halsey)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "You are to me\n" +
                "A part of me just like anatomy\n" +
                "You're pulling me\n" +
                "You're pulling me in like you're gravity\n" +
                "\n" +
                "I'm notorious for thinking you're full of beautiful\n" +
                "Instead of hollow\n" +
                "Sugar on your lips, it's hard to kill\n" +
                "Jagged like a pill, so hard to swallow\n" +
                "\n" +
                "[Justin Bieber & Halsey:]\n" +
                "Am I in love with you?\n" +
                "(am I in love with you?)\n" +
                "Or am I in love with the feeling?\n" +
                "Trying to find the truth,\n" +
                "(trying to find the truth)\n" +
                "Sometimes the heart is deceiving\n" +
                "Can't get out of my head, and I need you to save me\n" +
                "If I am delusional then maybe I'm crazy\n" +
                "In love with you. Am I in love with you?\n" +
                "Or am I in love with the feeling?\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "You give to me\n" +
                "Everything, anything that I could dream\n" +
                "At least that's what it seems\n" +
                "Could it be I don't know what's good for me?\n" +
                "\n" +
                "I'm notorious for thinking you're full of beautiful\n" +
                "Instead of hollow\n" +
                "Sugar on your lips, it's hard to kill\n" +
                "Jagged like a pill, so hard to swallow\n" +
                "\n" +
                "[Justin Bieber & Halsey:]\n" +
                "Am I in love with you?\n" +
                "(am I in love with you?)\n" +
                "Or am I in love with the feeling?\n" +
                "Trying to find the truth,\n" +
                "(trying to find the truth)\n" +
                "Sometimes the heart is deceiving\n" +
                "Can't get out of my head, and I need you to save me\n" +
                "If I am delusional then maybe I'm crazy\n" +
                "In love with you. Am I in love with you?\n" +
                "Or am I in love with the feeling?\n" +
                "\n" +
                "[Justin Bieber & Halsey:]\n" +
                "I'm sinking faster and faster\n" +
                "Between heaven and disaster\n" +
                "Sorry if I made you feel like\n" +
                "I'm standing on the borderline\n" +
                "\n" +
                "[Justin Bieber & Halsey:]\n" +
                "Am I in love with you?\n" +
                "(am I in love with you?)\n" +
                "Or am I in love with the feeling?\n" +
                "Trying to find the truth,\n" +
                "(trying to find the truth)\n" +
                "Sometimes the heart is deceiving\n" +
                "Can't get out of my head, and I need you to save me\n" +
                "If I am delusional then maybe I'm crazy\n" +
                "In love with you.\n" +
                "Or am I in love with the feeling?\n" +
                "\n";
        intentactivity(view);
    }
    public void TI(View view)
    {
        Global.lyrics="\"The Intro\"\n" +
                "\n" +
                "What up guys, this is Justin Bieber.\n" +
                "And this is the best DJ in the whole world.\n" +
                "His name is DJ Tay James. He's kinda cool.\n" +
                "And you're now tuning in to WeKnowTheDJ radio.\n" +
                "\n" +
                "Black rims.\n" +
                "Black body.\n" +
                "Bad girls.\n" +
                "You should act naughty.\n" +
                "Oh that's your girl, I met in lobby\n" +
                "If you're in my section\n" +
                "Baby girl, you here to party.\n" +
                "\n" +
                "VIP\n" +
                "You know it, boy.\n" +
                "Make a milli at the show, just to throw it, boy.\n" +
                "Said this goes out, to all the haters.\n" +
                "I'm a young Tunechi, kicking it with pro skaters.\n" +
                "\n" +
                "Oh my goodness. (Why you wearing two rollies?)\n" +
                "I got time\n" +
                "and I got money\n" +
                "and I got girls\n" +
                "Like it's not funny.\n" +
                "\n" +
                "Honey (Honey)\n" +
                "What you from me?\n" +
                "C'mon bunny.\n" +
                "My, My bunny.\n" +
                "My playboy bunny.\n" +
                "I open the door, walk in the store.\n" +
                "She sees it's me, she says 'Hello.'\n" +
                "I said 'What's good?', she said 'Let's go'\n" +
                "So I took her home, TKO.\n" +
                "\n" +
                "Black rims\n" +
                "Black body.\n" +
                "Bad girls.\n" +
                "You should act naughty.\n" +
                "Oh that's your girl, on my Ducati\n" +
                "If you're in my section\n" +
                "Baby girl, you here to party\n" +
                "\n" +
                "Never did I think that I would get here.\n" +
                "Now you know I'm flying on the jet here.\n" +
                "I'm a super man, but don't forget, dear.\n" +
                "So I had to tell e'erybody you the best here\n" +
                "(Uh huh!)\n" +
                "\n" +
                "Black rims.\n" +
                "Black body.\n" +
                "Bad girls.\n" +
                "You should act naughty.\n" +
                "Oh that's your girl, I met in lobby\n" +
                "If you're in my section\n" +
                "Baby girl, you here to party.\n";
        intentactivity(view);
    }
    public void TM(View view)
    {
        Global.lyrics="\"The Most\"\n" +
                "\n" +
                "Where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "Need you the most\n" +
                "When you broke down, I didn't leave you\n" +
                "I stayed by your side\n" +
                "So where are you now that I need you?\n" +
                "Need you the most\n" +
                "\n" +
                "I gave you attention when nobody else was paying\n" +
                "I gave you the shirt off my back, what you saying?\n" +
                "To keep you warm\n" +
                "I showed you the game everybody else was playing\n" +
                "That's for sure\n" +
                "And I was on my knees when nobody else was praying\n" +
                "Oh lord\n" +
                "\n" +
                "Where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "Need you the most\n" +
                "When you broke down, I didn't leave you\n" +
                "I stayed by your side\n" +
                "So where are you now that I need you?\n" +
                "Need you the most\n" +
                "\n" +
                "I gave you my heart when you said yours was broken\n" +
                "Yes I did\n" +
                "I gave you the key when the door wasn't open\n" +
                "Just admit it\n" +
                "See I gave you faith, turned your doubt into hoping\n" +
                "Can't deny it\n" +
                "Now I'm all alone and my joys turn to moping\n" +
                "Tell me...\n" +
                "\n" +
                "Where are you now that I need you?\n" +
                "Where are you now?\n" +
                "Where are you now that I need you?\n" +
                "Couldn't find you anywhere\n" +
                "When you broke down, I didn't leave you\n" +
                "I was by your side\n" +
                "So where are you now that I need you?\n" +
                "I need you the most";
        intentactivity(view);
    }
    public void TAY(View view)
    {
        Global.lyrics="\"Thinking About You\"\n" +
                "(feat. Jaden Smith)\n" +
                "(originally by Frank Ocean)\n" +
                "\n" +
                "A tornado flew around my room before you came\n" +
                "Excuse the mess it made, it usually doesn't rain\n" +
                "In Southern California, much like Arizona\n" +
                "My eyes don't shed tears, girl, they bawl\n" +
                "\n" +
                "I've thinkin' 'bout you\n" +
                "(Ooh, no, no, no)\n" +
                "I've been thinkin' 'bout you\n" +
                "(No, no, no)\n" +
                "I've been thinkin' 'bout you\n" +
                "Do you think about me still?\n" +
                "Do ya, do ya?\n" +
                "\n" +
                "Do you not think so far ahead?\n" +
                "I been thinkin' about forever (Ooh, ooh)\n" +
                "Do you not think so far ahead?\n" +
                "I been thinkin' about forever (Oooh, oooh)\n" +
                "\n" +
                "[Jaden Smith Rap:]\n" +
                "I been thinking 'bout you and you know I do\n" +
                "When I be thinking 'bout them kisses girl so are you\n" +
                "Man I heard some things, I don't know it's true\n" +
                "But people say you really like me and I hope that's true\n" +
                "You my baby girl and I hope you know it,\n" +
                "A boy will tell you that he loves you but a man will show it\n" +
                "That's why you in my arms, just for the day\n" +
                "Cause let so much go by you be dancing away\n" +
                "But let's just have some fun girl\n" +
                "As long as you're here\n" +
                "Cause when you get up on that plane you'll be gone for a year\n" +
                "And when you come up in my room I'll be bawling some tears\n" +
                "But people say just live in the moment it's wrong to be scared girl\n" +
                "Is it wrong to be scared?\n" +
                "Cause that's what they say and every day that I don't see you,\n" +
                "You slippin' away,\n" +
                "And all my teachers in my class thinkin' I'm crazy\n" +
                "But they don't know that I think about you daily cause I be\n" +
                "\n" +
                "Thinkin' 'bout you\n" +
                "(Ooh, no, no, no)\n" +
                "I've been thinkin' 'bout you\n" +
                "(No, no, no)\n" +
                "I've been thinkin' 'bout you\n" +
                "Do you think about me still?\n" +
                "Do ya, do ya?\n" +
                "\n" +
                "Do you not think so far ahead?\n" +
                "I been thinkin' 'bout forever (Ooh, ooh)\n" +
                "Do you not think so far ahead?\n" +
                "I been thinkin' 'bout forever (Ooh, ooh)\n" +
                "\n" +
                "[Justin Bieber Rap:]\n" +
                "Baby I could pick you up in a Rolls Royce\n" +
                "Anywhere you wanna go it's your choice\n" +
                "Every time that I'm away girl I miss your voice\n" +
                "And I promise that I'm nothing like them other boys\n" +
                "I came from the bottom now I'm at the top\n" +
                "Tell you I love you every day and that I'll never stop\n" +
                "They say it's true love well is love true\n" +
                "Yeah I think it's love that's why I found you\n" +
                "Ain't a second that'll go by that I don't think you're so fly\n" +
                "And I know why ain't no guy gonna treat you like I wanna,\n" +
                "Gonna be the man that treat you right\n" +
                "Be the man to hold you tight\n" +
                "You know I know you right\n" +
                "Let's go into the night,\n" +
                "\n" +
                "Thinkin' 'bout you\n" +
                "(Ooh, no, no, no)\n" +
                "I've been thinkin' 'bout you\n" +
                "(No, no, no)\n" +
                "I've been thinkin' 'bout you\n" +
                "Do you think about me still?\n" +
                "Do ya, do ya?\n" +
                "\n" +
                "Do you not think so far ahead?\n" +
                "I been thinkin' 'bout forever (Ooh, ooh)\n" +
                "Do you not think so far ahead?\n" +
                "I been thinkin' 'bout forever (Ooh, ooh)\n" +
                "\n";
        intentactivity(view);
    }
    public void TOY(View view)
    {
        Global.lyrics="\"Thought Of You\"\n" +
                "\n" +
                "Girl I've been fooled by your smile\n" +
                "I was mistaken by the way you loved me\n" +
                "We led it straight for a while, yeah\n" +
                "Looks so deceiving, you convinced me, yeah\n" +
                "\n" +
                "So clear to me now,\n" +
                "Can't explain what you're doing to me, yeah\n" +
                "I'd leave but I don't know how\n" +
                "It's gon' take some time\n" +
                "But I'll figure it out\n" +
                "\n" +
                "Why should we fight the feeling\n" +
                "Let's just live in the moment\n" +
                "Though it's infatuation\n" +
                "I'm good with that\n" +
                "\n" +
                "'Cause I'm in love with the thought of you\n" +
                "With the thought of you, with the thought of you\n" +
                "I'm in love with the thought of you\n" +
                "Not the things you do, but the thought of you\n" +
                "\n" +
                "Girl, I'm in love with the thought of you, you, you\n" +
                "Girl, I'm in love with the thought of you, you, you\n" +
                "Love with the thought of you\n" +
                "\n" +
                "I fell victim to your style\n" +
                "You're so amazing, girl you're in your own league\n" +
                "Rather be stuck in denial, yeah\n" +
                "Than tryna be without you girl\n" +
                "\n" +
                "So clear to me now,\n" +
                "Can't explain what you're doing to me\n" +
                "I'd leave but I don't know how\n" +
                "It's gon' take some time\n" +
                "But I'll figure it out\n" +
                "\n" +
                "Why should we fight the feeling\n" +
                "Let's just live in the moment\n" +
                "Though it's infatuation\n" +
                "I'm good with that\n" +
                "\n" +
                "'Cause I'm in love with the thought of you\n" +
                "With the thought of you, with the thought of you\n" +
                "I'm in love with the thought of you\n" +
                "Not the things you do, but the thought of you\n" +
                "\n" +
                "Girl, I'm in love with the thought of you, you, you\n" +
                "Girl, I'm in love with the thought of you, you, you\n" +
                "Girl, I'm in love with the thought of you, you, you\n" +
                "Girl, I'm in love with the thought of you\n" +
                "\n" +
                "So clear to me now,\n" +
                "Can't explain what you're doing to me\n" +
                "I'd leave but I don't know how\n" +
                "It's gon' take some time\n" +
                "But I'll figure it out\n" +
                "\n" +
                "Why should we fight the feeling\n" +
                "Let's just live in the moment\n" +
                "Though it's infatuation\n" +
                "I'm good with that\n" +
                "\n" +
                "'Cause I'm in love with the thought of you\n" +
                "With the thought of you, with the thought of you\n" +
                "I'm in love with the thought of you\n" +
                "Not the things you do, but the thought of you\n" +
                "\n" +
                "You-hoo-hoo, you-hoo-hoo\n" +
                "Girl, I'm in love with the thought of you, you, you\n" +
                "Girl, I'm in love with the thought of you\n" +
                "Not the things you do, but the thought of you\n" +
                "You-hoo-hoo, you-hoo-hoo\n" +
                "Girl, I'm in love with the thought of you\n" +
                "\n";
        intentactivity(view);
    }
    public void T(View view)
    {
        Global.lyrics="\"Trust\"\n" +
                "\n" +
                "Oh, oh, baby\n" +
                "Yeah, oh, oh\n" +
                "\n" +
                "If I believe in love and you believe in love\n" +
                "Then we could be in love somehow\n" +
                "If you want the best for us\n" +
                "Like I want the best for us\n" +
                "Then we gotta learn to trust right now\n" +
                "\n" +
                "Don't let this effort go to waste\n" +
                "Put our all in it\n" +
                "Don't want to be left with the questions \"Why?\"\n" +
                "Let's be honest with ourselves\n" +
                "Did we really come this far\n" +
                "Just to watch it go down the drain?\n" +
                "\n" +
                "Yeah, sometimes the heart can see what's invisible to the eye\n" +
                "All you gotta do is listen to your deepest feelings\n" +
                "They don't ever lie\n" +
                "Well giving up is immature\n" +
                "There's so much more to live for\n" +
                "They don't wanna see us together now\n" +
                "'Cause we're strong enough to endure, whoa\n" +
                "\n" +
                "If I believe in love and you believe in love\n" +
                "Then we could be in love, somehow\n" +
                "If you want the best for us\n" +
                "Like I want the best for us\n" +
                "Then we gotta learn to trust right now\n" +
                "\n" +
                "Growing pains come along with these changes\n" +
                "Some people get closer some people separate, yeah\n" +
                "Don't think we should separate\n" +
                "And we both adore one another\n" +
                "You're a dream come true\n" +
                "We should start off brand new\n" +
                "That's what we ought to do, yeah\n" +
                "\n" +
                "Sometimes the heart can see what's invisible to the eye\n" +
                "All you gotta do is listen to your deepest feelings\n" +
                "They don't ever lie\n" +
                "Well giving up is immature\n" +
                "There's so much more to live for\n" +
                "They don't wanna see us together now\n" +
                "'Cause we're strong enough to endure, whoa\n" +
                "\n" +
                "If I believe in love and you believe in love\n" +
                "Then we could be in love somehow\n" +
                "If you want the best for us\n" +
                "Like I want the best for us\n" +
                "Then we gotta learn to trust right now\n" +
                "\n" +
                "Trust me right now\n" +
                "Yeah, yeah, yeah-ah-ah-ah\n" +
                "Oh, we gotta learn to trust now\n" +
                "Yeah, yeah, yeah-ah-ah-ah\n" +
                "Girl you gotta learn to trust me now\n" +
                "Hey, hey, yeah\n" +
                "If I believe in love and you believe in love\n" +
                "Then we could be in love\n" +
                "If you want the best for us\n" +
                "I got the best for us\n" +
                "We gotta learn to trust\n" +
                "We gotta learn to trust\n" +
                "Yeah, whoa, whoa";
        intentactivity(view);
    }
    public void TTY(View view)
    {
        Global.lyrics="\"Turn To You\"\n" +
                "\n" +
                "You worked two jobs\n" +
                "To keep a roof above our heads\n" +
                "You chose life for me\n" +
                "No you never gave up\n" +
                "I admire you for the strength you've instilled in me\n" +
                "\n" +
                "You were so young\n" +
                "You were just my age when you had me\n" +
                "Mom, you were so brave\n" +
                "There was nothing gonna stop or get in our way\n" +
                "And I know you will always be there for me\n" +
                "\n" +
                "So when you're lost and you're tired\n" +
                "When you're broken in two\n" +
                "Let my love take you higher\n" +
                "Cause I, I still turn to you\n" +
                "I still turn to you\n" +
                "I still turn to you\n" +
                "\n" +
                "It was '94\n" +
                "The year that everything started to change\n" +
                "From before, you had to be a woman\n" +
                "You were forced to change your ways\n" +
                "To change your ways\n" +
                "\n" +
                "Then you found the Lord\n" +
                "You gave your life to Him\n" +
                "And you could not ignore\n" +
                "The love he had for you\n" +
                "And I wanted more of your heart\n" +
                "\n" +
                "So when you're lost and you're tired\n" +
                "When you're broken in two\n" +
                "Let my love take you higher\n" +
                "Cause I, I still turn to you\n" +
                "\n" +
                "I don't know what I'd do if you left me\n" +
                "So please don't go away\n" +
                "Everything that you are is who I am\n" +
                "Who I am today\n" +
                "\n" +
                "So when you're lost and you're tired\n" +
                "When you're broken in two\n" +
                "Let my love take you higher\n" +
                "Cause I, I still turn to you\n" +
                "I still turn to you\n" +
                "I still turn to you\n" +
                "\n" +
                "To you, to you, to you. I still turn to you. To you, to you, to you\n" +
                "Cause I, I turn to you";
        intentactivity(view);
    }
    public void US(View view)
    {
        Global.lyrics="Oh\n" +
                "Yeah\n" +
                "Mmmm\n" +
                "\n" +
                "I'd wait on you forever and a day\n" +
                "Hand and foot\n" +
                "Your world is my world\n" +
                "Yeah\n" +
                "Ain't no way you're ever gon' get\n" +
                "Any less than you should\n" +
                "Cause baby\n" +
                "You smile I smile (oh)\n" +
                "Cause whenever\n" +
                "You smile, I smile\n" +
                "Hey hey hey\n" +
                "\n" +
                "Your lips, my biggest weakness\n" +
                "Shouldn't have let you know\n" +
                "I'm always gonna do what they say (hey)\n" +
                "If you need me\n" +
                "I'll come runnin'\n" +
                "From a thousand miles away\n" +
                "When you smile I smile (oh whoa)\n" +
                "You smile, I smile\n" +
                "Hey\n" +
                "\n" +
                "Baby take my open heart and all it offers\n" +
                "Cause this is as unconditional as it'll ever get\n" +
                "You ain't seen nothing yet\n" +
                "I won't ever hesitate to give you more\n" +
                "Cause baby (hey)\n" +
                "You smile, I smile (whoa)\n" +
                "You smile, I smile\n" +
                "Hey hey hey\n" +
                "You smile, I smile\n" +
                "I smile, I smile, I smile\n" +
                "You smile, I smile\n" +
                "Make me smile baby\n" +
                "\n" +
                "Baby you won't ever want for nothing\n" +
                "You are my ends and my means now\n" +
                "With you there's no in between\n" +
                "I'm all in\n" +
                "Cause my cards are on the table\n" +
                "And I'm willing and I'm able\n" +
                "But I fold to your wish\n" +
                "Cause it's my command\n" +
                "Hey hey hey\n" +
                "\n" +
                "You smile, I smile (whoa)\n" +
                "You smile, I smile\n" +
                "Hey hey hey\n" +
                "You smile, I smile\n" +
                "I smile, I smile, I smile\n" +
                "You smile, I smile\n" +
                "Oh\n" +
                "\n" +
                "You smile, I smile\n" +
                "You smile, I smile";
        intentactivity(view);
    }
    public void UO(View view)
    {
        Global.lyrics="\"Uh Oh\"\n" +
                "\n" +
                "Oh oh oh\n" +
                "You got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "Said I really wasn't trying to fall in love\n" +
                "Got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "I swear I really wasn't trying to fall in love\n" +
                "\n" +
                "Girl when we met you said we wasn't gone rush\n" +
                "Just peed to and see where it takes us\n" +
                "And then there was your smile, Yeah\n" +
                "And everyday get closer and closer\n" +
                "In my arms with your head on my shoulder\n" +
                "Never wanna come down\n" +
                "Cause girl I don't know when these feelings that I have for you\n" +
                "Knock me off my balance can't explain\n" +
                "All I know is\n" +
                "One minute I'm walking and then next thing I know I'm falling\n" +
                "\n" +
                "You got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "Said I really wasn't trying to fall in love\n" +
                "Got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "I swear I really wasn't trying to fall in love\n" +
                "\n" +
                "Holding hands and I feel so connective\n" +
                "And every kiss, yeah, I feel so electric\n" +
                "I never stood a chance\n" +
                "You're an angel sent straight from heaven\n" +
                "And through the phone I can feel your affection\n" +
                "I hope this never ends\n" +
                "Cause girl I don't know when these feelings that I have for you\n" +
                "Knock me off my balance can't explain all I know is\n" +
                "One minute I'm walking and then next thing I know I'm falling\n" +
                "\n" +
                "You got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "Said I really wasn't trying to fall in love\n" +
                "Got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "I swear I really wasn't trying to fall in love\n" +
                "I really didn't mean to\n" +
                "I really didn't mean to\n" +
                "Didn't mean to fall in love\n" +
                "Didn't mean to fall in love girl\n" +
                "I really didn't mean to\n" +
                "I really didn't mean to\n" +
                "Didn't mean to fall in love\n" +
                "\n" +
                "Girl you know you got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "Said I really wasn't trying to fall in love\n" +
                "\n" +
                "Got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "I swear I really wasn't trying to fall in love\n" +
                "\n" +
                "You got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "Said I really wasn't trying to fall in love\n" +
                "\n" +
                "Got me like oh oh oh oh oh oh\n" +
                "Baby oh oh oh oh oh oh\n" +
                "I really wasn't trying to fall in love\n" +
                "I swear I really wasn't trying to fall in love";
        intentactivity(view);
    }
    public void U(View view)
    {
        Global.lyrics="\"Up\"\n" +
                "\n" +
                "It's a big big world\n" +
                "It's easy to get lost in it\n" +
                "You've always been my girl, oh\n" +
                "And I'm not ready to call it quits\n" +
                "\n" +
                "We can make the sun shine in the moon light\n" +
                "We can make the grey clouds turn to blue skies\n" +
                "I know it's hard\n" +
                "Baby, believe me\n" +
                "\n" +
                "That we can go nowhere but up\n" +
                "From here, my dear\n" +
                "Baby, we can go nowhere but up\n" +
                "Tell me what we've got to fear\n" +
                "We'll take it to the sky past the moon to the galaxy\n" +
                "As long as you're with me, baby\n" +
                "Honestly, honestly with the strength of our love\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "It's a big big world\n" +
                "And I'm gonna show you all of it\n" +
                "I'm gonna lace you with pearls, oh\n" +
                "From every ocean that we're swimmin' in\n" +
                "\n" +
                "We can make the sun shine in the moon light\n" +
                "We can make the grey clouds turn to blue skies\n" +
                "Yeah, I know it's hard\n" +
                "Baby, believe me, ooh\n" +
                "\n" +
                "That we can go nowhere but up\n" +
                "From here, my dear\n" +
                "Baby, we can go nowhere but up\n" +
                "Tell me what we've got to fear\n" +
                "We'll take it to the sky past the moon to the galaxy\n" +
                "As long as you're with me, baby\n" +
                "Honestly, honestly with the strength of our love\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "Nowhere but up\n" +
                "\n" +
                "Baby, we were underground\n" +
                "We're on the surface now\n" +
                "We're gonna make it, girl\n" +
                "I promise\n" +
                "If you believe in love\n" +
                "And you believe in us\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "We can go nowhere but up\n" +
                "From here, my dear\n" +
                "Baby, we can go nowhere but up\n" +
                "Tell me what we've got to fear\n" +
                "We'll take it to the sky past the moon to the galaxy\n" +
                "As long as you're with me, baby\n" +
                "Honestly, honestly with the strength of our love\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "Nowhere but up\n" +
                "Nowhere but up\n" +
                "Yeah\n" +
                "Nowhere but up";
        intentactivity(view);
    }
    public void Ur(View view)
    {
        Global.lyrics="\"Up (Remix)\"\n" +
                "(feat. Chris Brown)\n" +
                "\n" +
                "It's a big big world\n" +
                "It's easy to get lost in it\n" +
                "You've always been my girl\n" +
                "And I'm not ready to call it quits\n" +
                "\n" +
                "We can make the sun shine in the moon light\n" +
                "We can make the gray clouds turn to blue skies\n" +
                "I know it's hard\n" +
                "Baby believe in me\n" +
                "That we can't go\n" +
                "\n" +
                "Nowhere but up\n" +
                "From here\n" +
                "My dear\n" +
                "Baby we can go nowhere but up\n" +
                "Tell me what got to fear\n" +
                "We'll take to the sky pass the moon to the galaxy\n" +
                "As long as you're with me baby\n" +
                "Honestly with the strenght of our love\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "[Chris Brown:]\n" +
                "It's a big big world\n" +
                "Girl I'm gonna show you all of it\n" +
                "I'm gonna lace you with pearls\n" +
                "From every ocean\n" +
                "That will swim in it\n" +
                "\n" +
                "We make the sun shine in the moon light\n" +
                "We can make those gray clouds turn to blue skies\n" +
                "Yeah I know it's hard\n" +
                "But baby believe me (oh)\n" +
                "That we can't go\n" +
                "\n" +
                "Nowhere but up\n" +
                "From here\n" +
                "My dear\n" +
                "Baby we can go nowhere but up\n" +
                "Tell me what we got to fear\n" +
                "We'll take it to the sky pass the moon to the galaxy\n" +
                "As long as you're with me baby\n" +
                "Honestly with the strenght of our love\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "[Justin Bieber (Chris Brown):]\n" +
                "Baby we were underground\n" +
                "We're on the surface now\n" +
                "We gonna make it girl\n" +
                "I promise\n" +
                "(If you believe in love)\n" +
                "(And you believe in us)\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "Baby we can go\n" +
                "\n" +
                "Nowhere but up\n" +
                "From here\n" +
                "My dear\n" +
                "Baby we can go nowhere but up\n" +
                "Tell me what we got to fear\n" +
                "We'll take it to the sky pass the moon to the galaxy\n" +
                "As long as you're with me baby\n" +
                "Honestly with the strength of our love\n" +
                "We can go nowhere but up\n" +
                "\n" +
                "Nowhere but up (I'll take you there)\n" +
                "Nowhere but up\n" +
                "Yeah\n" +
                "Nowhere but up";
        intentactivity(view);
    }
    public void WFAM(View view)
    {
        Global.lyrics="\"Wait For A Minute\"\n" +
                "(feat. Tyga)\n" +
                "\n" +
                "Yeah\n" +
                "Wait for a minute\n" +
                "Can you wait for a minute?\n" +
                "Yeah, wait for a minute\n" +
                "Wait for a minute\n" +
                "Girl, just a minute\n" +
                "\n" +
                "Well, if you walk with me\n" +
                "Well, if you take my hand babe\n" +
                "We can go to a place you ain't never seen before\n" +
                "\n" +
                "Slow dance in the moonlight\n" +
                "I'm just tryna set the mood right\n" +
                "I'm just doing what a dude do\n" +
                "Do it over and over and over\n" +
                "\n" +
                "Quickly wanna run with me now\n" +
                "Swiftly just come with me now\n" +
                "Foot steps go to the beat now\n" +
                "Over and over and over\n" +
                "\n" +
                "It's just the way, that way, that way, that you do me babe\n" +
                "All, I can say, that say, that say, that I'd behave\n" +
                "But I'd be lying babe\n" +
                "\n" +
                "Just wanna wait for a minute (wait for a minute)\n" +
                "Wait for a minute, babe (wait for a minute)\n" +
                "Just wanna wait for a minute (play for a minute)\n" +
                "I dream place for a minute, place for a minute babe\n" +
                "\n" +
                "[Tyga]\n" +
                "Hold up, I don't need no love\n" +
                "I said that with a straight face, baby that's poker\n" +
                "Feel a lil sober, got it mixed in my soda\n" +
                "I clean up good, aropa, dopa\n" +
                "Baby I'm the shit but that's a good odor\n" +
                "I'm a young star but my money look Yoda\n" +
                "Crib on the ocean, backyard boat shit\n" +
                "You hating on the Internet, I couldn't even notice\n" +
                "Tickets no service, we at the top working\n" +
                "Pop-pops is lurking, told her \"don't get nervous\"\n" +
                "I don't swerve Suburbans, this a gold derby\n" +
                "Ferarri's and horses, I snap like Torres\n" +
                "No rug, I floor it, girl, come feel important\n" +
                "I'm all about a dollar, babe, banks call me Georgi\n" +
                "9-5 Rollie, 96 Kobe, tonight we gon' ball like Ginobili\n" +
                "You know me, I'm just tryna...\n" +
                "\n" +
                "Slow dance in the moonlight\n" +
                "I'm just tryna set the mood right\n" +
                "I'm just doing what a dude do\n" +
                "Do it over and over and over\n" +
                "\n" +
                "Quickly wanna run with me now\n" +
                "Swiftly just come with me now\n" +
                "Foot steps go to the beat now\n" +
                "Over and over and over\n" +
                "\n" +
                "It's just the way, that way, that way, that you do me babe (oh)\n" +
                "All I can say, that say, that say that I'd behave\n" +
                "But I'd be lying babe (I'd be lying babe)\n" +
                "\n" +
                "Just wanna wait for a minute (wait for a minute)\n" +
                "Wait for a minute, babe (wait for a minute)\n" +
                "Just wanna wait for a minute (wait for a minute)\n" +
                "I dream place for a minute, place for a minute babe\n" +
                "\n" +
                "Just wanna wait for a minute\n" +
                "Wait for a minute\n" +
                "Just to wait for a minute\n" +
                "Wait for a minute\n" +
                "Girl, just a minute\n" +
                "Wait just a minute\n" +
                "Can you wait just a minute?\n" +
                "Girl, just a minute\n" +
                "Wait just a minute, wait just a minute\n" +
                "\n" +
                "Aggh!\n" +
                "Yeah, T-raw, JB\n" +
                "Too fly never stop, know what?";
        intentactivity(view);
    }
    public void WA(View view)
    {
        Global.lyrics="\"We Are\"\n" +
                "(feat. Nas)\n" +
                "\n" +
                "Happy birthday\n" +
                "\n" +
                "You ain't gotta question it\n" +
                "You already know the answer\n" +
                "The truth don't make us relevant\n" +
                "Hurts but it's necessary\n" +
                "Don't want us to lose what we are\n" +
                "Don't want us to lose what we are\n" +
                "Lose what we are\n" +
                "\n" +
                "If it ain't broke then we don't need to fix it\n" +
                "Believing in that she say I have you livid\n" +
                "No, they won't be happy 'til your love is over\n" +
                "They tryna break us up but you don't wanna get it\n" +
                "\n" +
                "They ain't never had your back like I got it\n" +
                "They ain't never had trust like how we got it\n" +
                "So they can't help but to come and hate on it\n" +
                "They see what we got and you know they want it\n" +
                "Don't question it\n" +
                "\n" +
                "You ain't gotta question it\n" +
                "You already know the answer\n" +
                "The truth don't make us relevant\n" +
                "Hurts but it's necessary\n" +
                "Don't want us to lose what we are\n" +
                "Don't want us to lose what we are\n" +
                "Lose what we are\n" +
                "\n" +
                "It's like you're always looking for a problem\n" +
                "But there ain't enough equations for you to solve 'em\n" +
                "So quick to turn nothin' right into somethin'\n" +
                "Get the numbers out my phone, go 'head and call 'em\n" +
                "\n" +
                "They ain't never had my back like you got it\n" +
                "They ain't never had a chance how you got it\n" +
                "So they can't help but to come and hate on it\n" +
                "They see what we got and you know they want it\n" +
                "Don't question it\n" +
                "\n" +
                "You ain't gotta question it\n" +
                "You already know the answer\n" +
                "The truth don't make us relevant\n" +
                "Hurts but it's necessary\n" +
                "Don't want us to lose what we are\n" +
                "Don't want us to lose what we are\n" +
                "Lose what we are\n" +
                "\n" +
                "[Nas:]\n" +
                "She texts me \"How's your love life?\" and \"How are you? \", I said \"I'm good.\"\n" +
                "They only get as close as you allow them to\n" +
                "We should be closer together, warm oceans, better weather\n" +
                "Instead of us playing games forever, she says whatever\n" +
                "I says whatever, who get you wetter than a half-moon wearer\n" +
                "HSTRY sweater, serendipity when you with me\n" +
                "Swear you love that one thing we did that one time in that one place\n" +
                "Blew your mind, you got my mind gone when I'm home\n" +
                "I'm serious girl, a much older dude, a whole 42\n" +
                "I've accomplished my goals, it's only you\n" +
                "You and I in that Wraith, retired my pimp super-fly cape\n" +
                "Just my Mets cap and my batch and I'm straight\n" +
                "Esco\n" +
                "\n" +
                "Don't question it\n" +
                "You ain't gotta question it\n" +
                "You already know the answer\n" +
                "The truth don't make us relevant\n" +
                "Hurts but it's necessary\n" +
                "Don't want us to lose what we are\n" +
                "Don't wanna lose, no\n" +
                "Don't wanna still lose what we are\n" +
                "We can't lose\n" +
                "Lose what we are\n";
        intentactivity(view);
    }
    public void WWBT(View view)
    {
        Global.lyrics="\"We Were Born For This\"\n" +
                "\n" +
                "(Wh-whoa, oh yeah\n" +
                "Wh-whoa)\n" +
                "\n" +
                "[Verse 1:]\n" +
                "Look at all the choices\n" +
                "The choices in this world\n" +
                "The world spinnin' on freedom\n" +
                "Freedom for the boys and the girls\n" +
                "\n" +
                "But the boys and girls, they don't know\n" +
                "What love is like\n" +
                "Love is like appreciation\n" +
                "Mixed in a double cup with Sprite\n" +
                "\n" +
                "So, can we go\n" +
                "No left or right\n" +
                "You go your way\n" +
                "And I'll go mine\n" +
                "\n" +
                "[Chorus:]\n" +
                "'Cause this is my time\n" +
                "And I won't waste it\n" +
                "Thinkin' 'bout what you gotta say\n" +
                "'Cause I'm here to stay, yeah\n" +
                "\n" +
                "'Cause this is my time\n" +
                "And I won't waste it\n" +
                "Thinkin' 'bout what you gotta say\n" +
                "'Cause I'm here to stay\n" +
                "\n" +
                "(Whoa, whoa\n" +
                "Whoa, oh, oh)\n" +
                "\n" +
                "[Verse 2:]\n" +
                "Look at all the places\n" +
                "Places that I've been, oh\n" +
                "It doesn't come easy\n" +
                "You gotta have strength\n" +
                "\n" +
                "And when it goes down\n" +
                "And it's all said and done\n" +
                "You gotta stand up tall\n" +
                "There's no need to run\n" +
                "\n" +
                "And now that I've made it\n" +
                "I won't look back, no\n" +
                "Sacrifice what meant the most to me\n" +
                "The most to me\n" +
                "Yes, I did\n" +
                "\n" +
                "[Chorus:]\n" +
                "'Cause this is my time (this is my time)\n" +
                "And I won't waste it\n" +
                "Thinkin' 'bout what you gotta say (thinkin' 'bout what you gotta say)\n" +
                "'Cause I'm here to stay\n" +
                "\n" +
                "(Whoa, whoa\n" +
                "Whoa, oh, oh)\n" +
                "\n" +
                "[Bridge:]\n" +
                "Look at all the people\n" +
                "Standing outside\n" +
                "So dedicated\n" +
                "Your love doesn't go unrecognized\n" +
                "\n" +
                "(Wh-whoa, wh-whoa)\n" +
                "\n" +
                "Your love doesn't go...\n" +
                "Unrecognized\n" +
                "\n" +
                "(Oh, whoa\n" +
                "Oh, whoa\n" +
                "Oh, whoa\n" +
                "Oh, whoa\n" +
                "Yeah)";
        intentactivity(view);
    }
    public void WDYM(View view)
    {
        Global.lyrics="\"What Do You Mean?\"\n" +
                "\n" +
                "What do you mean?\n" +
                "Ohh ohh ohh\n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean?\n" +
                "Hey yeah\n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "Ohh\n" +
                "What do you mean?\n" +
                "Said we're running out of time\n" +
                "What do you mean?\n" +
                "Ohh ohh ohh\n" +
                "What do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?\n" +
                "\n" +
                "You're so indecisive of what I'm saying\n" +
                "Tryna catch the beat, make up your heart\n" +
                "Don't know if you're happy or complaining\n" +
                "Don't want for us to end\n" +
                "Where do I start\n" +
                "First you wanna go to the left and you want to turn right\n" +
                "Wanna argue all day, make love all night\n" +
                "First you're up then you're down and then between\n" +
                "Ohh I really want to know...\n" +
                "\n" +
                "What do you mean?\n" +
                "Ohh ohh ohh\n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean?\n" +
                "Hey yeah\n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "Ohh\n" +
                "What do you mean?\n" +
                "Said we're running out of time\n" +
                "What do you mean?\n" +
                "Ohh ohh ohh\n" +
                "What do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?\n" +
                "\n" +
                "You're overprotective when I'm leaving\n" +
                "Tryna compromise but I can't win\n" +
                "You wanna make a point but you keep preaching\n" +
                "You had me from the start, won't let this end\n" +
                "First you wanna go to the left then you want to turn right\n" +
                "Wanna argue all day, make love all night\n" +
                "First you're up then you're down and then between\n" +
                "Ohh I really wanna know...\n" +
                "\n" +
                "What do you mean?\n" +
                "Ohh ohh ohh\n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean?\n" +
                "Hey yeah\n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "\n" +
                "I want to know...\n" +
                "Oh\n" +
                "What do you mean?\n" +
                "Ohhh\n" +
                "Said we're running out of time\n" +
                "What do you mean?\n" +
                "(Oh baby)\n" +
                "Ohh ohh ohh\n" +
                "What do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?\n" +
                "\n" +
                "Ohh ohh ohh\n" +
                "(This is ours baby, yeah)\n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean?\n" +
                "(You're so confusing baby)\n" +
                "Hey yeah\n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "(Be more straight forward)\n" +
                "Ohh\n" +
                "What do you mean?\n" +
                "(Give it back back back)\n" +
                "Said we're running out of time\n" +
                "What do you mean?\n" +
                "(Give it back back back)\n" +
                "Ohh ohh ohh\n" +
                "What do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?\n";
        intentactivity(view);
    }
    public void WDYMr(View view)
    {
        Global.lyrics="\"What Do You Mean? (Remix)\"\n" +
                "(with Ariana Grande)\n" +
                "\n" +
                "What do you mean?\n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean?\n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "Oh, what do you mean?\n" +
                "Said you're running out of time, what do you mean?\n" +
                "Oh, oh, oh, what do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?\n" +
                "\n" +
                "You’re so indecisive, what I’m saying\n" +
                "Tryna catch the beat, make up your heart\n" +
                "Don't know if you're happy or complaining\n" +
                "Don't want for us to end, where do I start?\n" +
                "\n" +
                "First you wanna go to the left then you wanna turn right\n" +
                "Wanna argue all day, make love all night\n" +
                "First you're up, then you’re down and then between\n" +
                "Oh, I really want to know…\n" +
                "\n" +
                "What do you mean?\n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean? \n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "Oh, what do you mean?\n" +
                "Said you're running out of time, what do you mean?\n" +
                "Oh, oh, oh, what do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?\n" +
                "\n" +
                "[Ariana Grande:]\n" +
                "You’re overprotective when I’m leaving\n" +
                "Trying to compromise but I can’t win\n" +
                "You want to make a point, but you keep preaching\n" +
                "You had me from the start, won't let this end\n" +
                "\n" +
                "[Justin Bieber & Ariana Grande:]\n" +
                "First you wanna go to the left then you wanna turn right\n" +
                "Wanna argue all day, make love all night\n" +
                "First you're up, then you’re down and then between\n" +
                "Oh, I really want to know…\n" +
                "\n" +
                "What do you mean? \n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean? \n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "(I wanna know)\n" +
                "Oh, what do you mean?\n" +
                "Said you're running out of time, what do you mean?\n" +
                "(Oh baby)\n" +
                "Oh, oh, oh, what do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?\n" +
                "\n" +
                "(This is ours baby, yeah)\n" +
                "When you nod your head yes\n" +
                "But you wanna say no\n" +
                "What do you mean? \n" +
                "(You're so confusing baby)\n" +
                "When you don't want me to move\n" +
                "But you tell me to go\n" +
                "What do you mean?\n" +
                "(Be more straight forward)\n" +
                "Oh, what do you mean?\n" +
                "Said you're running out of time, what do you mean?\n" +
                "Oh, oh, oh, what do you mean?\n" +
                "Better make up your mind\n" +
                "What do you mean?";
        intentactivity(view);
    }
    public void WH(View view)
    {
        Global.lyrics="\"What's Hatnin'\"\n" +
                "(feat. Future)\n" +
                "\n" +
                "[Hook:]\n" +
                "I pull up and then I hop out, like what's hatnin'\n" +
                "I knock on the door, she know who it is, what's hatnin'\n" +
                "She wanna roll, we 'bout to go, what's hatnin'\n" +
                "We took off in that UFO, like what's hatnin'\n" +
                "What's hatnin', what's hatnin', baby girl what's hatnin'\n" +
                "Don't talk about it, just be about it, whatever happens, just happens\n" +
                "What's hatnin', what's hatnin', baby girl what's hatnin'\n" +
                "Don't talk about it, just be about it, you got it girl, what's hatnin'\n" +
                "\n" +
                "[Future:]\n" +
                "Do you wanna scream and shout?\n" +
                "But I don't wanna fight babe\n" +
                "I guess that's why I'm leavin' now\n" +
                "I can't do nothin' right babe, what's hatnin'\n" +
                "\n" +
                "[Bridge:]\n" +
                "Arguin' won't fix the problem, talk with me baby we can solve it\n" +
                "Be real with me, no other option, no other option, no other option\n" +
                "Arguin' won't fix the problem, talk with me, baby we can solve it\n" +
                "Be real with me, no other option, no other option, no other option\n" +
                "\n" +
                "[Justin:]\n" +
                "We just need forgiveness baby, let me get to business\n" +
                "I just, I just wanna give it to you\n" +
                "Girl let's pick up where we started, we don't need to worry 'bout it\n" +
                "We just wanna have fun tonight\n" +
                "\n" +
                "[Hook:]\n" +
                "I pull up and then I hop out, like what's hatnin'\n" +
                "I knock on the door, she know who it is, what's hatnin'\n" +
                "She wanna roll roll, we 'bout to go, what's hatnin'\n" +
                "We took off in that UFO, like what's hatnin'\n" +
                "What's hatnin', what's hatnin', baby girl what's hatnin'\n" +
                "Don't talk about it, just be about it, whatever happens, just happens\n" +
                "What's hatnin', what's hatnin', baby girl what's hatnin'\n" +
                "Don't talk about it, just be about it, you got it girl, what's hatnin'\n" +
                "\n" +
                "[Justin:]\n" +
                "Hey love, what you waiting for?\n" +
                "I've been waiting for a girl like you for a long, long, long, long time now\n" +
                "Hey love, hey love, hey love\n" +
                "Don't throw it away, don't throw it away, don't, don't throw it away\n" +
                "\n" +
                "[Bridge:]\n" +
                "Arguin' won't fix the problem, talk with me and we can solve it\n" +
                "Be real with me, ain't no other option, no other option, no other option\n" +
                "Arguin' won't fix the problem, talk with me, baby we can solve it\n" +
                "Be real with me, ain't no other option, no other option, no other option\n" +
                "\n" +
                "[Hook:]\n" +
                "I pull up and then I hop out, like what's hatnin'\n" +
                "I knock on the door, she know who it is, what's hatnin'\n" +
                "She wanna roll, we 'bout to go, what's hatnin'\n" +
                "We took off in that UFO, like what's hatnin'\n" +
                "What's hatnin', what's hatnin', baby girl what's hatnin'\n" +
                "Don't talk about it, just be about it, whatever happens, just happens\n" +
                "What's hatnin', what's hatnin', baby girl what's hatnin'\n" +
                "Don't talk about it, just be about it, you got it girl, what's hatnin'\n" +
                "\n" +
                "[Outro:]\n" +
                "Girl you my blessin', with you undressin'\n" +
                "What's hatnin', what's hatnin', what's hatnin', what's hatnin', what's hatnin'\n" +
                "Future";
        intentactivity(view);
    }
    public void WAUN(View view)
    {
        Global.lyrics="\"Where Are Ü Now\"\n" +
                "(feat. Justin Bieber)\n" +
                "\n" +
                "I need you (the) I need you\n" +
                "I need you (the) I need you\n" +
                "I need you, you, you, you, you, you\n" +
                "I need you (the) I need you\n" +
                "I need you (the) I need you\n" +
                "I need you, you, you, you, you, you\n" +
                "You, you, you\n" +
                "I need you the most\n" +
                "\n" +
                "I gave you the key when the door wasn't open, just admit it\n" +
                "See, I gave you faith, turned your doubt into hoping, can’t deny it\n" +
                "Now I’m all alone and my joys turned to moping\n" +
                "Tell me, where are you now that I need you?\n" +
                "Where are you now?\n" +
                "Where are you now that I need you?\n" +
                "Couldn't find you anywhere\n" +
                "When you broke down I didn't leave you\n" +
                "I was by your side\n" +
                "So where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "\n" +
                "Where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "\n" +
                "I gave you attention when nobody else was paying\n" +
                "I gave you the shirt off my back, what you saying? \n" +
                "To keep you warm\n" +
                "I showed you the game everybody else was playing, that's for sure\n" +
                "And I was on my knees when nobody else was praying, oh Lord\n" +
                "\n" +
                "Where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "\n" +
                "I need you (the) I need you\n" +
                "I need you (the) I need you\n" +
                "I need you, you, you, you, you, you\n" +
                "Where are you now that I need you?\n" +
                "I need you (the) I need you\n" +
                "I need you (the) I need you\n" +
                "I need you, you, you, you, you, you\n" +
                "I need you the most\n" +
                "\n" +
                "Where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "Where are you now that I need you?\n" +
                "I need you the most (I need you the most, I need you the most)\n";
        intentactivity(view);
    }
    public void YR(View view)
    {
        Global.lyrics="\"Yellow Raincoat\"\n" +
                "\n" +
                "'Cause I put on my raincoat, my yellow raincoat\n" +
                "Baby, it's keeping me dry\n" +
                "I put on my raincoat, my yellow raincoat\n" +
                "You know exactly why\n" +
                "\n" +
                "When the wind blows, and the sun goes away\n" +
                "And the sinful, stormy day,\n" +
                "That's what it's for, yeah, that's what it's for, yeah\n" +
                "And as it pours down, the water sprinkles off my jacket slow yeah, jacket slow yeah\n" +
                "\n" +
                "Well, never do I ever, do I ever want this to faze me\n" +
                "Well, never do I ever do I want this thing to make me\n" +
                "'Cause the fame and the money, and the girls will drive you crazy (drive you crazy)\n" +
                "And all the \"He said, she said\", I'm thinking maybe\n" +
                "Just put on my...\n" +
                "\n" +
                "'Cause I put on my raincoat, my yellow raincoat\n" +
                "Baby, it's keeping me dry\n" +
                "I put on my raincoat, my yellow raincoat\n" +
                "You know exactly why\n" +
                "\n" +
                "But as I look around, I see\n" +
                "What nothing can never, change me.\n" +
                "Well, all I gotta do is stay me\n" +
                "Let's the rest do the work and I'm sure that it'll be fine, be fine\n" +
                "\n" +
                "When the wind blows, and the sun goes away\n" +
                "And the sinful, stormy day,\n" +
                "That's what it's for, yeah, that's what it's for, yeah\n" +
                "And as it pours down, the water sprinkles off my jacket slow yeah, jacket slow yeah\n" +
                "\n" +
                "Well, never do I ever, do I ever want this to faze me\n" +
                "Well, never do I ever, do I want this thing to make me\n" +
                "'Cause the fame and the money, and the girls will drive you crazy\n" +
                "And all the \"He said, she said\", I'm thinking maybe\n" +
                "Just put on my...\n" +
                "\n" +
                "'Cause I put on my raincoat, my yellow raincoat\n" +
                "Baby, it's keeping me dry\n" +
                "I put on my raincoat, my yellow raincoat\n" +
                "You know exactly why\n" +
                "\n" +
                "Just put on my...\n" +
                "Do do do do do\n" +
                "Do do do do do\n" +
                "Just put on my...\n" +
                "Do do do do do\n" +
                "Do do do do do\n" +
                "Just put on my...\n" +
                "\n" +
                "'Cause I put on my raincoat, my yellow raincoat\n" +
                "Baby, it's keeping me dry\n" +
                "I put on my raincoat, my yellow raincoat\n" +
                "You know exactly why\n" +
                "\n" +
                "Yeah, oh oh";
        intentactivity(view);
    }
    public void YWM(View view)
    {
        Global.lyrics="\"You Want Me\"\n" +
                "\n" +
                "Ha\n" +
                "It's Justin... Bieber\n" +
                "\n" +
                "I can take you to a new world\n" +
                "Take your problems away\n" +
                "Tell me what you wanna do girl\n" +
                "Just come right this way\n" +
                "I don't never need a new girl (no)\n" +
                "Cause you're here to stay\n" +
                "Let me show you what I do girl\n" +
                "And you'll never leave.\n" +
                "\n" +
                "You want me\n" +
                "Girl, you know you want me\n" +
                "You want me, you want me\n" +
                "Girl, you know you want me right (go) right (go)\n" +
                "Right, right\n" +
                "Girl, you know you want me right\n" +
                "\n" +
                "Yeah you said that you love me\n" +
                "Yeah I said that I love you too\n" +
                "Let you know that you're lovely\n" +
                "Flowers for nothing just for you\n" +
                "You know I got you until the whole world ends\n" +
                "You know I got you\n" +
                "Won't you come and be my girlfriend?\n" +
                "\n" +
                "[Rap:]\n" +
                "Cause you're scared to fall.\n" +
                "But you won't spread your wings.\n" +
                "You know it's hard to fly.\n" +
                "When you don't try new things.\n" +
                "And I'm a be the one to make you smile for a minute\n" +
                "Put your head down, let it down for a minute.\n" +
                "\n" +
                "Baby, (baby) this sounds crazy (this sounds crazy)\n" +
                "Thinking bout you lately (thinking bout you lately)\n" +
                "I just need a... I just need a lady\n" +
                "(Save me)\n" +
                "\n" +
                "I can take you to a new world\n" +
                "Take your problems away\n" +
                "Tell me what you wanna do girl\n" +
                "Just come right this way\n" +
                "I don't never need a new girl\n" +
                "Cause you're here to stay\n" +
                "Let me show you what I do girl\n" +
                "And you'll never leave.\n" +
                "\n" +
                "You want me\n" +
                "Girl, you know you want me\n" +
                "You want me, you want me\n" +
                "Girl, you know you want me right, right\n" +
                "Right, right\n" +
                "Girl, you know you want me right\n" +
                "\n" +
                "I can take you to a new world\n" +
                "Take your problems away\n" +
                "Tell me what you wanna do girl\n" +
                "Just come right this way\n" +
                "I don't never need a new girl\n" +
                "Cause you're here to stay\n" +
                "Let me show you what I do girl\n" +
                "And you'll never leave.\n" +
                "\n" +
                "You want me\n" +
                "Girl, you know you want me\n" +
                "You want me, you want me\n" +
                "Girl, you know you want me right, right\n" +
                "Right, right\n" +
                "Girl, you know you want me right";
        intentactivity(view);
    }
    public void FS(View view)
    {
        Global.lyrics="\"Friends\"\n" +
                "\n" +
                "BloodPop\n" +
                "\n" +
                "I was wonderin' 'bout your mama\n" +
                "Did she get that job she wanted?\n" +
                "Sell that car that gave her problems\n" +
                "I'm just curious 'bout her, honest\n" +
                "\n" +
                "Know your wonderin' why I been callin'\n" +
                "Like I got ulterior motives\n" +
                "Know we didn't end this so good\n" +
                "But you know we had something so good\n" +
                "\n" +
                "So I'm wonderin'\n" +
                "Can we still be friends? (ah-ah)\n" +
                "Can we still be friends? (ah-ah)\n" +
                "Doesn't have to end (ah-ah)\n" +
                "And if it ends\n" +
                "Can we be friends?\n" +
                "\n" +
                "Can we be friends?\n" +
                "Can we be friends?\n" +
                "\n" +
                "Wonderin' if you got a body\n" +
                "To hold you tighter since I left\n" +
                "Wonderin' if you think about me\n" +
                "Actually, don't answer that\n" +
                "\n" +
                "Know your wonderin' why I been callin'\n" +
                "Like I got ulterior motives\n" +
                "Know we didn't end this so good\n" +
                "But you know we had something so good\n" +
                "\n" +
                "So I'm wonderin'\n" +
                "Can we still be friends? (ah-ah)\n" +
                "Can we still be friends? (ah-ah)\n" +
                "Doesn't have to end (ah-ah)\n" +
                "And if it ends\n" +
                "Can we be friends?\n" +
                "\n" +
                "Can we be friends?\n" +
                "\n" +
                "And if it ends\n" +
                "Can we be friends?\n" +
                "\n" +
                "Know your wonderin' why I been callin'\n" +
                "Like I got ulterior motives\n" +
                "Know we didn't end this so good\n" +
                "But you know we had something so good\n" +
                "\n" +
                "I'm wonderin'\n" +
                "Can we still be friends? (ah-ah)\n" +
                "Can we still be friends? (ah-ah)\n" +
                "Doesn't have to end (ah-ah)\n" +
                "And if it ends\n" +
                "Can we be friends?\n" +
                "\n";
        intentactivity(view);
    }
    public void DV(View view)
    {
        Global.lyrics="\"Deja Vu\"\n" +
                "(feat. Justin Bieber)\n" +
                "\n" +
                "[Post Malone:]\n" +
                "Cause I can't take it no more\n" +
                "No you ain't like them bitches\n" +
                "Tell them hoes adios\n" +
                "And you can drop your panties\n" +
                "Leave them shits at the door\n" +
                "Dior falls on the floor\n" +
                "I swear we been here before\n" +
                "\n" +
                "I'm tryna see you from my own perspective\n" +
                "You all in my section tryna come to my session\n" +
                "We runnin' a pressure, you know that we flexin'\n" +
                "We bought all the bottles, we came with the models\n" +
                "Girl this a confession, I'm not like your exes\n" +
                "I came in from Texas, and now that we textin'\n" +
                "You can fly in whenever, now you undressin'\n" +
                "Panties on the dresser, your hair gettin' messed up\n" +
                "The feelin' we catchin', my love is a blessin'\n" +
                "Made love in that Lexus, made love in that Lexus\n" +
                "I know you remember\n" +
                "\n" +
                "[Justin Bieber & Post Malone:]\n" +
                "Tell me is that deja vu?\n" +
                "Cause you want me and I want you\n" +
                "Tell me is that deja vu?\n" +
                "Cause baby it ain't nothing new, no\n" +
                "Tell me is that deja vu?\n" +
                "Cause you want me and I want you\n" +
                "Tell me is that deja vu?\n" +
                "Cause baby this ain't nothing new, no\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Oh you actin' reckless\n" +
                "I told you that I need affection\n" +
                "So let me point you in the right direction\n" +
                "It's so important that you get the message\n" +
                "Yeah, I gotta say, gotta say somethin' to you, you, you\n" +
                "I'm on a roll, I'm gonna roll out in that new, new, new\n" +
                "If you wanna do what I wanna do\n" +
                "Well uhm-uhm-uhm\n" +
                "Well I guess that's just deja vu\n" +
                "\n" +
                "[Justin Bieber & Post Malone:]\n" +
                "Tell me is that deja vu?\n" +
                "Cause you want me and I want you\n" +
                "Tell me is that deja vu?\n" +
                "Cause baby it ain't nothing new, no\n" +
                "Tell me is that deja vu?\n" +
                "Cause you want me and I want you\n" +
                "Tell me is that deja vu?\n" +
                "Cause baby it is ain't nothing new, no\n" +
                "\n" +
                "Tell me if you want it baby\n" +
                "'Cause I know I can drive you crazy\n" +
                "I just wanted you to know now\n" +
                "Oh-oh, oh-ohhh\n" +
                "Show up in that new Mercedes, you already know I'm faded\n" +
                "Girl I've been thinkin' about you lately\n" +
                "Oh-oh, oh-ohhh\n" +
                "\n" +
                "Tell me is that deja vu?\n" +
                "Cause you want me and I want you\n" +
                "Tell me is that deja vu?\n" +
                "Cause baby it ain't nothing new, no\n" +
                "Tell me is that deja vu?\n" +
                "Cause you want me and I want you\n" +
                "Tell me is that deja vu?\n" +
                "Cause baby it is ain't nothing new, no\n" +
                "\n" +
                "[Post Malone:]\n" +
                "Cause I can't take it no more\n" +
                "No you ain't like them bitches\n" +
                "Tell them hoes adios\n" +
                "And you can drop your panties\n" +
                "Leave them shits at the door\n" +
                "Dior falls on the floor\n" +
                "I swear we been here before";
        intentactivity(view);
    }
    public void Dr(View view)
    {
        Global.lyrics="\"Despacito (Remix)\"\n" +
                "(with Daddy Yankee)\n" +
                "(feat. Justin Bieber)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Coming over in my direction\n" +
                "So thankful for that, it's such a blessin', yeah\n" +
                "Turn every situation into Heaven, yeah\n" +
                "Oh, you are my sunrise on the darkest day\n" +
                "Got me feelin' some kind of way\n" +
                "Make me wanna savour every moment slowly, slowly\n" +
                "You fit me tailor-made, love, how you put it on\n" +
                "Got the only key, know how to turn it on\n" +
                "The way you nibble on my ear,\n" +
                "The only words I wanna hear\n" +
                "Baby, take it slow so we can last long\n" +
                "\n" +
                "[Luis Fonsi:]\n" +
                "Oh, tú, tú eres el imán y yo soy el metal\n" +
                "Me voy acercando y voy armando el plan\n" +
                "Sólo con pensarlo se acelera el pulso\n" +
                "\n" +
                "[Daddy Yankee:]\n" +
                "Oh, yeah ya, ya me está gustando más de lo normal\n" +
                "Todos mis sentidos van pidiendo más\n" +
                "Esto hay que tomarlo sin ningún apuro\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Despacito\n" +
                "Quiero respirar tu cuello despacito\n" +
                "Deja que te diga cosas al oído\n" +
                "Para que te acuerdes si no estás conmigo\n" +
                "Despacito\n" +
                "Quiero desnudarte a besos despacito\n" +
                "Firmo en las paredes de tu laberinto\n" +
                "Y hacer de tu cuerpo todo un manuscrito\n" +
                "\n" +
                "[Daddy Yankee:]\n" +
                "Sube, sube, sube\n" +
                "Sube, sube\n" +
                "\n" +
                "[Luis Fonsi (Daddy Yankee):]\n" +
                "Quiero ver bailar tu pelo\n" +
                "Quiero ser tu ritmo\n" +
                "Que le enseñes a mi boca\n" +
                "Tus lugares favoritos\n" +
                "(Favorito, favorito, baby)\n" +
                "Déjame sobrepasar tus zonas de peligro\n" +
                "Hasta provocar tus gritos\n" +
                "Y que olvides tu apellido\n" +
                "\n" +
                "[Daddy Yankee:]\n" +
                "Si te pido un beso, ven, dámelo\n" +
                "Yo sé que estás pensándolo\n" +
                "Llevo tiempo intentándolo\n" +
                "Mami, esto es dando y dándolo\n" +
                "Sabes que tu corazón conmigo te hace bang-bang\n" +
                "Sabes que esa beba está buscando de mi bang-bang\n" +
                "Ven, prueba de mi boca para ver cómo te sabe\n" +
                "Quiero, quiero, quiero ver cuánto amor a ti te cabe\n" +
                "Yo no tengo prisa, yo me quiero dar el viaje\n" +
                "Empecemos lento, después salvaje\n" +
                "\n" +
                "[Daddy Yankee & Justin Bieber:]\n" +
                "Pasito a pasito, suave suavecito\n" +
                "Nos vamos pegando, poquito a poquito\n" +
                "\n" +
                "[Daddy Yankee:]\n" +
                "Cuando tú me besas con esa destreza\n" +
                "Veo que eres malicia con delicadeza\n" +
                "\n" +
                "[Daddy Yankee & Justin Bieber:]\n" +
                "Pasito a pasito, suave suavecito\n" +
                "Nos vamos pegando, poquito a poquito\n" +
                "\n" +
                "[Daddy Yankee:]\n" +
                "Y es que esa belleza es un rompecabezas\n" +
                "Pero pa' montarlo aquí tengo la pieza\n" +
                "¡Oye!\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Despacito\n" +
                "Quiero respirar tu cuello despacito\n" +
                "Deja que te diga cosas al oído\n" +
                "Para que te acuerdes si no estás conmigo\n" +
                "Despacito\n" +
                "Quiero desnudarte a besos despacito\n" +
                "Firmo en las paredes de tu laberinto\n" +
                "Y hacer de tu cuerpo todo un manuscrito\n" +
                "\n" +
                "[Daddy Yankee:]\n" +
                "Sube, sube, sube\n" +
                "Sube, sube\n" +
                "\n" +
                "[Luis Fonsi (Daddy Yankee):]\n" +
                "Quiero ver bailar tu pelo\n" +
                "Quiero ser tu ritmo\n" +
                "Que le enseñes a mi boca\n" +
                "Tus lugares favoritos\n" +
                "(Favorito, favorito, baby)\n" +
                "Déjame sobrepasar tus zonas de peligro\n" +
                "Hasta provocar tus gritos\n" +
                "Y que olvides tu apellido\n" +
                "\n" +
                "[Luis Fonsi:]\n" +
                "Despacito\n" +
                "This is how we do it down in Puerto Rico\n" +
                "I just wanna hear you screaming, \"¡Ay, Bendito!\"\n" +
                "I can move forever cuando esté contigo\n" +
                "¡Bailalo!\n" +
                "\n" +
                "[Daddy Yankee, Luis Fonsi & Justin Bieber:]\n" +
                "Pasito a pasito, suave suavecito\n" +
                "Nos vamos pegando, poquito a poquito\n" +
                "\n" +
                "[Luis Fonsi (Daddy Yankee):]\n" +
                "Que le enseñes a mi boca\n" +
                "Tus lugares favoritos\n" +
                "(Favorito, favorito, baby)\n" +
                "\n" +
                "[Daddy Yankee, Luis Fonsi & Justin Bieber:]\n" +
                "Pasito a pasito, suave suavecito\n" +
                "Nos vamos pegando, poquito a poquito\n" +
                "\n" +
                "[Luis Fonsi:]\n" +
                "Hasta provocar tus gritos (Fonsi)\n" +
                "\n" +
                "[Daddy Yankee:]\n" +
                "Y que olvides tu apellido (D.Y.)\n" +
                "\n" +
                "[Justin Bieber:]\n" +
                "Despacito";
        intentactivity(view);
    }
    public void Fl(View view)
    {
        Global.lyrics="\"Faithful\"\n" +
                "\n" +
                "\n" +
                "I'm close to finishing\n" +
                "I'm closely listening\n" +
                "I'm tryna figure out but this is not as interesting\n" +
                "Should I stay or go?\n" +
                "How do I let her know?\n" +
                "Don't wanna lose control\n" +
                "Think it's time to tell her that I'm moving on (I'm moving on)\n" +
                "I'm moving on\n" +
                "Not tryna make commitments (commitments)\n" +
                "Just tryna make decisions (decisions)\n" +
                "(Chris Brown – Faithful)\n" +
                "\n" +
                "‘Cause I'm faithful\n" +
                "Faithfuuul yeah\n" +
                "‘Cause I'm faithful\n" +
                "I don't want to hurt your heart\n" +
                "But I told you from the start\n" +
                "‘Cause I'm faithfuuul\n" +
                "You know I'm faithfuuul.\n" +
                "\n" +
                "Everyday you're wondering\n" +
                "Asking me who was I with and where I been\n" +
                "Mind no more\n" +
                "‘Cause baby I am leaving\n" +
                "You know that I'm moving on, moving on\n" +
                "I'm moving on, I'm moving on\n" +
                "You made a promise\n" +
                "Girl at least I'm honest.\n" +
                "[Lyrics from: https:/lyrics.az/justin-bieber/-/faithful.html]\n" +
                "\n" +
                "‘Cause I'm faithfuuul\n" +
                "Faithfuuul yeah\n" +
                "‘Cause I'm faithfuuul\n" +
                "I don't want to hurt your heart\n" +
                "But I told you from the start\n" +
                "‘Cause I'm faithfuuul\n" +
                "You know I'm faithfuuul.\n" +
                "\n" +
                "It seems like every day you wanna fight\n" +
                "Why do you think I don't wanna spend the night\n" +
                "You always mess with me\n" +
                "Let me be.\n" +
                "\n" +
                "I'm moving on slowly\n" +
                "I'm moving on, I'm moving on\n" +
                "You made a promise\n" +
                "Girl at least I'm honest\n" +
                "I'm moving on, I'm moving on\n" +
                "I gave you everything I have\n" +
                "I have nothing to give.\n" +
                "\n" +
                "‘Cause I'm faithfuuul (faithfuuul, 'cause I'm faithfuuul)\n" +
                "Faithfuuul yeah\n" +
                "‘Cause I'm faithfuuul\n" +
                "I don't want to hurt your heart\n" +
                "But I told you from the start\n" +
                "‘Cause I'm faithfuuul\n" +
                "You know I'm faithfuuulll.";
    }


    public void intentactivity (View view)
    {

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("me", Global.lyrics);
        startActivity(i);

    }


}
