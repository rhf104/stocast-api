package stocast.api.util;

import java.util.Arrays;
import java.util.List;

public abstract class Corpora {

    private static final String THE_PICTURE_OF_DORIAN_GRAY;

    static {
        THE_PICTURE_OF_DORIAN_GRAY = "It was long past noon when he awoke. His valet had crept several times\n" +
                "on tiptoe into the room to see if he was stirring, and had wondered what\n" +
                "made his young master sleep so late. Finally his bell sounded, and\n" +
                "Victor came softly in with a cup of tea, and a pile of letters, on a\n" +
                "small tray of old Sèvres china, and drew back the olive-satin curtains,\n" +
                "with their shimmering blue lining, that hung in front of the three tall\n" +
                "windows.\n" +
                "\n" +
                "\"Monsieur has well slept this morning,\" he said, smiling.\n" +
                "\n" +
                "\"What o'clock is it, Victor?\" asked Dorian Gray, drowsily.\n" +
                "\n" +
                "\"One hour and a quarter, Monsieur.\"\n" +
                "\n" +
                "How late it was! He sat up, and, having sipped some tea, turned over his\n" +
                "letters. One of them was from Lord Henry, and had been brought by hand\n" +
                "that morning. He hesitated for a moment, and then put it aside. The\n" +
                "others he opened listlessly. They contained the usual collection of\n" +
                "cards, invitations to dinner, tickets for private views, programmes of\n" +
                "charity concerts, and the like, that are showered on fashionable young\n" +
                "men every morning during the season. There was a rather heavy bill, for\n" +
                "a chased silver Louis-Quinze toilet-set, that he had not yet had the\n" +
                "courage to send on to his guardians, who were extremely old-fashioned\n" +
                "people and did not realise that we live in an age when unnecessary\n" +
                "things are our only necessities; and there were several very courteously\n" +
                "worded communiations from Jermyn Street money-lenders offering to\n" +
                "advance any sum of money at a moment's notice and at the most reasonable\n" +
                "rates of interest.\n" +
                "\n" +
                "After about ten minutes he got up, and, throwing on an elaborate\n" +
                "dressing-gown of silk-embroidered cashmere wool, passed into the\n" +
                "onyx-paved bathroom. The cool water refreshed him after his long sleep.\n" +
                "He seemed to have forgotten all that he had gone through. A dim sense of\n" +
                "having taken part in some strange tragedy came to him once or twice, but\n" +
                "there was the unreality of a dream about it.\n" +
                "\n" +
                "As soon as he was dressed, he went into the library and sat down to a\n" +
                "light French breakfast, that had been laid out for him on a small round\n" +
                "table close to the open window. It was an exquisite day. The warm air\n" +
                "seemed laden with spices. A bee flew in, and buzzed round the\n" +
                "blue-dragon bowl that, filled with sulphur-yellow roses, stood before\n" +
                "him. He felt perfectly happy.\n" +
                "\n" +
                "Suddenly his eye fell on the screen that he had placed in front of the\n" +
                "portrait, and he started.\n" +
                "\n" +
                "\"Too cold for Monsieur?\" asked his valet, putting an omelette on the\n" +
                "table. \"I shut the window?\"\n" +
                "\n" +
                "Dorian shook his head. \"I am not cold,\" he murmured.\n" +
                "\n" +
                "Was it all true? Had the portrait really changed? Or had it been simply\n" +
                "his own imagination that had made him see a look of evil where there had\n" +
                "been a look of joy? Surely a painted canvas could not alter? The thing\n" +
                "was absurd. It would serve as a tale to tell Basil some day. It would\n" +
                "make him smile.\n" +
                "\n" +
                "And, yet, how vivid was his recollection of the whole thing! First in\n" +
                "the dim twilight, and then in the bright dawn, he had seen the touch of\n" +
                "cruelty round the warped lips. He almost dreaded his valet leaving the\n" +
                "room. He knew that when he was alone he would have to examine the\n" +
                "portrait. He was afraid of certainty. When the coffee and cigarettes\n" +
                "had been brought and the man turned to go, he felt a wild desire to tell\n" +
                "him to remain. As the door was closing behind him he called him back.\n" +
                "The man stood waiting for his orders. Dorian looked at him for a moment.\n" +
                "\"I am not at home to anyone, Victor,\" he said, with a sigh. The man\n" +
                "bowed and retired.\n" +
                "\n" +
                "Then he rose from the table, lit a cigarette, and flung himself down on\n" +
                "a luxuriously-cushioned couch that stood facing the screen. The screen\n" +
                "was an old one, of gilt Spanish leather, stamped and wrought with a\n" +
                "rather florid Louis-Quatorze pattern. He scanned it curiously, wondering\n" +
                "if ever before it had concealed the secret of a man's life.\n" +
                "\n" +
                "Should he move it aside, after all? Why not let it stay there? What was\n" +
                "the use of knowing? If the thing was true, it was terrible. If it was\n" +
                "not true, why trouble about it? But what if, by some fate or deadlier\n" +
                "chance, eyes other than his spied behind, and saw the horrible change?\n" +
                "What should he do if Basil Hallward came and asked to look at his own\n" +
                "picture? Basil would be sure to do that. No; the thing had to be\n" +
                "examined, and at once. Anything would be better than this dreadful state\n" +
                "of doubt.\n" +
                "\n" +
                "He got up, and locked both doors. At least he would be alone when he\n" +
                "looked upon the mask of his shame. Then he drew the screen aside, and\n" +
                "saw himself face to face. It was perfectly true. The portrait had\n" +
                "altered.\n" +
                "\n" +
                "As he often remembered afterwards, and always with no small wonder, he\n" +
                "found himself at first gazing at the portrait with a feeling of almost\n" +
                "scientific interest. That such a change should have taken place was\n" +
                "incredible to him. And yet it was a fact. Was there some subtle affinity\n" +
                "between the chemical atoms, that shaped themselves into form and colour\n" +
                "on the canvas, and the soul that was within him? Could it be that what\n" +
                "that soul thought, they realized?--that what it dreamed, they made true?\n" +
                "Or was there some other, more terrible reason? He shuddered, and felt\n" +
                "afraid, and, going back to the couch, lay there, gazing at the picture\n" +
                "in sickened horror.\n" +
                "\n" +
                "One thing, however, he felt that it had done for him. It had made him\n" +
                "conscious how unjust, how cruel, he had been to Sibyl Vane. It was not\n" +
                "too late to make reparation for that. She could still be his wife. His\n" +
                "unreal and selfish love would yield to some higher influence, would be\n" +
                "transformed into some nobler passion, and the portrait that Basil\n" +
                "Hallward had painted of him would be a guide to him through life, would\n" +
                "be to him what holiness is to some, and conscience to others, and the\n" +
                "fear of God to us all. There were opiates for remorse, drugs that could\n" +
                "lull the moral sense to sleep. But here was a visible symbol of the\n" +
                "degradation of sin. Here was an ever-present sign of the ruin men\n" +
                "brought upon their souls.\n" +
                "\n" +
                "Three o'clock struck, and four, and the half-hour rang its double chime,\n" +
                "but Dorian Gray did not stir. He was trying to gather up the scarlet\n" +
                "threads of life, and to weave them into a pattern; to find his way\n" +
                "through the sanguine labyrinth of passion through which he was\n" +
                "wandering. He did not know what to do, or what to think. Finally, he\n" +
                "went over to the table, and wrote a passionate letter to the girl he had\n" +
                "loved, imploring her forgiveness, and accusing himself of madness. He\n" +
                "covered page after page with wild words of sorrow, and wilder words of\n" +
                "pain. There is a luxury in self-reproach. When we blame ourselves we\n" +
                "feel that no one else has a right to blame us. It is the confession, not\n" +
                "the priest, that gives us absolution. When Dorian had finished the\n" +
                "letter, he felt that he had been forgiven.\n" +
                "\n" +
                "Suddenly there came a knock to the door, and he heard Lord Henry's voice\n" +
                "outside. \"My dear boy, I must see you. Let me in at once. I can't bear\n" +
                "your shutting yourself up like this.\"\n" +
                "\n" +
                "He made no answer at first, but remained quite still. The knocking\n" +
                "still continued, and grew louder. Yes, it was better to let Lord Henry\n" +
                "in, and to explain to him the new life he was going to lead, to quarrel\n" +
                "with him if it became necessary to quarrel, to part if parting was\n" +
                "inevitable. He jumped up, drew the screen hastily across the picture,\n" +
                "and unlocked the door.\n" +
                "\n" +
                "\"I am so sorry for it all, Dorian,\" said Lord Henry, as he entered. \"But\n" +
                "you must not think too much about it.\"\n" +
                "\n" +
                "\"Do you mean about Sibyl Vane?\" asked the lad.\n" +
                "\n" +
                "\"Yes, of course,\" answered Lord Henry, sinking into a chair, and slowly\n" +
                "pulling off his yellow gloves. \"It is dreadful, from one point of view,\n" +
                "but it was not your fault. Tell me, did you go behind and see her, after\n" +
                "the play was over?\"\n" +
                "\n" +
                "\"Yes.\"\n" +
                "\n" +
                "\"I felt sure you had. Did you make a scene with her?\"\n" +
                "\n" +
                "\"I was brutal, Harry--perfectly brutal. But it is all right now. I am\n" +
                "not sorry for anything that has happened. It has taught me to know\n" +
                "myself better.\"\n" +
                "\n" +
                "\"Ah, Dorian, I am so glad you take it in that way! I was afraid I would\n" +
                "find you plunged in remorse, and tearing that nice curly hair of yours.\"\n" +
                "\n" +
                "\"I have got through all that,\" said Dorian, shaking his head, and\n" +
                "smiling. \"I am perfectly happy now. I know what conscience is, to begin\n" +
                "with. It is not what you told me it was. It is the divinest thing in us.\n" +
                "Don't sneer at it, Harry, any more--at least not before me. I want to be\n" +
                "good. I can't bear the idea of my soul being hideous.\"\n" +
                "\n" +
                "\"A very charming artistic basis for ethics, Dorian! I congratulate you\n" +
                "on it. But how are you going to begin?\"\n" +
                "\n" +
                "\"By marrying Sibyl Vane.\"\n" +
                "\n" +
                "\"Marrying Sibyl Vane!\" cried Lord Henry, standing up, and looking at him\n" +
                "in perplexed amazement. \"But, my dear Dorian----\"\n" +
                "\n" +
                "\"Yes, Harry, I know what you are going to say. Something dreadful about\n" +
                "marriage. Don't say it. Don't ever say things of that kind to me again.\n" +
                "Two days ago I asked Sibyl to marry me. I am not going to break my word\n" +
                "to her. She is to be my wife!\"\n" +
                "\n" +
                "\"Your wife! Dorian!... Didn't you get my letter? I wrote to you this\n" +
                "morning, and sent the note down, by my own man.\"\n" +
                "\n" +
                "\"Your letter? Oh, yes, I remember. I have not read it yet, Harry. I was\n" +
                "afraid there might be something in it that I wouldn't like. You cut life\n" +
                "to pieces with your epigrams.\"\n" +
                "\n" +
                "\"You know nothing then?\"\n" +
                "\n" +
                "\"What do you mean?\"\n" +
                "\n" +
                "Lord Henry walked across the room, and, sitting down by Dorian Gray,\n" +
                "took both his hands in his own, and held them tightly. \"Dorian,\" he\n" +
                "said, \"my letter--don't be frightened--was to tell you that Sibyl Vane\n" +
                "is dead.\"\n" +
                "\n" +
                "A cry of pain broke from the lad's lips, and he leaped to his feet,\n" +
                "tearing his hands away from Lord Henry's grasp. \"Dead! Sibyl dead! It is\n" +
                "not true! It is a horrible lie! How dare you say it?\"\n" +
                "\n" +
                "\"It is quite true, Dorian,\" said Lord Henry, gravely. \"It is in all the\n" +
                "morning papers. I wrote down to you to ask you not to see anyone till I\n" +
                "came. There will have to be an inquest, of course, and you must not be\n" +
                "mixed up in it. Things like that make a man fashionable in Paris. But in\n" +
                "London people are so prejudiced. Here, one should never make one's\n" +
                "_début_ with a scandal. One should reserve that to give an interest to\n" +
                "one's old age. I suppose they don't know your name at the theatre? If\n" +
                "they don't, it is all right. Did anyone see you going round to her room?\n" +
                "That is an important point.\"\n" +
                "\n" +
                "Dorian did not answer for a few moments. He was dazed with horror.\n" +
                "Finally he stammered in a stifled voice, \"Harry, did you say an\n" +
                "inquest? What did you mean by that? Did Sibyl----? Oh, Harry, I can't\n" +
                "bear it! But be quick. Tell me everything at once.\"\n" +
                "\n" +
                "\"I have no doubt it was not an accident, Dorian, though it must be put\n" +
                "in that way to the public. It seems that as she was leaving the theatre\n" +
                "with her mother, about half-past twelve or so, she said she had\n" +
                "forgotten something upstairs. They waited some time for her, but she did\n" +
                "not come down again. They ultimately found her lying dead on the floor\n" +
                "of her dressing-room. She had swallowed something by mistake, some\n" +
                "dreadful thing they use at theatres. I don't know what it was, but it\n" +
                "had either prussic acid or white lead in it. I should fancy it was\n" +
                "prussic acid, as she seems to have died instantaneously.\"\n" +
                "\n" +
                "\"Harry, Harry, it is terrible!\" cried the lad.\n" +
                "\n" +
                "\"Yes; it is very tragic, of course, but you must not get yourself mixed\n" +
                "up in it. I see by _The Standard_ that she was seventeen. I should have\n" +
                "thought she was almost younger than that. She looked such a child, and\n" +
                "seemed to know so little about acting. Dorian, you mustn't let this\n" +
                "thing get on your nerves. You must come and dine with me, and afterwards\n" +
                "we will look in at the Opera. It is a Patti night, and everybody will be\n" +
                "there. You can come to my sister's box. She has got some smart women\n" +
                "with her.\"\n" +
                "\n" +
                "\"So I have murdered Sibyl Vane,\" said Dorian Gray, half to\n" +
                "himself--\"murdered her as surely as if I had cut her little throat with\n" +
                "a knife. Yet the roses are not less lovely for all that. The birds sing\n" +
                "just as happily in my garden. And to-night I am to dine with you, and\n" +
                "then go on to the Opera, and sup somewhere, I suppose, afterwards. How\n" +
                "extraordinarily dramatic life is! If I had read all this in a book,\n" +
                "Harry, I think I would have wept over it. Somehow, now that it has\n" +
                "happened actually, and to me, it seems far too wonderful for tears. Here\n" +
                "is the first passionate love-letter I have ever written in my life.\n" +
                "Strange, that my first passionate love-letter should have been addressed\n" +
                "to a dead girl. Can they feel, I wonder, those white silent people we\n" +
                "call the dead? Sibyl! Can she feel, or know, or listen? Oh, Harry, how I\n" +
                "loved her once! It seems years ago to me now. She was everything to me.\n" +
                "Then came that dreadful night--was it really only last night?--when she\n" +
                "played so badly, and my heart almost broke. She explained it all to me.\n" +
                "It was terribly pathetic. But I was not moved a bit. I thought her\n" +
                "shallow. Suddenly something happened that made me afraid. I can't tell\n" +
                "you what it was, but it was terrible. I said I would go back to her. I\n" +
                "felt I had done wrong. And now she is dead. My God! my God! Harry, what\n" +
                "shall I do? You don't know the danger I am in, and there is nothing to\n" +
                "keep me straight. She would have done that for me. She had no right to\n" +
                "kill herself. It was selfish of her.\"\n" +
                "\n" +
                "\"My dear Dorian,\" answered Lord Henry, taking a cigarette from his case,\n" +
                "and producing a gold-latten matchbox, \"the only way a woman can ever\n" +
                "reform a man is by boring him so completely that he loses all possible\n" +
                "interest in life. If you had married this girl you would have been\n" +
                "wretched. Of course you would have treated her kindly. One can always be\n" +
                "kind to people about whom one cares nothing. But she would have soon\n" +
                "found out that you were absolutely indifferent to her. And when a woman\n" +
                "finds that out about her husband, she either becomes dreadfully dowdy,\n" +
                "or wears very smart bonnets that some other woman's husband has to pay\n" +
                "for. I say nothing about the social mistake, which would have been\n" +
                "abject, which, of course, I would not have allowed, but I assure you\n" +
                "that in any case the whole thing would have been an absolute failure.\"\n" +
                "\n" +
                "\"I suppose it would,\" muttered the lad, walking up and down the room,\n" +
                "and looking horribly pale. \"But I thought it was my duty. It is not my\n" +
                "fault that this terrible tragedy has prevented my doing what was right.\n" +
                "I remember your saying once that there is a fatality about good\n" +
                "resolutions--that they are always made too late. Mine certainly were.\"\n" +
                "\n" +
                "\"Good resolutions are useless attempts to interfere with scientific\n" +
                "laws. Their origin is pure vanity. Their result is absolutely _nil_.\n" +
                "They give us, now and then, some of those luxurious sterile emotions\n" +
                "that have a certain charm for the weak. That is all that can be said for\n" +
                "them. They are simply cheques that men draw on a bank where they have no\n" +
                "account.\"\n" +
                "\n" +
                "\"Harry,\" cried Dorian Gray, coming over and sitting down beside him,\n" +
                "\"why is it that I cannot feel this tragedy as much as I want to? I don't\n" +
                "think I am heartless. Do you?\"\n" +
                "\n" +
                "\"You have done too many foolish things during the last fortnight to be\n" +
                "entitled to give yourself that name, Dorian,\" answered Lord Henry, with\n" +
                "his sweet, melancholy smile.\n" +
                "\n" +
                "The lad frowned. \"I don't like that explanation, Harry,\" he rejoined,\n" +
                "\"but I am glad you don't think I am heartless. I am nothing of the kind.\n" +
                "I know I am not. And yet I must admit that this thing that has happened\n" +
                "does not affect me as it should. It seems to me to be simply like a\n" +
                "wonderful ending to a wonderful play. It has all the terrible beauty of\n" +
                "a Greek tragedy, a tragedy in which I took a great part, but by which I\n" +
                "have not been wounded.\"\n" +
                "\n" +
                "\"It is an interesting question,\" said Lord Henry, who found an exquisite\n" +
                "pleasure in playing on the lad's unconscious egotism--\"an extremely\n" +
                "interesting question. I fancy that the true explanation is this. It\n" +
                "often happens that the real tragedies of life occur in such an\n" +
                "inartistic manner that they hurt us by their crude violence, their\n" +
                "absolute incoherence, their absurd want of meaning, their entire lack of\n" +
                "style. They affect us just as vulgarity affects us. They give us an\n" +
                "impression of sheer brute force, and we revolt against that. Sometimes,\n" +
                "however, a tragedy that possesses artistic elements of beauty crosses\n" +
                "our lives. If these elements of beauty are real, the whole thing simply\n" +
                "appeals to our sense of dramatic effect. Suddenly we find that we are no\n" +
                "longer the actors, but the spectators of the play. Or rather we are\n" +
                "both. We watch ourselves, and the mere wonder of the spectacle enthralls\n" +
                "us. In the present case, what is it that has really happened? Someone\n" +
                "has killed herself for love of you. I wish that I had ever had such an\n" +
                "experience. It would have made me in love with love for the rest of my\n" +
                "life. The people who have adored me--there have not been very many, but\n" +
                "there have been some--have always insisted on living on, long after I\n" +
                "had ceased to care for them, or they to care for me. They have become\n" +
                "stout and tedious, and when I meet them they go in at once for\n" +
                "reminiscences. That awful memory of woman! What a fearful thing it is!\n" +
                "And what an utter intellectual stagnation it reveals! One should absorb\n" +
                "the colour of life, but one should never remember its details. Details\n" +
                "are always vulgar.\"\n" +
                "\n" +
                "\"I must sow poppies in my garden,\" sighed Dorian.\n" +
                "\n" +
                "\"There is no necessity,\" rejoined his companion. \"Life has always\n" +
                "poppies in her hands. Of course, now and then things linger. I once wore\n" +
                "nothing but violets all through one season, as a form of artistic\n" +
                "mourning for a romance that would not die. Ultimately, however, it did\n" +
                "die. I forget what killed it. I think it was her proposing to sacrifice\n" +
                "the whole world for me. That is always a dreadful moment. It fills one\n" +
                "with the terror of eternity. Well--would you believe it?--a week ago, at\n" +
                "Lady Hampshire's, I found myself seated at dinner next the lady in\n" +
                "question, and she insisted on going over the whole thing again, and\n" +
                "digging up the past, and raking up the future. I had buried my romance\n" +
                "in a bed of asphodel. She dragged it out again, and assured me that I\n" +
                "had spoiled her life. I am bound to state that she ate an enormous\n" +
                "dinner, so I did not feel any anxiety. But what a lack of taste she\n" +
                "showed! The one charm of the past is that it is the past. But women\n" +
                "never know when the curtain has fallen. They always want a sixth act,\n" +
                "and as soon as the interest of the play is entirely over they propose to\n" +
                "continue it. If they were allowed their own way, every comedy would have\n" +
                "a tragic ending, and every tragedy would culminate in a farce. They are\n" +
                "charmingly artificial, but they have no sense of art. You are more\n" +
                "fortunate than I am. I assure you, Dorian, that not one of the women I\n" +
                "have known would have done for me what Sibyl Vane did for you. Ordinary\n" +
                "women always console themselves. Some of them do it by going in for\n" +
                "sentimental colours. Never trust a woman who wears mauve, whatever her\n" +
                "age may be, or a woman over thirty-five who is fond of pink ribbons. It\n" +
                "always means that they have a history. Others find a great consolation\n" +
                "in suddenly discovering the good qualities of their husbands. They\n" +
                "flaunt their conjugal felicity in one's face, as if it were the most\n" +
                "fascinating of sins. Religion consoles some. Its mysteries have all the\n" +
                "charm of a flirtation, a woman once told me; and I can quite understand\n" +
                "it. Besides, nothing makes one so vain as being told that one is a\n" +
                "sinner. Conscience makes egotists of us all. Yes; there is really no end\n" +
                "to the consolations that women find in modern life. Indeed, I have not\n" +
                "mentioned the most important one.\"\n" +
                "\n" +
                "\"What is that, Harry?\" said the lad, listlessly.\n" +
                "\n" +
                "\"Oh, the obvious consolation. Taking someone else's admirer when one\n" +
                "loses one's own. In good society that always whitewashes a woman. But\n" +
                "really, Dorian, how different Sibyl Vane must have been from all the\n" +
                "women one meets! There is something to me quite beautiful about her\n" +
                "death. I am glad I am living in a century when such wonders happen. They\n" +
                "make one believe in the reality of the things we all play with, such as\n" +
                "romance, passion, and love.\"\n" +
                "\n" +
                "\"I was terribly cruel to her. You forget that.\"\n" +
                "\n" +
                "\"I am afraid that women appreciate cruelty, downright cruelty, more than\n" +
                "anything else. They have wonderfully primitive instincts. We have\n" +
                "emancipated them, but they remain slaves looking for their masters, all\n" +
                "the same. They love being dominated. I am sure you were splendid. I have\n" +
                "never seen you really and absolutely angry, but I can fancy how\n" +
                "delightful you looked. And, after all, you said something to me the day\n" +
                "before yesterday that seemed to me at the time to be merely fanciful,\n" +
                "but that I see now was absolutely true, and it holds the key to\n" +
                "everything.\"\n" +
                "\n" +
                "\"What was that, Harry?\"\n" +
                "\n" +
                "\"You said to me that Sibyl Vane represented to you all the heroines of\n" +
                "romance--that she was Desdemona one night, and Ophelia the other; that\n" +
                "if she died as Juliet, she came to life as Imogen.\"\n" +
                "\n" +
                "\"She will never come to life again now,\" muttered the lad, burying his\n" +
                "face in his hands.\n" +
                "\n" +
                "\"No, she will never come to life. She has played her last part. But you\n" +
                "must think of that lonely death in the tawdry dressing-room simply as a\n" +
                "strange lurid fragment from some Jacobean tragedy, as a wonderful scene\n" +
                "from Webster, or Ford, or Cyril Tourneur. The girl never really lived,\n" +
                "and so she has never really died. To you at least she was always a\n" +
                "dream, a phantom that flitted through Shakespeare's plays and left them\n" +
                "lovelier for its presence, a reed through which Shakespeare's music\n" +
                "sounded richer and more full of joy. The moment she touched actual life,\n" +
                "she marred it, and it marred her, and so she passed away. Mourn for\n" +
                "Ophelia, if you like. Put ashes on your head because Cordelia was\n" +
                "strangled. Cry out against Heaven because the daughter of Brabantio\n" +
                "died. But don't waste your tears over Sibyl Vane. She was less real than\n" +
                "they are.\"\n" +
                "\n" +
                "There was a silence. The evening darkened in the room. Noiselessly, and\n" +
                "with silver feet, the shadows crept in from the garden. The colours\n" +
                "faded wearily out of things.\n" +
                "\n" +
                "After some time Dorian Gray looked up. \"You have explained me to myself,\n" +
                "Harry,\" he murmured, with something of a sigh of relief. \"I felt all\n" +
                "that you have said, but somehow I was afraid of it, and I could not\n" +
                "express it to myself. How well you know me! But we will not talk again\n" +
                "of what has happened. It has been a marvellous experience. That is all.\n" +
                "I wonder if life has still in store for me anything as marvellous.\"\n" +
                "\n" +
                "\"Life has everything in store for you, Dorian. There is nothing that\n" +
                "you, with your extraordinary good looks, will not be able to do.\"\n" +
                "\n" +
                "\"But suppose, Harry, I became haggard, and old, and wrinkled? What\n" +
                "then?\"\n" +
                "\n" +
                "\"Ah, then,\" said Lord Henry, rising to go--\"then, my dear Dorian, you\n" +
                "would have to fight for your victories. As it is, they are brought to\n" +
                "you. No, you must keep your good looks. We live in an age that reads too\n" +
                "much to be wise, and that thinks too much to be beautiful. We cannot\n" +
                "spare you. And now you had better dress, and drive down to the club. We\n" +
                "are rather late, as it is.\"\n" +
                "\n" +
                "\"I think I shall join you at the Opera, Harry. I feel too tired to eat\n" +
                "anything. What is the number of your sister's box?\"\n" +
                "\n" +
                "\"Twenty-seven, I believe. It is on the grand tier. You will see her name\n" +
                "on the door. But I am sorry you won't come and dine.\"\n" +
                "\n" +
                "\"I don't feel up to it,\" said Dorian, listlessly. \"But I am awfully\n" +
                "obliged to you for all that you have said to me. You are certainly my\n" +
                "best friend. No one has ever understood me as you have.\"\n" +
                "\n" +
                "\"We are only at the beginning of our friendship, Dorian,\" answered Lord\n" +
                "Henry, shaking him by the hand. \"Good-bye. I shall see you before\n" +
                "nine-thirty, I hope. Remember, Patti is singing.\"\n" +
                "\n" +
                "As he closed the door behind him, Dorian Gray touched the bell, and in a\n" +
                "few minutes Victor appeared with the lamps and drew the blinds down. He\n" +
                "waited impatiently for him to go. The man seemed to take an interminable\n" +
                "time over everything.\n" +
                "\n" +
                "As soon as he had left, he rushed to the screen, and drew it back. No;\n" +
                "there was no further change in the picture. It had received the news of\n" +
                "Sibyl Vane's death before he had known of it himself. It was conscious\n" +
                "of the events of life as they occurred. The vicious cruelty that marred\n" +
                "the fine lines of the mouth had, no doubt, appeared at the very moment\n" +
                "that the girl had drunk the poison, whatever it was. Or was it\n" +
                "indifferent to results? Did it merely take cognizance of what passed\n" +
                "within the soul? He wondered, and hoped that some day he would see the\n" +
                "change taking place before his very eyes, shuddering as he hoped it.\n" +
                "\n" +
                "Poor Sibyl! what a romance it had all been! She had often mimicked death\n" +
                "on the stage. Then Death himself had touched her, and taken her with\n" +
                "him. How had she played that dreadful last scene? Had she cursed him, as\n" +
                "she died? No; she had died for love of him, and love would always be a\n" +
                "sacrament to him now. She had atoned for everything, by the sacrifice\n" +
                "she had made of her life. He would not think any more of what she had\n" +
                "made him go through, on that horrible night at the theatre. When he\n" +
                "thought of her, it would be as a wonderful tragic figure sent on to the\n" +
                "world's stage to show the supreme reality of Love. A wonderful tragic\n" +
                "figure? Tears came to his eyes as he remembered her childlike look, and\n" +
                "winsome fanciful ways, and shy tremulous grace. He brushed them away\n" +
                "hastily, and looked again at the picture.\n" +
                "\n" +
                "He felt that the time had really come for making his choice. Or had his\n" +
                "choice already been made? Yes, life had decided that for him--life, and\n" +
                "his own infinite curiosity about life. Eternal youth, infinite passion,\n" +
                "pleasures subtle and secret, wild joys and wilder sins--he was to have\n" +
                "all these things. The portrait was to bear the burden of his shame: that\n" +
                "was all.\n" +
                "\n" +
                "A feeling of pain crept over him as he thought of the desecration that\n" +
                "was in store for the fair face on the canvas. Once, in boyish mockery of\n" +
                "Narcissus, he had kissed, or feigned to kiss, those painted lips that\n" +
                "now smiled so cruelly at him. Morning after morning he had sat before\n" +
                "the portrait, wondering at its beauty, almost enamoured of it, as it\n" +
                "seemed to him at times. Was it to alter now with every mood to which he\n" +
                "yielded? Was it to become a monstrous and loathsome thing, to be hidden\n" +
                "away in a locked room, to be shut out from the sunlight that had so\n" +
                "often touched to brighter gold the waving wonder of its hair? The pity\n" +
                "of it! the pity of it!\n" +
                "\n" +
                "For a moment he thought of praying that the horrible sympathy that\n" +
                "existed between him and the picture might cease. It had changed in\n" +
                "answer to a prayer; perhaps in answer to a prayer it might remain\n" +
                "unchanged. And, yet, who, that knew anything about Life, would surrender\n" +
                "the chance of remaining always young, however fantastic that chance\n" +
                "might be, or with what fateful consequences it might be fraught?\n" +
                "Besides, was it really under his control? Had it indeed been prayer that\n" +
                "had produced the substitution? Might there not be some curious\n" +
                "scientific reason for it all? If thought could exercise its influence\n" +
                "upon a living organism, might not thought exercise an influence upon\n" +
                "dead and inorganic things? Nay, without thought or conscious desire,\n" +
                "might not things external to ourselves vibrate in unison with our moods\n" +
                "and passions, atom calling to atom in secret love of strange affinity?\n" +
                "But the reason was of no importance. He would never again tempt by a\n" +
                "prayer any terrible power. If the picture was to alter, it was to alter.\n" +
                "That was all. Why inquire too closely into it?\n" +
                "\n" +
                "For there would be a real pleasure in watching it. He would be able to\n" +
                "follow his mind into its secret places. This portrait would be to him\n" +
                "the most magical of mirrors. As it had revealed to him his own body, so\n" +
                "it would reveal to him his own soul. And when winter came upon it, he\n" +
                "would still be standing where spring trembles on the verge of summer.\n" +
                "When the blood crept from its face, and left behind a pallid mask of\n" +
                "chalk with leaden eyes, he would keep the glamour of boyhood. Not one\n" +
                "blossom of his loveliness would ever fade. Not one pulse of his life\n" +
                "would ever weaken. Like the gods of the Greeks, he would be strong, and\n" +
                "fleet, and joyous. What did it matter what happened to the coloured\n" +
                "image on the canvas? He would be safe. That was everything.\n" +
                "\n" +
                "He drew the screen back into its former place in front of the picture,\n" +
                "smiling as he did so, and passed into his bedroom, where his valet was\n" +
                "already waiting for him. An hour later he was at the Opera, and Lord\n" +
                "Henry was leaning over his chair.";
    }

    public static final List<String> CORPORA = Arrays.asList(THE_PICTURE_OF_DORIAN_GRAY);
}
