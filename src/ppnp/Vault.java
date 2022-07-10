package ppnp;


import ppnp.resources.RepoAccess;
import ppnp.resources.role;

import java.util.ArrayList;
import java.util.Arrays;

public class Vault {

    private static class Alpha_Prime_Vault {

        public static final RepoAccess Alpha_Prime_PMGH = new RepoAccess(Repositories.ProdigyMathGameHacking, role.Admin, "3f271188-f4da-4d45-ada5-e4901041eae6");

        public static final RepoAccess Alpha_Prime_PNP = new RepoAccess(Repositories.PNP, role.Admin, "57d9cdb7-cf23-43bb-9b9b-9d7f9134c5c8");


        public static ArrayList<RepoAccess> Alpha_Prime_Access = (ArrayList<RepoAccess>) Arrays.asList(new RepoAccess[] {

                Alpha_Prime_PMGH,
                Alpha_Prime_PNP,


        });



    }

    public static final Clearance Alpha_Prime = new Clearance("Alpha Prime", "Alpha Prime. Administrator access for PMGH and PNP.", "8e59d898-3016-429a-95c8-2465662d3115", Alpha_Prime_Vault.Alpha_Prime_Access);




    private static class Alpha_Vault {

        public static final RepoAccess Alpha_PMGH = new RepoAccess(Repositories.ProdigyMathGameHacking, role.Maintain, "83caa3da-8865-4a95-9449-39e97980ff8e");

        public static final RepoAccess Alpha_PNP = new RepoAccess(Repositories.PNP, role.Maintain, "154cc295-b38a-4690-92c3-77770c17197b");


        public static ArrayList<RepoAccess> Alpha_Access = (ArrayList<RepoAccess>) Arrays.asList(new RepoAccess[] {

                Alpha_PMGH,
                Alpha_PNP,


        });





    }

    public static final Clearance Alpha = new Clearance("Alpha", "Alpha Personnel. Maintain access for PMGH and PNP.", "82fac385-120e-457a-a209-49d47c18dcb2", Alpha_Vault.Alpha_Access);



    private static class Beta_Vault {

        public static final RepoAccess Beta_PMGH = new RepoAccess(Repositories.ProdigyMathGameHacking, role.Write, "5e378ecf-a4eb-4e50-b8cd-968141abd875");

        public static final RepoAccess Beta_PNP = new RepoAccess(Repositories.PNP, role.Write, "91276309-cf8c-4ca6-b53e-e51914d3d680");


        public static ArrayList<RepoAccess> Beta_Access = (ArrayList<RepoAccess>) Arrays.asList(new RepoAccess[] {

                Beta_PMGH,
                Beta_PNP,


        });





    }

    public static final Clearance Beta = new Clearance("Beta", "Beta Personnel. Write access for PMGH and PNP.", "5391206d-1539-47f8-8541-d2a9e2bb66a4", Beta_Vault.Beta_Access);



    private static class Gamma_Vault {

        public static final RepoAccess Gamma_PMGH = new RepoAccess(Repositories.ProdigyMathGameHacking, role.Triage, "479f4a25-1108-4110-bf29-8946a5cdfd6c");

        public static final RepoAccess Gamma_PNP = new RepoAccess(Repositories.PNP, role.Triage, "4e5711fe-14df-46c6-b756-c6ba4dd5f9a7");


        public static ArrayList<RepoAccess> Beta_Access = (ArrayList<RepoAccess>) Arrays.asList(new RepoAccess[] {

                Gamma_PMGH,
                Gamma_PNP,


        });





    }

    public static final Clearance Gamma = new Clearance("Gamma", "Gamma Personnel. Triage access for PMGH and PNP.", "ef7fb00d-05ba-4579-8d60-23b8f0b07d14", Gamma_Vault.Beta_Access);

}
