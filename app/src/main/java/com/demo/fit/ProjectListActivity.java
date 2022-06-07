package com.demo.fit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.demo.fit.adapter.ProjectAdapter;
import com.demo.fit.bean.ProjectBeen;
import com.demo.fit.databinding.ActivityProjectListBinding;

import java.util.ArrayList;
import java.util.List;

public class ProjectListActivity extends AppCompatActivity {

    ActivityProjectListBinding binding;

    private String[] images1 = new String[]{"https://img1.baidu.com/it/u=687868493,1390866183&fm=253&fmt=auto&app=120&f=JPEG?w=500&h=330",
            "https://img1.baidu.com/it/u=3133010419,838570553&fm=253&fmt=auto&app=138&f=JPEG?w=546&h=500",
            "https://img2.baidu.com/it/u=2854195313,2160947980&fm=253&fmt=auto&app=120&f=JPEG?w=640&h=427",
            "https://img1.baidu.com/it/u=1897049906,4020952029&fm=253&fmt=auto&app=120&f=JPEG?w=1134&h=755",
            "https://img1.baidu.com/it/u=3919588689,2924247077&fm=253&fmt=auto&app=138&f=JPEG?w=750&h=500"};
    private String[] titles1 = new String[]{"仰卧起坐", "下蹲支撑", "俯卧撑", "引体向上", "高抬腿"};
    private String[] contents1 = new String[]{"仰卧起坐，一种锻炼身体的方式。仰卧，两腿并拢，两手上举，利用腹肌收缩，两臂向前摆动，迅速成坐姿，上体继续前屈，两手触脚面，低头；然后还原成坐姿，如此连续进行。",
            "下蹲支撑是指运动员在发力结束后借杠铃惯性向上运动的同时，迅速下降身体重心去支撑杠铃。在抓举中表现为直臂支撑，同时锁肩，肘外转，挺胸，抬头，身体重心降至最低位置；在挺举中表现为提铃至胸的屈臂支撑(两臂弯曲至最大程度)，把杠铃放在两侧锁骨和三角肌上，挺胸抬头，双肘高抬，两大臂呈水平状态并保持平行，把杠铃紧紧扣住。下蹲支撑的架子要稳定，就举重行话是说把臀部和大腿“坐”在小腿上。",
            "俯卧撑（英文：push-up；Press-up。中国大陆称作俯卧撑，中国台湾地区称作伏地挺身，港澳地区称作掌上压），常见的健身运动有助于增加胸大肌锻炼效果 [1]  。\n" +
                    "在日常锻炼和体育课上，特别是在军事体能训练中是一项基本训练。俯卧撑主要锻炼上肢、腰部及腹部的肌肉，尤其是胸肌。是很简单易行却十分有效的力量训练手段。初学者练习俯卧撑可以进行两组，每组15到20下；有一定基础的运动者则可做3组，每组20下；高水平人士可以尝试4组30到50下的俯卧撑锻炼。",
            "引体向上，有时候简称引体，指依靠自身力量克服自身体重向上做功的垂吊练习。主要测试上肢肌肉力量的发展水平，以及臂力和腰腹力量，在完成一个完整的引体向上的过程中需要众多背部骨骼肌和上肢骨骼肌的共同参与做功，是一项多关节复合动作练习，是较好的锻炼上肢的方法，是所有发展背部骨骼肌肌力和肌耐力的练习方式中参与肌肉最多、运动模式最复杂、发展背部骨骼肌的肌力和肌耐力最有效的练习方式，是最基本的锻炼背部的方法，是中考和高中体育会考的考试选择项目之一，是衡量男性体质的重要参考标准和项目之一。",
            "高抬腿，是一项健身运动，具体动作为挺直背部，目视前方，前脚掌着地快速交替抬腿。"};

    private String[] images2 = new String[]{"https://img1.baidu.com/it/u=1885670485,3364735853&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500",
            "https://img1.baidu.com/it/u=1668537308,872467054&fm=253&fmt=auto&app=138&f=JPEG?w=334&h=500",
            "https://img0.baidu.com/it/u=3010780845,3089108301&fm=253&fmt=auto&app=138&f=JPEG?w=333&h=500",
            "https://img1.baidu.com/it/u=2151056574,189603216&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=341",
            "https://img1.baidu.com/it/u=467956605,37453574&fm=253&fmt=auto&app=138&f=JPEG?w=720&h=470"};
    private String[] titles2 = new String[]{"陈守军", "金岩", "于春雷", "杨丽梅", "渝高"};
    private String[] contents2 = new String[]{"从业5年",
            "从业8年",
            "从业7年",
            "从业7年",
            "从业76年"};

