package com.example.shayriapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(){

    lateinit var taxt : TextView
    lateinit var click: ListView
    var morning = arrayOf("ये कितनी खूबसूरत सुबह है,\n" +
            "इसे यादों से सजाने का जी चाहता है,\n" +
            "इस सुबह की खूबसूरती के साथ,\n" +
            "नए नए दोस्त बनाने का जी चाहता है,\n" +
            "और उन नए नय दोस्तों के साथ,\n" +
            "खुशियां मनाने का जी चाहता है।,\n" ,
        " तेरी हर सुबह इतनी सुहानी हो,\n"+
                "दुखो की सारी बातें पुरानी हो,\n"+
                "तेरे चेहरे पर इतनी मुस्कान हो,\n"+
                " तेरी मुस्कान की दीवानी ये दुनिया सारी हो।","ना किसी के आभाव में जियो,\n" +
                "ना किसी के प्रभाव में जियो,\n" +
                "ज़िन्दगी आपकी है बस अपने, \n" +
                "मस्त स्वभाव में जियो..........!!!\n" +
                "\"सुप्रभात\"\n","सुबह का हर पल ज़िंदगी दे आपको,\n" +
                "दिन का हर लम्हा खुशी दे आपको,\n" +
                "जहा गम की हवा छू कर भी न गुज़रे,\n" +
                "खुदा वो जन्नत से ज़मीन दे आपको.......!!!\n" +
                "\"Good Morning\"\n","ना किसी के आभाव में जियो,\n" +
                "ना किसी के प्रभाव में जियो,\n" +
                "ज़िन्दगी आपकी है बस अपने, \n" +
                "मस्त स्वभाव में जियो..........!!!\n" +
                "\"सुप्रभात\"\n","फूलों ने अमृत का जाम भेजा हैं,\n" +
                "सूरज ने गगन से सलाम भेजा हैं,\n" +
                "मुबारक हो आपको नयी सुबह,\n" +
                "तहे दिल से हमने ये पैगाम भेजा हैं........!!!\n" +
                "\"सुप्रभात\"")

    var attitude = arrayOf("बाप की दौलत पर घमंड कर के क्या मजा,\n" +
            "मजा तो तब है जब दौलत अपनी हो और फक्र बाप करे ! \n","जुबान मेरी कड़वी मगर दिल साफ है,\n" +
            "कौन कब बदला सबका हिसाब है ! \n","कुछ सही तो कुछ खराब कहते हैं,\n" +
            "लोग हमें बिगड़ा हुआ नवाब कहते हैं ! \n","जिनके मिजाज दुनिया से अलग होते हैं,\n" +
            "महफ़िलो में चर्चे उनके गजब होते हैं ! \n","जिन्दगी अपनी है तो,\n" +
            "अंदाज भी अपना ही होगा न ! \n")

    var funny= arrayOf("हम उसके इश्क में\n" +
            "इस कदर चोट खाए हुए हैं,\n" +
            "कल उसके बाप ने मारा था\n" +
            "आज भाई आये हुए हैं।\n" ,
        "\n" +"जो मुश्किल से मिले वो है खुशी,\n" +
                "जो किसी किसी को मिले वो है प्यार,\n" +
                "जो सबको मिले वो है गम,\n" +
                "जो नसीब वालों को मिले वो हैं हम। \n","ये दोस्त हर ख़ुशी तेरी तरफ मोड़ दूं\n" +
                "तेरे लिए चाँद तारे तक तोड़ दूं\n" +
                "खुशियों के दरवाजे तेरे लिए खोल दूं\n" +
                "इतना काफ़ी है या दो-चार झूठ और बोल दूं। \n","कभी रूठ जाऊ तो मना लेना\n" +
                "गुस्से से कहु तो दिल पर मत लेना\n" +
                "कल क्या पता हम रहे या न रहे\n" +
                "इसलिए जब भी में आपको मिलू तो\n" +
                "कभी समोसा तो कभी पानी पूरी खिला देना \n","मेरे दोस्त को देखकर आज\n" +
                "चाँद भी शरमाया हे\n" +
                "लगता हे सारे को फिर से\n" +
                "पागल पन का दौरा आया हे")

    var god= arrayOf("ईश्वर कहते है उदास न हो मैं तेरे साथ हूँ\n" +
            "सामने नहीं आसपास हूँ,\n" +
            "पलकों को बंद कर और दिल से याद कर\n" +
            "मैं कोई ओर नहीं\n" +
            "तेरा विश्वास हूँ…\n","भगवान कहते है –\n" +
            "तू करता वहीं है, जो तू चाहता है\n" +
            "पर होता वहीं है जो मैं चाहता हूँ\n" +
            "तू वो कर जो मैं चाहता हूँ,\n" +
            "फिर देख, होगा वहीं जो तू चाहता है…\n","चिंतन हो सदा इस मन में तेरा,\n" +
            "चरणों में सदा मेरा ध्यान रहे,\n" +
            "चाहे दुख में रहूँ चाहे सुख में रहूँ,\n" +
            "होंठों पे सदा तेरा नाम रहे…!\n","बैरागी बने तो जग छूटे,\n" +
            "सन्यासी बने तो छूटे तन,\n" +
            "कान्हा (कृष्ण) से प्रेम हो जाये\n" +
            "तो छूटे आत्मा के सब बन्धन…\n","वो तो सदा सबका है,\n" +
            "कभी तू भी उसका बन कर देख,\n" +
            "बनेंगे तेरे बिगड़े काम\n" +
            "राम नाम तू जप कर देख।")

    var yaad= arrayOf("मेरी गलती बस यही थी के मैंने हर,\n" +
            "किसी को खुद से ज़्यादा जरुरी समझा।\n","कितना अजीब है लोगों का अंदाज़-ए-मोहब्बत,\n" +
            "रोज़ एक नया ज़ख्म देकर कहते हैं,\n" +
            "अपना ख्याल रखना।\n","फायदा बहुत गिरी हुई चीज है,\n" +
            "लोग उठाते ही रहते हैं।\n","जिसके नसीब मे हों ज़माने की ठोकरें,\n" +
            "उस बदनसीब से ना सहारों की बात कर।\n","")

    var sad= arrayOf("मैं बैठूंगा जरूर महफ़िल में मगर पियूँगा नहीं,\n" +
            "क्योंकि मेरा गम मिटा दे इतनी शराब की औकात नहीं।","ऐ दिल तू क्यों रोता है,\n" +
            "ये दुनिया है यहाँ ऐसा ही होता है !","बड़ी अजीब होती हैं ये यादें,\n" +
            "कभी हंसा देती हैं कभी रुला देती हैं !","अकेले रोना भी क्या खूब कारीगरी है,\n" +
            "सवाल भी खुद के होते है,\n" +
            "और जवाब भी खुद के !","कुछ अजीब सा चल रहा है ये वक्त का सफर,\n" +
            "एक गहरी सी खामोशी है खुद के ही अंदर !","तेरे हर सवाल का जवाब सिर्फ यही है,\n" +
            "हां मैं गलत हूँ और तू सही है !","अजीब हैं मेरा अकेलापन\n" +
            "न तो खुश हूँ न ही उदास हूँ,\n" +
            "बस खाली हूँ और खामोश हूँ !","जिंदगी में कुछ हसीन पल यूंही गुजर जाते हैं\n" +
            "रह जाती हैं यादें और इंसान बिछड़ जाते हैं।")

    var bestwish= arrayOf("कभी खुद पर न करना शक,\n" +
            "मिलेगा वो जो है तेरा हक,\n" +
            "नई शुरुआत के लिए मेरे दोस्त\n" +
            "बेस्ट ऑफ लक।","किस्मत से हार कर कभी झुकना नहीं,\n" +
            "मंजिल से पहले कभी रुकना नहीं।\n" +
            "गुड लक दोस्त","खुदा का हाथ तेरे सिर होगा,\n" +
            "हर मुसीबत का हल होगा।\n" +
            "पल भर को गम की घड़ियां होगी,\n" +
            "फिर खुशियां हर पल होगी।","र महफिल की शान बनेगा,\n" +
            "मेरा दोस्त एक दिन महान बनेगा,\n" +
            "हर गलियारे में होगी चर्चा तेरी,\n" +
            "देखना एक दिन ऐसा इंसान बनेगा।\n" +
            "बेस्ट ऑफ लक","हर मन्नत पूरी हो जाए तुम्हारी,\n" +
            "यही दुआ है खुदा से हमारी।\n" +
            "चढ़ो इतनी कामयाबी की सीढ़ियां,\n" +
            "जितना चढ़ न पाए कोई दोबारा।","तमन्नाओं से भरा हर पल हो,\n" +
            "खुशियों से भरा आने वाला कल हो,\n" +
            "दुःख न छू सके मेरे यार को,\n" +
            "ऐसा उसका हर पल हो।\n" +
            "गुड लक","तू खुद की तकदीर लिखेगा,\n" +
            "जीवन के हर खेल में जीतेगा,\n" +
            "सबसे अलग होगी शोहरत तेरी,\n" +
            "जिसे हर कोई दिखेगा।\n" +
            "गुड लक","कदम रुक जाएं, पर इरादे थकने न देना,\n" +
            "मंजिल की राह से खुद को भटकने न देना।\n" +
            "\n"," चलेगा तभी तो बढ़ेगा,\n" +
            "रुककर अपनी किस्मत से कैसे लड़ेगा।\n" +
            "बेस्ट ऑफ लक","तेरा रास्ता हो आसान,\n" +
            "तू बन जाए अपनों की शान,\n" +
            "हो हर दिन तरक्की तुम्हारी,\n" +
            "यही है मेरे दिल की अरमान।"," चांद-सी रोशन हो किस्मत आपकी,\n" +
            "सितारें भी किया करें इज्जत आपकी,\n" +
            "बुलंदी खुद कदमों की धूल बन जाए,\n" +
            "इतनी ऊंची हो शख्सियत आपकी।")

    var night= arrayOf("हो मुबारक आपको यह सुहानी रात,\n" +
            "मिले ख्वाबो में भी खुदा का साथ,\n" +
            "खुले जब आपकी आँखे तो,\n" +
            "ढेरो खुशियां हो आपके साथ|","रात का चाँद आसमान मे निकल आया है,\n" +
            "साथ मे तारो की बारात लाया है,\n" +
            "ज़रा आसमान की ओर देखो वो आपको,\n" +
            "मेरी ओर से गुड नाईट कहने आया है|","दुखों को कह दो अलविदा,\n" +
            "खुशियों का तुम कर लो साथ,\n" +
            "चाँद की यह चांदनी और तारों की बारात,\n" +
            "लेकर मीठे सपने संग आ गयी है यह रात|","सितारों में अगर नूर न होता,\n" +
            "तन्हा दिल मजबूर न होता,\n" +
            "हम आपको गुड search नाईट कहने ज़रूर आते,\n" +
            "अगर आप का घर दूर न होता|","ऐसा लगता है कुछ होने जा रहा है,\n" +
            "कोई मीठे सपनो में खोने जा रहा है,\n" +
            "धीमी कर दे अपनी रोशनी ऐ चाँद,\n" +
            "मेरा कोई अपना सोने जा रहा है|","चाँद तारो से रात जगमगाने लगी,\n" +
            "फूलों की खुशबू से दुनिया महकने लगी,\n" +
            "सो जाओ रात हो गई है काफी,\n" +
            "निंदिया रानी भी आपको देखने है आने लगी|")

    var birthday= arrayOf("आ तेरी उम्र में लिख दूँ ✨चाँद-सितारों✨ से,\n" +
            "तेरा जन्मदिन मनाऊँ फूलों से बहारों से…\n" +
            "हर एक खूबसूरती दुनिया से मैं ले आउ,\n" +
            "सजाऊ में ये महेफिल हर हसिन नजारों से…\n" +
            "जन्मदिन की ढेर सारी शुभकामनायें…","खुशियों की ऐसी चली है बहार\n" +
            "सबका दिल है आज बेकरार\n" +
            "जिसका था हम सबको इंतेजार\n" +
            "जन्मदिन की बधाई हो हजार बार","दोस्त तू है मेरा सबसे न्यारा,\n" +
            "तुझे मुबारक हो तेरा जन्मदिन ओ यारा…\n" +
            "किसी की कभी नजर ना लगे तुझे,\n" +
            "कभी उदास ना हो ये चहेरा प्यारा  प्यारा…\n" +
            "जन्मदिन की बहोत बहोत शुभकामनायें","एक दुआ  माँगते है हम अपने भगवान से,\n" +
            "चाहते है आपकी खुशी पूरे ईमान से,\n" +
            "सब हसरतें पूरी हो आपकी\n" +
            "और आप मुस्कुराएँ दिलो  जान  से…\n" +
            "*Happy Birthday*")


    var all= arrayOf("खिलाफ कितने हैं ये मुद्दा नहीं\n" +
            "बस साथ कितने हैं ये जरूरी हैं|","सिर्फ हम हैं उनके दिल में,\n" +
            "ले डूबी ये गलतफहमी हमको।","एक तुम ही काफी थे\n" +
            "उम्र सारी गुजारने को","दुनिया एसी ही रीत है यहां मजबूत से\n" +
            "मजबूत लोहा टूट जाता है\n" +
            "कई झूठे इकट्ठे हो तो सच्चा टूट जाता है|","तुम्हारे चेहरे पर, ये जो मुस्कान है\n" +
            "क्या कहें यही तो हमारी जान है।")

    var kite= arrayOf("कटी पतंग सी हो गयी है ज़िंदगी\n" +
            "हर कोई लूटना चाहता है बस|","उम्मीदों के धागे, ख्वाहिशों की पतंग\n" +
            "सब जला दी हमने कल रात अंगीठी में|","प्रेम की पतंग उड़ाना, नफरत की पेच काटना\n" +
            "मांझे जितना लंबा रिश्ता बढ़ाना, दिल से इसे निभाना|")

    var divali= arrayOf("दीयों की रौशनी से झिलमिलाता आँगन हो,\n" +
            "\n" +
            "पटाखों की गुंजों से रोशन आसमान हो,\n" +
            "\n" +
            "ऐसी आये झूमती गाती यह दिवाली,\n" +
            "\n" +
            "हर तरफ खुशियों ही खुशियों का मौसम|","घर मे धन की वर्षा हो\n" +
            "\n" +
            "दीपो से चमकती शाम आए\n" +
            "\n" +
            "सफलता मिले हर काम मे तुम्हे\n" +
            "\n" +
            "खुशियो का सदा पैगाम आए !","लक्ष्मी जी के आँगन मे है\n" +
            "\n" +
            "सबने दीपो की माला सजाई\n" +
            "\n" +
            "दिवाली के इस पावन अवसर पर आपको कोटी कोटी बधाई|","पूजा की थाली रसोई मे पकवान\n" +
            "\n" +
            "आँगन मे दिया खुशिया हो तमाम\n" +
            "\n" +
            
            "हाथो मे फुलझारिया रोशन हो जहा\n" +
            "\n" +
            "मुबारक हो आपको दीवाली मेरी जान !\n" +
            "\n" +
            "दीवाली मुबारक हो !","सुख के दीप जले घर आंगन में\n" +
            "\n" +
            "खुशहाली हो बड़ों का आशीर्वाद\n" +
            "\n" +
            "और अपनो का प्यार मिले ऐसी\n" +
            "\n" +
            "आपकी मंगल दिवाली हो।\n" +
            "\n" +
            "दीपावली की बहुत-बहुत बधाई !","पल पल सुनहरे फूल खिले\n" +
            "\n" +
            "कभी न हो कांटो का सामना\n" +
            "\n" +
            "जिंदगी आपकी खुशियो से भरी रहे\n" +
            "\n" +
            "दीपावली पर हमारी यही शुभकामना|")

    var line2= arrayOf("जब हाथ आसमां तक नहीं पहुँचते,\n" +
            "मैं पैर बुज़ुर्गों के छुं लेता हूं|","चर्चाओं में रहने का हमें कोई शौक नहीं ..\n" +
            "लेकिन हमारी हर बात के चर्चे हैं तो हम क्या करें....","घाटे और मुनाफे का बाजार नहीं है\n" +
            "\n" +
            "इश्क इबादत है कारोबार नहीं है|","\"हर ख्वाहिश हर ख्वाब हर अरमान पुरे कहा होते है\"\n" +
            "\n" +
            "\"जो हमारे लिए जरुरी है हम उनके लिए जरुरी कहा होते है\"","हर मैदान में बेखौफ लड़ो,\n" +
            "\n" +
            "वक्त से पहले मौत नहीं आने वाली !!","बात अगर आत्मसम्मान पर आएगी तो जान से प्यारी चीज भी छोड़ दी जायेगी","बात अगर आत्मसम्मान पर आएगी तो जान से प्यारी चीज भी छोड़ दी जायेगी|")

    var motivational= arrayOf("काम करो ऐसा कि एक पहचान बन जाए,\n" +
            "हर कदम ऐसा चलो कि निशान बन जाए,\n" +
            "यहां जिंदगी तो हर कोई काट लेता है,\n" +
            "जिंदगी जियो इस कदर कि मिसाल बन जाए।","लक्ष्य को पाने के लिए यदि हम तन, मन और धन लगा देते हैं,\n" +
            "सच कहता हूं दोस्तों, कुंडली के सितारे भी अपनी जगह बदल देते हैं।","वक्त से लड़कर जो नसीब बदल दे,\n" +
            "इंसान वही जो अपनी तकदीर बदल दे,\n" +
            "कल क्या होगा कभी मत सोचो,\n" +
            "क्या पता कल वक्त खुद अपनी तस्वीर बदल ले।","हवाओं के भरोसे मत उड़,\n" +
            "चट्टाने तूफानों का भी रुख मोड़ देती हैं,\n" +
            "अपने पंखों पर भरोसा रख,\n" +
            "हवाओं के भरोसे तो पतंगे उड़ा करती हैं।","बेहतर से बेहतर कि तलाश करो,\n" +
            "मिल जाए नदी तो समंदर कि तलाश करो,\n" +
            "टूट जाता है शीशा पत्थर कि चोट से,\n" +
            "टूट जाए पत्थर ऐसा शीशा तलाश करो।")

    var other= arrayOf("उजाले अपनी यादों के हमारे साथ रहने दो \n" +
            "\n" +
            "न जाने किस गली में ज़िंदगी की शाम हो जाए ","और भी दुख हैं ज़माने में मोहब्बत के सिवा \n" +
            "\n" +
            "राहतें और भी हैं वस्ल की राहत के सिवा ","दिल ना-उमीद तो नहीं नाकाम ही तो है \n" +
            "\n" +
            "लम्बी है ग़म की शाम मगर शाम ही तो है|","हम को मालूम है जन्नत की हक़ीक़त लेकिन \n" +
            "\n" +
            "दिल के ख़ुश रखने को 'ग़ालिब' ये ख़याल अच्छा है| ","कर रहा था ग़म-ए-जहाँ का हिसाब \n" +
            "\n" +
            "आज तुम याद बे-हिसाब आए| ","ख़ुदी को कर बुलंद इतना कि हर तक़दीर से पहले \n" +
            "\n" +
            "ख़ुदा बंदे से ख़ुद पूछे बता तेरी रज़ा क्या है |")

    var royal= arrayOf("आज नही तो कल तू भी\n" +
            "हमारे नाम का दीवाना होगा.।","जहाँ से तेरी बदमाशी ख़तम होती हैं,\n" +
            "वह से मेरी नवाबी शुरू होती हैं….!!","मशहूर होने का शौक नही है..।\n" +
            "बस कुछ लोगो का गुरुर तोड़ना है..","नाम नही लूंगा.\n" +
            "लेकिन बदला जरूर लूंगा..।","हम जरा खामोश क्या हुए..\n" +
            "नादान कुत्ते भी शोर मचाने\n" +
            "लगे..!","अकेला खड़े रहने का साहस रखो\n" +
            "दुनियां ज्ञान देती हैं साथ नही !","हथ्यार तो हम शोक के लिए रखते है,\n" +
            "खौफ के लिए तो हमारा नाम की काफी है..!","रुतबा कम है मगर लाजवाब है\n" +
            "मेरा जो हर किसी के दर पर दस्तक\n" +
            "दे वो किरदार नहीं है मेरा.।।","हिम्मत इतनी बड़ी रखो\n" +
            "कि किस्मत छोटी लगने लगे।।")

    var janmastami= arrayOf("गोकुल में है जिनका वास, गोपियों संग रचाए जो रास\n" +
            "देवकी यसोदा जिनकी मैया, ऐसे है हमारे कृष्ण कन्हैया\n" +
            "“कृष्ण जन्माष्टमी की हार्दिक शुभकामनाएं”\n" +
            "\n","गोकुल में है जिनका वास, गोपियों संग रचाए जो रास\n" +
            "देवकी यसोदा जिनकी मैया, ऐसे है हमारे कृष्ण कन्हैया\n" +
            "“कृष्ण जन्माष्टमी की हार्दिक शुभकामनाएं”\n" +
            "\n","कन्हिया की महिमा , कन्हिया का प्यार ,\n" +
            "’कन्हिया में श्रद्धा , कन्हिया से संसार ,\n" +
            "मुबारक हो आपको जन्माष्टमी का त्यौहार।\n" +
            "बोलो राधे राधे श्रीकृष्ण","चंदन की ख़ुशबू को रेशम का हार,\n" +
            "सावन की सुगंध और बारिश की फुहार,\n" +
            "राधा की उम्मीद को कन्हैया का प्यार,\n" ,"\n" +
            "जो है माखन चोर, जो है मुरली वाला,\n" +
            "वही है हम सबके दुःख दूर करने वाला।।","\n" +
            "कृष्णा का नाम लो सहारा मिलेगा,\n" +
            "यह जीवन ना तुमको दोबारा मिलेगा।।")

    var independence= arrayOf("दे सलामी इस तिरंगे को,\n" +
            "जिससे तेरी शान है,\n" +
            "सर हमेशा ऊंचा रखना इसका,\n" +
            "जब तक दिल में जान है।","लो फिर से वो नजारा याद कर लें\n" +
            "शहीदों के दिल में थी जो ज्वाला वो याद कर लें\n" +
            "जिसमें बहकर आजादी पहुंची थी किनारे पर\n" +
            "बलिदानियों के खून की वो धारा याद कर लें!","जहा इंसानियत को पहला दर्जा दिया जाता है\n" +
            "वही मेरा देश हिंदुस्तान है।","दुश्मन की गोलियों का सामना हम करेंगे\n" +
            "आजाद हैं आजाद ही रहेंगे !","क्या हिन्दू, क्या मुस्लिम, क्या सिख और क्या ईसाई,\n" +
            "आओ मिलकर आजादी का पर्व मनाएं,\n" +
            "क्योंकि, हम सब हैं भाई-भाई।","मैंने ढूंढा बहुत वो जहां ना मिला,\n" +
            "मेरे वतन जैसी ना जमीं,\n" +
            "ना कोई आसमां मिला!","न पूछो जमाने को\n" +
            "क्या हमारी कहानी है\n" +
            "हमारी पहचान तो सिर्फ ये हैं\n" +
            "की हम सिर्फ हिंदुस्तानी हैं !")

    var holi= arrayOf("\"दुनिया के रंगों पर मत नाचो, अपने रंग पर दुनिया को नचाओ। ","\"हवा में गुलाल है, चारों ओर कमाल है, खुशियाँ हैं उड़ रहीं, यह होली का धमाल है। ","\"महक रही है चारों ओर खुशियाँ, हवा ये हमसे आ कर बोली है, रंग लगाओ गालों पर धीरे से, बुरा ना मानो होली है।")

    var valentine= arrayOf("एक बार मुस्कुरा के कह दो हमसे प्यार है तुमको,\n" +
            "एक बार ये बता दो कि हमारा इन्तजार है तुमको,\n" +
            "जिन्दगी भर करेंगे आपसे ही हम उल्फत बस,\n" +
            "कहो कि हमारी इस बात का ऐतबार है तुमको।","यूं हर पल सताया न कीजिए,\n" +
            "यूं हमारे दिल को तड़पाया न कीजिए,\n" +
            "क्या पता कल हम हों न हों इस जहां में,\n" +
            "यूं नजर हमसे आप चुराया न कीजिए।","मेरे चेहरे की हंसी हो तुम,\n" +
            "मेरे दिल की हर खुशी हो तुम,\n" +
            "मेरे होठों की मुस्कान हो तुम,\n" +
            "धड़कता है मेरा ये दिल जिसके लिए,\n" +
            "वही मेरी जान हो तुम।",
        "हमनें सुना है की इश्क इतना मत करो,\n" +
                "कि हुस्न सर पे सवार हो जाए,\n" +
                "मैं कहता हूं कि ऐ मेरे दोस्त,\n" +
                "इश्क इतना कर कि पत्थर\n" +
                "दिल को भी तुझसे प्यार हो जाए।\n" ,
        "कभी हंसाता है ये प्यार,\n" +
                "कभी रुलाता है ये प्यार,\n" +
                "हर पल की याद दिलाता है ये प्यार,\n" +
                "चाहो या ना चाहो पर आपके होने का\n" +
                "एहसास दिलाता है ये प्यार।")

    var republic= arrayOf("वतन हमारा ऐसा कोई न छोड़ पाये\n" +
            "रिश्ता हमारा ऐसा कोई न तोड़ पाये\n" +
            "दिल एक है एक है जान हमारी\n" +
            "हिंदुस्तान हमारा है हम इसकी शान है","ना सर झुका है कभी और ना झुकायेंगे कभी,\n" +
            "\n" +
            "जो अपने दम पे जियें सच में ज़िन्दगी है वही.","आन देश की शान देश की देश की हम संतान है\n" +
            "तीन रंगों से रंगा तिरंगा अपनी ये पहेचान है","देश भक्तो के बलिदान से ,\n" +
            "स्वतनत्र हुए है हम ..\n" +
            "कोई पूछे कौन हो ,\n" +
            "तो गर्व से कहेंगे .\n" +
            "भारतीय है हम …")

    var ganesh= arrayOf("हर शुभ काम में सबसे पहले पूजा आपकी,\n" +
            "हे भगवान् गणेश, करो ऐसी कृपा नित\n" +
            "पूजा करू मैं आपकी.","गणेश जी का रूप निराला हैं,\n" +
            "चेहरा कितना भोला भाला हैं,\n" +
            "जिसे भी आती हैं कोई मुसीबत\n" +
            "उसे इन्ही ने तो संभाला हैं .","भगवान् गणेश की ज्योति से नूर मिलता हैं,\n" +
            "सबके दिलो को सुरूर मिलता हैं,\n" +
            "जो भी जाता हैं गणेश के द्वार\n" +
            "कुछ ना कुछ जरूर मिलता हैं.","आते हैं बड़े धूम से गणपति जी,\n" +
            "जाते हैं बड़े घूम से गणपति जी,\n" +
            "आख़िर सबसे पहले आकर ,\n" +
            "हमारे दिलो में बस जाते हैं गणपति जी.","रिद्धि सिद्धि को लेकर आओ\n" +
            "हे मंगलकर्ता मेरे द्वार\n" +
            "भेज रहा हूँ प्रथम निमंत्रण\n" +
            "सहर्ष करो स्वीकार ।।")

    var navratri= arrayOf("हे माँ तुमसे विश्वास ना उठने देना, तेरी दुनिया में भय से जब सिमट जाऊं, चारो ओर अँधेरा ही अँधेरा घना पाऊं, बन के रोशनी तुम राह दिखा देना..!\n" +
            "\n" ,"लाल रंग की चुनरी से सजा माँ का दरबार, हर्षित हुआ मन, पुलकित हुआ संसार, नन्हें-नन्हें क़दमों से माँ आए आपके द्वार….. इस नवरात्रि यही हैं हमारी दुआ…\n" +
            "\n" )

    var blank = arrayOf<String>("")
   lateinit var arrow:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        taxt=findViewById(R.id.taxt)
        click=findViewById(R.id.click)
        arrow=findViewById(R.id.arrow)

        var position=intent.getStringExtra("m1")

        taxt.setText(position)


        if (position.equals("Morning Shayri")){
            blank=morning
        }else if(position.equals("Attitude Shayri")){
            blank=attitude
        }else if(position.equals("Funny Shayri")){
            blank=funny
        }else if(position.equals("God Shayri")){
            blank=god
        }else if(position.equals("Yaad Shayri")){
            blank=yaad
        }else if(position.equals("Sad Shayri")){
            blank=sad
        }else if (position.equals("Best Wishes")){
            blank=bestwish
        }else if(position.equals("Night Shayri")){
            blank=night
        }else if(position.equals("Brithday Shayri")){
            blank=birthday
        } else if(position.equals("All In One")){
            blank=all
        }else if(position.equals("Kite Shayri")){
            blank=kite
        }else if (position.equals("Diwali Shayri")){
            blank=divali
        }else if(position.equals("2 Line Shayri")){
            blank=line2
        }else if(position.equals("Motivational Shayri")){
            blank=motivational
        }else if(position.equals("Other Shayri")){
            blank=other
        }else if(position.equals("Royal Shayri")){
            blank=royal
        }else if(position.equals("Janmashtami Shayri")){
            blank=janmastami
        }else if(position.equals("Indepandence Shayri")){
            blank=independence
        }else if(position.equals("Holi Shayri")){
            blank=holi
        }else if(position.equals("Valentine Shayri")){
            blank=valentine
        }else if(position.equals("Republic Shayri")){
            blank=republic
        }else if(position.equals("Ganesha Shayri")){
            blank=ganesh
        }else if (position.equals("Navratri Shayri")){
            blank=navratri
        }

        var adapter = Class2(this,blank)

        click.adapter=adapter

        click.setOnItemClickListener { parent, view, pos, idd ->
            var secondveiw= Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(secondveiw.putExtra("m2",blank[pos]).putExtra("blank",blank).putExtra("pos",pos))
        }
        arrow.setOnClickListener {
            // Redirect to the Start/Home page
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

    }
}

