package SearchSpecies;

/**
 * Created by chashurin on 17.02.2017.
 */
public class SearchSpecies {

    public static final long[] classificCode = {141000000000L, 141001000000L, 141001010000L, 141001020000L, 141001030000L, 141001040000L, 141002000000L, 141003000000L, 141004000000L, 141005000000L,
            141006000000L, 141007000000L, 141008000000L, 141009000000L, 141010000000L, 141011000000L, 141012000000L, 141013000000L, 141014000000L, 142000000000L, 142001000000L, 142001010000L,
            142001020000L, 142001020100L, 142001020200L, 142001020300L, 142001020400L, 142001030000L, 142001040000L, 142002000000L, 142002010000L, 142002020000L, 142002030000L, 142002040000L,
            142002040100L, 142002040200L, 142002050000L, 142002060000L, 142002070000L, 142002080000L, 142002090000L, 142002100000L, 142002110000L, 142002120000L, 142002130000L, 142002140000L,
            142002150000L, 142002160000L, 142002170000L, 142003000000L, 142004000000L, 142004010000L, 142004020000L, 142004030000L, 142004040000L, 142004050000L, 142005000000L, 142006000000L,
            142007000000L, 143000000000L, 143001000000L, 143001010000L, 143001010100L, 143001010200L, 143001010300L, 143001010400L, 143001010500L, 143001010600L, 143001010700L, 143001020000L,
            143001030000L, 143002000000L, 143002010000L, 143002010100L, 143002010200L, 143002010300L, 143002010400L, 143002010500L, 143002010600L, 143002010700L, 143002010800L, 143002020000L,
            143002020100L, 143002020200L, 143002020300L, 143002020400L, 143002020500L, 143002030000L, 143003000000L, 143003010000L, 143003010100L, 143003010200L, 143003010300L, 143003010301L,
            143003010302L, 143003010303L, 143003020000L, 143003020100L, 143003020200L, 143003020300L, 143003020400L, 143003020500L, 143003020600L, 143003030000L, 143003030100L, 143003030200L,
            143003030300L, 143003030400L, 143003040000L, 143003040100L, 143003040200L, 143003040300L, 143003040400L, 143003050000L, 143003050100L, 143003050200L, 143003050300L, 143003050400L,
            143003060000L, 143004000000L, 143004010000L, 143004020000L, 143004030000L, 143004040000L, 143004050000L, 143004060000L, 143005000000L, 143005010000L, 143005020000L, 143005030000L,
            143005040000L, 143005050000L, 143005060000L, 143005070000L, 143006000000L, 143006010000L, 143006010100L, 143006010200L, 143006010300L, 143006010400L, 143006010500L, 143006010600L,
            143006010700L, 143006020000L, 143006020100L, 143006020200L, 143006020300L, 143006020400L, 143006020500L, 143006020600L, 143006030000L, 143007000000L, 144000000000L, 144001000000L,
            144001010000L, 144001020000L, 144001030000L, 144001040000L, 144001050000L, 144001060000L, 144001070000L, 144001080000L, 144001090000L, 144001100000L, 144002000000L, 144003000000L,
            144003010000L, 144003020000L, 144003030000L, 144003040000L, 144003050000L, 144003060000L, 144003070000L, 144003080000L, 144003090000L, 144003100000L, 144004000000L, 144004010000L,
            144004020000L, 144005000000L, 145000000000L, 145001000000L, 145002000000L, 145003000000L, 146000000000L, 146001000000L, 146002000000L, 146003000000L, 147000000000L,};

