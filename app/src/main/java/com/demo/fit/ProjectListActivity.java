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
    private String[] titles1 = new String[]{"Sit-ups", "Squat support", "Push-ups", "Pull-ups", "High Leg Raise"};
    private String[] contents1 = new String[]{"Sit-ups, a way to exercise the body. Lie on your back, legs together, both hands up, using the abdominal muscles contraction, both arms swing forward, quickly into a sitting position, the upper body continues to bend forward, both hands touch the surface of the feet, head down",
            "Squat support refers to the athlete quickly dropping the body weight to support the barbell while using the inertia of the barbell to move upward at the end of the power-up. In the snatch, it is shown as a straight arm support, while locking the shoulders, elbows out, chest up, head up, and body weight down to the lowest position.",
            "Push-ups are a common fitness exercise that helps increase the pectoralis major exercise effect.\n" +
                    "In daily exercise and physical education classes, especially in military physical training is a basic training. Push-ups mainly exercise the muscles of the upper limbs, waist and abdomen, especially the pectoral muscles.",
            "Pull-ups, sometimes referred to as pull-ups, are hanging exercises that rely on one's own strength to overcome one's own weight and work upward. It tests the level of development of upper limb muscle strength, as well as arm strength and lumbar and abdominal strength.",
            "High leg raise, is a fitness exercise, the specific action is straight back, eyes forward, the forefoot on the ground quickly alternate leg raise."};

    private String[] images2 = new String[]{"https://img1.baidu.com/it/u=1885670485,3364735853&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500",
            "https://img1.baidu.com/it/u=1668537308,872467054&fm=253&fmt=auto&app=138&f=JPEG?w=334&h=500",
            "https://img0.baidu.com/it/u=3010780845,3089108301&fm=253&fmt=auto&app=138&f=JPEG?w=333&h=500",
            "https://img1.baidu.com/it/u=2151056574,189603216&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=341",
            "https://img1.baidu.com/it/u=467956605,37453574&fm=253&fmt=auto&app=138&f=JPEG?w=720&h=470"};
    private String[] titles2 = new String[]{"Denver", "Li Junyi", "KangKang", "Wuli", "Hu Jun"};
    private String[] contents2 = new String[]{"5-year Experience",
            "8-year Experience",
            "7-year Experience",
            "6-year Experience",
            "6-year Experience"};

    private String[] images3 = new String[]{"https://bkimg.cdn.bcebos.com/pic/14ce36d3d539b6004ea7dd55e950352ac75cb7e3?x-bce-process=image/resize,m_lfit,w_1280,limit_1/format,f_auto",
            "https://img0.baidu.com/it/u=3676186452,1698853552&fm=253&fmt=auto&app=120&f=JPEG?w=684&h=500",
            "https://img1.baidu.com/it/u=4091340250,612086172&fm=253&fmt=auto&app=138&f=JPG?w=500&h=500",
            "https://img2.baidu.com/it/u=1040660805,1799774576&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500",
            "https://img0.baidu.com/it/u=648352742,1653010150&fm=253&fmt=auto&app=120&f=JPEG?w=600&h=400"};
    private String[] titles3 = new String[]{"Eggs", "Broccoli", "Protein-powder", "Chicken", "Beef"};
    private String[] contents3 = new String[]{"One egg contains as many calories as half an apple or half a glass of milk, but it also has 8% of the phosphorus, 4% of zinc, 4% of iron, 12.6% of protein, 6% of vitamin D, 3% of vitamin E, 6% of vitamin A, 2% of vitamin B, 5% of vitamin B2, and 4% of vitamin B6 that the human body needs every day.",
            "The edible part of green cauliflower is mainly the crisp and tender flower stems and short, fat flower shoots and tightly clustered, globular flower buds. Green cauliflower has a complete nutritional composition, containing about 89 grams of water and 3.6 grams of protein per 100 grams of edible part.",
            "Protein is the most important nutrient for the health of the body, it is necessary for the maintenance and repair of the body and cell growth, it not only affects the growth of body tissues such as muscle, but also participates in the production of hormones, the maintenance of immune function, the transport of other nutrients and oxygen.",
            "Chicken breast has a high protein content and is easily absorbed into the body, and contains phospholipids that are important for human growth and development.",
            "Beef contains more sarcosine than any other food, which is particularly effective in growing muscle and building strength"};

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
                binding.llTitle.tvTitle.setText("Fit Project");
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
                binding.llTitle.tvTitle.setText("Coach Team");
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
                binding.llTitle.tvTitle.setText("Good Food");
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