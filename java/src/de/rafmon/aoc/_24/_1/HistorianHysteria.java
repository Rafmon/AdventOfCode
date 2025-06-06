package de.rafmon.aoc._24._1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://adventofcode.com/2024/day/1
 */
public class HistorianHysteria {

	public static final String INPUT = "77221   93653\r\n" + "61169   27995\r\n" + "49546   69782\r\n"
			+ "11688   41563\r\n" + "15820   48282\r\n" + "63235   37517\r\n" + "28850   68189\r\n"
			+ "80735   25255\r\n" + "42616   65322\r\n" + "55068   99897\r\n" + "30851   35509\r\n"
			+ "14907   49013\r\n" + "64732   92011\r\n" + "16709   68830\r\n" + "67643   36207\r\n"
			+ "44080   23559\r\n" + "96480   58330\r\n" + "99450   40186\r\n" + "21169   63410\r\n"
			+ "58096   21671\r\n" + "53828   79572\r\n" + "47026   44529\r\n" + "90101   28656\r\n"
			+ "45773   73412\r\n" + "71303   85991\r\n" + "45304   78294\r\n" + "96528   23559\r\n"
			+ "19794   17882\r\n" + "74831   17211\r\n" + "88912   11644\r\n" + "98961   80435\r\n"
			+ "15788   96101\r\n" + "16350   86995\r\n" + "96806   19028\r\n" + "99959   77868\r\n"
			+ "58887   90255\r\n" + "42568   25255\r\n" + "29278   88912\r\n" + "94028   63269\r\n"
			+ "42810   21548\r\n" + "97490   71747\r\n" + "89051   24477\r\n" + "73916   31808\r\n"
			+ "97751   88912\r\n" + "73608   77868\r\n" + "62426   13754\r\n" + "29429   36177\r\n"
			+ "11070   10894\r\n" + "78656   85185\r\n" + "31308   60500\r\n" + "96166   91114\r\n"
			+ "36906   85134\r\n" + "99662   77868\r\n" + "66402   41563\r\n" + "37085   14475\r\n"
			+ "80907   53324\r\n" + "61650   53324\r\n" + "84223   63753\r\n" + "83891   47827\r\n"
			+ "15973   77536\r\n" + "68843   40593\r\n" + "98854   31274\r\n" + "42426   97404\r\n"
			+ "25255   67531\r\n" + "44559   50141\r\n" + "93909   50674\r\n" + "28070   32858\r\n"
			+ "24880   24813\r\n" + "29338   89795\r\n" + "64883   77868\r\n" + "66924   57646\r\n"
			+ "32984   66502\r\n" + "32238   39062\r\n" + "38816   23559\r\n" + "58770   65322\r\n"
			+ "74953   91636\r\n" + "70592   19028\r\n" + "93111   11644\r\n" + "31065   23537\r\n"
			+ "67370   19028\r\n" + "18314   47412\r\n" + "71075   74334\r\n" + "21544   44529\r\n"
			+ "59137   50980\r\n" + "20440   80749\r\n" + "14393   38495\r\n" + "72130   90255\r\n"
			+ "43828   68830\r\n" + "23262   73660\r\n" + "11923   50980\r\n" + "47754   14164\r\n"
			+ "96043   34362\r\n" + "27162   28090\r\n" + "20838   50713\r\n" + "75009   11121\r\n"
			+ "92099   31274\r\n" + "22054   38248\r\n" + "43518   80106\r\n" + "68189   13153\r\n"
			+ "50520   12727\r\n" + "51425   40674\r\n" + "42998   31053\r\n" + "52443   33051\r\n"
			+ "37256   54436\r\n" + "16648   95555\r\n" + "81123   17329\r\n" + "46974   79835\r\n"
			+ "36328   77868\r\n" + "76373   23559\r\n" + "82592   70046\r\n" + "70600   22417\r\n"
			+ "27116   89690\r\n" + "28090   34969\r\n" + "86348   23559\r\n" + "53145   50980\r\n"
			+ "30203   83301\r\n" + "23347   77681\r\n" + "76433   26236\r\n" + "28046   92869\r\n"
			+ "58920   50980\r\n" + "25518   28090\r\n" + "12791   44529\r\n" + "61967   31808\r\n"
			+ "98022   53056\r\n" + "24326   12263\r\n" + "41095   13121\r\n" + "24045   82448\r\n"
			+ "31274   16530\r\n" + "78021   21589\r\n" + "63029   19658\r\n" + "75684   14475\r\n"
			+ "31258   36493\r\n" + "40561   48589\r\n" + "20457   54974\r\n" + "14783   88465\r\n"
			+ "39433   23537\r\n" + "34774   53324\r\n" + "10455   14329\r\n" + "26338   74416\r\n"
			+ "55227   37003\r\n" + "36963   40380\r\n" + "31910   68189\r\n" + "94894   18220\r\n"
			+ "23166   44111\r\n" + "48884   46787\r\n" + "73036   89795\r\n" + "83519   25205\r\n"
			+ "50205   93653\r\n" + "85926   50141\r\n" + "69194   23559\r\n" + "25529   11642\r\n"
			+ "10182   31274\r\n" + "13638   61987\r\n" + "83588   19028\r\n" + "75911   20768\r\n"
			+ "44692   24325\r\n" + "43278   94888\r\n" + "48148   24394\r\n" + "86205   99327\r\n"
			+ "82605   58818\r\n" + "52770   68189\r\n" + "89068   84917\r\n" + "66452   83679\r\n"
			+ "50217   85099\r\n" + "64914   52073\r\n" + "76460   78294\r\n" + "43026   24410\r\n"
			+ "44179   50980\r\n" + "47653   90255\r\n" + "78061   50980\r\n" + "14475   71478\r\n"
			+ "77868   37150\r\n" + "99645   28090\r\n" + "86267   70055\r\n" + "58072   68830\r\n"
			+ "96428   66585\r\n" + "77501   50141\r\n" + "52344   93653\r\n" + "49534   35509\r\n"
			+ "46925   12437\r\n" + "40005   87987\r\n" + "17329   86995\r\n" + "17585   89795\r\n"
			+ "32296   59660\r\n" + "81836   11644\r\n" + "89435   65322\r\n" + "55149   59423\r\n"
			+ "56971   50141\r\n" + "26342   95142\r\n" + "57894   56227\r\n" + "49762   33007\r\n"
			+ "48949   65641\r\n" + "40453   53505\r\n" + "67613   23537\r\n" + "27110   87987\r\n"
			+ "25231   63910\r\n" + "92546   50713\r\n" + "70074   27554\r\n" + "39649   93653\r\n"
			+ "93231   30520\r\n" + "60008   79179\r\n" + "18449   47209\r\n" + "68828   36207\r\n"
			+ "18908   72254\r\n" + "55426   44661\r\n" + "62522   87987\r\n" + "60923   25255\r\n"
			+ "85721   68107\r\n" + "35153   71814\r\n" + "20053   24813\r\n" + "24233   22904\r\n"
			+ "36237   92731\r\n" + "92077   68189\r\n" + "30105   50674\r\n" + "37032   90255\r\n"
			+ "12745   54116\r\n" + "41563   53324\r\n" + "24700   29145\r\n" + "60226   85335\r\n"
			+ "50713   64775\r\n" + "29972   51790\r\n" + "79176   19794\r\n" + "40017   96101\r\n"
			+ "90724   41345\r\n" + "51608   39176\r\n" + "46178   50141\r\n" + "26151   23489\r\n"
			+ "19569   44529\r\n" + "34368   86052\r\n" + "18948   50801\r\n" + "62091   17329\r\n"
			+ "89749   38984\r\n" + "68315   37514\r\n" + "52396   19794\r\n" + "14981   14475\r\n"
			+ "36038   69571\r\n" + "50048   50980\r\n" + "60796   41563\r\n" + "69942   72877\r\n"
			+ "80976   25234\r\n" + "56722   90255\r\n" + "49489   28090\r\n" + "60768   65557\r\n"
			+ "70753   85065\r\n" + "15233   23522\r\n" + "94697   87600\r\n" + "40958   41532\r\n"
			+ "91709   40116\r\n" + "83586   19028\r\n" + "88140   24977\r\n" + "56993   50980\r\n"
			+ "17980   53324\r\n" + "12421   97982\r\n" + "30183   40884\r\n" + "50452   53324\r\n"
			+ "91314   90651\r\n" + "69995   19028\r\n" + "16588   28090\r\n" + "22432   98658\r\n"
			+ "86088   77868\r\n" + "46361   65322\r\n" + "97178   75705\r\n" + "37444   79320\r\n"
			+ "12275   96101\r\n" + "47016   16942\r\n" + "36822   87327\r\n" + "62082   31274\r\n"
			+ "68265   64314\r\n" + "87344   24603\r\n" + "40642   23559\r\n" + "87254   38755\r\n"
			+ "62372   50713\r\n" + "89026   68830\r\n" + "88519   96101\r\n" + "53514   31808\r\n"
			+ "24686   41563\r\n" + "23817   68705\r\n" + "26704   89031\r\n" + "37908   65322\r\n"
			+ "22665   35601\r\n" + "75378   59200\r\n" + "16797   86995\r\n" + "55847   68189\r\n"
			+ "55932   72688\r\n" + "41470   96101\r\n" + "43557   17329\r\n" + "45439   77868\r\n"
			+ "41230   76226\r\n" + "25104   92869\r\n" + "43736   93653\r\n" + "85938   93653\r\n"
			+ "74153   54726\r\n" + "73956   70350\r\n" + "70419   37102\r\n" + "81275   64160\r\n"
			+ "30656   32684\r\n" + "46218   32617\r\n" + "67969   31808\r\n" + "61544   81806\r\n"
			+ "39376   56568\r\n" + "14769   60336\r\n" + "10199   97703\r\n" + "61064   40091\r\n"
			+ "75531   30486\r\n" + "17211   31808\r\n" + "75184   74633\r\n" + "24565   61765\r\n"
			+ "83922   44529\r\n" + "11644   25255\r\n" + "71836   14393\r\n" + "53030   19028\r\n"
			+ "83437   33190\r\n" + "33687   54998\r\n" + "92054   82083\r\n" + "48250   68533\r\n"
			+ "10977   34363\r\n" + "51050   19028\r\n" + "80898   68276\r\n" + "26442   68830\r\n"
			+ "39875   65514\r\n" + "24976   76417\r\n" + "31946   23537\r\n" + "95278   90255\r\n"
			+ "71678   26450\r\n" + "49641   28580\r\n" + "12962   13674\r\n" + "13598   30362\r\n"
			+ "40620   21256\r\n" + "49062   92869\r\n" + "88449   79529\r\n" + "80153   94081\r\n"
			+ "36918   70556\r\n" + "77902   99228\r\n" + "41848   99097\r\n" + "26032   39378\r\n"
			+ "23830   50980\r\n" + "49712   78294\r\n" + "95464   65322\r\n" + "76971   27393\r\n"
			+ "67074   22132\r\n" + "17629   71246\r\n" + "92019   92869\r\n" + "20780   96521\r\n"
			+ "68372   16880\r\n" + "49710   88060\r\n" + "94680   52634\r\n" + "28626   57101\r\n"
			+ "31808   60809\r\n" + "25578   28090\r\n" + "12020   25255\r\n" + "46008   33046\r\n"
			+ "27712   36207\r\n" + "17168   53033\r\n" + "92923   87987\r\n" + "94668   65843\r\n"
			+ "59490   48858\r\n" + "69085   38485\r\n" + "28242   14664\r\n" + "18302   96101\r\n"
			+ "64047   71241\r\n" + "62752   73532\r\n" + "28873   59278\r\n" + "22206   18029\r\n"
			+ "57298   85374\r\n" + "26420   78294\r\n" + "74055   30817\r\n" + "74377   45566\r\n"
			+ "81846   17058\r\n" + "35184   27305\r\n" + "72054   89795\r\n" + "78666   41563\r\n"
			+ "80545   96101\r\n" + "69240   51322\r\n" + "76319   36831\r\n" + "23617   14475\r\n"
			+ "53848   93653\r\n" + "65082   36888\r\n" + "18802   93491\r\n" + "63942   23559\r\n"
			+ "80208   22876\r\n" + "17018   68830\r\n" + "78018   51611\r\n" + "35520   75130\r\n"
			+ "43479   88543\r\n" + "18522   96101\r\n" + "41260   15010\r\n" + "58041   21675\r\n"
			+ "96272   68830\r\n" + "73601   78294\r\n" + "44788   52104\r\n" + "67152   89795\r\n"
			+ "57671   61399\r\n" + "33841   56764\r\n" + "41963   53394\r\n" + "41010   28090\r\n"
			+ "53937   65322\r\n" + "75472   76675\r\n" + "22253   92068\r\n" + "24277   93653\r\n"
			+ "62012   14475\r\n" + "27539   50141\r\n" + "29180   41637\r\n" + "27151   35922\r\n"
			+ "28752   23559\r\n" + "31602   47673\r\n" + "80298   50906\r\n" + "94689   38297\r\n"
			+ "87987   48139\r\n" + "51692   61967\r\n" + "93653   86995\r\n" + "99694   96638\r\n"
			+ "50948   11644\r\n" + "87830   19794\r\n" + "57579   93403\r\n" + "60947   72082\r\n"
			+ "18514   53324\r\n" + "99194   25255\r\n" + "57630   93653\r\n" + "49914   10526\r\n"
			+ "34613   94340\r\n" + "32145   16105\r\n" + "39569   62764\r\n" + "14118   31274\r\n"
			+ "38901   19016\r\n" + "47443   66925\r\n" + "83812   31274\r\n" + "61920   50141\r\n"
			+ "88684   50713\r\n" + "32305   31808\r\n" + "58695   50713\r\n" + "20016   42720\r\n"
			+ "68955   31976\r\n" + "96299   99509\r\n" + "83258   96101\r\n" + "49424   68830\r\n"
			+ "97130   14043\r\n" + "34668   50936\r\n" + "27567   35509\r\n" + "57890   65959\r\n"
			+ "58399   78860\r\n" + "88934   50980\r\n" + "70656   66788\r\n" + "91507   44529\r\n"
			+ "53671   87987\r\n" + "75858   71137\r\n" + "14726   13674\r\n" + "25416   31274\r\n"
			+ "90521   50075\r\n" + "37289   96101\r\n" + "79415   19028\r\n" + "21158   25355\r\n"
			+ "53210   16168\r\n" + "35192   81526\r\n" + "67240   23559\r\n" + "42967   65310\r\n"
			+ "81598   93094\r\n" + "12765   36207\r\n" + "23853   41643\r\n" + "78439   22984\r\n"
			+ "13052   50141\r\n" + "56642   93653\r\n" + "19028   82791\r\n" + "89371   36244\r\n"
			+ "89795   50799\r\n" + "41542   90489\r\n" + "49486   72630\r\n" + "26630   50763\r\n"
			+ "35019   68830\r\n" + "62271   78294\r\n" + "16433   77868\r\n" + "42466   57338\r\n"
			+ "63666   39984\r\n" + "56231   83564\r\n" + "51132   96101\r\n" + "33675   74200\r\n"
			+ "94670   70445\r\n" + "51236   17822\r\n" + "52493   64460\r\n" + "45346   86995\r\n"
			+ "41620   31274\r\n" + "80479   88912\r\n" + "46200   90255\r\n" + "13789   60686\r\n"
			+ "98564   76843\r\n" + "44974   92717\r\n" + "76047   80674\r\n" + "60650   89430\r\n"
			+ "55723   45722\r\n" + "89426   97853\r\n" + "33961   98414\r\n" + "32872   68189\r\n"
			+ "65322   12029\r\n" + "29922   36159\r\n" + "74923   34697\r\n" + "37065   59688\r\n"
			+ "66622   23559\r\n" + "68253   14475\r\n" + "28664   53324\r\n" + "62981   25761\r\n"
			+ "83161   50674\r\n" + "22849   50980\r\n" + "11119   76308\r\n" + "22980   13794\r\n"
			+ "76171   19411\r\n" + "96351   28221\r\n" + "45573   90255\r\n" + "19850   79146\r\n"
			+ "97828   90483\r\n" + "23867   85271\r\n" + "36353   50141\r\n" + "46579   87987\r\n"
			+ "73434   23559\r\n" + "57169   68189\r\n" + "68768   41682\r\n" + "59354   97617\r\n"
			+ "62181   64641\r\n" + "34167   53324\r\n" + "28374   24803\r\n" + "55863   57352\r\n"
			+ "25058   33040\r\n" + "76126   53005\r\n" + "97283   51641\r\n" + "25887   29253\r\n"
			+ "43067   50713\r\n" + "51616   61868\r\n" + "97533   16129\r\n" + "50692   80951\r\n"
			+ "43173   41626\r\n" + "93917   76055\r\n" + "84713   53465\r\n" + "24130   13599\r\n"
			+ "56773   50980\r\n" + "15310   44529\r\n" + "63375   50141\r\n" + "75875   93653\r\n"
			+ "22284   33135\r\n" + "46294   77836\r\n" + "29713   14393\r\n" + "95318   83346\r\n"
			+ "83264   61967\r\n" + "39267   47771\r\n" + "61101   86995\r\n" + "47882   96101\r\n"
			+ "24345   70347\r\n" + "50674   14475\r\n" + "17296   12880\r\n" + "52605   11644\r\n"
			+ "40817   78294\r\n" + "36207   93653\r\n" + "16045   96101\r\n" + "91784   68830\r\n"
			+ "34583   69934\r\n" + "71867   28090\r\n" + "74898   22671\r\n" + "54609   27206\r\n"
			+ "33070   26257\r\n" + "18570   57394\r\n" + "16766   87036\r\n" + "62825   21503\r\n"
			+ "39793   17504\r\n" + "12038   82452\r\n" + "37265   12706\r\n" + "69479   44529\r\n"
			+ "96101   44260\r\n" + "49175   50713\r\n" + "70708   55412\r\n" + "50136   14475\r\n"
			+ "27300   96101\r\n" + "75794   62368\r\n" + "10277   87990\r\n" + "30825   87987\r\n"
			+ "35563   24149\r\n" + "12505   91890\r\n" + "11323   14393\r\n" + "89922   84455\r\n"
			+ "10927   65359\r\n" + "50656   71304\r\n" + "47973   11644\r\n" + "17156   92869\r\n"
			+ "98964   96101\r\n" + "50980   59345\r\n" + "94733   23559\r\n" + "22743   26134\r\n"
			+ "90255   54273\r\n" + "80006   65322\r\n" + "10157   92869\r\n" + "70496   28090\r\n"
			+ "25569   41226\r\n" + "79982   92869\r\n" + "34897   76485\r\n" + "83357   86388\r\n"
			+ "26352   79503\r\n" + "67432   15174\r\n" + "49155   72153\r\n" + "36311   86995\r\n"
			+ "14394   65333\r\n" + "70928   51667\r\n" + "67367   23559\r\n" + "48195   57003\r\n"
			+ "52001   26154\r\n" + "63251   21651\r\n" + "21894   89795\r\n" + "50774   43252\r\n"
			+ "85637   36207\r\n" + "79243   11644\r\n" + "49512   57954\r\n" + "22454   15919\r\n"
			+ "84214   20805\r\n" + "67121   86995\r\n" + "49247   78035\r\n" + "79313   34840\r\n"
			+ "33168   19814\r\n" + "48657   92888\r\n" + "59824   74905\r\n" + "30088   68830\r\n"
			+ "74246   90052\r\n" + "78389   65322\r\n" + "88418   28090\r\n" + "93716   62226\r\n"
			+ "74962   29324\r\n" + "47309   50980\r\n" + "93517   14393\r\n" + "23895   68175\r\n"
			+ "34548   25255\r\n" + "32628   84730\r\n" + "55988   31274\r\n" + "82578   40953\r\n"
			+ "51728   16926\r\n" + "19440   27805\r\n" + "42922   45159\r\n" + "52930   41563\r\n"
			+ "91562   31274\r\n" + "23559   62680\r\n" + "92150   26879\r\n" + "78315   61783\r\n"
			+ "43601   91325\r\n" + "87621   17838\r\n" + "78580   65350\r\n" + "94778   77868\r\n"
			+ "68519   83273\r\n" + "35509   66389\r\n" + "82288   52439\r\n" + "65083   19794\r\n"
			+ "86995   13010\r\n" + "66618   95850\r\n" + "18656   70145\r\n" + "98537   65322\r\n"
			+ "60842   52161\r\n" + "68830   10132\r\n" + "99689   24077\r\n" + "33740   89795\r\n"
			+ "45595   53090\r\n" + "78239   36207\r\n" + "20185   36207\r\n" + "87307   69366\r\n"
			+ "83009   77868\r\n" + "34685   88642\r\n" + "13674   28090\r\n" + "82450   69909\r\n"
			+ "44812   75146\r\n" + "54296   92869\r\n" + "73558   94990\r\n" + "21422   48229\r\n"
			+ "49473   10547\r\n" + "66108   68189\r\n" + "71169   74202\r\n" + "78276   40690\r\n"
			+ "82977   78294\r\n" + "61842   15634\r\n" + "31582   95459\r\n" + "39064   14475\r\n"
			+ "70204   18593\r\n" + "71244   87987\r\n" + "31642   50490\r\n" + "98413   37109\r\n"
			+ "61175   50141\r\n" + "37168   23559\r\n" + "44093   11032\r\n" + "18806   40848\r\n"
			+ "91249   73483\r\n" + "95812   32572\r\n" + "93644   68189\r\n" + "30669   20850\r\n"
			+ "75404   92869\r\n" + "53324   50141\r\n" + "80675   50216\r\n" + "14897   73401\r\n"
			+ "34074   29952\r\n" + "16366   32630\r\n" + "95656   28090\r\n" + "73964   58896\r\n"
			+ "90705   66916\r\n" + "92869   59662\r\n" + "99522   78294\r\n" + "35903   19794\r\n"
			+ "33033   42610\r\n" + "55650   50980\r\n" + "29289   11753\r\n" + "32302   58345\r\n"
			+ "76036   57644\r\n" + "74870   31274\r\n" + "85035   77868\r\n" + "79322   25255\r\n"
			+ "50332   31274\r\n" + "78294   44529\r\n" + "93000   53324\r\n" + "36560   19028\r\n"
			+ "40041   53525\r\n" + "70360   89795\r\n" + "19074   98749\r\n" + "32829   89603\r\n"
			+ "61436   71046\r\n" + "89938   85369\r\n" + "52708   28090\r\n" + "83958   53324\r\n"
			+ "88155   67097\r\n" + "32730   75527\r\n" + "64221   23559\r\n" + "60391   97432\r\n"
			+ "70047   20185\r\n" + "12372   73527\r\n" + "46501   29274\r\n" + "66552   14746\r\n"
			+ "56373   51614\r\n" + "95596   11782\r\n" + "81196   72623\r\n" + "32282   60515\r\n"
			+ "49504   14393\r\n" + "57642   34348\r\n" + "95402   87987\r\n" + "81625   68830\r\n"
			+ "28527   37199\r\n" + "71475   31808\r\n" + "94280   23005\r\n" + "55623   99355\r\n"
			+ "46783   29073\r\n" + "36641   81559\r\n" + "74788   14535\r\n" + "87994   78773\r\n"
			+ "80189   77868\r\n" + "33263   89795\r\n" + "23537   23537\r\n" + "25755   22264\r\n"
			+ "67413   72800\r\n" + "74924   73774\r\n" + "81215   78294\r\n" + "78206   92869\r\n"
			+ "36161   50141\r\n" + "54925   86995\r\n" + "66305   49951\r\n" + "42462   28090\r\n"
			+ "99051   88912\r\n" + "44954   89795\r\n" + "88856   28090\r\n" + "63026   85778\r\n"
			+ "22651   24813\r\n" + "39262   14475\r\n" + "86176   69982\r\n" + "65395   14393\r\n"
			+ "12926   78294\r\n" + "81994   53324\r\n" + "16933   30191\r\n" + "46987   19794\r\n"
			+ "37215   28090\r\n" + "15340   63748\r\n" + "40271   86674\r\n" + "23747   52856\r\n"
			+ "61156   11644\r\n" + "65356   56048\r\n" + "72336   51278\r\n" + "21864   77868\r\n"
			+ "99351   13349\r\n" + "24599   79046\r\n" + "62281   23361\r\n" + "81871   53324\r\n"
			+ "14029   42297\r\n" + "50141   48720\r\n" + "46677   43636\r\n" + "10745   35965\r\n"
			+ "39344   80864\r\n" + "38077   50038\r\n" + "13983   89795\r\n" + "66663   67877\r\n"
			+ "64175   19028\r\n" + "62355   68830\r\n" + "96823   79443\r\n" + "46436   44754\r\n"
			+ "53388   68830\r\n" + "45987   92723\r\n" + "87646   11707\r\n" + "75997   45545\r\n"
			+ "69968   93653\r\n" + "30425   44529\r\n" + "83211   88109\r\n" + "28725   64932\r\n"
			+ "47043   89795\r\n" + "34475   31274\r\n" + "42302   94895\r\n" + "66558   92753\r\n"
			+ "48964   50713\r\n" + "19546   78294\r\n" + "51026   89795\r\n" + "89346   57408\r\n"
			+ "52993   54676\r\n" + "29577   38385\r\n" + "85932   60320\r\n" + "18030   22556\r\n"
			+ "65993   19922\r\n" + "74692   23559\r\n" + "61588   89795\r\n" + "50688   69541\r\n"
			+ "93760   44529\r\n" + "75094   96101\r\n" + "68976   86835\r\n" + "46278   50980\r\n"
			+ "97836   44529\r\n" + "17576   32708\r\n" + "48519   46071\r\n" + "72647   93653\r\n"
			+ "54724   34155\r\n" + "45186   43448\r\n" + "44529   41828\r\n" + "90404   86357\r\n"
			+ "63175   44529\r\n" + "88381   25963\r\n" + "32140   23537\r\n" + "43348   36423\r\n"
			+ "41733   88912\r\n" + "84065   98953\r\n" + "20389   96101\r\n" + "38749   93788\r\n"
			+ "37929   35143\r\n" + "63747   35340\r\n" + "72249   93653\r\n" + "98042   59381\r\n"
			+ "22741   95783\r\n" + "88124   33425\r\n" + "16493   44529\r\n" + "36599   69408\r\n"
			+ "50436   41563\r\n" + "67695   86149\r\n" + "89091   20022\r\n" + "60708   92607\r\n"
			+ "28750   68830\r\n" + "80224   39113\r\n" + "34580   96101\r\n" + "79688   34798\r\n"
			+ "14870   68189\r\n" + "47719   29252\r\n" + "57652   33458\r\n" + "65541   87987\r\n"
			+ "86435   19794\r\n" + "95204   81239\r\n" + "43800   50980\r\n" + "94063   11644\r\n"
			+ "24096   36588\r\n" + "36628   95478\r\n" + "81443   17329\r\n" + "61221   57166\r\n"
			+ "52782   78294\r\n" + "16740   31274\r\n" + "68369   45653\r\n" + "28895   44529\r\n"
			+ "39222   65582\r\n" + "97201   77602\r\n" + "81119   11644\r\n" + "41083   50141\r\n"
			+ "72917   25255\r\n" + "46148   21269\r\n" + "44495   18020\r\n" + "99464   90525\r\n"
			+ "67254   58381\r\n" + "52750   28135\r\n" + "63899   55754\r\n" + "14617   50713\r\n"
			+ "36962   50713\r\n" + "41322   73436\r\n" + "22504   38709\r\n" + "72577   39875\r\n"
			+ "67799   68830\r\n" + "68284   71156\r\n" + "46011   61967\r\n" + "50367   31808\r\n"
			+ "45832   87987\r\n" + "88775   87987\r\n" + "32562   26340\r\n" + "43756   49887\r\n"
			+ "73444   16547\r\n" + "67302   92449\r\n" + "22133   85451\r\n" + "17768   77868\r\n"
			+ "69281   39885\r\n" + "87364   25255\r\n" + "41209   27363\r\n" + "37792   77868\r\n"
			+ "66667   73746\r\n" + "22195   28090\r\n" + "65037   37556\r\n" + "28634   89795\r\n"
			+ "23901   50674\r\n" + "40511   95801\r\n" + "47779   45253\r\n" + "76489   86807\r\n"
			+ "77873   66992\r\n" + "87523   35509\r\n" + "32876   50980\r\n" + "62342   50980\r\n"
			+ "84222   41563\r\n" + "88205   40382\r\n" + "78856   20051\r\n" + "97888   68189\r\n"
			+ "22233   17329\r\n" + "35868   81437\r\n" + "80155   93653\r\n" + "82730   78294\r\n"
			+ "12733   19794\r\n" + "55038   26258\r\n" + "50682   23250\r\n" + "42043   74279\r\n"
			+ "54719   71512\r\n" + "54474   23991\r\n" + "61776   25255\r\n" + "55564   41563\r\n"
			+ "39404   31274\r\n" + "94954   14475\r\n" + "76258   89795\r\n" + "87689   67995\r\n"
			+ "65619   59930\r\n" + "41846   17435\r\n" + "21990   22185\r\n" + "60161   53026\r\n"
			+ "44955   57523\r\n" + "84178   39875\r\n" + "32693   87987\r\n" + "19125   44529\r\n"
			+ "96731   93653\r\n" + "98080   44529\r\n" + "72947   95746\r\n" + "67285   23344\r\n"
			+ "78101   77580\r\n" + "43064   11644\r\n" + "81350   23483\r\n" + "46937   11644\r\n"
			+ "97686   79381\r\n" + "66339   60744\r\n" + "39269   50674\r\n" + "61837   77868\r\n"
			+ "97647   86995\r\n" + "44613   93568\r\n" + "73127   68830\r\n" + "64048   80370\r\n"
			+ "15530   87987\r\n" + "63926   51860\r\n" + "95853   91981\r\n" + "26155   28090\r\n"
			+ "82222   19794\r\n" + "10035   87445\r\n" + "16445   93653\r\n" + "67972   15558\r\n"
			+ "51780   68830\r\n" + "52358   31274\r\n" + "83942   60096\r\n" + "64899   11955\r\n"
			+ "56009   96101\r\n" + "42288   36590\r\n" + "53349   65322\r\n" + "76255   50713\r\n"
			+ "53044   26351\r\n" + "37184   31274\r\n" + "24813   19028\r\n" + "62309   52490\r\n"
			+ "93607   19028\r\n" + "27423   45568\r\n" + "26128   78294\r\n" + "72691   50141\r\n"
			+ "42162   60052\r\n" + "78247   10613\r\n" + "80209   31808\r\n" + "38310   93653\r\n"
			+ "59228   47607\r\n" + "24897   23559\r\n" + "55176   37760\r\n" + "33062   53324\r\n"
			+ "26521   39170\r\n" + "93209   68189\r\n" + "89881   23559\r\n" + "11418   50980\r\n"
			+ "16884   78294\r\n" + "31995   50980\r\n" + "17858   98671\r\n" + "49107   96101\r\n"
			+ "50512   54526\r\n" + "56890   65322\r\n" + "76173   65309\r\n" + "51569   52845\r\n"
			+ "73919   23537\r\n" + "62591   16739\r\n" + "53735   79935\r\n" + "14454   69804\r\n"
			+ "19976   46609\r\n";

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int totalDistance = 0;
		
		String[] input = INPUT.split("\r\n");
		for (String line : input) {
			String[] parts = line.split("   ");
			list1.add(Integer.parseInt(parts[0]));
			list2.add(Integer.parseInt(parts[1]));
		}

		// Sortieren am Ende
		Collections.sort(list1);
		Collections.sort(list2);

		for (int i = 0; i < list1.size(); i++) {
			totalDistance += Math.abs(list2.get(i) - list1.get(i));
		}

		System.out.println("Total distance: " + totalDistance);

		/* ----- part 2 ----- */

		Map<Integer, Integer> numberCounts = new HashMap<>();
		int similarityScore = 0;

		for (Integer i : list2) {
			numberCounts.put(i, numberCounts.getOrDefault(i, 0) + 1);
		}

		for (int i : list1) {
			if (numberCounts.containsKey(i)) {
				similarityScore += (i * numberCounts.get(i));
			}
		}

		System.out.println("Similarity score: " + similarityScore);
	}
}