    public static final String[] textClassificCode = {
            "Для размещения объектов сельскохозяйственного назначения и сельскохозяйственных угодий", "Для сельскохозяйственного производства", "Для использования в качестве сельскохозяйственных угодий",
            "Для размещения зданий, строений, сооружений, используемых для производства, хранения и первичной переработки сельскохозяйственной продукции", "Для размещения внутрихозяйственных дорог и коммуникаций",
            "Для размещения водных объектов", "Для ведения крестьянского (фермерского) хозяйства", "Для ведения личного подсобного хозяйства", "Для ведения гражданами садоводства и огородничества",
            "Для ведения гражданами животноводства", "Для дачного строительства", "Для размещения древесно-кустарниковой растительности, предназначенной для защиты земель от воздействия негативных (вредных) природных, антропогенных и техногенных явлений",
            "Для научно-исследовательских целей", "Для учебных целей", "Для сенокошения и выпаса скота гражданами", "Фонд перераспределения", "Для размещения объектов охотничьего хозяйства",
            "Для размещения объектов рыбного хозяйства", "Для иных видов сельскохозяйственного использования", "Для размещения объектов, характерных для населенных пунктов", "Для объектов жилой застройки", "Для индивидуальной жилой застройки",
            "Для многоквартирной застройки", "Для малоэтажной застройки", "Для среднеэтажной застройки", "Для многоэтажной застройки", "Для иных видов жилой застройки", "Для размещения объектов дошкольного, начального, общего и среднего (полного) общего образования",
            "Для размещения иных объектов, допустимых в жилых зонах и не перечисленных в классификаторе", "Для объектов общественно-делового значения", "Для размещения объектов социального и коммунально-бытового назначения", "Для размещения объектов здравоохранения",
            "Для размещения объектов культуры", "Для размещения объектов торговли", "Для размещения объектов розничной торговли", "Для размещения объектов оптовой торговли", "Для размещения объектов общественного питания",
            "Для размещения объектов предпринимательской деятельности", "Для размещения объектов среднего профессионального и высшего профессионального образования", "Для размещения административных зданий", "Для размещения научно-исследовательских учреждений", "Для размещения культовых зданий", "Для стоянок автомобильного транспорта",
            "Для размещения объектов делового назначения, в том числе офисных центров", "Для размещения объектов финансового назначения", "Для размещения гостиниц", "Для размещения подземных или многоэтажных гаражей", "Для размещения индивидуальных гаражей",
            "Для размещения иных объектов общественно-делового значения, обеспечивающих жизнь граждан", "Для общего пользования (уличная сеть)", "Для размещения объектов специального назначения", "Для размещения кладбищ", "Для размещения крематориев", "Для размещения скотомогильников",
            "Под объектами размещения отходов потребления", "Под иными объектами специального назначения", "Для размещения коммунальных, складских объектов", "Для размещения объектов жилищно-коммунального хозяйства", "Для иных видов использования, характерных для населенных пунктов",
            "Для размещения объектов промышленности, энергетики, транспорта, связи, радиовещания, телевидения, информатики, обеспечения космической деятельности, обороны, безопасности и иного специального назначения",
            "Для размещения промышленных объектов",
            "Для размещения производственных и административных зданий, строений, сооружений и обслуживающих их объектов",
            "Для размещения производственных зданий",
            "Для размещения коммуникаций",
            "Для размещения подъездных путей",
            "Для размещения складских помещений",
            "Для размещения административных зданий",
            "Для размещения культурно-бытовых зданий",
            "Для размещения иных сооружений промышленности",
            "Для добычи и разработки полезных ископаемых",
            "Для размещения иных объектов промышленности",
            "Для размещения объектов энергетики",
            "Для размещения электростанций и обслуживающих сооружений и объектов",
            "Для размещения гидроэлектростанций",
            "Для размещения атомных станций",
            "Для размещения ядерных установок",
            "Для размещения пунктов хранения ядерных материалов и радиоактивных веществ энергетики",
            "Для размещения хранилищ радиоактивных отходов",
            "Для размещения тепловых станций",
            "Для размещения иных типов электростанций",
            "Для размещения иных обслуживающих сооружений и объектов",
            "Для размещения объектов электросетевого хозяйства",
            "Для размещения воздушных линий электропередачи",
            "Для размещения наземных сооружений кабельных линий электропередачи",
            "Для размещения подстанций",
            "Для размещения распределительных пунктов",
            "Для размещения других сооружений и объектов электросетевого хозяйства",
            "Для размещения иных объектов энергетики",
            "Для размещения объектов транспорта",
            "Для размещения и эксплуатации объектов железнодорожного транспорта",
            "Для размещения железнодорожных путей и их конструктивных элементов",
            "Для размещения полос отвода железнодорожных путей",
            "Для размещения, эксплуатации, расширения и реконструкции строений, зданий, сооружений, в том числе железнодорожных вокзалов, железнодорожных станций, а также устройств и других объектов, необходимых для эксплуатации, содержания, строительства, реконструкции, ремонта, развития наземных и подземных зданий, строений, сооружений, устройств и других объектов железнодорожного транспорта",
            "Для размещения железнодорожных вокзалов",
            "Для размещения железнодорожных станций",
            "Для размещения устройств и других объектов, необходимых для эксплуатации, содержания, строительства, реконструкции, ремонта, развития наземных и подземных зданий, строений, сооружений, устройств и других объектов железнодорожного транспорта",
            "Для размещения и эксплуатации объектов автомобильного транспорта и объектов дорожного хозяйства",
            "Для размещения автомобильных дорог и их конструктивных элементов",
            "Для размещения полос отвода",
            "Для размещения объектов дорожного сервиса в полосах отвода автомобильных дорог",
            "Для размещения дорожных сооружений",
            "Для размещения автовокзалов и автостанций",
            "Для размещения иных объектов автомобильного транспорта и дорожного хозяйства",
            "Для размещения и эксплуатации объектов морского, внутреннего водного транспорта",
            "Для размещения искусственно созданных внутренних водных путей",
            "Для размещения морских и речных портов, причалов, пристаней",
            "Для размещения иных объектов морского, внутреннего водного транспорта",
            "Для выделения береговой полосы",
            "Для размещения и эксплуатации объектов воздушного транспорта",
            "Для размещения аэропортов и аэродромов",
            "Для размещения аэровокзалов",
            "Для размещения взлетно-посадочных полос",
            "Для размещения иных наземных объектов воздушного транспорта",
            "Для размещения и эксплуатации объектов трубопроводного транспорта",
            "Для размещения нефтепроводов",
            "Для размещения газопроводов",
            "Для размещения иных трубопроводов",
            "Для размещения иных объектов трубопроводного транспорта",
            "Для размещения и эксплуатации иных объектов транспорта",
            "Для размещения объектов связи, радиовещания, телевидения, информатики",
            "Для размещения эксплуатационных предприятий связи и обслуживания линий связи",
            "Для размещения кабельных, радиорелейных и воздушных линий связи и линий радиофикации на трассах кабельных и воздушных линий связи и радиофикации и их охранные зоны",
            "Для размещения подземных кабельных и воздушных линий связи и радиофикации и их охранные зоны",
            "Для размещения наземных и подземных необслуживаемых усилительных пунктов на кабельных линиях связи и их охранные зоны",
            "Для размещения наземных сооружений и инфраструктур спутниковой связи",
            "Для размещения иных объектов связи, радиовещания, телевидения, информатики",
            "Для размещения объектов, предназначенных для обеспечения космической деятельности",
            "Для размещения космодромов, стартовых комплексов и пусковых установок",
            "Для размещения командно-измерительных комплексов, центров и пунктов управления полетами космических объектов, приема, хранения и переработки информации",
            "Для размещения баз хранения космической техники",
            "Для размещения полигонов приземления космических объектов и взлетно-посадочных полос",
            "Для размещения объектов экспериментальной базы для отработки космической техники",
            "Для размещения центров и оборудования для подготовки космонавтов",
            "Для размещения других наземных сооружений и техники, используемых при осуществлении космической деятельности",
            "Для размещения объектов, предназначенных для обеспечения обороны и безопасности",
            "Для обеспечения задач обороны",
            "Для размещения военных организаций, учреждений и других объектов",
            "Для дислокации войск и сил флота",
            "Для проведения учений и иных мероприятий",
            "Для испытательных полигонов",
            "Для мест уничтожения оружия и захоронения отходов",
            "Для создания запасов материальных ценностей в государственном и мобилизационном резервах (хранилища, склады и другие)",
            "Для размещения иных объектов обороны",
            "Для размещения объектов (территорий), обеспечивающих защиту и охрану Государственной границы Российской Федерации",
            "Для обустройства и содержания инженерно-технических сооружений и заграждений",
            "Для обустройства и содержания пограничных знаков",
            "Для обустройства и содержания пограничных просек",
            "Для обустройства и содержания коммуникаций",
            "Для обустройства и содержания пунктов пропуска через Государственную границу Российской Федерации",
            "Для размещения иных объектов для защиты и охраны Государственной границы Российской Федерации",
            "Для размещения иных объектов обороны и безопасности",
            "Для размещения иных объектов промышленности, энергетики, транспорта, связи, радиовещания, телевидения, информатики, обеспечения космической деятельности, обороны, безопасности и иного специального назначения",
            "Для размещения особо охраняемых историко-культурных и природных объектов (территорий)",
            "Для размещения особо охраняемых природных объектов (территорий)",
            "Для размещения государственных природных заповедников (в том числе биосферных)",
            "Для размещения государственных природных заказников",
            "Для размещения национальных парков",
            "Для размещения природных парков",
            "Для размещения дендрологических парков",
            "Для размещения ботанических садов",
            "Для размещения объектов санаторного и курортного назначения",
            "Территории месторождений минеральных вод, лечебных грязей, рапы лиманов и озер",
            "Для традиционного природопользования",
            "Для размещения иных особо охраняемых природных территорий (объектов)",
            "Для размещения объектов (территорий) природоохранного назначения",
            "Для размещения объектов (территорий) рекреационного назначения",
            "Для размещения домов отдыха, пансионатов, кемпингов",
            "Для размещения объектов физической культуры и спорта",
            "Для размещения туристических баз, стационарных и палаточных туристско-оздоровительных лагерей, домов рыболова и охотника, детских туристических станций",
            "Для размещения туристических парков",
            "Для размещения лесопарков",
            "Для размещения учебно-туристических троп и трасс",
            "Для размещения детских и спортивных лагерей",
            "Для размещения скверов, парков, городских садов",
            "Для размещения пляжей",
            "Для размещения иных объектов (территорий) рекреационного назначения",
            "Для размещения объектов историко-культурного назначения",
            "Для размещения объектов культурного наследия народов Российской Федерации (памятников истории и культуры), в том числе объектов археологического наследия",
            "Для размещения военных и гражданских захоронений",
            "Для размещения иных особо охраняемых историко-культурных и природных объектов (территорий)",
            "Для размещения объектов лесного фонда",
            "Для размещения лесной растительности",
            "Для восстановления лесной растительности",
            "Для прочих объектов лесного хозяйства",
            "Для размещения объектов водного фонда",
            "Под водными объектами",
            "Для размещения гидротехнических сооружений",
            "Для размещения иных сооружений, расположенных на водных объектах",
            "Земли запаса (неиспользуемые)" };

