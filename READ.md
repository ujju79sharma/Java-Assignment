API Url: http://localhost:8080/user/signup [POST Request]

Request Body

{
    "firstName":"Ujjwal",
    "lastName":"Sharma",
    "email":"ujjwal@gmail.com",
    "password":"Ftp@1234"
}

Response:
{
    "success": true,
    "data": {
        "userId": 5,
        "firstName": "Ujjwal",
        "lastName": "Sharma",
        "email": "ujjwal@gmail.com",
        "password": "Ftp@1234",
        "storeIds": null
    },
    "message": "User successfully signed-up.",
    "statusCode": 200
}

API Url: http://localhost:8080/user/sign-in [POST Request]

Request Body
{
    "email":"sanket_bahadur@gmail.com",
    "password":"Ftp@1234"
}

Response:

{
    "success": true,
    "data": {
        "userId": 3,
        "firstName": "User",
        "lastName": " 3",
        "email": "sanket_bahadur@gmail.com",
        "password": "Ftp@1234",
        "storeIds": null
    },
    "message": "User logged in successfully",
    "statusCode": 200
}


API Url: http://localhost:8080/store/create [POST Request]

Request Body:

{
    "ownerId":3,
    "storeName":"Ujjwal Store",
    "genre":"fiction"
}

Response:

{
    "success": true,
    "data": {
        "storeId": 1,
        "ownerId": 3,
        "storeName": "Ujjwal Store",
        "genre": "fiction",
        "booksCount": 1600,
        "bookIds": [
            "6E7qCAAAQBAJ",
            "6JZ5yTwt5qkC",
            "a6nsCQAAQBAJ",
            "GynbBQAAQBAJ",
            "uNOnJkxlr3IC",
            "dUBpDQAAQBAJ",
            "rdnYAAAAQBAJ",
            "4MzzCQAAQBAJ",
            "phhhHT64kIMC",
            "FSs8EAAAQBAJ",
            "OcAqEAAAQBAJ",
            "TGmDDwAAQBAJ",
            "-8L9CQAAQBAJ",
            "vei8RbRWpi4C",
            "bI5bDwAAQBAJ",
            "PhtjDwAAQBAJ",
            "VJ4qDwAAQBAJ",
            "IJ1GHQAACAAJ",
            "TOgxAQAAMAAJ",
            "EdXRxeEPFP4C",
            "fFCjDQAAQBAJ",
            "7bYRAQAAMAAJ",
            "ITvgCQAAQBAJ",
            "iVyqCQAAQBAJ",
            "yBtjDwAAQBAJ",
            "zZNxDwAAQBAJ",
            "MHG_CQAAQBAJ",
            "KH5KCAAAQBAJ",
            "rs5eRutIV5cC",
            "wG7WCgAAQBAJ",
            "Nb75CQAAQBAJ",
            "gHU7CgAAQBAJ",
            "wTM7DwAAQBAJ",
            "Pf6L2GZ9WT0C",
            "hNLZCgAAQBAJ",
            "4S6WAAAAQBAJ",
            "yJUmEAAAQBAJ",
            "wNlvCQAAQBAJ",
            "i-EgAQAAMAAJ",
            "0mgwDwAAQBAJ"
        ]
    },
    "message": "Store created successfully.",
    "statusCode": 200
}

API Url: http://localhost:8080/store/find-all [GET Request]

Response:

{
    "success": true,
    "data": [
        {
            "storeId": 1,
            "ownerId": 3,
            "storeName": "Ujjwal Store",
            "genre": "fiction",
            "booksCount": 1600,
            "bookIds": [
                "6E7qCAAAQBAJ",
                "6JZ5yTwt5qkC",
                "a6nsCQAAQBAJ",
                "GynbBQAAQBAJ",
                "uNOnJkxlr3IC",
                "dUBpDQAAQBAJ",
                "rdnYAAAAQBAJ",
                "4MzzCQAAQBAJ",
                "phhhHT64kIMC",
                "FSs8EAAAQBAJ",
                "OcAqEAAAQBAJ",
                "TGmDDwAAQBAJ",
                "-8L9CQAAQBAJ",
                "vei8RbRWpi4C",
                "bI5bDwAAQBAJ",
                "PhtjDwAAQBAJ",
                "VJ4qDwAAQBAJ",
                "IJ1GHQAACAAJ",
                "TOgxAQAAMAAJ",
                "EdXRxeEPFP4C",
                "fFCjDQAAQBAJ",
                "7bYRAQAAMAAJ",
                "ITvgCQAAQBAJ",
                "iVyqCQAAQBAJ",
                "yBtjDwAAQBAJ",
                "zZNxDwAAQBAJ",
                "MHG_CQAAQBAJ",
                "KH5KCAAAQBAJ",
                "rs5eRutIV5cC",
                "wG7WCgAAQBAJ",
                "Nb75CQAAQBAJ",
                "gHU7CgAAQBAJ",
                "wTM7DwAAQBAJ",
                "Pf6L2GZ9WT0C",
                "hNLZCgAAQBAJ",
                "4S6WAAAAQBAJ",
                "yJUmEAAAQBAJ",
                "wNlvCQAAQBAJ",
                "i-EgAQAAMAAJ",
                "0mgwDwAAQBAJ"
            ]
        },
        {
            "storeId": 2,
            "ownerId": 4,
            "storeName": "Steve Store",
            "genre": "programming",
            "booksCount": 1600,
            "bookIds": [
                "OzdPAQAAIAAJ",
                "LrtLXF4twRkC",
                "6JZ5yTwt5qkC",
                "NmOkCgAAQBAJ",
                "d2CMAgAAQBAJ",
                "BCjryAEACAAJ",
                "aWgHzgEACAAJ",
                "ZI9UuQAACAAJ",
                "pjqbAgAAQBAJ",
                "i2_FBQAAQBAJ",
                "4dDNNYmoqScC",
                "ZF17CwAAQBAJ",
                "X_ToAwAAQBAJ",
                "BBgvvr0hLFUC",
                "68xEAQAAMAAJ",
                "2mDVAAAAMAAJ",
                "rsIAmbc2cIoC",
                "-zczEAAAQBAJ",
                "Gno8RQuM_-wC",
                "0Go1D2-AHqQC",
                "UY3tAAAAMAAJ",
                "Z-SPe1ycqkcC",
                "vPRTNAEACAAJ",
                "3liLysT2DKwC",
                "gN1QAAAAMAAJ",
                "wsbUAAAAMAAJ",
                "VNX4ngEACAAJ",
                "LIQjs_v1LpMC",
                "KGIbfiiP1i4C",
                "xV_J-1PFeaEC",
                "i_yF-gRf7uIC",
                "bdoBEAAAQBAJ",
                "shq9clM7YtoC",
                "_ok4RLEXKIsC",
                "7ILgAAAAMAAJ",
                "UJe4950hL5gC",
                "RUJui5ubKFoC",
                "SYIVe0YbzxUC",
                "tMpEAQAAIAAJ",
                "cCHlCwAAQBAJ"
            ]
        }
    ],
    "message": "2 Store(s) found.",
    "statusCode": 200
}


API Url : http://localhost:8080/books/find/{storeId} [GET Request]

	e.g. http://localhost:8080/books/find/1