    private String[] images3 = new String[]{"https://bkimg.cdn.bcebos.com/pic/14ce36d3d539b6004ea7dd55e950352ac75cb7e3?x-bce-process=image/resize,m_lfit,w_1280,limit_1/format,f_auto",
            "https://img0.baidu.com/it/u=3676186452,1698853552&fm=253&fmt=auto&app=120&f=JPEG?w=684&h=500",
            "https://img1.baidu.com/it/u=4091340250,612086172&fm=253&fmt=auto&app=138&f=JPG?w=500&h=500",
            "https://img2.baidu.com/it/u=1040660805,1799774576&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500",
            "https://img0.baidu.com/it/u=648352742,1653010150&fm=253&fmt=auto&app=120&f=JPEG?w=600&h=400"};
    private String[] titles3 = new String[]{"鸡蛋", "西蓝花", "蛋白粉", "鸡胸肉", "牛肉"};
    private String[] contents3 = new String[]{"一个鸡蛋所含的热量，相当于半个苹果或半杯牛奶的热量，但是它还拥有人体每天所需8%的磷、4%的锌、4%的铁、12.6%的蛋白质、6%的维生素D、3%的维生素E、6%的维生素A、2%的维生素B、5%的维生素B2、4%的维生素B6。这些营养都是人体必不可少的，它们起着极其重要的作用，如修复人体组织、形成新的组织、消耗能量和参与复杂的新陈代谢过程等。",
            "绿花菜的食用部分主要是脆嫩的花茎和短缩肥嫩的花薹及紧密群集成球状的花蕾。绿花菜营养成分齐全，每100克可食部分含水分89克左右，蛋白质3.6克左右，碳水化合物5.9克，富含维生素A、维生素C和相当数量的维生素B1、B2以及磷、铁、钙等无机质，其色泽鲜绿，风味清香，花茎脆嫩，品质优于芥兰，风味比花椰菜鲜美。",
            "蛋白质是保证机体健康最重要的营养素，它是维持和修复机体以及细胞生长所必需的，它不仅影响机体组织如肌肉的生长，还参与激素的产生、免疫功能的维持、其它营养物质和氧的转运以及血红蛋白的生成、血液凝结等多方面。一般脑力劳动者每天所需的蛋白质为每千克体重0.8－1.0克，从事大强度的运动员及健美爱好者的需要量则为他们的2－3倍；因为高强度的运动会不同程度地破坏肌细胞，引起肌肉蛋白的分解，蛋白质的及时补充能减少肌肉组织的破坏，促进蛋白的合成，甚至超量恢复，从而使肌肉得到增长，力量得到提高。传统做法通过吃肉补充蛋白质往往会摄入过多的脂肪，引起体脂增加，甚至影响心血管的健康。",
            "鸡胸肉蛋白质含量较高，且易被人体吸收入利用，含有对人体生长发育有重要作用的磷脂类，是中国人膳食结构磷脂的重要来源之一。鸡胸肉有温中益气、补虚填精、健脾胃、活血脉、强筋骨的功效。",
            "牛肉中的肌氨酸含量比任何其它食品都高，它对增长肌肉、增强力量特别有效。在进行训练的头几秒钟里，肌氨酸是肌肉燃料之源，有效补充三磷酸腺苷，使训练能坚持得更久。\n蛋白质需求量越大，饮食中增加的维生素B6就越多。牛肉含有足够的维生素B6，可帮你增强免疫力，促进蛋白质的新陈代谢和合成，从而有助于紧张训练后身体的恢复。\n鸡肉、鱼肉中肉毒碱和肌氨酸的含量很低，牛肉却很高。肉毒碱主要用于支持脂肪的新陈代谢，产生支链氨基酸，是对健美运动员 增长肌肉起重要作用的一种氨基酸。\n钾是运动员饮食中比较缺少的矿物质。钾的水平低会抑制蛋白质的合成以及生长激素的产生，影响肌肉生长。"};

    int type;

    ProjectAdapter projectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProjectListBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.rvProjects.setLayoutManager(new LinearLayoutManager(this));

        type = getIntent().getIntExtra("type", 1);

        switch (type) {
            case 1:
                binding.llTitle.tvTitle.setText("健身项目");
                List<ProjectBeen> projectBeens = new ArrayList<>();
                for (int i = 0; i < images1.length; i++) {
                    ProjectBeen projectBeen = new ProjectBeen();
                    projectBeen.setImage(images1[i]);
                    projectBeen.setTitle(titles1[i]);
                    projectBeen.setContent(contents1[i]);
                    projectBeens.add(projectBeen);
                }
                projectAdapter = new ProjectAdapter(this, projectBeens);

                binding.rvProjects.setAdapter(projectAdapter);
                break;
            case 2:
                binding.llTitle.tvTitle.setText("教练团队");
                List<ProjectBeen> projectBeens1 = new ArrayList<>();
                for (int i = 0; i < images2.length; i++) {
                    ProjectBeen projectBeen = new ProjectBeen();
                    projectBeen.setImage(images2[i]);
                    projectBeen.setTitle(titles2[i]);
                    projectBeen.setContent(contents2[i]);
                    projectBeens1.add(projectBeen);
                }
                projectAdapter = new ProjectAdapter(this, projectBeens1);

                binding.rvProjects.setAdapter(projectAdapter);
                break;
            case 3:
                binding.llTitle.tvTitle.setText("营养食物");
                List<ProjectBeen> projectBeens2 = new ArrayList<>();
                for (int i = 0; i < images3.length; i++) {
                    ProjectBeen projectBeen = new ProjectBeen();
                    projectBeen.setImage(images3[i]);
                    projectBeen.setTitle(titles3[i]);
                    projectBeen.setContent(contents3[i]);
                    projectBeens2.add(projectBeen);
                }
                projectAdapter = new ProjectAdapter(this, projectBeens2);

                binding.rvProjects.setAdapter(projectAdapter);
                break;
        }

    }
}