    public static long[] arr = {143001000000L, 143002020100L, 143002020100L, 142006000000L, 143002000000L, 143002000000L, 143002020100L, 143002020000L, 142000000000L, 143004020000L, 143003000000L,
            143002000000L, 141001000000L, 141003000000L, 141010000000L, 145003000000L, 141014000000L, 143002020100L, 143003000000L, 143002000000L, 143002020100L, 143002000000L, 143002030000L,
            142006000000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 145003000000L, 143003000000L, 143001000000L, 141001000000L,
            143002000000L, 143002020100L, 143002020500L, 141003000000L, 141001000000L, 141001000000L, 143007000000L, 142007000000L, 143002020100L, 142006000000L, 141003000000L, 141003000000L,
            143002000000L, 141003000000L, 143003000000L, 143003020100L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L,
            142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142001010000L, 142000000000L, 142000000000L, 142000000000L, 142005000000L, 142000000000L,
            142000000000L, 142000000000L, 142000000000L, 142000000000L, 142000000000L, 142000000000L, 141003000000L, 143002000000L, 143001000000L, 141002000000L, 143002030000L, 143002000000L,
            143002020100L, 145003000000L, 141003000000L, 141003000000L, 141003000000L, 143002020100L, 143002030000L, 141003000000L, 141001000000L, 143002020100L, 143002030000L, 141001000000L,
            141001000000L, 141001000000L, 141003000000L, 141003000000L, 141003000000L, 141003000000L, 141000000000L, 141000000000L, 141003000000L, 143002020100L, 143002020100L, 145000000000L,
            143002030000L, 141003000000L, 143002000000L, 145000000000L, 142000000000L, 141003000000L, 141003000000L, 141003000000L, 143003000000L, 143003000000L, 145000000000L, 143002010000L,
            141003000000L, 141003000000L, 141003000000L, 143002020100L, 142007000000L, 141003000000L, 141003000000L, 141000000000L, 141000000000L, 141000000000L, 141003000000L, 141014000000L,
            141000000000L, 141003000000L, 143003000000L};

    public static void main(String[] args) {

        String[] elemenName = new String[arr.length];

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < classificCode.length; i++) {
                if (arr[k] == classificCode[i]) {
                        elemenName[k] = textClassificCode[i];
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d " + "%s", arr[i], elemenName[i]);
            System.out.println();
        }
    }
}