Response:
{
    "success": true,
    "data": [
        {
            "bookId": "6E7qCAAAQBAJ",
            "storeId": 1,
            "title": "Cut Elimination in Categories",
            "subtitle": null,
            "authors": [
                "K. Dosen"
            ],
            "categories": [
                "Philosophy"
            ],
            "price": 0.0,
            "publisher": "Springer Science & Business Media",
            "publishedDate": "2013-04-18",
            "description": "Proof theory and category theory were first drawn together by Lambek some 30 years ago but, until now, the most fundamental notions of category theory (as opposed to their embodiments in logic) have not been explained systematically in terms of proof theory. Here it is shown that these notions, in particular the notion of adjunction, can be formulated in such as way as to be characterised by composition elimination. Among the benefits of these composition-free formulations are syntactical and simple model-theoretical, geometrical decision procedures for the commuting of diagrams of arrows. Composition elimination, in the form of Gentzen's cut elimination, takes in categories, and techniques inspired by Gentzen are shown to work even better in a purely categorical context than in logic. An acquaintance with the basic ideas of general proof theory is relied on only for the sake of motivation, however, and the treatment of matters related to categories is also in general self contained. Besides familiar topics, presented in a novel, simple way, the monograph also contains new results. It can be used as an introductory text in categorical proof theory.",
            "pageCount": 229,
            "thumbnail": "http://books.google.com/books/content?id=6E7qCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=6E7qCAAAQBAJ&pg=PA2&dq=incategories:fiction&hl=&cd=14&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "6JZ5yTwt5qkC",
            "storeId": 1,
            "title": "Who's Listening, Letters to the Editor Years 1988-2000, in Categories and Illustrated",
            "subtitle": null,
            "authors": [
                "J. M. Webber"
            ],
            "categories": [
                "Business ethics"
            ],
            "price": 0.0,
            "publisher": "Createspace",
            "publishedDate": "2002",
            "description": null,
            "pageCount": 517,
            "thumbnail": "http://books.google.com/books/content?id=6JZ5yTwt5qkC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=6JZ5yTwt5qkC&pg=PA205&dq=incategories:fiction&hl=&cd=6&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "a6nsCQAAQBAJ",
            "storeId": 1,
            "title": "The Midnight Moon",
            "subtitle": "",
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2014-07-10",
            "description": "It was a fun, holiday romance under a moonlit sky. After exchanging passionate nights and only first names, Peyton Watts and Logan Weaver go back to their lives. For Peyton, it’s a return to her steady, conservative social circle and the not unwelcome overtures from attorney Margot Joseph. Meanwhile, Logan’s free spirit is happy again moving with the college crowd. So when fate throws them once more into each other’s paths, it shouldn’t mean a thing…",
            "pageCount": 224,
            "thumbnail": "http://books.google.com/books/content?id=a6nsCQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=a6nsCQAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=17&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "GynbBQAAQBAJ",
            "storeId": 1,
            "title": "A Court of Thorns and Roses",
            "subtitle": "The #1 bestselling series",
            "authors": [
                "Sarah J. Maas"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bloomsbury Publishing",
            "publishedDate": "2015-05-05",
            "description": "With bits of Buffy, Game Of Thrones and Outlander, this is a glorious series of total joy - Stylist The tantalising start to a seductive fantasy series from global #1 bestselling author Sarah J. Maas Feyre is a huntress. And when she sees a deer in the forest being pursued by a wolf, she kills the predator and takes its prey to feed herself and her family. But the wolf was not what it seemed, and Feyre cannot predict the high price she will have to pay for its death ... Dragged away from her family for the murder of a faerie, Feyre discovers that her captor, his face obscured by a jewelled mask, is hiding even more than his piercing green eyes suggest. As Feyre's feelings for Tamlin turn from hostility to passion, she learns that the faerie lands are a far more dangerous place than she realized. And Feyre must fight to break an ancient curse, or she will lose him forever. Sarah J. Maas's books have sold millions of copies worldwide and have been translated into 37 languages. Discover the sweeping romantic fantasy for yourself.",
            "pageCount": 432,
            "thumbnail": "http://books.google.com/books/content?id=GynbBQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=GynbBQAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=9&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "uNOnJkxlr3IC",
            "storeId": 1,
            "title": "The Cambridge Introduction to the Novel",
            "subtitle": null,
            "authors": [
                "Marina MacKay"
            ],
            "categories": [
                "Literary Criticism"
            ],
            "price": 0.0,
            "publisher": "Cambridge University Press",
            "publishedDate": "2010-11-25",
            "description": "Beginning its life as the sensational entertainment of the eighteenth century, the novel has become the major literary genre of modern times. Drawing on hundreds of examples of famous novels from all over the world, Marina MacKay explores the essential aspects of the novel and its history: where novels came from and why we read them; how we think about their styles and techniques, their people, plots, places, and politics. Between the main chapters are longer readings of individual works, from Don Quixote to Midnight's Children. A glossary of key terms and a guide to further reading are included, making this an ideal accompaniment to introductory courses on the novel.",
            "pageCount": 0,
            "thumbnail": "http://books.google.com/books/content?id=uNOnJkxlr3IC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=uNOnJkxlr3IC&printsec=frontcover&dq=incategories:fiction&hl=&cd=32&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "dUBpDQAAQBAJ",
            "storeId": 1,
            "title": "Way of the Wolf",
            "subtitle": "Straight Line Selling: Master the Art of Persuasion, Influence, and Success",
            "authors": [
                "Jordan Belfort"
            ],
            "categories": [
                "Business & Economics"
            ],
            "price": 0.0,
            "publisher": "Simon and Schuster",
            "publishedDate": "2017-09-26",
            "description": "Jordan Belfort—immortalized by Leonardo DiCaprio in the hit movie The Wolf of Wall Street—reveals the step-by-step sales and persuasion system proven to turn anyone into a sales-closing, money-earning rock star. For the first time ever, Jordan Belfort opens his playbook and gives you access to his exclusive step-by-step system—the same system he used to create massive wealth for himself, his clients, and his sales teams. Until now this revolutionary program was only available through Jordan’s $1,997 online training. Now, in Way of the Wolf, Belfort is ready to unleash the power of persuasion to a whole new generation, revealing how anyone can bounce back from devastating setbacks, master the art of persuasion, and build wealth. Every technique, every strategy, and every tip has been tested and proven to work in real-life situations. Written in his own inimitable voice, Way of the Wolf cracks the code on how to persuade anyone to do anything, and coaches readers—regardless of age, education, or skill level—to be a master sales person, negotiator, closer, entrepreneur, or speaker.",
            "pageCount": 256,
            "thumbnail": "http://books.google.com/books/content?id=dUBpDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=dUBpDQAAQBAJ&pg=PP1&dq=incategories:fiction&hl=&cd=22&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "rdnYAAAAQBAJ",
            "storeId": 1,
            "title": "Guiding Adolescent Readers to Success",
            "subtitle": null,
            "authors": [
                "Mark Donnelly",
                "Julie Donnelly"
            ],
            "categories": [
                "Education"
            ],
            "price": 0.0,
            "publisher": "Teacher Created Materials",
            "publishedDate": "2011-10-01",
            "description": "This is an easy-to-follow resource that explains how to transition successful Guided Reading strategies into the upper grades. It provides strategies, differentiation suggestions, and practical tips for successfully incorporating various genres of literature into instruction to keep students motivated and interested in reading. This resource is aligned to the interdisciplinary themes from the Partnership for 21st Century Skills and supports the Common Core and other state standards.",
            "pageCount": 256,
            "thumbnail": "http://books.google.com/books/content?id=rdnYAAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=rdnYAAAAQBAJ&pg=PA20&dq=incategories:fiction&hl=&cd=27&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "4MzzCQAAQBAJ",
            "storeId": 1,
            "title": "Weeping Walls",
            "subtitle": null,
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2013-12-10",
            "description": "An abandoned old house in a small town northeast of Houston is the site of a second murder, eerily similar to a supposed cold case of fourteen years earlier. FBI Agents CJ Johnston and Paige Riley are dispatched to find the link between the two homicides. The team, including Ice and Billy, find the case to be anything but cold. For CJ and Paige, juggling the investigation while trying to keep their love affair a secret proves to be as hard as uncovering long-buried clues. Seven-time Goldie winner Gerri Hill delivers thrills and passion in the chilling sequel to Keepers of the Cave.",
            "pageCount": 256,
            "thumbnail": "http://books.google.com/books/content?id=4MzzCQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=4MzzCQAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=3&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "phhhHT64kIMC",
            "storeId": 1,
            "title": "International Who's Who of Authors and Writers 2004",
            "subtitle": null,
            "authors": [
                "Europa Publications"
            ],
            "categories": [
                "Biography & Autobiography"
            ],
            "price": 0.0,
            "publisher": "Psychology Press",
            "publishedDate": "2003",
            "description": "Accurate and reliable biographical information essential to anyone interested in the world of literature TheInternational Who's Who of Authors and Writersoffers invaluable information on the personalities and organizations of the literary world, including many up-and-coming writers as well as established names. With over 8,000 entries, this updated edition features: * Concise biographical information on novelists, authors, playwrights, columnists, journalists, editors, and critics * Biographical details of established writers as well as those who have recently risen to prominence * Entries detailing career, works published, literary awards and prizes, membership, and contact addresses where available * An extensive listing of major international literary awards and prizes, and winners of those prizes * A directory of major literary organizations and literary agents * A listing of members of the American Academy of Arts and Letters",
            "pageCount": 624,
            "thumbnail": "http://books.google.com/books/content?id=phhhHT64kIMC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=phhhHT64kIMC&pg=PA602&dq=incategories:fiction&hl=&cd=12&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "FSs8EAAAQBAJ",
            "storeId": 1,
            "title": "I Found My Magic in the Hills",
            "subtitle": null,
            "authors": [
                "Jatin Kukreja"
            ],
            "categories": [
                "Poetry"
            ],
            "price": 0.0,
            "publisher": "Notion Press",
            "publishedDate": "2021-08-02",
            "description": "A small hill town, located in Maharashtra, India. In the late winters of January 2021, was when she came to the hills where I live. And that was it. It was MAGIC altogether. The energy she carried and the vibes that came out of her soul, was admirable. The very first time I wrote something about her was, “She is that sort of magic one would write a book on.” And so here I am with this first book about her. This book consists of six categories, and each category consists of eight write-ups, where I have described her in categories like flowers, intentions, sunset, words, moon, and magic. As a reader, you will find me talking about her and narrating her with these six categories. They are written in the hills while knowing her and spending time with her as and in whatever manner I got to. Something which was born between us where we did not try for it. We never decided. Time played a beautiful role and got us together. It’s like living while loving and not just spending time. It’s like loving with intentions and not needs. It’s that sort of love which is so easy. Like breathing. We don’t try to breathe, neither we force ourselves to breathe. We all will happen to find our magic at that point in our lives where we would not expect it. And then, everything else will make sense which will show us the reality of being treated and loved rightly. I am home to her and she is my peace. Dear readers, I hope you enjoy reading this book, and I will see you in the second book. Till then, stay tuned! Love freely, and live that love daily :)",
            "pageCount": 68,
            "thumbnail": "http://books.google.com/books/content?id=FSs8EAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=FSs8EAAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=11&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "OcAqEAAAQBAJ",
            "storeId": 1,
            "title": "The Soul of a Woman",
            "subtitle": null,
            "authors": [
                "Isabel Allende"
            ],
            "categories": [
                "Biography & Autobiography"
            ],
            "price": 0.0,
            "publisher": "Bloomsbury Publishing",
            "publishedDate": "2021-05-13",
            "description": "The wise, warm, defiant new book from literary legend Isabel Allende – a meditation on power, feminism and what it means to be a woman An Independent, Guardian and Grazia Highlight for 2021 When I say that I was a feminist in kindergarten, I am not exaggerating. As a child, Isabel Allende watched her mother, abandoned by her husband, provide for her three small children. As a young woman coming of age in the late 1960s, she rode the first wave of feminism. She has seen what has been accomplished by the movement in the course of her lifetime. And over the course of three marriages, she has learned how to grow as a woman while having a partner, when to step away, and the rewards of embracing one's sexuality. So what do women want? To be safe, to be valued, to live in peace, to have their own resources, to be connected, to have control over their bodies and lives, and above all, to be loved. On all these fronts, there is much work to be done, and this book, Allende hopes, will 'light the torch of our daughters and granddaughters with mine. They will have to live for us, as we lived for our mothers, and carry on with the work still left to be finished.'",
            "pageCount": 192,
            "thumbnail": "http://books.google.com/books/content?id=OcAqEAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=OcAqEAAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=37&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "TGmDDwAAQBAJ",
            "storeId": 1,
            "title": "Time and Tide",
            "subtitle": "The Feminist and Cultural Politics of a Modern Magazine",
            "authors": [
                "Catherine Clay"
            ],
            "categories": [
                "Literary Collections"
            ],
            "price": 0.0,
            "publisher": "Edinburgh University Press",
            "publishedDate": "2018-05-15",
            "description": "\"The first in-depth study of the landmark modern feminist magazine, \"Time and Tide.\" Unique in establishing itself as the only female-run intellectual weekly in the golden age of the weekly review, \"Time and Tide\" both challenged persistent prejudices against women's participation in public life and played an instrumental role in redefining women's gender roles and identities. Drawing on extensive new archival research, Catherine Clay recovers the contributions to this magazine of both well- and lesser-known British women writers, editors, critics and journalists and explores a cultural dialogue about literature, politics and the arts that took place beyond the parameters of modernist 'little magazines.' The book makes a major contribution to the history of women's writing and feminism in Britain between the wars.\"--Publisher's description.",
            "pageCount": 306,
            "thumbnail": "http://books.google.com/books/content?id=TGmDDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=TGmDDwAAQBAJ&pg=PA91&dq=incategories:fiction&hl=&cd=2&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "-8L9CQAAQBAJ",
            "storeId": 1,
            "title": "Keepers of the Cave",
            "subtitle": null,
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2012-07-01",
            "description": "While the investigations go on in Dallas and Baton Rouge after the disappearance of a senator's daughter, FBI agents CJ Johnston and Paige Riley are assigned to the sleepy backwoods of East Texas for a dead-end assignment to infiltrate an all-girls school. Random disappearances dating back fifty years and more raise red flags that point to the tiny, isolated community of Hoganville. But CJ and Paige fear there will be little distraction from the memories of the one-night stand they shared six months ago. Nevertheless, they integrate themselves into the lives of the teachers and staff, but soon the odd behavior of the townspeople has them convinced something sinister lurks there. Something, perhaps, that even the residents of Hoganville don't know about. Six-time Goldie winner Gerri Hill delivers thrills and passion in the chilling Keepers of the Cave.",
            "pageCount": 320,
            "thumbnail": "http://books.google.com/books/content?id=-8L9CQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=-8L9CQAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=16&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "vei8RbRWpi4C",
            "storeId": 1,
            "title": "Literature",
            "subtitle": "Released Exercises",
            "authors": [
                "National Assessment of Educational Progress (Project)"
            ],
            "categories": [
                "Books and reading"
            ],
            "price": 0.0,
            "publisher": null,
            "publishedDate": "1973",
            "description": null,
            "pageCount": 330,
            "thumbnail": "http://books.google.com/books/content?id=vei8RbRWpi4C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=vei8RbRWpi4C&pg=RA9-PT1&dq=incategories:fiction&hl=&cd=10&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "bI5bDwAAQBAJ",
            "storeId": 1,
            "title": "Rag",
            "subtitle": "Stories",
            "authors": [
                "Maryse Meijer"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "FSG Originals",
            "publishedDate": "2019-02-12",
            "description": "A New York Times Book Review Editors' Choice. One of Vol. 1 Brooklyn and Tor.com's Books to Read in February. \"Sharp, haunting . . . [Meijer] writes wonderfully of the trap of the self, with its impossible prisons of circumstance and identity, not to mention the perversity of being buried alive, alone, inside a body.\" --Merritt Tierce, The New York Times Book Review From the author of Heartbreaker, a disquieting collection tracing the destructive consequences of the desire for connection A man, forgotten by the world, takes care of his deaf brother while euthanizing dogs for a living. A stepbrother so desperately wants to become his stepsibling that he rapes his girlfriend. In Maryse Meijer’s decidedly dark and searingly honest collection Rag, the desperate human desire for connection slips into a realm that approximates horror. Meijer’s explosive debut collection, Heartbreaker, reinvented sexualized and romantic taboos, holding nothing back. In Rag, Meijer’s fearless follow-up, she shifts her focus to the dark heart of intimacies of all kinds, and the ways in which isolated people’s yearning for community can breed violence, danger, and madness. With unparalleled precision, Meijer spins stories that leave you troubled and slightly shaken by her uncanny ability to elicit empathy for society’s most marginalized people.",
            "pageCount": 160,
            "thumbnail": "http://books.google.com/books/content?id=bI5bDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=bI5bDwAAQBAJ&pg=PP1&dq=incategories:fiction&hl=&cd=29&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "PhtjDwAAQBAJ",
            "storeId": 1,
            "title": "Novel & Short Story Writer's Market 2017",
            "subtitle": "The Most Trusted Guide to Getting Published",
            "authors": [
                "Rachel Randall"
            ],
            "categories": [
                "Reference"
            ],
            "price": 0.0,
            "publisher": "Penguin",
            "publishedDate": "2016-09-14",
            "description": "The best resource for getting your fiction published! Novel & Short Story Writer's Market 2017 is the only resource you need to get your short stories, novellas, and novels published. As with past editions, Novel & Short Story Writer's Market offers hundreds of listings for book publishers, literary agents, fiction publications, contests, and more. Each listing includes contact information, submission guidelines, and other essential tips. Novel & Short Story Writer's Market also includes valuable advice to elevate your fiction: • Discover creative ways to conquer writer's block. • Wield exposition and summary effectively in your story. • Amplify your author brand with 8 simple ingredients. • Gain insight from best-selling and award-winning authors, including Garth Stein, Patrick Rothfuss, and more. You also receive a one-year subscription to WritersMarket.com's searchable online database of fiction publishers, as well as a free digital download of Writer's Yearbook, featuring the 100 Best Markets: WritersDigest.com/WritersDigest-Yearbook-16. Includes exclusive access to the webinar \"Create Edge-of-Your-Seat Suspense\" by Jane K. Cleland.",
            "pageCount": 508,
            "thumbnail": "http://books.google.com/books/content?id=PhtjDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=PhtjDwAAQBAJ&pg=PT240&dq=incategories:fiction&hl=&cd=31&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "VJ4qDwAAQBAJ",
            "storeId": 1,
            "title": "The Pillars of the Earth",
            "subtitle": null,
            "authors": [
                "Ken Follett"
            ],
            "categories": [
                "Cathedrals"
            ],
            "price": 0.0,
            "publisher": "Pan Macmillan",
            "publishedDate": "2014",
            "description": "The no.1 bestselling masterpiece \"A novel of majesty and power.\" Chicago Sun-TimesA spellbinding epic tale of ambition, anarchy, and absolute power set against the sprawling medieval canvas of twelfth-century England, this is Ken Follett's classic historical masterpiece. The Pillars of the Earth tells the story of Philip, prior of Kingsbridge, a devout and resourceful monk driven to build the greatest Gothic cathedral the world has known . . . of Tom, the mason who becomes his architect - a man divided in his soul . . . of the beautiful, elusive Lady Aliena, haunted by a secret shame . . . and of a struggle between good and evil that will turn church against state, and brother against brother.If you loved Pillars of the Earth, read the bestselling sequel, World Without End.",
            "pageCount": 1095,
            "thumbnail": "http://books.google.com/books/content?id=VJ4qDwAAQBAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=VJ4qDwAAQBAJ&dq=incategories:fiction&hl=&cd=28&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "IJ1GHQAACAAJ",
            "storeId": 1,
            "title": "Stories in Categories",
            "subtitle": "Containing Practical Helps for After Dinner Speakers and Hearty Laughs for Everybody from More Than Two Hundred Stories",
            "authors": [
                "H. Arthur Phillips"
            ],
            "categories": [
                "Anecdotes"
            ],
            "price": 0.0,
            "publisher": null,
            "publishedDate": "1976",
            "description": null,
            "pageCount": 90,
            "thumbnail": null,
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=IJ1GHQAACAAJ&dq=incategories:fiction&hl=&cd=23&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "TOgxAQAAMAAJ",
            "storeId": 1,
            "title": "Twok: a Novel",
            "subtitle": null,
            "authors": [
                "Watson Griffin"
            ],
            "categories": null,
            "price": 0.0,
            "publisher": "Hamilton [Ont.] : Griffin & Kidner",
            "publishedDate": "1887",
            "description": null,
            "pageCount": 232,
            "thumbnail": "http://books.google.com/books/content?id=TOgxAQAAMAAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=TOgxAQAAMAAJ&pg=PP1&dq=incategories:fiction&hl=&cd=13&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "EdXRxeEPFP4C",
            "storeId": 1,
            "title": "Dictionary for School Library Media Specialists",
            "subtitle": "A Practical and Comprehensive Guide",
            "authors": [
                "Mary Maude McCain",
                "Martha Merrill"
            ],
            "categories": [
                "Education"
            ],
            "price": 0.0,
            "publisher": "Libraries Unlimited",
            "publishedDate": "2001",
            "description": "This dictionary provides a single source of definitions for the language specifically associated with your profession. It covers all the basic terminology-words, phrases, and acronyms-that you need for the daily operation of a K-12 school library media center. There are terms related to librarianship and publishing, technology, awards, organizations, celebrations, and more. A must-have professional tool and ready-reference you'll use again and again.",
            "pageCount": 219,
            "thumbnail": "http://books.google.com/books/content?id=EdXRxeEPFP4C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=EdXRxeEPFP4C&pg=PA89&dq=incategories:fiction&hl=&cd=26&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "fFCjDQAAQBAJ",
            "storeId": 1,
            "title": "Atomic Habits",
            "subtitle": "the life-changing million-copy #1 bestseller",
            "authors": [
                "James Clear"
            ],
            "categories": [
                "Self-Help"
            ],
            "price": 0.0,
            "publisher": "Random House",
            "publishedDate": "2018-10-18",
            "description": "THE PHENOMENAL INTERNATIONAL BESTSELLER: 1 MILLION COPIES SOLD Transform your life with tiny changes in behaviour, starting now. People think that when you want to change your life, you need to think big. But world-renowned habits expert James Clear has discovered another way. He knows that real change comes from the compound effect of hundreds of small decisions: doing two push-ups a day, waking up five minutes early, or holding a single short phone call. He calls them atomic habits. In this ground-breaking book, Clears reveals exactly how these minuscule changes can grow into such life-altering outcomes. He uncovers a handful of simple life hacks (the forgotten art of Habit Stacking, the unexpected power of the Two Minute Rule, or the trick to entering the Goldilocks Zone), and delves into cutting-edge psychology and neuroscience to explain why they matter. Along the way, he tells inspiring stories of Olympic gold medalists, leading CEOs, and distinguished scientists who have used the science of tiny habits to stay productive, motivated, and happy. These small changes will have a revolutionary effect on your career, your relationships, and your life. ________________________________ A NEW YORK TIMES AND SUNDAY TIMES BESTSELLER 'A supremely practical and useful book.' Mark Manson, author of The Subtle Art of Not Giving A F*ck 'James Clear has spent years honing the art and studying the science of habits. This engaging, hands-on book is the guide you need to break bad routines and make good ones.' Adam Grant, author of Originals 'Atomic Habits is a step-by-step manual for changing routines.' Books of the Month, Financial Times 'A special book that will change how you approach your day and live your life.' Ryan Holiday, author of The Obstacle is the Way",
            "pageCount": 320,
            "thumbnail": "http://books.google.com/books/content?id=fFCjDQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=fFCjDQAAQBAJ&pg=PP1&dq=incategories:fiction&hl=&cd=7&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "7bYRAQAAMAAJ",
            "storeId": 1,
            "title": "International Who's who of Authors and Writers",
            "subtitle": null,
            "authors": null,
            "categories": [
                "Bio-bibliography"
            ],
            "price": 0.0,
            "publisher": null,
            "publishedDate": "2008",
            "description": null,
            "pageCount": 0,
            "thumbnail": "http://books.google.com/books/content?id=7bYRAQAAMAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=7bYRAQAAMAAJ&q=incategories:fiction&dq=incategories:fiction&hl=&cd=36&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "ITvgCQAAQBAJ",
            "storeId": 1,
            "title": "Angel Fire",
            "subtitle": null,
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2014-12-10",
            "description": "A vacation out of the city sounds like just the ticket for Tori Hunter and Sam Kennedy. Joining their Dallas Police Department pals Casey O’Connor and Leslie Tucker in a rented RV, they set out for the New Mexico mountains—and on a collision course with a manhunt. FBI agents Cameron Ross and Andrea Sullivan are tracking a deadly quarry in desolate territory. An ex-teammate from Cameron’s Special-Ops days is in deep hiding, planning who-knows-what to cap off a killing spree. With a hostage at stake and time running out, Cameron reluctantly agrees to outside help from women she doesn’t know…or trust. In the crossover that fans have been clamoring for, it’s a heart-pounding race against time that challenges the courage and commitment of the exceptional women from Gerri Hill’s Hunter’s Way and Devil’s Rock Series.",
            "pageCount": 224,
            "thumbnail": "http://books.google.com/books/content?id=ITvgCQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=ITvgCQAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=8&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "iVyqCQAAQBAJ",
            "storeId": 1,
            "title": "Hunter's Way",
            "subtitle": "",
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2005-03-21",
            "description": "Homicide detective Tori Hunter was used to doing things her way. But even after having six different partners in seven years, Tori isn't prepared when she's forced to team up with the hot-tempered Samantha Kennedy. Samantha, on the other hand, is trying to juggle a new job, a demanding boyfriend, and now finds herself with an even greater challenge—being partnered with the most difficult detective in the entire squad. After a brief terrorist scare disrupts their serial killer investigation, the two women find themselves growing closer. Samantha begins to question the relationship with her longtime boyfriend, and Tori, never one to allow anyone to get close, begins to feel her defenses slipping in Sam's presence. A serial killer and drug deals gone bad; the two detectives struggle with their feelings, trying to maintain their professional relationship while keeping their nearly flammable physical relationship in check. With Hunter's Way, Gerri Hill masterfully blends suspense and intrigue with her unique style of romance.",
            "pageCount": 366,
            "thumbnail": "http://books.google.com/books/content?id=iVyqCQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=iVyqCQAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=19&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "yBtjDwAAQBAJ",
            "storeId": 1,
            "title": "Novel & Short Story Writer's Market 2018",
            "subtitle": "The Most Trusted Guide to Getting Published",
            "authors": [
                "Rachel Randall"
            ],
            "categories": [
                "Reference"
            ],
            "price": 0.0,
            "publisher": "Penguin",
            "publishedDate": "2017-09-14",
            "description": "The best resource for getting your fiction published! Novel & Short Story Writer's Market 2018 is the only resource you need to get your short stories, novellas, and novels published. This edition of NSSWM features hundreds of updated listings for book publishers, literary agents, fiction publications, contests, and more, and each listing includes contact information, submission guidelines, and other essential tips. Inside Novel & Short Story Writer's Market, you'll find valuable tips for: • How to take your readers on a roller-coaster ride by mastering the art of the unexpected • Weaving foreshadowing and echoing into your story • Discovering the DNA--dialogue, narrative, and action--dwelling inside all memorable characters • Gaining insight from best-selling and award-winning authors, including Steve Berry, Liane Moriarty, Junot Diaz, and more You will also receive a one-year subscription to WritersMarket.com's searchable online database of fiction publishers (comes with print version only). Includes exclusive access to the webinar \"Say What? Create Dialogue to Hook Readers and Make Your Story Pop\" by best-selling author Jennifer Probst.",
            "pageCount": 512,
            "thumbnail": "http://books.google.com/books/content?id=yBtjDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=yBtjDwAAQBAJ&pg=PT259&dq=incategories:fiction&hl=&cd=34&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "zZNxDwAAQBAJ",
            "storeId": 1,
            "title": "Women's Fiction: A Guide to Popular Reading Interests",
            "subtitle": "A Guide to Popular Reading Interests",
            "authors": [
                "Rebecca Vnuk",
                "Nanette Donohue"
            ],
            "categories": [
                "Language Arts & Disciplines"
            ],
            "price": 0.0,
            "publisher": "Libraries Unlimited",
            "publishedDate": "2013-09-17",
            "description": "Offering a fresh perspective on women's fiction for a broad reading audience—fans as well as librarians—this book defines and maps the genre, and describes hundreds of relevant titles.",
            "pageCount": 233,
            "thumbnail": "http://books.google.com/books/content?id=zZNxDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=zZNxDwAAQBAJ&pg=PR9&dq=incategories:fiction&hl=&cd=39&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "MHG_CQAAQBAJ",
            "storeId": 1,
            "title": "Fiction and Art",
            "subtitle": "Explorations in Contemporary Theory",
            "authors": [
                "Ananta Ch. Sukla"
            ],
            "categories": [
                "Philosophy"
            ],
            "price": 0.0,
            "publisher": "Bloomsbury Publishing",
            "publishedDate": "2015-09-24",
            "description": "The nature of fiction has long been debated across the humanities, and is of considerable importance for philosophical aesthetics, literary theory, narratology and the history of ideas. This volume offers something entirely new: a selection of multidisciplinary perspectives on fiction written by an international team of contributors at the forefront of their fields, providing a spectrum of approaches to compare and contrast. This volume, divided between historical, cognitive, aesthetic and non-western approaches, targets a wide range of topics, including mathematics, history, religion and metaphysics. This is a seminal volume on one of the most important topics in the humanities.",
            "pageCount": 416,
            "thumbnail": "http://books.google.com/books/content?id=MHG_CQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=MHG_CQAAQBAJ&pg=PA201&dq=incategories:fiction&hl=&cd=38&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "KH5KCAAAQBAJ",
            "storeId": 1,
            "title": "Justice in Young Adult Speculative Fiction",
            "subtitle": "A Cognitive Reading",
            "authors": [
                "Marek C. Oziewicz"
            ],
            "categories": [
                "Literary Criticism"
            ],
            "price": 0.0,
            "publisher": "Routledge",
            "publishedDate": "2015-04-17",
            "description": "This book is the first to offer a justice-focused cognitive reading of modern YA speculative fiction in its narrative and filmic forms. It links the expansion of YA speculative fiction in the 20th century with the emergence of human and civil rights movements, with the communitarian revolution in conceptualizations of justice, and with spectacular advances in cognitive sciences as applied to the examination of narrative fiction. Oziewicz argues that complex ideas such as justice are processed by the human mind as cognitive scripts; that scripts, when narrated, take the form of multiply indexable stories; and that YA speculative fiction is currently the largest conceptual testing ground in the forging of justice consciousness for the 21st century world. Drawing on recent research in the cognitive and evolutionary sciences, Oziewicz explains how poetic, retributive, restorative, environmental, social, and global types of justice have been represented in narrative fiction, from 19th century folk and fairy tales through 21st century fantasy, dystopia, and science fiction. Suggesting that the appeal of these and other nonmimetic genres is largely predicated on the dream of justice, Oziewicz theorizes new justice scripts as conceptual tools essential to help humanity survive the qualitative leap toward an environmentally conscious, culturally diversified global world. This book is an important contribution to studies of children’s and YA speculative fiction, adding a new perspective to discussions about the educational as well as social potential of nonmimetic genres. It demonstrates that the justice imperative is very much alive in YA speculative fiction, creating new visions of justice relevant to contemporary challenges.",
            "pageCount": 258,
            "thumbnail": "http://books.google.com/books/content?id=KH5KCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=KH5KCAAAQBAJ&pg=PA59&dq=incategories:fiction&hl=&cd=20&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "rs5eRutIV5cC",
            "storeId": 1,
            "title": "Impossibility Fiction",
            "subtitle": "Alternativity, Extrapolation, Speculation",
            "authors": [
                "Derek Littlewood",
                "Peter Stockwell"
            ],
            "categories": [
                "Social Science"
            ],
            "price": 0.0,
            "publisher": "Rodopi",
            "publishedDate": "1996",
            "description": "Impossibility fiction is an 'intergenre' that has recently been the resort of many writers searching for new ways of understanding and expressing the real world of the imagination, making use of fantasy, alternative history and science fiction. Coping with ideas that are both impossible and realistically constructed is the ultimate contemporary challenge of our technology. The chapters of this book move towards establishing appropriate readings that allow contemporary readers to negotiate unreality, a skill that the end of the millennium is making inevitably necessary. Such strategies have long been the preserve of literary and cultural study, and here a number of well-regarded scholars and some new to the field make their contribution to an area that has become increasingly important in recent years. From Mary Shelley to Philip K. Dick, Iain M. Banks to J.G. Ballard, taking in African-American science fiction, Jurassic Park, and Kurt Vonnegut, and exploring issues of alternative history and ideology, feminism, the holocaust, characterisation, and impossible geography, this collection is an important source-book for all those interested in the literature, culture and philosophy of realistic impossible worlds.",
            "pageCount": 211,
            "thumbnail": "http://books.google.com/books/content?id=rs5eRutIV5cC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=rs5eRutIV5cC&pg=PA108&dq=incategories:fiction&hl=&cd=25&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "wG7WCgAAQBAJ",
            "storeId": 1,
            "title": "Snow Falls",
            "subtitle": null,
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2012",
            "description": "Jennifer Kincaid, on her way to a writer's workshop in the Colorado mountain town of Lake City, gets lost and is stranded by an avalanche. Catherine Ryan Barrett, running from fame and fortune of her family name, wants nothing more to spend the winter alone and sequestered in her high mountain cabin. She is not prepared for a party crasher. After spending two months together, they form an unlikely friendship that deepens even further. But after the spring thaw, Jen leaves and returns to her life in Santa Fe—and to the man who wants to marry her. All she knows of the woman who rescued her is her name...Ryan.",
            "pageCount": 228,
            "thumbnail": "http://books.google.com/books/content?id=wG7WCgAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=wG7WCgAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=5&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "Nb75CQAAQBAJ",
            "storeId": 1,
            "title": "At Seventeen",
            "subtitle": "",
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2013-07-01",
            "description": "Madison Lansford and Shannon Fletcher met when they were ten years old. Madison—daughter of wealthy parents and Shannon, daughter of their live-in maid and cook—became fast friends, yet both knew their place in life. There was never a doubt that they would become lovers . . . there was also never a doubt that Madison would marry and maintain her social standing in the community. Little by little, they grew apart, their love affair ending with Madison’s marriage and pregnancy. Now, years later, Shannon returns to her old hometown to care for her ailing mother. Can they rebuild their friendship? Or will their new-found closeness bring back memories of their long-lost love? Travel through the years with Shannon and Madison and watch their love unfold as they move from teens to young women and into adulthood.",
            "pageCount": 272,
            "thumbnail": "http://books.google.com/books/content?id=Nb75CQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=Nb75CQAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=15&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "gHU7CgAAQBAJ",
            "storeId": 1,
            "title": "Storms",
            "subtitle": "",
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2011-07-12",
            "description": "Estranged for years from her father and four brothers after her mother’s death, Carson Cartwright is surprised when she gets a phone call from her twin brother, urging a reconciliation before their father succumbs to his final illness. Though she has spent more than a decade trying to forget her family existed, she is suddenly pulled back to the Montana ranch where she grew up. Carson discovers her brothers divided over plans to change their working ranch into a guest ranch, and their consultant, Kerry Elder, doesn’t seem above using her wiles to get her way. Kerry finds that while she may have her clients right where she wants them, it’s the wayward sister that may be awakening something she has long denied. The big Montana sky crackles with thunder and lightning as emotions twist in unbidden directions. Neither Carson nor Kerry is prepared for the wild storms of summer.",
            "pageCount": 236,
            "thumbnail": "http://books.google.com/books/content?id=gHU7CgAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=gHU7CgAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=4&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "wTM7DwAAQBAJ",
            "storeId": 1,
            "title": "Creepy Conspiracy Theories",
            "subtitle": null,
            "authors": [
                "Virginia Loh-Hagan"
            ],
            "categories": [
                "Juvenile Nonfiction"
            ],
            "price": 0.0,
            "publisher": "Cherry Lake",
            "publishedDate": "2018-01-01",
            "description": "Creepy Conspiracy Theories checks out the wildest conspiracy stories in the world--stories too strange to be made up! The book is written with a high interest level to appeal to a more mature audience with a lower level of complexity for struggling readers. Clear visuals and colorful photographs help with comprehension. Fascinating information and wild facts that will hold the readers' interest are conveyed in considerate text for older readers, allowing for successful mastery of content. A table of contents, glossary, and index all enhance comprehension and vocabulary.",
            "pageCount": 32,
            "thumbnail": "http://books.google.com/books/content?id=wTM7DwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=wTM7DwAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=1&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "Pf6L2GZ9WT0C",
            "storeId": 1,
            "title": "Fact and Fiction",
            "subtitle": "Representations of the Asturian Revolution (1934-1938)",
            "authors": [
                "Sarah Sanchez"
            ],
            "categories": [
                "Literary Criticism"
            ],
            "price": 0.0,
            "publisher": "MHRA",
            "publishedDate": "2003",
            "description": "This study examines a varied corpus of documentary and literary texts produced during the Miners revolution of October 1934 in Asturias.",
            "pageCount": 366,
            "thumbnail": "http://books.google.com/books/content?id=Pf6L2GZ9WT0C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=Pf6L2GZ9WT0C&pg=PA338&dq=incategories:fiction&hl=&cd=33&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "hNLZCgAAQBAJ",
            "storeId": 1,
            "title": "Devil's Rock",
            "subtitle": "",
            "authors": [
                "Gerri Hill"
            ],
            "categories": [
                "Fiction"
            ],
            "price": 0.0,
            "publisher": "Bella Books",
            "publishedDate": "2010-12-21",
            "description": "Two women vow to bring a killer to justice. Deputy Andrea Sullivan had hoped to leave the horrors of Los Angeles behind her, but the serial murders of college students in peaceful, picturesque Sedona is her nightmare case to solve. The complexities stretch local resources to the limit, and the FBI joins the case with Agent Cameron Ross in the lead. The crime scenes are covered with the trademark signs of the fiendish Patrick Doe, whose handiwork has been investigated by Dallas detective Tori Hunter and others. But where Hunter failed Cameron intends to win. She will break the case, find justice and go on her way. No distractions. Unfortunately, Deputy Sullivan is very distracting. And Patrick Doe has other plans. Bestselling, award-winning Gerri Hill presents the turmoil of unbidden passion combined with heart-pounding suspense in a compelling story inspired by her own Hunter's Way.",
            "pageCount": 245,
            "thumbnail": "http://books.google.com/books/content?id=hNLZCgAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=hNLZCgAAQBAJ&printsec=frontcover&dq=incategories:fiction&hl=&cd=18&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "4S6WAAAAQBAJ",
            "storeId": 1,
            "title": "Writing Fiction For Dummies",
            "subtitle": null,
            "authors": [
                "Randy Ingermanson",
                "Peter Economy"
            ],
            "categories": [
                "Education"
            ],
            "price": 0.0,
            "publisher": "John Wiley & Sons",
            "publishedDate": "2009-11-05",
            "description": "A complete guide to writing and selling your novel So you want to write a novel? Great! That’s a worthy goal, no matter what your reason. But don’t settle for just writing a novel. Aim high. Write a novel that you intend to sell to a publisher. Writing Fiction for Dummies is a complete guide designed to coach you every step along the path from beginning writer to royalty-earning author. Here are some things you’ll learn in Writing Fiction for Dummies: Strategic Planning: Pinpoint where you are on the roadmap to publication; discover what every reader desperately wants from a story; home in on a marketable category; choose from among the four most common creative styles; and learn the self-management methods of professional writers. Writing Powerful Fiction: Construct a story world that rings true; create believable, unpredictable characters; build a strong plot with all six layers of complexity of a modern novel; and infuse it all with a strong theme. Self-Editing Your Novel: Psychoanalyze your characters to bring them fully to life; edit your story structure from the top down; fix broken scenes; and polish your action and dialogue. Finding An Agent and Getting Published: Write a query letter, a synopsis, and a proposal; pitch your work to agents and editors without fear. Writing Fiction For Dummies takes you from being a writer to being an author. It can happen—if you have the talent and persistence to do what you need to do.",
            "pageCount": 384,
            "thumbnail": "http://books.google.com/books/content?id=4S6WAAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=4S6WAAAAQBAJ&pg=PA357&dq=incategories:fiction&hl=&cd=30&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "yJUmEAAAQBAJ",
            "storeId": 1,
            "title": "Murakami T",
            "subtitle": "The T-Shirts I Love",
            "authors": [
                "Haruki Murakami"
            ],
            "categories": [
                "Biography & Autobiography"
            ],
            "price": 0.0,
            "publisher": "Random House",
            "publishedDate": "2021-11-23",
            "description": "The international literary icon opens his eclectic closet and shares photos of his extensive unique personal T-shirt collection, accompanied by essays that reveal a side of the writer rarely seen by the public. This is the ultimate gift for Murakami fans. Haruki Murakami's books have galvanized millions around the world. Many of his fans know about his 10,000-vinyl-record collection, and his obsession with running, but few have heard about a more intimate, and perhaps more unique, passion: his T-shirt-collecting habit. In Murakami T, the famously reclusive novelist shows us his T-shirts - including gems found in bookshops, charity shops and record stores - from those featuring whisky, animals, cars and superheroes, to souvenirs of marathons and a Beach Boys concert in Honolulu, to the shirt that inspired the beloved short story 'Tony Takitani'. Accompanied by short, frank essays that have been translated into English for the first time, these photographs reveal much about Murakami's multifaceted and wonderfully eccentric persona. 'The world's most popular cult novelist' Guardian",
            "pageCount": 192,
            "thumbnail": "http://books.google.com/books/content?id=yJUmEAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=yJUmEAAAQBAJ&pg=PP1&dq=incategories:fiction&hl=&cd=21&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "wNlvCQAAQBAJ",
            "storeId": 1,
            "title": "Get Started in Writing Young Adult Fiction",
            "subtitle": "How to write inspiring fiction for young readers",
            "authors": [
                "Juliet Mushens"
            ],
            "categories": [
                "Language Arts & Disciplines"
            ],
            "price": 0.0,
            "publisher": "Hachette UK",
            "publishedDate": "2015-06-18",
            "description": "Learn how to write young adult fiction with imagination and verve. This is an authoritative and engaging introduction to writing young adult fiction for the complete beginner. It will help you understand how the genre works, the big do's and don't's - as well as giving you the inspiration and motivation you actually need to write. Written by a leading literary agent who knows what it takes to make it in this market, this book will give you the advice and tips you need to stand out. An essential book for anyone hoping to emulate the success and addictive qualities that characterize books like The Hunger Games, Twilight, Divergent and The Fault in Our Stars. ABOUT THE SERIES The Teach Yourself Creative Writing series helps aspiring authors tell their story. Covering a range of genres from science fiction and romantic novels, to illustrated children's books and comedy, this series is packed with advice, exercises and tips for unlocking creativity and improving your writing. And because we know how daunting the blank page can be, we set up the Just Write online community at tyjustwrite, for budding authors and successful writers to connect and share.",
            "pageCount": 256,
            "thumbnail": "http://books.google.com/books/content?id=wNlvCQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=wNlvCQAAQBAJ&pg=PT14&dq=incategories:fiction&hl=&cd=35&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "i-EgAQAAMAAJ",
            "storeId": 1,
            "title": "The Commonwealth",
            "subtitle": null,
            "authors": null,
            "categories": null,
            "price": 0.0,
            "publisher": null,
            "publishedDate": "1986",
            "description": null,
            "pageCount": 0,
            "thumbnail": "http://books.google.com/books/content?id=i-EgAQAAMAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=i-EgAQAAMAAJ&q=incategories:fiction&dq=incategories:fiction&hl=&cd=24&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "0mgwDwAAQBAJ",
            "storeId": 1,
            "title": "Framing Fan Fiction",
            "subtitle": "Literary and Social Practices in Fan Fiction Communities",
            "authors": [
                "Kristina Busse"
            ],
            "categories": [
                "Social Science"
            ],
            "price": 0.0,
            "publisher": "University of Iowa Press",
            "publishedDate": "2017-10",
            "description": "Gathering some of Kristina Busse’s essential essays on fan fiction together with new work, Framing Fan Fiction argues that understanding media fandom requires combining literary theory with cultural studies because fan artifacts are both artistic works and cultural documents. Drawing examples from a multitude of fan communities and texts, Busse frames fan fiction in three key ways: as individual and collective erotic engagement; as a shared interpretive practice in which tropes constitute shared creative markers and illustrate the complexity of fan creations; and as a point of contention around which community conflicts over ethics play out. Moving between close readings of individual texts and fannish tropes on the one hand, and the highly intertextual embeddedness of these communal creations on the other, the book demonstrates that fan fiction is simultaneously a literary and a social practice. Framing Fan Fiction deploys personal history and the interpretations of specific stories to contextualize fan fiction culture and its particular forms of intertextuality and performativity. In doing so, it highlights the way fans use fan fiction’s reimagining of the source material to explore issues of identities and peformativities, gender and sexualities, within a community of like-minded people. In contrast to the celebration of originality in many other areas of artistic endeavor, fan fiction celebrates repetition, especially the collective creation and circulation of tropes. An essential resource for scholars, Framing Fan Fiction is also an ideal starting point for those new to the study of fan fiction and its communities of writers.",
            "pageCount": 254,
            "thumbnail": "http://books.google.com/books/content?id=0mgwDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
            "previewLink": null,
            "infoLink": "http://books.google.co.in/books?id=0mgwDwAAQBAJ&pg=PA120&dq=incategories:fiction&hl=&cd=40&source=gbs_api",
            "buyLink": null,
            "bookCount": 40
        },
        {
            "bookId": "6E7qBAAAQBAJ",
            "storeId": 1,
            "title": "Cut Elimination in Categories-----",
            "subtitle": null,
            "authors": [
                "K. Dosen---"
            ],
            "categories": [
                "Philosophy---"
            ],
            "price": 221.0,
            "publisher": "Springer Science & Business Media---",
            "publishedDate": "2013-04-18---",
            "description": "Proof theory and category theory were first drawn together by Lambek some 30 years ago but, until now, the most fundamental notions of category theory (as opposed to their embodiments in logic) have not been explained systematically in terms of proof theory. Here it is shown that these notions, in particular the notion of adjunction, can be formulated in such as way as to be characterised by composition elimination. Among the benefits of these composition-free formulations are syntactical and simple model-theoretical, geometrical decision procedures for the commuting of diagrams of arrows. Composition elimination, in the form of Gentzen's cut elimination, takes in categories, and techniques inspired by Gentzen are shown to work even better in a purely categorical context than in logic. An acquaintance with the basic ideas of general proof theory is relied on only for the sake of motivation, however, and the treatment of matters related to categories is also in general self contained. Besides familiar topics, presented in a novel, simple way, the monograph also contains new results. It can be used as an introductory text in categorical proof theory.----",
            "pageCount": 221,
            "thumbnail": "http://books.google.com/books/content?id=6E7qCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api-----",
            "previewLink": null,
            "infoLink": null,
            "buyLink": null,
            "bookCount": 141
        }
    ],
    "message": "41 book(s) found.",
    "statusCode": 200
}


API Url: http://localhost:8080/books/create [POST Request]

Request Body 
{
        "bookId" : "6E7qBAAAQBAJ",
        "storeId" : 1,
        "title" : "Cut Elimination in Categories COPY 1",
        "authors" : [
                "K. Dosen"
        ],
        "categories" : [
                "Philosophy"
        ],
        "price" : 220,
        "publisher" : "Springer Science & Business Media",
        "publishedDate" : "2013-04-18",
        "description" : "Proof theory and category theory were first drawn together by Lambek some 30 years ago but, until now, the most fundamental notions of category theory (as opposed to their embodiments in logic) have not been explained systematically in terms of proof theory. Here it is shown that these notions, in particular the notion of adjunction, can be formulated in such as way as to be characterised by composition elimination. Among the benefits of these composition-free formulations are syntactical and simple model-theoretical, geometrical decision procedures for the commuting of diagrams of arrows. Composition elimination, in the form of Gentzen's cut elimination, takes in categories, and techniques inspired by Gentzen are shown to work even better in a purely categorical context than in logic. An acquaintance with the basic ideas of general proof theory is relied on only for the sake of motivation, however, and the treatment of matters related to categories is also in general self contained. Besides familiar topics, presented in a novel, simple way, the monograph also contains new results. It can be used as an introductory text in categorical proof theory.",
        "pageCount" : 229,
        "thumbnail" : "http://books.google.com/books/content?id=6E7qCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
        "infoLink" : "http://books.google.co.in/books?id=6E7qCAAAQBAJ&pg=PA2&dq=incategories:fiction&hl=&cd=14&source=gbs_api",
        "bookCount" : 140
}

Response:

{
    "success": true,
    "data": {
        "bookId": "6E7qBAAAQBAJ",
        "storeId": 1,
        "title": "Cut Elimination in Categories COPY 1",
        "subtitle": null,
        "authors": [
            "K. Dosen"
        ],
        "categories": [
            "Philosophy"
        ],
        "price": 220.0,
        "publisher": "Springer Science & Business Media",
        "publishedDate": "2013-04-18",
        "description": "Proof theory and category theory were first drawn together by Lambek some 30 years ago but, until now, the most fundamental notions of category theory (as opposed to their embodiments in logic) have not been explained systematically in terms of proof theory. Here it is shown that these notions, in particular the notion of adjunction, can be formulated in such as way as to be characterised by composition elimination. Among the benefits of these composition-free formulations are syntactical and simple model-theoretical, geometrical decision procedures for the commuting of diagrams of arrows. Composition elimination, in the form of Gentzen's cut elimination, takes in categories, and techniques inspired by Gentzen are shown to work even better in a purely categorical context than in logic. An acquaintance with the basic ideas of general proof theory is relied on only for the sake of motivation, however, and the treatment of matters related to categories is also in general self contained. Besides familiar topics, presented in a novel, simple way, the monograph also contains new results. It can be used as an introductory text in categorical proof theory.",
        "pageCount": 229,
        "thumbnail": "http://books.google.com/books/content?id=6E7qCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
        "previewLink": null,
        "infoLink": "http://books.google.co.in/books?id=6E7qCAAAQBAJ&pg=PA2&dq=incategories:fiction&hl=&cd=14&source=gbs_api",
        "buyLink": null,
        "bookCount": 140
    },
    "message": "book inserted successfully.",
    "statusCode": 200
}


API Url: http://localhost:8080/books/update/6E7qBAAAQBAJ [PUT Request]

Rquest Body
{
        "bookId" : "6E7qBAAAQBAJ",
        "storeId" : 1,
        "title" : "Cut Elimination in Categories-----",
        "authors" : [
                "K. Dosen---"
        ],
        "categories" : [
                "Philosophy---"
        ],
        "price" : 221,
        "publisher" : "Springer Science & Business Media---",
        "publishedDate" : "2013-04-18---",
        "description" : "Proof theory and category theory were first drawn together by Lambek some 30 years ago but, until now, the most fundamental notions of category theory (as opposed to their embodiments in logic) have not been explained systematically in terms of proof theory. Here it is shown that these notions, in particular the notion of adjunction, can be formulated in such as way as to be characterised by composition elimination. Among the benefits of these composition-free formulations are syntactical and simple model-theoretical, geometrical decision procedures for the commuting of diagrams of arrows. Composition elimination, in the form of Gentzen's cut elimination, takes in categories, and techniques inspired by Gentzen are shown to work even better in a purely categorical context than in logic. An acquaintance with the basic ideas of general proof theory is relied on only for the sake of motivation, however, and the treatment of matters related to categories is also in general self contained. Besides familiar topics, presented in a novel, simple way, the monograph also contains new results. It can be used as an introductory text in categorical proof theory.----",
        "pageCount" : 221,
        "thumbnail" : "http://books.google.com/books/content?id=6E7qCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api-----",
        "infoLink" : "http://books.google.co.in/books?id=6E7qCAAAQBAJ&pg=PA2&dq=incategories:fiction&hl=&cd=14&source=gbs_api----",
        "bookCount" : 141
}

Response: 

{
    "success": true,
    "data": {
        "bookId": "6E7qBAAAQBAJ",
        "storeId": 1,
        "title": "Cut Elimination in Categories-----",
        "subtitle": null,
        "authors": [
            "K. Dosen---"
        ],
        "categories": [
            "Philosophy---"
        ],
        "price": 221.0,
        "publisher": "Springer Science & Business Media---",
        "publishedDate": "2013-04-18---",
        "description": "Proof theory and category theory were first drawn together by Lambek some 30 years ago but, until now, the most fundamental notions of category theory (as opposed to their embodiments in logic) have not been explained systematically in terms of proof theory. Here it is shown that these notions, in particular the notion of adjunction, can be formulated in such as way as to be characterised by composition elimination. Among the benefits of these composition-free formulations are syntactical and simple model-theoretical, geometrical decision procedures for the commuting of diagrams of arrows. Composition elimination, in the form of Gentzen's cut elimination, takes in categories, and techniques inspired by Gentzen are shown to work even better in a purely categorical context than in logic. An acquaintance with the basic ideas of general proof theory is relied on only for the sake of motivation, however, and the treatment of matters related to categories is also in general self contained. Besides familiar topics, presented in a novel, simple way, the monograph also contains new results. It can be used as an introductory text in categorical proof theory.----",
        "pageCount": 221,
        "thumbnail": "http://books.google.com/books/content?id=6E7qCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api-----",
        "previewLink": null,
        "infoLink": "http://books.google.co.in/books?id=6E7qCAAAQBAJ&pg=PA2&dq=incategories:fiction&hl=&cd=14&source=gbs_api----",
        "buyLink": null,
        "bookCount": 141
    },
    "message": "book inserted successfully.",
    "statusCode": 200
}


API Url: http://localhost:8080/books/delete/{bookid}
	http://localhost:8080/books/delete/6E7qBAAAQBAJ

Response
	{
    "success": true,
    "data": {
        "bookId": "6E7qBAAAQBAJ",
        "storeId": 1,
        "title": "Cut Elimination in Categories-----",
        "subtitle": null,
        "authors": [
            "K. Dosen---"
        ],
        "categories": [
            "Philosophy---"
        ],
        "price": 221.0,
        "publisher": "Springer Science & Business Media---",
        "publishedDate": "2013-04-18---",
        "description": "Proof theory and category theory were first drawn together by Lambek some 30 years ago but, until now, the most fundamental notions of category theory (as opposed to their embodiments in logic) have not been explained systematically in terms of proof theory. Here it is shown that these notions, in particular the notion of adjunction, can be formulated in such as way as to be characterised by composition elimination. Among the benefits of these composition-free formulations are syntactical and simple model-theoretical, geometrical decision procedures for the commuting of diagrams of arrows. Composition elimination, in the form of Gentzen's cut elimination, takes in categories, and techniques inspired by Gentzen are shown to work even better in a purely categorical context than in logic. An acquaintance with the basic ideas of general proof theory is relied on only for the sake of motivation, however, and the treatment of matters related to categories is also in general self contained. Besides familiar topics, presented in a novel, simple way, the monograph also contains new results. It can be used as an introductory text in categorical proof theory.----",
        "pageCount": 221,
        "thumbnail": "http://books.google.com/books/content?id=6E7qCAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api-----",
        "previewLink": null,
        "infoLink": null,
        "buyLink": null,
        "bookCount": 141
    },
    "message": "book deleted successfully.",
    "statusCode": 200
}
