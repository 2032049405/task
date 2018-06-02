package service;

import model.Student;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/*
* 随机类
* 获取随机Student POJO
* */
public class RandomStudent {

    private static StringBuilder stuBuilder = new StringBuilder();
    private static StringBuilder nameBuilder = new StringBuilder();
    private static StringBuilder schoolBuilder = new StringBuilder();
    static Logger logger = Logger.getLogger(RandomStudent.class.getName());
    private static Random random = new Random();


    public Student getStudent(){

        Student student = new Student();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        student.setName( getNameBuilder().toString());
        student.setCreate_at(date.getTime());
        student.setUpdate_at(date.getTime());
        student.setQq(getQq());
        student.setType(getType());
        student.setStartTime(sdf.format(date.getTime()));
        student.setSchool(getSchool().toString());
        student.setStuNum(getStuNum());
        student.setDailyLink("jnshu.com");
        student.setPro(getPro());
        student.setBrother(getNameBuilder().toString());
        student.setUserId(getUserId());

//        logger.info(student.toString());
        return student;
    }


    public int getUserId(){

        return random.nextInt(99999);

    }

    public StringBuilder getNameBuilder(){

        String[] strN = {
                "赵","钱","孙","李","周","吴","郑","王","诸葛","公孙",
                "冯","陈","褚","卫","蒋","沈","韩","杨","欧阳","乌良",
                "朱","秦","尤","许","何","吕","施","张","夏侯","东郭",
                "孔","曹","严","华","金","魏","陶","姜","乌苏","令狐",
                "戚","谢","邹","喻","柏","水","窦","章","司马","赫连",
                "云","苏","潘","葛","奚","范","彭","郎","拓跋","乐正",
                "鲁","韦","昌","马","苗","凤","花","方"};

        String[] strM = {
                "辰彬","运皓","骞腾","晨轩","侠宇","振震","骞晨","运骏","澄运","轩龙","逸辰","嘉","强",
                "盛凡","晨骏","柏成","凯骞","文邦","骞逸","梓然","鸿仕","树","翰","梁","允轩","炳家",
                "振家","辞","晨骞","良骏","骏晨","嘉中","畅胤","德稷","星运","潍","运帆","泽","辰",
                "铭","福","辞桀","材泽","华","华文","振良","祯逸","驰初","凯星","谷轩","辰嘉","震",
                "振坤","康骞","嘉","振","骏","爵斌","然允","嘉驰","勇骞","文骏","轩","骞梓","嘉俊",
                "运海","峰振","骏","良","家梓","加晨","权祜","阳","星轩","鸿锐","沛骞","畅","仕延",
                "暄","震家","郁辰","辰树","运奇","辰帝","杰运","成涛","博胤","信","初尧","良林",
                "高晨","命","北家","松木","醒","牙","利","峰峰","梁木","好好","球球","门伏","神漾",
                "嘉浩","哲权","腾骞","锋福","裕裕","天勇","鹤","运然","钊浩","球","门","漾",
                "魄","英","鸥鸟","瀚海","荷","枫枫","男","东","西政","欧派","佛山","让","关",
                "高","路","南","宿也","吉利","烈焰","冰山","恴熙","木","不还","影","伏","凼"};

//        for (int i=0;i<5;i++){
//            NameBuild.delete(0,99);
//            NameBuild.append(strN[(int)(Math.random()* strN.length)]);
//            NameBuild.append(strM[(int)(Math.random()* strN.length)]);
//            System.out.print(NameBuild.toString()+"\n");
//            NameBuild.delete(0,99);
//        }

        nameBuilder.delete(0,999);
        nameBuilder.append(strN[(int)(Math.random()* strN.length)]);
        nameBuilder.append(strM[(int)(Math.random()* strN.length)]);

        return nameBuilder;
    }



    public int getType(){
        return random.nextInt(12) % (1 - 12 + 1) + 1;
    }

    public String getTypeString(int type){
        if(type == 1){
            return "web前端";
        }else if(type == 2){
            return "Android";
        }else if(type == 3){
            return "ios";
        }else if(type == 4){
            return "java";
        }else if(type == 5){
            return "op";
        }else if(type == 6){
            return "pm";
        }else if(type == 7){
            return "ui";
        }else if(type == 8){
            return "qa";
        }else if(type == 9){
            return "python";
        }else if(type == 10){
            return "ui";
        }else if(type == 11){
            return "运营";
        }else {
            return "无职业";
        }

    }

    public StringBuilder getSchool(){

        String[] strN = {
                "农业","中华","常青藤","轻工业","传媒","计算机信息技术","生物","科学技术","地质研究","社会管理",
                "建筑","船舶与海洋","影视传播","电子信息","体育","多媒体","制造与设计","表演","医科","法律",
                "全能","空天技术","交通运输","千层饼","大洋洲","欧洲","亚洲","美洲","高科",
                "信达","华北","华中","西藏","伦敦","坦桑","荆州","社科","黑魔法","伐尔夫尼"};

        String[] strM = {
                "大学","学院","职业学院","学校","艺术学院","技术学院"};

        schoolBuilder.delete(0,999);
        schoolBuilder.append(strN[(int)(Math.random()* strN.length)]);
        schoolBuilder.append(strM[(int)(Math.random()* strM.length)]);

        return schoolBuilder;
    }


    public int getAge(int min,int max){

        return random.nextInt(max)%(max-min+1) + min;

    }


    public long getQq(){


//        生成7-8位随机数
//        int max=10000000;
//        int min=1000000;

        int max=99999999;
        int min=10000000;

        return random.nextInt(max)%(max-min+1) + min;

        //获取一个8位随机数
        //将随机数转换为字符串
//        String str = String.valueOf(Math.random()).replace("0.", "");
        //截取字符串转化long
//        Long.ValueOf("String")返回Long包装类型
//        包装类型： Byte，Integer，Short，Long，Boolean，Character，Float，Double等
//        Long.parseLong("String")返回long基本数据类型
//        基本数据类型：byte，int， short， long， boolean，char， float，double等
//        java.lang.NumberFormatException: For input string: "2.900941252" 偶尔报错数据类型转换异常
//        return Long.parseLong(str.substring(0, 11));

    }



    public int getStuNum(){
//        return random.nextInt(10000);

//        return System.currentTimeMillis();

        String str = String.valueOf(random.nextInt(9999999)+1000);
        str = str.substring(str.length()-4,str.length());
        return Integer.parseInt(str);


    }



    public String getPro(){
        String[] str = {"真理惟一可靠的标准就是永远自相符合",
                "土地是以它的肥沃和收获而被估价的；才能也是土地，不过它生产的不是粮食，而是真理。如果只能滋生瞑想和幻想的话，即使再大的才能也只是砂地或盐池，那上面连小草也长不出来的。",
                "我需要三件东西：爱情友谊和图书。然而这三者之间何其相通！炽热的爱情可以充实图书的内容，图书又是人们最忠实的朋友。 ",
                "时间是一切财富中最宝贵的财富。",
                "世界上一成不变的东西，只有“任何事物都是在不断变化的”这条真理。",
                "过放荡不羁的生活，容易得像顺水推舟，但是要结识良朋益友，却难如登天。 ",
                "这世界要是没有爱情，它在我们心中还会有什么意义！这就如一盏没有亮光的走马灯。 ",
                "生活有度，人生添寿。",
                "相信谎言的人必将在真理之前毁灭。 —— 赫尔巴特",
                "真正的科学家应当是个幻想家；谁不是幻想家，谁就只能把自己称为实践家。 —— 巴尔扎克",
                "爱情原如树叶一样，在人忽视里绿了，在忍耐里露出蓓蕾。 —— 何其芳",
                "一件事实是一条没有性别的真理。 —— 纪伯伦",
                "友谊是一棵可以庇荫的树。 —— 柯尔律治",
                "理想是人生的太阳。 —— 德莱赛",
                "如果你浪费了自己的年龄，那是挺可悲的。因为你的青春只能持续一点儿时间——很短的一点儿时间。 —— 王尔德",
                "我读的书愈多，就愈亲近世界，愈明了生活的意义，愈觉得生活的重要。",
                "人生的磨难是很多的，所以我们不可对于每一件轻微的伤害都过于敏感。在生活磨难面前，精神上的坚强和无动于衷是我们抵抗罪恶和人生意外的最好武器。 —— 洛克",
                "人生并不像火车要通过每个站似的经过每一个生活阶段。人生总是直向前行走，从不留下什么。 —— 刘易斯",
                "不达成功誓不休。 —— 陈潭秋",
                "科学是到处为家的，不过，在任何不播种的地方，是决不会得到丰收的。 —— 赫尔岑",
                "爱情只有当它是自由自在时，才会叶茂花繁。认为爱情是某种义务的思想只能置爱情于死地。只消一句话：你应当爱某个人，就足以使你对这个人恨之入骨。 —— 罗素",
                "没有人不爱惜他的生命，但很少人珍视他的时间。 —— 梁实秋",
                "温顺的青年人在图书馆里长大，他们相信他们的责任是应当接受西塞罗，洛克，培根发表的意见；他们忘了西塞罗，洛克与培根写这些书的时候，也不过是在图书馆里的青年人。 —— 爱默生",
                "劳于读书，逸于作文。",
                "笨蛋自以为聪明，聪明人才知道自己是笨蛋。 —— 莎士比亚",
                "毫无经验的初恋是迷人的，但经得起考验的爱情是无价的。 —— 马尔林斯基",
                "良好的健康状况和高度的身体训练，是有效的脑力劳动的重要条件。 —— 克鲁普斯卡娅",
                "成功的秘诀，在永不改变既定的目的。 —— 卢梭",
                "从不浪费时间的人，没有工夫抱怨时间不够。 —— 杰弗逊",
                "谚语可以体现一个民族的创造力，智慧和精神。 —— 培根",
                "说真话不应当是艰难的事情。我所谓真话不是指真理，也不是指正确的话。自己想什麽就讲什麽；自己怎麽想就怎麽说这就是说真话。 —— 巴金",
                "她们把自己恋爱作为终极目标，有了爱人便什么都不要了，对社会作不了贡献，人生价值最少。",
                "忠诚可以简练地定义为对不可能的情况的一种不合逻辑的信仰。 —— 门肯",
                "人生贵知心，定交无暮早。 —— 袁中道",
                "谁不会休息，谁就不会工作。 —— 列宁",
                "友谊是灵魂的结合，这个结合是可以离异的，这是两个敏感，正直的人之间心照不宣的契约。 —— 伏尔泰",
                "新的数学方法和概念，常常比解决数学问题本身更重要。 —— 华罗庚",
                "个人的智慧只是有限的。 —— 普劳图斯",
                "较高级复杂的劳动，是这样一种劳动力的表现，这种劳动力比较普通的劳动力需要较高的教育费用，它的生产需要花费较多的劳动时间。因此，具有较高的价值。 —— 马克思",
                "对的事，每天做",
                "伟大的思想能变成巨大的财富。 —— 塞内加",
                "将人生投于赌博的赌徒，当他们胆敢妄为的时候，对自己的力量有充分的自信，并且认为大胆的冒险是唯一的形式。 —— 茨威格",
                "道德衰亡，诚亡国灭种之根基。 —— 章炳麟",
                "把时间用在思考上是最能节省时间的事情。 —— 卡曾斯",
                "最甜美的是爱情，最苦涩的也是爱情。 —— 菲·贝利",
                "读书使人心明眼亮。 —— 伏尔泰",
                "劳动和人，人和劳动，这是所有真理的父母亲。 —— 苏霍姆林斯基",
                "人类的历史，就是一个不断地从必然王国向自由王国发展的历史。",
                "成功大易，而获实丰于斯所期，浅人喜焉，而深识者方以为吊。 —— 梁启超",
                "生活是一种绵延不绝的渴望，渴望不断上升，变得更伟大而高贵。 —— 杜伽尔",
                "真实是人生的命脉，是一切价值的根基。 —— 德莱塞",
                "人的活动如果没有理想的鼓舞，就会变得空虚而渺小。 —— 车尔尼雪夫斯基",
                "最成功的说谎者是那些使最少量的谎言发挥最大的作用的人。 —— 塞·巴特勒",
                "管理的第一目标是使较高工资与较低的劳动成本结合起来。 —— 泰罗",
                "躯体总是以惹人厌烦告终。除思想以外，没有什么优美和有意思的东西留下来，因为思想就是生命。 —— 萧伯纳",
                "文明就是要造成有修养的人。—— 罗斯金",
                "软件在能够复用前必须先能用。–Ralph Johnson",
                "优秀的判断力来自经验，但经验来自于错误的判断。–Fred Brooks",
                "当你想在你的代码中找到一个错误时，这很难；当你认为你的代码是不会有错误时，这就更难了。-Steve McConnell 《代码大全》",
                "如果建筑工人盖房子的方式跟程序员写程序一样，那第一只飞来的啄木鸟就将毁掉人类文明。-Gerald Weinberg",
                "我们这个世界的一个问题是，蠢人信誓旦旦，智人满腹狐疑。–Bertrand Russell",
                "C程序员永远不会灭亡。他们只是cast成了void。",
                "如果debugging是一种消灭bug的过程，那编程就一定是把bug放进去的过程。–Edsger Dijkstra",
                "你要么要软件质量，要么要指针算法；两者不可兼得。–(Bertrand Meyer)",
                "有两种方法能写出没有错误的程序；但只有第三种好用。–Alan J. Perlis",
                "用代码行数来测评软件开发进度，就相对于用重量来计算飞机建造进度。–比尔-盖茨",
                "最初的90%的代码用去了最初90%的开发时间。余下的10%的代码用掉另外90%的开发时间。–Tom Cargill",
                "程序员和上帝打赌要开发出更大更好——傻瓜都会用的软件。而上帝却总能创造出更大更傻的傻瓜。所以，上帝总能赢。–Anon",
                "计算机没有什么用处.它们唯一能做的就是告诉你答案. －－Pablo Picasso",
                "分布式文件系统是一场残忍的骗局. －－Zalman Stern",
                "计算机并不解决问题,它们只是执行解决方案. －－Laurent Gasser",
                "计算机使很多事情更容易做到,但其中大部分并不是必需. －－Andy Rooney",
                "内存就象性高潮.不作假会好一点. －－Seymore Cray (对虚拟内存的评价)",
                "所谓软件工程就是指计算机科学中对计算机科学家来说太难的那一部分. －－F. L. Bauer",
                "八进制和十进制其实也差不多,如果你少了两根手指头的话. －－Tom Lehrer",
                "这个世界上有 10 种人,其中有些是能理解三进制的,有些不懂,有些则把它和二进制弄混淆了.",
                "如果你拷问数据到一定程度,它自然会坦白的. －－Ronald Coase",
                "据我们所知,我们的计算机还没有未被检验出的错误. －－Weisert",
                "如果你交给某人一个程序,你将折磨他一整天；如果你教某人如何编写程序,你将折磨他一辈子.",
                "编程就好比“性爱”,一个错误就能让你一辈子不得安宁. －－Michael Sinz",
                "无一分可增不叫完美,无一分可减才是. －－Antoine de Saint-Exupery",
                "管理一堆高级程序员就象放牧一群猫. －－Dave Platt",
                "倘若代码和注释不一致,那么很可能两者都是错的. －－Norm Schryer",
                "如果你的计算机说英语,那么它很可能是日本造的. －－Alan J. Perlis",
                "随机数的产生实在太重要了,不能够让它由偶然性来决定. －－Robert R.",
                "人的过失会带来错误,但要制造真正的灾难还得用计算机.",
                "走投无路时再去阅读说明. －－L. Iasellio",
                "永远不要信任那些你无法将其抛出窗外的电脑. －－Steve Wozniak",
                "许多专家认为,导致世界毁灭最可能的原因是意外事件.那正是我们在做的；我们是计算机专业人士,我们正在制造意外事件. －－Nathaniel Borenstein",
                "UNIX 是很友好的,只不过它结交朋友时很有选择性",
                "真正的程序员认为自己比用户更明白用户需要什么。",
                "测试是来表明bug的存在而不是不存在。",
                "世界上只有两句真理：1、人一定会死。2、程序一定有Bug。",
                "程序中蕴含着很多的道理，唯有大彻大悟者方能体会其中的奥妙。",
                "不要被对象、属性、方法等词汇所迷惑；最根本的是先了解最基础知识。",
                "请把书上的例子亲手到电脑上实践，即使配套光盘中有源文件。",
                "别指望看第一遍书就能记住和掌握什么——请看第二遍、第三遍。",
                "如果debugging是一种消灭bug的过程，那编程就一定是把bug放进去的过程。",
                "任何傻瓜都能写出计算机可以理解的代码。好的程序员能写出人能读懂的代码。",
                "当你想在你的代码中找到一个错误时，这很难；当你认为你的代码是不会有错误时，这就更难了。",
                "一个100行的代码调试都可能会让程序员遇到很多挫折，所以，面对挫折，我们永远不能低头。",
                "永不放弃，永不放弃又有两个原则，第一个原则是永不放弃，第二个原则就是：当你想放弃时回头看第一个原则。",
                "就算我们站在群山之颠，也别忘记雄鹰依旧能从我们头顶飞过。骄傲是比用JAVA进行底层开发更可笑的东西。",
                "一个人静静坐在电脑面前写代码的感觉，那是什么感觉？那是武林高手闭关修炼的感觉。",
                "作为一个真正的程序员，首先应该尊重编程，热爱你所写下的程序，他是你的伙伴，而不是工具。",
                "每一个问题都是一把锁，句子大全http://Www.1juzI.coM/你要相信世界上一定有一把钥匙能打开这把锁，你也能找到这把钥匙。",
                "非优秀的程序员常常把空间和时间消耗殆尽，优秀的程序员则总是有足够的空间和时间去完成编程任务，而且配合近乎完美。",
                "真正的程序员不会在上午9：00到下午5：00之间工作，如果你看到他在上午9：00工作，这表现他从昨晚一直干到现在。",
                "程序员中的前辈在谈到一个人学写程序有没有前途时，总是会说：“学程序不光要能吃苦能用功，还得看有没有sense，没sense的人，就是再怎么学，再怎么给他讲效果都不好。",
                "什么？有bug？你会不会用啊？？？",
                "哦，难道是有bug？我才测试过的啊",
                "不不不，这不是bug，这是专门这样写的",
                "错误,没有发现键盘 - 按 F1 键继续。 --BIOS系统的提示",
                "不要担心它能否正常工作。如果一切正常，那么你就会失去工作。",
                "程序员的美德：懒惰，没有耐心以及老子天下第一。",
                "程序员的美德：懒惰，没有耐心以及老子天下第一。",
                "这不是bug——这是没有被证明的功能。",
                "写代码的时候总是想象维护你代码的家伙是一个知道你住在哪里的暴力精神病患者。",
                "一个人写的烂软件将会给另一个人带来一份全职工作。",
                "这是我们这个行业的一件咄咄怪事：我们不仅不从错误中学习，我们也不从成功中学习。",
                "一旦一种新技术开始滚动碾压道路，如果你不能成为压路机的一部分，那么你就只能成为道路的一部分。",
                "如果第一次你没有成功，那么称之为1.0版，继续加油。",
                "为什么我们总是没有时间把事情做对，却有时间做完它？",
                "自己的代码六个月或更久不见，还不如别人写的代码。",
                "只有两种编程语言：一种是天天挨骂的，另一种是没人用的。",
                "如果Java真的有垃圾收集，那么大多数程序会执行自我删除。",
                "如果Java真的有垃圾收集，那么大多数程序会执行自我删除。",
                "理论上看，理论和实践之间是没有差别的。但是，在实践中，有。",
                "编程就是10％的科学，20％得的独创性，再加70％和这门科学的灵巧合作。",
                "第一次是否正确完成一点也不重要。最后一次正确完成才至关重要。",
                "数组的下标一定要从0或1开始吗？我认为，我采取的中间值0.5没有经过适当考虑就被驳回了。",
                "计算机善于遵循指令，不善于读取你的想法。",
                "小心上面代码中的bug；我只证明了它是正确的，还没有尝试过。",
                "如果Java真的有垃圾收集，那么大多数程序会执行自我删除。",
                "真正的程序员喜欢兼卖爆米花，他们利用CPU散发出的热量做爆米花，可以根据米花爆裂的速度听出正在运行什么程序。",
                "为API生，为框架死，为debug奋斗一辈子，吃符号亏，上大小写的当，最后死在需求上。",
                "一百万只猴子，给他们一百万个键盘，其中的一个会写出Java程序，其它的写的都是Perl程序。",
                "栈和队列的区别是啥？吃多了拉就是队列；吃多了吐就是栈。",
                "CSDN社区网友on1y_1onely留言：“C确实不适合做应用层，C有C的地盘。”网友zbdbao回复：“就是传说中的C盘么。”当时我就笑喷了……",
                "一个IT经理走进一家拉面馆说：“你们需要客户端吗？”老板说：“面一般是伙计端，忙的时候才需要客户端。",
                "一同学问我，软件外包是什么。解释了几句还没明白，遂想了一下：包工头知道吧？顿悟！",
                "正在码代码ing，医院回来的同事一脸的苦逼样子，问他怎么了？他回答：得了类风湿性关节炎了，我怕会遗传给下一代啊。我一脸的问号：谁说类风湿性关节炎能遗传的？丫一脸诧异：类不是继承的吗？",
                "世界上最遥远的距离不是生与死，而是你亲手制造的BUG就在你眼前，你却怎么都找不到她……",
                "继承，是幸福的延续；重载，是幸福的重生。",
                "假如生活欺骗了你，找50个程序员问问为什么编程；假如生活让你想死，找50个程序员问问BUG改完了没有；假如你觉得生活拮据，找50个程序员问问工资涨了没有；假如你觉得活着无聊，找50个程序员问问他们一天都干了什么！",
                "必备技能：去得了公司，回得了厨房；不羡慕好车，不想买新房；不惊动腾讯，不激怒同行；写得了代码，查得出异常；做得出产品，看得准市场；接触过VC，见识过投行。",
                "如果你的朋友最近没和你联系，要理解！只有三种可能：第一，他死了；第二，他改行当程序猿了；第三，需求又改了！",
                "某日和同学聊起对象问题，我答道：哥最不缺的就是对象了，要知道哥是程序员，每天不知道要new多少个对象出来，而且想要啥类型就有啥类型。如果你想要，哥给你来个for循环嵌套，new上她千个百个。 ",
                "作为一个程序员，郁闷的事情是，面对一个代码块，却不敢去修改。更糟糕的是，这个代码块还是自己写的。—— Peyton Jones ",
                "如果你的朋友最近没和你联系，要理解！只有三种可能：第一，他死了；第二，他改行当程序猿了；第三，需求又改了！",
                "它在我的机器上可以很好运行！——大部分程序员",
                "能说算不上什么，有本事就把你的代码给我看看。——Linus Torvalds，Linux 之父",
                "软件设计有两种方式：一种方式是，使软件过于简单，明显没有缺陷；另一种方式是，使软件过于复杂，没有明显的缺陷。——C.A.R. Hoare",
                "用几个小时来制定计划，可以节省几周的编程时间。—— 匿名"
                };

//        System.out.print(str[(int)(Math.random()* str.length)]);
        return str[(int)(Math.random()* str.length)];

    }






}
