package cn.edu.pku.sei.ra.wrapping.codegen.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import cn.edu.pku.sei.ra.wrapping.codegen.util.*;
import org.eclipse.emf.ecore.*;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.*;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "/**";
  protected final String TEXT_4 = NL + " * ";
  protected final String TEXT_5 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_6 = NL + " *" + NL + " * ";
  protected final String TEXT_7 = "Id";
  protected final String TEXT_8 = NL + " */";
  protected final String TEXT_9 = NL + "package ";
  protected final String TEXT_10 = ";";
  protected final String TEXT_11 = NL + "package ";
  protected final String TEXT_12 = ";";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = NL + "import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;" + NL + "import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;" + NL + "import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;" + NL + "import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;" + NL + "import java.util.ArrayList;" + NL + "import java.util.Collection;" + NL + "import java.util.List;" + NL + "import java.util.Set;";
  protected final String TEXT_16 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_17 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_18 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_19 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_20 = NL + " *";
  protected final String TEXT_21 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_22 = NL + " *   <li>{@link ";
  protected final String TEXT_23 = "#";
  protected final String TEXT_24 = " <em>";
  protected final String TEXT_25 = "</em>}</li>";
  protected final String TEXT_26 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_27 = NL + " *";
  protected final String TEXT_28 = NL + " * @see ";
  protected final String TEXT_29 = "#get";
  protected final String TEXT_30 = "()";
  protected final String TEXT_31 = NL + " * @model ";
  protected final String TEXT_32 = NL + " *        ";
  protected final String TEXT_33 = NL + " * @model";
  protected final String TEXT_34 = NL + " * @extends ";
  protected final String TEXT_35 = NL + " * @generated" + NL + " */";
  protected final String TEXT_36 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_37 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_38 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_39 = NL + " *   <li>{@link ";
  protected final String TEXT_40 = "#";
  protected final String TEXT_41 = " <em>";
  protected final String TEXT_42 = "</em>}</li>";
  protected final String TEXT_43 = NL + " * </ul>";
  protected final String TEXT_44 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_45 = NL + "public";
  protected final String TEXT_46 = " abstract";
  protected final String TEXT_47 = " class ";
  protected final String TEXT_48 = NL + "public interface ";
  protected final String TEXT_49 = NL + "{";
  protected final String TEXT_50 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_51 = " copyright = ";
  protected final String TEXT_52 = ";";
  protected final String TEXT_53 = NL;
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_55 = " mofDriverNumber = \"";
  protected final String TEXT_56 = "\";";
  protected final String TEXT_57 = NL;
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_60 = ";" + NL;
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_62 = ";" + NL;
  protected final String TEXT_63 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_64 = " = 0;" + NL;
  protected final String TEXT_65 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_66 = "() <em>";
  protected final String TEXT_67 = "</em>}' ";
  protected final String TEXT_68 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_69 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_70 = " ";
  protected final String TEXT_71 = ";" + NL;
  protected final String TEXT_72 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_73 = "() <em>";
  protected final String TEXT_74 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_75 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_76 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_77 = NL + "\tprotected static final ";
  protected final String TEXT_78 = "[] ";
  protected final String TEXT_79 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_80 = " [0]";
  protected final String TEXT_81 = ";" + NL;
  protected final String TEXT_82 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_83 = "() <em>";
  protected final String TEXT_84 = "</em>}' ";
  protected final String TEXT_85 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_86 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_87 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_88 = NL + "\tprotected static final ";
  protected final String TEXT_89 = " ";
  protected final String TEXT_90 = "; // TODO The default value literal \"";
  protected final String TEXT_91 = "\" is not valid.";
  protected final String TEXT_92 = " = ";
  protected final String TEXT_93 = ";";
  protected final String TEXT_94 = NL;
  protected final String TEXT_95 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_96 = " = 0;" + NL;
  protected final String TEXT_97 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_98 = "() <em>";
  protected final String TEXT_99 = "</em>}' ";
  protected final String TEXT_100 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_101 = "_EFLAG_OFFSET = ";
  protected final String TEXT_102 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_103 = "() <em>";
  protected final String TEXT_104 = "</em>}' ";
  protected final String TEXT_105 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_106 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_107 = ".ordinal()";
  protected final String TEXT_108 = ".VALUES.indexOf(";
  protected final String TEXT_109 = ")";
  protected final String TEXT_110 = " << ";
  protected final String TEXT_111 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_112 = " ";
  protected final String TEXT_113 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_114 = "[] ";
  protected final String TEXT_115 = "_EFLAG_VALUES = ";
  protected final String TEXT_116 = ".values()";
  protected final String TEXT_117 = "(";
  protected final String TEXT_118 = "[])";
  protected final String TEXT_119 = ".VALUES.toArray(new ";
  protected final String TEXT_120 = "[";
  protected final String TEXT_121 = ".VALUES.size()])";
  protected final String TEXT_122 = ";" + NL;
  protected final String TEXT_123 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_124 = " representing the value of the '{@link #";
  protected final String TEXT_125 = "() <em>";
  protected final String TEXT_126 = "</em>}' ";
  protected final String TEXT_127 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_128 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_129 = "_EFLAG = ";
  protected final String TEXT_130 = " << ";
  protected final String TEXT_131 = "_EFLAG_OFFSET";
  protected final String TEXT_132 = ";" + NL;
  protected final String TEXT_133 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_134 = "() <em>";
  protected final String TEXT_135 = "</em>}' ";
  protected final String TEXT_136 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_137 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_138 = " ";
  protected final String TEXT_139 = " = ";
  protected final String TEXT_140 = ";" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_142 = " = 0;" + NL;
  protected final String TEXT_143 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_144 = " ";
  protected final String TEXT_145 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_146 = "_ESETFLAG = 1 << ";
  protected final String TEXT_147 = ";" + NL;
  protected final String TEXT_148 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_149 = " ";
  protected final String TEXT_150 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_151 = "ESet;" + NL;
  protected final String TEXT_152 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_153 = " = ";
  protected final String TEXT_154 = ".getFeatureID(";
  protected final String TEXT_155 = ") - ";
  protected final String TEXT_156 = ";" + NL;
  protected final String TEXT_157 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_158 = " = ";
  protected final String TEXT_159 = ".getFeatureID(";
  protected final String TEXT_160 = ") - ";
  protected final String TEXT_161 = ";" + NL;
  protected final String TEXT_162 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_163 = "public";
  protected final String TEXT_164 = "protected";
  protected final String TEXT_165 = " ";
  protected final String TEXT_166 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_167 = NL + "\t\t";
  protected final String TEXT_168 = " |= ";
  protected final String TEXT_169 = "_EFLAG";
  protected final String TEXT_170 = "_DEFAULT";
  protected final String TEXT_171 = ";";
  protected final String TEXT_172 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_173 = NL + "\t@Override";
  protected final String TEXT_174 = NL + "\tprotected ";
  protected final String TEXT_175 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_176 = ";" + NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_177 = NL + "\t";
  protected final String TEXT_178 = NL + "\t";
  protected final String TEXT_179 = NL + "\t";
  protected final String TEXT_180 = NL + NL + "\t";
  protected final String TEXT_181 = NL + "\t";
  protected final String TEXT_182 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Object createCore(){" + NL + "\t\t";
  protected final String TEXT_183 = NL + "\t}" + NL + "\t";
  protected final String TEXT_184 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */ " + NL + "\t public void destroyCore(){" + NL + "\t \tif(core==null){" + NL + "\t\t\tthis.newborn=false;" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_185 = NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_186 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */ " + NL + "\t public boolean isForCore(Object arg0){" + NL + "\t \tboolean result=true;" + NL + "\t \tif(core==null) return false;" + NL + "\t\ttry{" + NL + "\t\t";
  protected final String TEXT_187 = NL + "\t\t}" + NL + "\t\tcatch(Exception e){" + NL + "\t\t\tresult=false;" + NL + "\t\t}" + NL + "\t\treturn result;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_188 = NL + NL + "\t";
  protected final String TEXT_189 = NL + "\t";
  protected final String TEXT_190 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */ " + NL + "\t public Object lookupCore(){" + NL + "\t\tObject result=null;" + NL + "\t\t";
  protected final String TEXT_191 = NL + "\t\treturn result;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_192 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */ " + NL + "\tpublic List listSubCores(int featureID){" + NL + "\t\tList result=new ArrayList();" + NL + "\t";
  protected final String TEXT_193 = NL + "\t\t";
  protected final String TEXT_194 = " core=(";
  protected final String TEXT_195 = ")this.getCore();" + NL + "\t\tif(core==null) " + NL + "\t\t\treturn result;" + NL + "\t\tswitch(featureID){" + NL + "\t\t" + NL + "\t";
  protected final String TEXT_196 = "\tcase ";
  protected final String TEXT_197 = ":" + NL + "\t";
  protected final String TEXT_198 = NL + "\t\t\t";
  protected final String TEXT_199 = NL + "\t\tbreak;" + NL + "\t\t";
  protected final String TEXT_200 = NL + "\t";
  protected final String TEXT_201 = "}" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */ " + NL + "\tpublic EClass getChildClassMap(Object object){" + NL + "\t\t";
  protected final String TEXT_202 = " pack=";
  protected final String TEXT_203 = ".eINSTANCE;\t" + NL + "\t";
  protected final String TEXT_204 = NL + "\t\tif(object instanceof ";
  protected final String TEXT_205 = ")" + NL + "\t\t\treturn pack.get";
  protected final String TEXT_206 = "();" + NL + "\t\t\t" + NL + "\t\t\t";
  protected final String TEXT_207 = NL + "\t\t";
  protected final String TEXT_208 = NL + "\t";
  protected final String TEXT_209 = NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_210 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_211 = NL + "\t@Override";
  protected final String TEXT_212 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_213 = ";" + NL + "\t}" + NL;
  protected final String TEXT_214 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_215 = NL + "\t";
  protected final String TEXT_216 = "[] ";
  protected final String TEXT_217 = "();" + NL;
  protected final String TEXT_218 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_219 = NL + "\tpublic ";
  protected final String TEXT_220 = "[] ";
  protected final String TEXT_221 = "()" + NL + "\t{";
  protected final String TEXT_222 = NL + "\t\t";
  protected final String TEXT_223 = " list = (";
  protected final String TEXT_224 = ")";
  protected final String TEXT_225 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_226 = "(";
  protected final String TEXT_227 = "[])";
  protected final String TEXT_228 = "_EEMPTY_ARRAY;";
  protected final String TEXT_229 = NL + "\t\tif (";
  protected final String TEXT_230 = " == null || ";
  protected final String TEXT_231 = ".isEmpty()) return ";
  protected final String TEXT_232 = "(";
  protected final String TEXT_233 = "[])";
  protected final String TEXT_234 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_235 = " list = (";
  protected final String TEXT_236 = ")";
  protected final String TEXT_237 = ";";
  protected final String TEXT_238 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_239 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_240 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_241 = NL + "\t";
  protected final String TEXT_242 = " get";
  protected final String TEXT_243 = "(int index);" + NL;
  protected final String TEXT_244 = NL + "\tpublic ";
  protected final String TEXT_245 = " get";
  protected final String TEXT_246 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_247 = "(";
  protected final String TEXT_248 = ")";
  protected final String TEXT_249 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_250 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_251 = NL + "\tint get";
  protected final String TEXT_252 = "Length();" + NL;
  protected final String TEXT_253 = NL + "\tpublic int get";
  protected final String TEXT_254 = "Length()" + NL + "\t{";
  protected final String TEXT_255 = NL + "\t\treturn ";
  protected final String TEXT_256 = "().size();";
  protected final String TEXT_257 = NL + "\t\treturn ";
  protected final String TEXT_258 = " == null ? 0 : ";
  protected final String TEXT_259 = ".size();";
  protected final String TEXT_260 = NL + "\t}" + NL;
  protected final String TEXT_261 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_262 = NL + "\tvoid set";
  protected final String TEXT_263 = "(";
  protected final String TEXT_264 = "[] new";
  protected final String TEXT_265 = ");" + NL;
  protected final String TEXT_266 = NL + "\tpublic void set";
  protected final String TEXT_267 = "(";
  protected final String TEXT_268 = "[] new";
  protected final String TEXT_269 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_270 = ")";
  protected final String TEXT_271 = "()).setData(new";
  protected final String TEXT_272 = ".length, new";
  protected final String TEXT_273 = ");" + NL + "\t}" + NL;
  protected final String TEXT_274 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_275 = NL + "\tvoid set";
  protected final String TEXT_276 = "(int index, ";
  protected final String TEXT_277 = " element);" + NL;
  protected final String TEXT_278 = NL + "\tpublic void set";
  protected final String TEXT_279 = "(int index, ";
  protected final String TEXT_280 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_281 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_282 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_283 = "</b></em>' ";
  protected final String TEXT_284 = ".";
  protected final String TEXT_285 = NL + "\t * The key is of type ";
  protected final String TEXT_286 = "list of {@link ";
  protected final String TEXT_287 = "}";
  protected final String TEXT_288 = "{@link ";
  protected final String TEXT_289 = "}";
  protected final String TEXT_290 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_291 = "list of {@link ";
  protected final String TEXT_292 = "}";
  protected final String TEXT_293 = "{@link ";
  protected final String TEXT_294 = "}";
  protected final String TEXT_295 = ",";
  protected final String TEXT_296 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_297 = "}";
  protected final String TEXT_298 = ".";
  protected final String TEXT_299 = NL + "\t * The default value is <code>";
  protected final String TEXT_300 = "</code>.";
  protected final String TEXT_301 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_302 = "}.";
  protected final String TEXT_303 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_304 = "#";
  protected final String TEXT_305 = " <em>";
  protected final String TEXT_306 = "</em>}'.";
  protected final String TEXT_307 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_308 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_309 = "</em>' ";
  protected final String TEXT_310 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_311 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_312 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_313 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_314 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_315 = "</em>' ";
  protected final String TEXT_316 = ".";
  protected final String TEXT_317 = NL + "\t * @see ";
  protected final String TEXT_318 = NL + "\t * @see #isSet";
  protected final String TEXT_319 = "()";
  protected final String TEXT_320 = NL + "\t * @see #unset";
  protected final String TEXT_321 = "()";
  protected final String TEXT_322 = NL + "\t * @see #set";
  protected final String TEXT_323 = "(";
  protected final String TEXT_324 = ")";
  protected final String TEXT_325 = NL + "\t * @see ";
  protected final String TEXT_326 = "#get";
  protected final String TEXT_327 = "()";
  protected final String TEXT_328 = NL + "\t * @see ";
  protected final String TEXT_329 = "#";
  protected final String TEXT_330 = NL + "\t * @model ";
  protected final String TEXT_331 = NL + "\t *        ";
  protected final String TEXT_332 = NL + "\t * @model";
  protected final String TEXT_333 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_334 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_335 = NL + "\t";
  protected final String TEXT_336 = " ";
  protected final String TEXT_337 = "();" + NL;
  protected final String TEXT_338 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_339 = NL + "\tpublic ";
  protected final String TEXT_340 = " ";
  protected final String TEXT_341 = "_";
  protected final String TEXT_342 = "()" + NL + "\t{";
  protected final String TEXT_343 = NL + "\t\treturn ";
  protected final String TEXT_344 = "(";
  protected final String TEXT_345 = "(";
  protected final String TEXT_346 = ")eGet(";
  protected final String TEXT_347 = ", true)";
  protected final String TEXT_348 = ").";
  protected final String TEXT_349 = "()";
  protected final String TEXT_350 = ";";
  protected final String TEXT_351 = NL + "\t\t";
  protected final String TEXT_352 = " ";
  protected final String TEXT_353 = " = (";
  protected final String TEXT_354 = ")eVirtualGet(";
  protected final String TEXT_355 = ");" + NL + "\t\t";
  protected final String TEXT_356 = NL + NL + "\t\t";
  protected final String TEXT_357 = NL + "\t\tif (";
  protected final String TEXT_358 = " == null)" + NL + "\t\t{" + NL + "\t" + NL + "\t";
  protected final String TEXT_359 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_360 = ", ";
  protected final String TEXT_361 = " = new ";
  protected final String TEXT_362 = ");" + NL + "\t";
  protected final String TEXT_363 = NL + "\t\t";
  protected final String TEXT_364 = NL + "\t\t\t";
  protected final String TEXT_365 = " = new ";
  protected final String TEXT_366 = ";" + NL + "\t\t";
  protected final String TEXT_367 = NL + "\t\t\t";
  protected final String TEXT_368 = " = new EObjectContainmentEListForWrapping<";
  protected final String TEXT_369 = ">(" + NL + "\t\t\t\t\t";
  protected final String TEXT_370 = ".class, " + NL + "\t\t\t\t\tthis, " + NL + "\t\t\t\t\t";
  protected final String TEXT_371 = "," + NL + "\t\t\t\t\t";
  protected final String TEXT_372 = ".eINSTANCE.get";
  protected final String TEXT_373 = "()" + NL + "\t\t\t\t);" + NL + "\t\t\t\t";
  protected final String TEXT_374 = NL + "\t}" + NL + "\t";
  protected final String TEXT_375 = NL + "\t\t((EObjectContainmentEListForWrapping<";
  protected final String TEXT_376 = ">)";
  protected final String TEXT_377 = ")" + NL + "\t\t.refreshWrap();" + NL + "\t";
  protected final String TEXT_378 = NL + "\t\treturn ";
  protected final String TEXT_379 = ";";
  protected final String TEXT_380 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_381 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_382 = ")eContainer();";
  protected final String TEXT_383 = NL + "\t\t";
  protected final String TEXT_384 = " ";
  protected final String TEXT_385 = " = (";
  protected final String TEXT_386 = ")eVirtualGet(";
  protected final String TEXT_387 = ", ";
  protected final String TEXT_388 = ");";
  protected final String TEXT_389 = NL + "\t\tif (";
  protected final String TEXT_390 = " != null && ";
  protected final String TEXT_391 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_392 = " old";
  protected final String TEXT_393 = " = (";
  protected final String TEXT_394 = ")";
  protected final String TEXT_395 = ";" + NL + "\t\t\t";
  protected final String TEXT_396 = " = ";
  protected final String TEXT_397 = "eResolveProxy(old";
  protected final String TEXT_398 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_399 = " != old";
  protected final String TEXT_400 = ")" + NL + "\t\t\t{";
  protected final String TEXT_401 = NL + "\t\t\t\t";
  protected final String TEXT_402 = " new";
  protected final String TEXT_403 = " = (";
  protected final String TEXT_404 = ")";
  protected final String TEXT_405 = ";";
  protected final String TEXT_406 = NL + "\t\t\t\t";
  protected final String TEXT_407 = " msgs = old";
  protected final String TEXT_408 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_409 = ", null, null);";
  protected final String TEXT_410 = NL + "\t\t\t\t";
  protected final String TEXT_411 = " msgs =  old";
  protected final String TEXT_412 = ".eInverseRemove(this, ";
  protected final String TEXT_413 = ", ";
  protected final String TEXT_414 = ".class, null);";
  protected final String TEXT_415 = NL + "\t\t\t\tif (new";
  protected final String TEXT_416 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_417 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_418 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_419 = ", null, msgs);";
  protected final String TEXT_420 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_421 = ".eInverseAdd(this, ";
  protected final String TEXT_422 = ", ";
  protected final String TEXT_423 = ".class, msgs);";
  protected final String TEXT_424 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_425 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_426 = ", ";
  protected final String TEXT_427 = ");";
  protected final String TEXT_428 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_429 = "(this, ";
  protected final String TEXT_430 = ".RESOLVE, ";
  protected final String TEXT_431 = ", old";
  protected final String TEXT_432 = ", ";
  protected final String TEXT_433 = "));";
  protected final String TEXT_434 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_435 = NL + "\t\treturn (";
  protected final String TEXT_436 = ")eVirtualGet(";
  protected final String TEXT_437 = ", ";
  protected final String TEXT_438 = ");";
  protected final String TEXT_439 = NL + "\t\treturn (";
  protected final String TEXT_440 = " & ";
  protected final String TEXT_441 = "_EFLAG) != 0;";
  protected final String TEXT_442 = NL + "\t\treturn ";
  protected final String TEXT_443 = "_EFLAG_VALUES[(";
  protected final String TEXT_444 = " & ";
  protected final String TEXT_445 = "_EFLAG) >>> ";
  protected final String TEXT_446 = "_EFLAG_OFFSET];";
  protected final String TEXT_447 = NL + "        Object result=null;";
  protected final String TEXT_448 = NL + "        ";
  protected final String TEXT_449 = " core=(";
  protected final String TEXT_450 = ")getCore();" + NL + "        if(core==null) return ";
  protected final String TEXT_451 = ";";
  protected final String TEXT_452 = "\t";
  protected final String TEXT_453 = NL + "        ";
  protected final String TEXT_454 = NL + "        ";
  protected final String TEXT_455 = "=(";
  protected final String TEXT_456 = ")ImagePool.find(result);";
  protected final String TEXT_457 = NL + "\t\treturn ";
  protected final String TEXT_458 = "; ";
  protected final String TEXT_459 = NL + "\t\t";
  protected final String TEXT_460 = " ";
  protected final String TEXT_461 = " = basicGet";
  protected final String TEXT_462 = "();" + NL + "\t\treturn ";
  protected final String TEXT_463 = " != null && ";
  protected final String TEXT_464 = ".eIsProxy() ? ";
  protected final String TEXT_465 = "eResolveProxy((";
  protected final String TEXT_466 = ")";
  protected final String TEXT_467 = ") : ";
  protected final String TEXT_468 = ";";
  protected final String TEXT_469 = NL + "\t\treturn new ";
  protected final String TEXT_470 = "((";
  protected final String TEXT_471 = ".Internal)((";
  protected final String TEXT_472 = ".Internal.Wrapper)get";
  protected final String TEXT_473 = "()).featureMap().";
  protected final String TEXT_474 = "list(";
  protected final String TEXT_475 = "));";
  protected final String TEXT_476 = NL + "\t\treturn (";
  protected final String TEXT_477 = ")get";
  protected final String TEXT_478 = "().";
  protected final String TEXT_479 = "list(";
  protected final String TEXT_480 = ");";
  protected final String TEXT_481 = NL + "\t\treturn ((";
  protected final String TEXT_482 = ".Internal.Wrapper)get";
  protected final String TEXT_483 = "()).featureMap().list(";
  protected final String TEXT_484 = ");";
  protected final String TEXT_485 = NL + "\t\treturn get";
  protected final String TEXT_486 = "().list(";
  protected final String TEXT_487 = ");";
  protected final String TEXT_488 = NL + "\t\treturn ";
  protected final String TEXT_489 = "(";
  protected final String TEXT_490 = "(";
  protected final String TEXT_491 = ")";
  protected final String TEXT_492 = "((";
  protected final String TEXT_493 = ".Internal.Wrapper)get";
  protected final String TEXT_494 = "()).featureMap().get(";
  protected final String TEXT_495 = ", true)";
  protected final String TEXT_496 = ").";
  protected final String TEXT_497 = "()";
  protected final String TEXT_498 = ";";
  protected final String TEXT_499 = NL + "\t\treturn ";
  protected final String TEXT_500 = "(";
  protected final String TEXT_501 = "(";
  protected final String TEXT_502 = ")";
  protected final String TEXT_503 = "get";
  protected final String TEXT_504 = "().get(";
  protected final String TEXT_505 = ", true)";
  protected final String TEXT_506 = ").";
  protected final String TEXT_507 = "()";
  protected final String TEXT_508 = ";";
  protected final String TEXT_509 = NL + "\t\t";
  protected final String TEXT_510 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_511 = "' ";
  protected final String TEXT_512 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_513 = NL + "\t\t// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting" + NL + "\t\t// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.";
  protected final String TEXT_514 = "EcoreEMap";
  protected final String TEXT_515 = "BasicFeatureMap";
  protected final String TEXT_516 = "EcoreEList";
  protected final String TEXT_517 = " should be used.";
  protected final String TEXT_518 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_519 = NL + "\t}" + NL;
  protected final String TEXT_520 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_521 = NL + "\tpublic ";
  protected final String TEXT_522 = " basicGet";
  protected final String TEXT_523 = "()" + NL + "\t{";
  protected final String TEXT_524 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_525 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_526 = ")eInternalContainer();";
  protected final String TEXT_527 = NL + "\t\treturn (";
  protected final String TEXT_528 = ")eVirtualGet(";
  protected final String TEXT_529 = ");";
  protected final String TEXT_530 = NL + "\t\treturn ";
  protected final String TEXT_531 = ";";
  protected final String TEXT_532 = NL + "\t\treturn (";
  protected final String TEXT_533 = ")((";
  protected final String TEXT_534 = ".Internal.Wrapper)get";
  protected final String TEXT_535 = "()).featureMap().get(";
  protected final String TEXT_536 = ", false);";
  protected final String TEXT_537 = NL + "\t\treturn (";
  protected final String TEXT_538 = ")get";
  protected final String TEXT_539 = "().get(";
  protected final String TEXT_540 = ", false);";
  protected final String TEXT_541 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_542 = "' ";
  protected final String TEXT_543 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_544 = NL + "\t}" + NL;
  protected final String TEXT_545 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_546 = NL + "\tpublic ";
  protected final String TEXT_547 = " basicSet";
  protected final String TEXT_548 = "(";
  protected final String TEXT_549 = " new";
  protected final String TEXT_550 = ", ";
  protected final String TEXT_551 = " msgs)" + NL + "\t{";
  protected final String TEXT_552 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_553 = ")new";
  protected final String TEXT_554 = ", ";
  protected final String TEXT_555 = ", msgs);";
  protected final String TEXT_556 = NL + "\t\treturn msgs;";
  protected final String TEXT_557 = NL + "\t\tObject old";
  protected final String TEXT_558 = " = eVirtualSet(";
  protected final String TEXT_559 = ", new";
  protected final String TEXT_560 = ");";
  protected final String TEXT_561 = NL + "\t\t";
  protected final String TEXT_562 = " old";
  protected final String TEXT_563 = " = ";
  protected final String TEXT_564 = ";" + NL + "\t\t";
  protected final String TEXT_565 = " = new";
  protected final String TEXT_566 = ";";
  protected final String TEXT_567 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_568 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_569 = NL + "\t\tboolean old";
  protected final String TEXT_570 = "ESet = (";
  protected final String TEXT_571 = " & ";
  protected final String TEXT_572 = "_ESETFLAG) != 0;";
  protected final String TEXT_573 = NL + "\t\t";
  protected final String TEXT_574 = " |= ";
  protected final String TEXT_575 = "_ESETFLAG;";
  protected final String TEXT_576 = NL + "\t\tboolean old";
  protected final String TEXT_577 = "ESet = ";
  protected final String TEXT_578 = "ESet;";
  protected final String TEXT_579 = NL + "\t\t";
  protected final String TEXT_580 = "ESet = true;";
  protected final String TEXT_581 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_582 = NL + "\t\t\t";
  protected final String TEXT_583 = " notification = new ";
  protected final String TEXT_584 = "(this, ";
  protected final String TEXT_585 = ".SET, ";
  protected final String TEXT_586 = ", ";
  protected final String TEXT_587 = "isSetChange ? null : old";
  protected final String TEXT_588 = "old";
  protected final String TEXT_589 = ", new";
  protected final String TEXT_590 = ", ";
  protected final String TEXT_591 = "isSetChange";
  protected final String TEXT_592 = "!old";
  protected final String TEXT_593 = "ESet";
  protected final String TEXT_594 = ");";
  protected final String TEXT_595 = NL + "\t\t\t";
  protected final String TEXT_596 = " notification = new ";
  protected final String TEXT_597 = "(this, ";
  protected final String TEXT_598 = ".SET, ";
  protected final String TEXT_599 = ", ";
  protected final String TEXT_600 = "old";
  protected final String TEXT_601 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_602 = "old";
  protected final String TEXT_603 = ", new";
  protected final String TEXT_604 = ");";
  protected final String TEXT_605 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_606 = NL + "\t\treturn msgs;";
  protected final String TEXT_607 = NL + "\t\treturn ((";
  protected final String TEXT_608 = ".Internal)((";
  protected final String TEXT_609 = ".Internal.Wrapper)get";
  protected final String TEXT_610 = "()).featureMap()).basicAdd(";
  protected final String TEXT_611 = ", new";
  protected final String TEXT_612 = ", msgs);";
  protected final String TEXT_613 = NL + "\t\treturn ((";
  protected final String TEXT_614 = ".Internal)get";
  protected final String TEXT_615 = "()).basicAdd(";
  protected final String TEXT_616 = ", new";
  protected final String TEXT_617 = ", msgs);";
  protected final String TEXT_618 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_619 = "' ";
  protected final String TEXT_620 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_621 = NL + "\t}" + NL;
  protected final String TEXT_622 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_623 = "#";
  protected final String TEXT_624 = " <em>";
  protected final String TEXT_625 = "</em>}' ";
  protected final String TEXT_626 = ".";
  protected final String TEXT_627 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_628 = "</em>' ";
  protected final String TEXT_629 = ".";
  protected final String TEXT_630 = NL + "\t * @see ";
  protected final String TEXT_631 = NL + "\t * @see #isSet";
  protected final String TEXT_632 = "()";
  protected final String TEXT_633 = NL + "\t * @see #unset";
  protected final String TEXT_634 = "()";
  protected final String TEXT_635 = NL + "\t * @see #";
  protected final String TEXT_636 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_637 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_638 = NL + "\tvoid set";
  protected final String TEXT_639 = "(";
  protected final String TEXT_640 = " value);" + NL;
  protected final String TEXT_641 = NL + "\tpublic void set";
  protected final String TEXT_642 = "_";
  protected final String TEXT_643 = "(";
  protected final String TEXT_644 = " ";
  protected final String TEXT_645 = ")" + NL + "\t{";
  protected final String TEXT_646 = NL + "\t\teSet(";
  protected final String TEXT_647 = ", ";
  protected final String TEXT_648 = "new ";
  protected final String TEXT_649 = "(";
  protected final String TEXT_650 = "new";
  protected final String TEXT_651 = ")";
  protected final String TEXT_652 = ");";
  protected final String TEXT_653 = NL + "\t\tif (new";
  protected final String TEXT_654 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_655 = " && new";
  protected final String TEXT_656 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_657 = ".isAncestor(this, ";
  protected final String TEXT_658 = "new";
  protected final String TEXT_659 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_660 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_661 = NL + "\t\t\t";
  protected final String TEXT_662 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_663 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_664 = ")new";
  protected final String TEXT_665 = ").eInverseAdd(this, ";
  protected final String TEXT_666 = ", ";
  protected final String TEXT_667 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_668 = "(";
  protected final String TEXT_669 = "new";
  protected final String TEXT_670 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_671 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_672 = "(this, ";
  protected final String TEXT_673 = ".SET, ";
  protected final String TEXT_674 = ", new";
  protected final String TEXT_675 = ", new";
  protected final String TEXT_676 = "));";
  protected final String TEXT_677 = NL + "\t\t";
  protected final String TEXT_678 = " ";
  protected final String TEXT_679 = " = (";
  protected final String TEXT_680 = ")eVirtualGet(";
  protected final String TEXT_681 = ");";
  protected final String TEXT_682 = NL + "\t\tif (new";
  protected final String TEXT_683 = " != ";
  protected final String TEXT_684 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_685 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_686 = " != null)";
  protected final String TEXT_687 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_688 = ")";
  protected final String TEXT_689 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_690 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_691 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_692 = ")new";
  protected final String TEXT_693 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_694 = ", null, msgs);";
  protected final String TEXT_695 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_696 = ")";
  protected final String TEXT_697 = ").eInverseRemove(this, ";
  protected final String TEXT_698 = ", ";
  protected final String TEXT_699 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_700 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_701 = ")new";
  protected final String TEXT_702 = ").eInverseAdd(this, ";
  protected final String TEXT_703 = ", ";
  protected final String TEXT_704 = ".class, msgs);";
  protected final String TEXT_705 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_706 = "(";
  protected final String TEXT_707 = "new";
  protected final String TEXT_708 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_709 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_710 = NL + "\t\t\tboolean old";
  protected final String TEXT_711 = "ESet = eVirtualIsSet(";
  protected final String TEXT_712 = ");";
  protected final String TEXT_713 = NL + "\t\t\tboolean old";
  protected final String TEXT_714 = "ESet = (";
  protected final String TEXT_715 = " & ";
  protected final String TEXT_716 = "_ESETFLAG) != 0;";
  protected final String TEXT_717 = NL + "\t\t\t";
  protected final String TEXT_718 = " |= ";
  protected final String TEXT_719 = "_ESETFLAG;";
  protected final String TEXT_720 = NL + "\t\t\tboolean old";
  protected final String TEXT_721 = "ESet = ";
  protected final String TEXT_722 = "ESet;";
  protected final String TEXT_723 = NL + "\t\t\t";
  protected final String TEXT_724 = "ESet = true;";
  protected final String TEXT_725 = NL + "          //where am I?";
  protected final String TEXT_726 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_727 = "(this, ";
  protected final String TEXT_728 = ".SET, ";
  protected final String TEXT_729 = ", new";
  protected final String TEXT_730 = ", new";
  protected final String TEXT_731 = ", !old";
  protected final String TEXT_732 = "ESet));";
  protected final String TEXT_733 = NL + "\t\t}";
  protected final String TEXT_734 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_735 = "(this, ";
  protected final String TEXT_736 = ".SET, ";
  protected final String TEXT_737 = ", new";
  protected final String TEXT_738 = ", new";
  protected final String TEXT_739 = "));";
  protected final String TEXT_740 = NL + "\t\t";
  protected final String TEXT_741 = " old";
  protected final String TEXT_742 = " = (";
  protected final String TEXT_743 = " & ";
  protected final String TEXT_744 = "_EFLAG) != 0;";
  protected final String TEXT_745 = NL + "\t\t";
  protected final String TEXT_746 = " old";
  protected final String TEXT_747 = " = ";
  protected final String TEXT_748 = "_EFLAG_VALUES[(";
  protected final String TEXT_749 = " & ";
  protected final String TEXT_750 = "_EFLAG) >>> ";
  protected final String TEXT_751 = "_EFLAG_OFFSET];";
  protected final String TEXT_752 = NL + "\t\tif (new";
  protected final String TEXT_753 = ") ";
  protected final String TEXT_754 = " |= ";
  protected final String TEXT_755 = "_EFLAG; else ";
  protected final String TEXT_756 = " &= ~";
  protected final String TEXT_757 = "_EFLAG;";
  protected final String TEXT_758 = NL + "\t\tif (new";
  protected final String TEXT_759 = " == null) new";
  protected final String TEXT_760 = " = ";
  protected final String TEXT_761 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_762 = " = ";
  protected final String TEXT_763 = " & ~";
  protected final String TEXT_764 = "_EFLAG | ";
  protected final String TEXT_765 = "new";
  protected final String TEXT_766 = ".ordinal()";
  protected final String TEXT_767 = ".VALUES.indexOf(new";
  protected final String TEXT_768 = ")";
  protected final String TEXT_769 = " << ";
  protected final String TEXT_770 = "_EFLAG_OFFSET;";
  protected final String TEXT_771 = NL + "\t\t";
  protected final String TEXT_772 = " old";
  protected final String TEXT_773 = " = ";
  protected final String TEXT_774 = ";";
  protected final String TEXT_775 = NL + "\t\t";
  protected final String TEXT_776 = " ";
  protected final String TEXT_777 = " = new";
  protected final String TEXT_778 = " == null ? ";
  protected final String TEXT_779 = " : new";
  protected final String TEXT_780 = ";";
  protected final String TEXT_781 = NL + "\t\t";
  protected final String TEXT_782 = " = new";
  protected final String TEXT_783 = " == null ? ";
  protected final String TEXT_784 = " : new";
  protected final String TEXT_785 = ";";
  protected final String TEXT_786 = NL + "\t\t";
  protected final String TEXT_787 = " ";
  protected final String TEXT_788 = " = ";
  protected final String TEXT_789 = "new";
  protected final String TEXT_790 = ";";
  protected final String TEXT_791 = NL + "\t\t";
  protected final String TEXT_792 = " = ";
  protected final String TEXT_793 = "new";
  protected final String TEXT_794 = ";";
  protected final String TEXT_795 = NL + "\t\tObject old";
  protected final String TEXT_796 = " = eVirtualSet(";
  protected final String TEXT_797 = ", ";
  protected final String TEXT_798 = ");";
  protected final String TEXT_799 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_800 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_801 = NL + "\t\tboolean old";
  protected final String TEXT_802 = "ESet = (";
  protected final String TEXT_803 = " & ";
  protected final String TEXT_804 = "_ESETFLAG) != 0;";
  protected final String TEXT_805 = NL + "\t\t";
  protected final String TEXT_806 = " |= ";
  protected final String TEXT_807 = "_ESETFLAG;";
  protected final String TEXT_808 = NL + "\t\tboolean old";
  protected final String TEXT_809 = "ESet = ";
  protected final String TEXT_810 = "ESet;";
  protected final String TEXT_811 = NL + "\t\t";
  protected final String TEXT_812 = "ESet = true;";
  protected final String TEXT_813 = NL + "        //Am I here 2?" + NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_814 = "(this, ";
  protected final String TEXT_815 = ".SET, ";
  protected final String TEXT_816 = ", ";
  protected final String TEXT_817 = "isSetChange ? ";
  protected final String TEXT_818 = " : old";
  protected final String TEXT_819 = "old";
  protected final String TEXT_820 = ", ";
  protected final String TEXT_821 = "new";
  protected final String TEXT_822 = ", ";
  protected final String TEXT_823 = "isSetChange";
  protected final String TEXT_824 = "!old";
  protected final String TEXT_825 = "ESet";
  protected final String TEXT_826 = "));";
  protected final String TEXT_827 = NL + "        \t";
  protected final String TEXT_828 = NL + "\t    ";
  protected final String TEXT_829 = " core=(";
  protected final String TEXT_830 = ")getCore();" + NL + "\t    if(core==null) return;" + NL + "\t    \t";
  protected final String TEXT_831 = NL + "        ";
  protected final String TEXT_832 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_833 = "(this, ";
  protected final String TEXT_834 = ".SET, ";
  protected final String TEXT_835 = ", ";
  protected final String TEXT_836 = "old";
  protected final String TEXT_837 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_838 = " : old";
  protected final String TEXT_839 = "old";
  protected final String TEXT_840 = ", ";
  protected final String TEXT_841 = "new";
  protected final String TEXT_842 = "));";
  protected final String TEXT_843 = NL + "\t\t((";
  protected final String TEXT_844 = ".Internal)((";
  protected final String TEXT_845 = ".Internal.Wrapper)get";
  protected final String TEXT_846 = "()).featureMap()).set(";
  protected final String TEXT_847 = ", ";
  protected final String TEXT_848 = "new ";
  protected final String TEXT_849 = "(";
  protected final String TEXT_850 = "new";
  protected final String TEXT_851 = ")";
  protected final String TEXT_852 = ");";
  protected final String TEXT_853 = NL + "\t\t((";
  protected final String TEXT_854 = ".Internal)get";
  protected final String TEXT_855 = "()).set(";
  protected final String TEXT_856 = ", ";
  protected final String TEXT_857 = "new ";
  protected final String TEXT_858 = "(";
  protected final String TEXT_859 = "new";
  protected final String TEXT_860 = ")";
  protected final String TEXT_861 = ");";
  protected final String TEXT_862 = NL + "\t\t";
  protected final String TEXT_863 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_864 = "' ";
  protected final String TEXT_865 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_866 = NL + "\t}" + NL;
  protected final String TEXT_867 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_868 = NL + "\tpublic ";
  protected final String TEXT_869 = " basicUnset";
  protected final String TEXT_870 = "(";
  protected final String TEXT_871 = " msgs)" + NL + "\t{";
  protected final String TEXT_872 = "Object old";
  protected final String TEXT_873 = " = ";
  protected final String TEXT_874 = "eVirtualUnset(";
  protected final String TEXT_875 = ");";
  protected final String TEXT_876 = NL + "\t\t";
  protected final String TEXT_877 = " old";
  protected final String TEXT_878 = " = ";
  protected final String TEXT_879 = ";";
  protected final String TEXT_880 = NL + "\t\t";
  protected final String TEXT_881 = " = null;";
  protected final String TEXT_882 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_883 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_884 = NL + "\t\tboolean old";
  protected final String TEXT_885 = "ESet = (";
  protected final String TEXT_886 = " & ";
  protected final String TEXT_887 = "_ESETFLAG) != 0;";
  protected final String TEXT_888 = NL + "\t\t";
  protected final String TEXT_889 = " &= ~";
  protected final String TEXT_890 = "_ESETFLAG;";
  protected final String TEXT_891 = NL + "\t\tboolean old";
  protected final String TEXT_892 = "ESet = ";
  protected final String TEXT_893 = "ESet;";
  protected final String TEXT_894 = NL + "\t\t";
  protected final String TEXT_895 = "ESet = false;";
  protected final String TEXT_896 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_897 = " notification = new ";
  protected final String TEXT_898 = "(this, ";
  protected final String TEXT_899 = ".UNSET, ";
  protected final String TEXT_900 = ", ";
  protected final String TEXT_901 = "isSetChange ? old";
  protected final String TEXT_902 = " : null";
  protected final String TEXT_903 = "old";
  protected final String TEXT_904 = ", null, ";
  protected final String TEXT_905 = "isSetChange";
  protected final String TEXT_906 = "old";
  protected final String TEXT_907 = "ESet";
  protected final String TEXT_908 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_909 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_910 = "' ";
  protected final String TEXT_911 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_912 = NL + "\t}" + NL;
  protected final String TEXT_913 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_914 = "#";
  protected final String TEXT_915 = " <em>";
  protected final String TEXT_916 = "</em>}' ";
  protected final String TEXT_917 = ".";
  protected final String TEXT_918 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_919 = NL + "\t * @see #isSet";
  protected final String TEXT_920 = "()";
  protected final String TEXT_921 = NL + "\t * @see #";
  protected final String TEXT_922 = "()";
  protected final String TEXT_923 = NL + "\t * @see #set";
  protected final String TEXT_924 = "(";
  protected final String TEXT_925 = ")";
  protected final String TEXT_926 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_927 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_928 = NL + "\tvoid unset";
  protected final String TEXT_929 = "();" + NL;
  protected final String TEXT_930 = NL + "\tpublic void unset";
  protected final String TEXT_931 = "_";
  protected final String TEXT_932 = "()" + NL + "\t{";
  protected final String TEXT_933 = NL + "\t\teUnset(";
  protected final String TEXT_934 = ");";
  protected final String TEXT_935 = NL + "\t\t";
  protected final String TEXT_936 = " ";
  protected final String TEXT_937 = " = (";
  protected final String TEXT_938 = ")eVirtualGet(";
  protected final String TEXT_939 = ");";
  protected final String TEXT_940 = NL + "\t\tif (";
  protected final String TEXT_941 = " != null) ((";
  protected final String TEXT_942 = ".Unsettable";
  protected final String TEXT_943 = ")";
  protected final String TEXT_944 = ").unset();";
  protected final String TEXT_945 = NL + "\t\t";
  protected final String TEXT_946 = " ";
  protected final String TEXT_947 = " = (";
  protected final String TEXT_948 = ")eVirtualGet(";
  protected final String TEXT_949 = ");";
  protected final String TEXT_950 = NL + "\t\tif (";
  protected final String TEXT_951 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_952 = " msgs = null;";
  protected final String TEXT_953 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_954 = ")";
  protected final String TEXT_955 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_956 = ", null, msgs);";
  protected final String TEXT_957 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_958 = ")";
  protected final String TEXT_959 = ").eInverseRemove(this, ";
  protected final String TEXT_960 = ", ";
  protected final String TEXT_961 = ".class, msgs);";
  protected final String TEXT_962 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_963 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_964 = NL + "\t\t\tboolean old";
  protected final String TEXT_965 = "ESet = eVirtualIsSet(";
  protected final String TEXT_966 = ");";
  protected final String TEXT_967 = NL + "\t\t\tboolean old";
  protected final String TEXT_968 = "ESet = (";
  protected final String TEXT_969 = " & ";
  protected final String TEXT_970 = "_ESETFLAG) != 0;";
  protected final String TEXT_971 = NL + "\t\t\t";
  protected final String TEXT_972 = " &= ~";
  protected final String TEXT_973 = "_ESETFLAG;";
  protected final String TEXT_974 = NL + "\t\t\tboolean old";
  protected final String TEXT_975 = "ESet = ";
  protected final String TEXT_976 = "ESet;";
  protected final String TEXT_977 = NL + "\t\t\t";
  protected final String TEXT_978 = "ESet = false;";
  protected final String TEXT_979 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_980 = "(this, ";
  protected final String TEXT_981 = ".UNSET, ";
  protected final String TEXT_982 = ", null, null, old";
  protected final String TEXT_983 = "ESet));";
  protected final String TEXT_984 = NL + "\t\t}";
  protected final String TEXT_985 = NL + "\t\t";
  protected final String TEXT_986 = " old";
  protected final String TEXT_987 = " = (";
  protected final String TEXT_988 = " & ";
  protected final String TEXT_989 = "_EFLAG) != 0;";
  protected final String TEXT_990 = NL + "\t\t";
  protected final String TEXT_991 = " old";
  protected final String TEXT_992 = " = ";
  protected final String TEXT_993 = "_EFLAG_VALUES[(";
  protected final String TEXT_994 = " & ";
  protected final String TEXT_995 = "_EFLAG) >>> ";
  protected final String TEXT_996 = "_EFLAG_OFFSET];";
  protected final String TEXT_997 = NL + "\t\tObject old";
  protected final String TEXT_998 = " = eVirtualUnset(";
  protected final String TEXT_999 = ");";
  protected final String TEXT_1000 = NL + "\t\t";
  protected final String TEXT_1001 = " old";
  protected final String TEXT_1002 = " = ";
  protected final String TEXT_1003 = ";";
  protected final String TEXT_1004 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1005 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1006 = NL + "\t\tboolean old";
  protected final String TEXT_1007 = "ESet = (";
  protected final String TEXT_1008 = " & ";
  protected final String TEXT_1009 = "_ESETFLAG) != 0;";
  protected final String TEXT_1010 = NL + "\t\tboolean old";
  protected final String TEXT_1011 = "ESet = ";
  protected final String TEXT_1012 = "ESet;";
  protected final String TEXT_1013 = NL + "\t\t";
  protected final String TEXT_1014 = " = null;";
  protected final String TEXT_1015 = NL + "\t\t";
  protected final String TEXT_1016 = " &= ~";
  protected final String TEXT_1017 = "_ESETFLAG;";
  protected final String TEXT_1018 = NL + "\t\t";
  protected final String TEXT_1019 = "ESet = false;";
  protected final String TEXT_1020 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1021 = "(this, ";
  protected final String TEXT_1022 = ".UNSET, ";
  protected final String TEXT_1023 = ", ";
  protected final String TEXT_1024 = "isSetChange ? old";
  protected final String TEXT_1025 = " : null";
  protected final String TEXT_1026 = "old";
  protected final String TEXT_1027 = ", null, ";
  protected final String TEXT_1028 = "isSetChange";
  protected final String TEXT_1029 = "old";
  protected final String TEXT_1030 = "ESet";
  protected final String TEXT_1031 = "));";
  protected final String TEXT_1032 = NL + "\t\tif (";
  protected final String TEXT_1033 = ") ";
  protected final String TEXT_1034 = " |= ";
  protected final String TEXT_1035 = "_EFLAG; else ";
  protected final String TEXT_1036 = " &= ~";
  protected final String TEXT_1037 = "_EFLAG;";
  protected final String TEXT_1038 = NL + "\t\t";
  protected final String TEXT_1039 = " = ";
  protected final String TEXT_1040 = " & ~";
  protected final String TEXT_1041 = "_EFLAG | ";
  protected final String TEXT_1042 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1043 = NL + "\t\t";
  protected final String TEXT_1044 = " = ";
  protected final String TEXT_1045 = ";";
  protected final String TEXT_1046 = NL + "\t\t";
  protected final String TEXT_1047 = " &= ~";
  protected final String TEXT_1048 = "_ESETFLAG;";
  protected final String TEXT_1049 = NL + "\t\t";
  protected final String TEXT_1050 = "ESet = false;";
  protected final String TEXT_1051 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1052 = "(this, ";
  protected final String TEXT_1053 = ".UNSET, ";
  protected final String TEXT_1054 = ", ";
  protected final String TEXT_1055 = "isSetChange ? old";
  protected final String TEXT_1056 = " : ";
  protected final String TEXT_1057 = "old";
  protected final String TEXT_1058 = ", ";
  protected final String TEXT_1059 = ", ";
  protected final String TEXT_1060 = "isSetChange";
  protected final String TEXT_1061 = "old";
  protected final String TEXT_1062 = "ESet";
  protected final String TEXT_1063 = "));";
  protected final String TEXT_1064 = NL + "\t\t((";
  protected final String TEXT_1065 = ".Internal)((";
  protected final String TEXT_1066 = ".Internal.Wrapper)get";
  protected final String TEXT_1067 = "()).featureMap()).clear(";
  protected final String TEXT_1068 = ");";
  protected final String TEXT_1069 = NL + "\t\t((";
  protected final String TEXT_1070 = ".Internal)get";
  protected final String TEXT_1071 = "()).clear(";
  protected final String TEXT_1072 = ");";
  protected final String TEXT_1073 = NL + "\t\t";
  protected final String TEXT_1074 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1075 = "' ";
  protected final String TEXT_1076 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1077 = NL + "\t}" + NL;
  protected final String TEXT_1078 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1079 = "#";
  protected final String TEXT_1080 = " <em>";
  protected final String TEXT_1081 = "</em>}' ";
  protected final String TEXT_1082 = " is set.";
  protected final String TEXT_1083 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1084 = "</em>' ";
  protected final String TEXT_1085 = " is set.";
  protected final String TEXT_1086 = NL + "\t * @see #unset";
  protected final String TEXT_1087 = "()";
  protected final String TEXT_1088 = NL + "\t * @see #";
  protected final String TEXT_1089 = "()";
  protected final String TEXT_1090 = NL + "\t * @see #set";
  protected final String TEXT_1091 = "(";
  protected final String TEXT_1092 = ")";
  protected final String TEXT_1093 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1094 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1095 = NL + "\tboolean isSet";
  protected final String TEXT_1096 = "();" + NL;
  protected final String TEXT_1097 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1098 = "_";
  protected final String TEXT_1099 = "()" + NL + "\t{";
  protected final String TEXT_1100 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1101 = ");";
  protected final String TEXT_1102 = NL + "\t\t";
  protected final String TEXT_1103 = " ";
  protected final String TEXT_1104 = " = (";
  protected final String TEXT_1105 = ")eVirtualGet(";
  protected final String TEXT_1106 = ");";
  protected final String TEXT_1107 = NL + "\t\treturn ";
  protected final String TEXT_1108 = " != null && ((";
  protected final String TEXT_1109 = ".Unsettable";
  protected final String TEXT_1110 = ")";
  protected final String TEXT_1111 = ").isSet();";
  protected final String TEXT_1112 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1113 = ");";
  protected final String TEXT_1114 = NL + "\t\treturn (";
  protected final String TEXT_1115 = " & ";
  protected final String TEXT_1116 = "_ESETFLAG) != 0;";
  protected final String TEXT_1117 = NL + "\t\treturn ";
  protected final String TEXT_1118 = "ESet;";
  protected final String TEXT_1119 = NL + "\t\treturn !((";
  protected final String TEXT_1120 = ".Internal)((";
  protected final String TEXT_1121 = ".Internal.Wrapper)get";
  protected final String TEXT_1122 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1123 = ");";
  protected final String TEXT_1124 = NL + "\t\treturn !((";
  protected final String TEXT_1125 = ".Internal)get";
  protected final String TEXT_1126 = "()).isEmpty(";
  protected final String TEXT_1127 = ");";
  protected final String TEXT_1128 = NL + "\t\t";
  protected final String TEXT_1129 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1130 = "' ";
  protected final String TEXT_1131 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1132 = NL + "\t}" + NL;
  protected final String TEXT_1133 = NL + "\t/**";
  protected final String TEXT_1134 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1135 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1136 = NL + "\t * ";
  protected final String TEXT_1137 = NL + "\t * @param ";
  protected final String TEXT_1138 = NL + "\t *   ";
  protected final String TEXT_1139 = NL + "\t * @param ";
  protected final String TEXT_1140 = " ";
  protected final String TEXT_1141 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1142 = NL + "\t * @model ";
  protected final String TEXT_1143 = NL + "\t *        ";
  protected final String TEXT_1144 = NL + "\t * @model";
  protected final String TEXT_1145 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1146 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1147 = NL + "\t";
  protected final String TEXT_1148 = " ";
  protected final String TEXT_1149 = "(";
  protected final String TEXT_1150 = ")";
  protected final String TEXT_1151 = ";" + NL;
  protected final String TEXT_1152 = NL + "\tpublic ";
  protected final String TEXT_1153 = " ";
  protected final String TEXT_1154 = "(";
  protected final String TEXT_1155 = ")";
  protected final String TEXT_1156 = NL + "\t{";
  protected final String TEXT_1157 = NL + "\t\t";
  protected final String TEXT_1158 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1159 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1160 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1161 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1162 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1163 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1164 = ".";
  protected final String TEXT_1165 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1166 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1167 = "\", ";
  protected final String TEXT_1168 = ".getObjectLabel(this, ";
  protected final String TEXT_1169 = ") }),";
  protected final String TEXT_1170 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1171 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1172 = NL + "\t}" + NL;
  protected final String TEXT_1173 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1174 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1175 = NL + "\t@Override";
  protected final String TEXT_1176 = NL + "\tpublic ";
  protected final String TEXT_1177 = " eInverseAdd(";
  protected final String TEXT_1178 = " otherEnd, int featureID, ";
  protected final String TEXT_1179 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1180 = ")" + NL + "\t\t{";
  protected final String TEXT_1181 = NL + "\t\t\tcase ";
  protected final String TEXT_1182 = ":";
  protected final String TEXT_1183 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1184 = "(";
  protected final String TEXT_1185 = ".InternalMapView";
  protected final String TEXT_1186 = ")";
  protected final String TEXT_1187 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1188 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1189 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1190 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1191 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1192 = "((";
  protected final String TEXT_1193 = ")otherEnd, msgs);";
  protected final String TEXT_1194 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1195 = ", msgs);";
  protected final String TEXT_1196 = NL + "\t\t\t\t";
  protected final String TEXT_1197 = " ";
  protected final String TEXT_1198 = " = (";
  protected final String TEXT_1199 = ")eVirtualGet(";
  protected final String TEXT_1200 = ");";
  protected final String TEXT_1201 = NL + "\t\t\t\t";
  protected final String TEXT_1202 = " ";
  protected final String TEXT_1203 = " = ";
  protected final String TEXT_1204 = "basicGet";
  protected final String TEXT_1205 = "();";
  protected final String TEXT_1206 = NL + "\t\t\t\tif (";
  protected final String TEXT_1207 = " != null)";
  protected final String TEXT_1208 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1209 = ")";
  protected final String TEXT_1210 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1211 = ", null, msgs);";
  protected final String TEXT_1212 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1213 = ")";
  protected final String TEXT_1214 = ").eInverseRemove(this, ";
  protected final String TEXT_1215 = ", ";
  protected final String TEXT_1216 = ".class, msgs);";
  protected final String TEXT_1217 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1218 = "((";
  protected final String TEXT_1219 = ")otherEnd, msgs);";
  protected final String TEXT_1220 = NL + "\t\t}";
  protected final String TEXT_1221 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1222 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1223 = NL + "\t}" + NL;
  protected final String TEXT_1224 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1225 = NL + "\t@Override";
  protected final String TEXT_1226 = NL + "\tpublic ";
  protected final String TEXT_1227 = " eInverseRemove(";
  protected final String TEXT_1228 = " otherEnd, int featureID, ";
  protected final String TEXT_1229 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1230 = ")" + NL + "\t\t{";
  protected final String TEXT_1231 = NL + "\t\t\tcase ";
  protected final String TEXT_1232 = ":";
  protected final String TEXT_1233 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1234 = ")((";
  protected final String TEXT_1235 = ".InternalMapView";
  protected final String TEXT_1236 = ")";
  protected final String TEXT_1237 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1238 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1239 = ")((";
  protected final String TEXT_1240 = ".Internal.Wrapper)";
  protected final String TEXT_1241 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1242 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1243 = ")";
  protected final String TEXT_1244 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1245 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1246 = ", msgs);";
  protected final String TEXT_1247 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1248 = "(msgs);";
  protected final String TEXT_1249 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1250 = "(null, msgs);";
  protected final String TEXT_1251 = NL + "\t\t}";
  protected final String TEXT_1252 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1253 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1254 = NL + "\t}" + NL;
  protected final String TEXT_1255 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1256 = NL + "\t@Override";
  protected final String TEXT_1257 = NL + "\tpublic ";
  protected final String TEXT_1258 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1259 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID";
  protected final String TEXT_1260 = ")" + NL + "\t\t{";
  protected final String TEXT_1261 = NL + "\t\t\tcase ";
  protected final String TEXT_1262 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1263 = ", ";
  protected final String TEXT_1264 = ".class, msgs);";
  protected final String TEXT_1265 = NL + "\t\t}";
  protected final String TEXT_1266 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1267 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1268 = NL + "\t}" + NL;
  protected final String TEXT_1269 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1270 = NL + "\t@Override";
  protected final String TEXT_1271 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1272 = ")" + NL + "\t\t{";
  protected final String TEXT_1273 = NL + "\t\t\tcase ";
  protected final String TEXT_1274 = ":";
  protected final String TEXT_1275 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1276 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1277 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1278 = "(";
  protected final String TEXT_1279 = "());";
  protected final String TEXT_1280 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1281 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1282 = "();";
  protected final String TEXT_1283 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1284 = ".InternalMapView";
  protected final String TEXT_1285 = ")";
  protected final String TEXT_1286 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1287 = "();";
  protected final String TEXT_1288 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1289 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1290 = "().map();";
  protected final String TEXT_1291 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1292 = ".Internal.Wrapper)";
  protected final String TEXT_1293 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1294 = "();";
  protected final String TEXT_1295 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1296 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1297 = ".Internal)";
  protected final String TEXT_1298 = "()).getWrapper();";
  protected final String TEXT_1299 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1300 = "();";
  protected final String TEXT_1301 = NL + "\t\t}";
  protected final String TEXT_1302 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1303 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1304 = NL + "\t}" + NL;
  protected final String TEXT_1305 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1306 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1307 = NL + "\t@Override";
  protected final String TEXT_1308 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1309 = ")" + NL + "\t\t{";
  protected final String TEXT_1310 = NL + "\t\t\tcase ";
  protected final String TEXT_1311 = ":";
  protected final String TEXT_1312 = NL + "\t\t\t\t((";
  protected final String TEXT_1313 = ".Internal)((";
  protected final String TEXT_1314 = ".Internal.Wrapper)";
  protected final String TEXT_1315 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1316 = NL + "\t\t\t\t((";
  protected final String TEXT_1317 = ".Internal)";
  protected final String TEXT_1318 = "()).set(newValue);";
  protected final String TEXT_1319 = NL + "\t\t\t\t((";
  protected final String TEXT_1320 = ".Setting)((";
  protected final String TEXT_1321 = ".InternalMapView";
  protected final String TEXT_1322 = ")";
  protected final String TEXT_1323 = "()).eMap()).set(newValue);";
  protected final String TEXT_1324 = NL + "\t\t\t\t((";
  protected final String TEXT_1325 = ".Setting)";
  protected final String TEXT_1326 = "()).set(newValue);";
  protected final String TEXT_1327 = NL + "\t\t\t\t";
  protected final String TEXT_1328 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1329 = "().addAll((";
  protected final String TEXT_1330 = "<? extends ";
  protected final String TEXT_1331 = ">";
  protected final String TEXT_1332 = ")newValue);";
  protected final String TEXT_1333 = NL + "\t\t\t\tset";
  protected final String TEXT_1334 = "(((";
  protected final String TEXT_1335 = ")newValue).";
  protected final String TEXT_1336 = "());";
  protected final String TEXT_1337 = NL + "\t\t\t\tset";
  protected final String TEXT_1338 = "(";
  protected final String TEXT_1339 = "(";
  protected final String TEXT_1340 = ")";
  protected final String TEXT_1341 = "newValue);";
  protected final String TEXT_1342 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1343 = NL + "\t\t}";
  protected final String TEXT_1344 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1345 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1346 = NL + "\t}" + NL;
  protected final String TEXT_1347 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1348 = NL + "\t@Override";
  protected final String TEXT_1349 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1350 = ")" + NL + "\t\t{";
  protected final String TEXT_1351 = NL + "\t\t\tcase ";
  protected final String TEXT_1352 = ":";
  protected final String TEXT_1353 = NL + "\t\t\t\t((";
  protected final String TEXT_1354 = ".Internal.Wrapper)";
  protected final String TEXT_1355 = "()).featureMap().clear();";
  protected final String TEXT_1356 = NL + "\t\t\t\t";
  protected final String TEXT_1357 = "().clear();";
  protected final String TEXT_1358 = NL + "\t\t\t\tunset";
  protected final String TEXT_1359 = "();";
  protected final String TEXT_1360 = NL + "\t\t\t\tset";
  protected final String TEXT_1361 = "((";
  protected final String TEXT_1362 = ")null);";
  protected final String TEXT_1363 = NL + "\t\t\t\tset";
  protected final String TEXT_1364 = "(";
  protected final String TEXT_1365 = ");";
  protected final String TEXT_1366 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1367 = NL + "\t\t}";
  protected final String TEXT_1368 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1369 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1370 = NL + "\t}" + NL;
  protected final String TEXT_1371 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1372 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1373 = NL + "\t@Override";
  protected final String TEXT_1374 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1375 = ")" + NL + "\t\t{";
  protected final String TEXT_1376 = NL + "\t\t\tcase ";
  protected final String TEXT_1377 = ":";
  protected final String TEXT_1378 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1379 = ".Internal.Wrapper)";
  protected final String TEXT_1380 = "()).featureMap().isEmpty();";
  protected final String TEXT_1381 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1382 = " != null && !";
  protected final String TEXT_1383 = ".featureMap().isEmpty();";
  protected final String TEXT_1384 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1385 = " != null && !";
  protected final String TEXT_1386 = ".isEmpty();";
  protected final String TEXT_1387 = NL + "\t\t\t\t";
  protected final String TEXT_1388 = " ";
  protected final String TEXT_1389 = " = (";
  protected final String TEXT_1390 = ")eVirtualGet(";
  protected final String TEXT_1391 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1392 = " != null && !";
  protected final String TEXT_1393 = ".isEmpty();";
  protected final String TEXT_1394 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1395 = "().isEmpty();";
  protected final String TEXT_1396 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1397 = "();";
  protected final String TEXT_1398 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1399 = " != null;";
  protected final String TEXT_1400 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1401 = ") != null;";
  protected final String TEXT_1402 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1403 = "() != null;";
  protected final String TEXT_1404 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1405 = " != null;";
  protected final String TEXT_1406 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1407 = ") != null;";
  protected final String TEXT_1408 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1409 = "() != null;";
  protected final String TEXT_1410 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1411 = " & ";
  protected final String TEXT_1412 = "_EFLAG) != 0) != ";
  protected final String TEXT_1413 = ";";
  protected final String TEXT_1414 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1415 = " & ";
  protected final String TEXT_1416 = "_EFLAG) != ";
  protected final String TEXT_1417 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1418 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1419 = " != ";
  protected final String TEXT_1420 = ";";
  protected final String TEXT_1421 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1422 = ", ";
  protected final String TEXT_1423 = ") != ";
  protected final String TEXT_1424 = ";";
  protected final String TEXT_1425 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1426 = "() != ";
  protected final String TEXT_1427 = ";";
  protected final String TEXT_1428 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1429 = " == null ? ";
  protected final String TEXT_1430 = " != null : !";
  protected final String TEXT_1431 = ".equals(";
  protected final String TEXT_1432 = ");";
  protected final String TEXT_1433 = NL + "\t\t\t\t";
  protected final String TEXT_1434 = " ";
  protected final String TEXT_1435 = " = (";
  protected final String TEXT_1436 = ")eVirtualGet(";
  protected final String TEXT_1437 = ", ";
  protected final String TEXT_1438 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1439 = " == null ? ";
  protected final String TEXT_1440 = " != null : !";
  protected final String TEXT_1441 = ".equals(";
  protected final String TEXT_1442 = ");";
  protected final String TEXT_1443 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1444 = " == null ? ";
  protected final String TEXT_1445 = "() != null : !";
  protected final String TEXT_1446 = ".equals(";
  protected final String TEXT_1447 = "());";
  protected final String TEXT_1448 = NL + "\t\t}";
  protected final String TEXT_1449 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1450 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1451 = NL + "\t}" + NL;
  protected final String TEXT_1452 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1453 = NL + "\t@Override";
  protected final String TEXT_1454 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_1455 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1456 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1457 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_1458 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1459 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1460 = ": return ";
  protected final String TEXT_1461 = ";";
  protected final String TEXT_1462 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1463 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_1464 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1465 = NL + "\t@Override";
  protected final String TEXT_1466 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_1467 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1468 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1469 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1470 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1471 = ": return ";
  protected final String TEXT_1472 = ";";
  protected final String TEXT_1473 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1474 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1475 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_1476 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1477 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1478 = ": return ";
  protected final String TEXT_1479 = ";";
  protected final String TEXT_1480 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1481 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1482 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1483 = NL + "\t@Override";
  protected final String TEXT_1484 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1485 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1486 = NL + "\t@Override";
  protected final String TEXT_1487 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1488 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1489 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1490 = NL + "\t@Override";
  protected final String TEXT_1491 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1492 = NL + "\t\t\tcase ";
  protected final String TEXT_1493 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1494 = ";";
  protected final String TEXT_1495 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1496 = NL + "\t@Override";
  protected final String TEXT_1497 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1498 = NL + "\t\t\tcase ";
  protected final String TEXT_1499 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1500 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1501 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1502 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1503 = NL + "\t@Override";
  protected final String TEXT_1504 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1505 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1506 = ": \");";
  protected final String TEXT_1507 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1508 = ": \");";
  protected final String TEXT_1509 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1510 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1511 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1512 = NL + "\t\tif (";
  protected final String TEXT_1513 = "(";
  protected final String TEXT_1514 = " & ";
  protected final String TEXT_1515 = "_ESETFLAG) != 0";
  protected final String TEXT_1516 = "ESet";
  protected final String TEXT_1517 = ") result.append((";
  protected final String TEXT_1518 = " & ";
  protected final String TEXT_1519 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1520 = NL + "\t\tif (";
  protected final String TEXT_1521 = "(";
  protected final String TEXT_1522 = " & ";
  protected final String TEXT_1523 = "_ESETFLAG) != 0";
  protected final String TEXT_1524 = "ESet";
  protected final String TEXT_1525 = ") result.append(";
  protected final String TEXT_1526 = "_EFLAG_VALUES[(";
  protected final String TEXT_1527 = " & ";
  protected final String TEXT_1528 = "_EFLAG) >>> ";
  protected final String TEXT_1529 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_1530 = NL + "\t\tif (";
  protected final String TEXT_1531 = "(";
  protected final String TEXT_1532 = " & ";
  protected final String TEXT_1533 = "_ESETFLAG) != 0";
  protected final String TEXT_1534 = "ESet";
  protected final String TEXT_1535 = ") result.append(";
  protected final String TEXT_1536 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1537 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1538 = ", ";
  protected final String TEXT_1539 = "));";
  protected final String TEXT_1540 = NL + "\t\tresult.append((";
  protected final String TEXT_1541 = " & ";
  protected final String TEXT_1542 = "_EFLAG) != 0);";
  protected final String TEXT_1543 = NL + "\t\tresult.append(";
  protected final String TEXT_1544 = "_EFLAG_VALUES[(";
  protected final String TEXT_1545 = " & ";
  protected final String TEXT_1546 = "_EFLAG) >>> ";
  protected final String TEXT_1547 = "_EFLAG_OFFSET]);";
  protected final String TEXT_1548 = NL + "\t\tresult.append(";
  protected final String TEXT_1549 = ");";
  protected final String TEXT_1550 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1551 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1552 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1553 = " getKey()" + NL + "\t{";
  protected final String TEXT_1554 = NL + "\t\treturn new ";
  protected final String TEXT_1555 = "(getTypedKey());";
  protected final String TEXT_1556 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1557 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_1558 = " key)" + NL + "\t{";
  protected final String TEXT_1559 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_1560 = "(";
  protected final String TEXT_1561 = ")";
  protected final String TEXT_1562 = "key);";
  protected final String TEXT_1563 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_1564 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1565 = ")key).";
  protected final String TEXT_1566 = "());";
  protected final String TEXT_1567 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1568 = ")key);";
  protected final String TEXT_1569 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1570 = " getValue()" + NL + "\t{";
  protected final String TEXT_1571 = NL + "\t\treturn new ";
  protected final String TEXT_1572 = "(getTypedValue());";
  protected final String TEXT_1573 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1574 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1575 = " setValue(";
  protected final String TEXT_1576 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1577 = " oldValue = getValue();";
  protected final String TEXT_1578 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_1579 = "(";
  protected final String TEXT_1580 = ")";
  protected final String TEXT_1581 = "value);";
  protected final String TEXT_1582 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_1583 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1584 = ")value).";
  protected final String TEXT_1585 = "());";
  protected final String TEXT_1586 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1587 = ")value);";
  protected final String TEXT_1588 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1589 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1590 = NL + "\tpublic ";
  protected final String TEXT_1591 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1592 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1593 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1594 = NL + "} //";
  protected final String TEXT_1595 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    stringBuffer.append(TEXT_1);
    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_5);
    }}
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_8);
    final GenEnvironment env=GenEnvironment.eINSTANCE;
    final EClass clazz=genClass.getEcoreClass();
    if (isInterface) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_10);
    } else {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    genModel.markImportLocation(stringBuffer, genPackage);
    stringBuffer.append(TEXT_14);
    if (isImplementation) {
	env.generateImport(stringBuffer,genClass);

    stringBuffer.append(TEXT_15);
    }
    if (isInterface) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_17);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_21);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_25);
    }
    }
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_30);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_31);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_33);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_35);
    } else {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_37);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_38);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_45);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    String s=genClass.getClassExtends(); if(" extends EObjectImpl".equals(s)) stringBuffer.append(" extends WrappingEObjectImpl"); else stringBuffer.append(" "+s);
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_49);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_50);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_53);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_57);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_58);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_60);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_62);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_64);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_71);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_75);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_76);
    }
    stringBuffer.append(TEXT_77);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_81);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_86);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_87);
    }
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_91);
    } else {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_94);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_96);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_106);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_107);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_109);
    }
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_115);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_116);
    } else {
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_121);
    }
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_130);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_131);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_132);
    } else {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_140);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_142);
    }
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_151);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_156);
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_161);
    }
    }
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_162);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_163);
    } else {
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_166);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_169);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    }
    stringBuffer.append(TEXT_172);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_173);
    }
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_176);
    /*Util Fields*/
    stringBuffer.append(TEXT_177);
    
	SpecCode sc=env.retrieveSpecCode(clazz,GenEnvironment.UTIL_FIELD);
	String code="";
	if(sc!=null){
		code=sc.getCode().getCode();
		code=env.preProc(code,null,genClass,genPackage);
	}
	if(code.length()>0){
	
    stringBuffer.append(TEXT_178);
    stringBuffer.append(code.trim());
    stringBuffer.append(TEXT_179);
    }//if
    stringBuffer.append(TEXT_180);
    /*SpecCreate*/
    stringBuffer.append(TEXT_181);
    
	sc=env.retrieveSpecCode(clazz,GenEnvironment.CREATE);
	code="";
	if(sc!=null){
		code=sc.getCode().getCode();
		code=env.preProc(code,null,genClass,genPackage);
	}
	if(code.length()>0){
	
    stringBuffer.append(TEXT_182);
    stringBuffer.append(code.trim());
    stringBuffer.append(TEXT_183);
    }
	sc=env.retrieveSpecCode(clazz,GenEnvironment.DESTROY);
	code="";
	if(sc!=null){
		code=sc.getCode().getCode();
		code=env.preProc(code,null,genClass,genPackage);
	}
	if(code.length()>0){
	
    stringBuffer.append(TEXT_184);
    stringBuffer.append(code.trim());
    stringBuffer.append(TEXT_185);
    }
	sc=env.retrieveSpecCode(clazz,GenEnvironment.IDENTIFY);
	code="";
	if(sc!=null){
		code=sc.getCode().getCode();
		code=env.preProc(code,null,genClass,genPackage);
		}
	if(code.length()>0){
	
    stringBuffer.append(TEXT_186);
    stringBuffer.append(code.trim());
    stringBuffer.append(TEXT_187);
    }
    stringBuffer.append(TEXT_188);
    //Look up cores
    stringBuffer.append(TEXT_189);
    
	sc=env.retrieveSpecCode(clazz,GenEnvironment.LOOKUP);
	code="";
	if(sc!=null){
		code=sc.getCode().getCode();
		code=env.preProc(code,null,genClass,genPackage);
		}
	if(code.length()>0){
	
    stringBuffer.append(TEXT_190);
    stringBuffer.append(code.trim());
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(TEXT_192);
    String sptype=env.retrieveSpecType(clazz);
    stringBuffer.append(TEXT_193);
    stringBuffer.append(sptype);
    stringBuffer.append(TEXT_194);
    stringBuffer.append(sptype);
    stringBuffer.append(TEXT_195);
    for (GenFeature genFeature:genClass.getGenFeatures()){
		EStructuralFeature feature=genFeature.getEcoreFeature();
		if(feature instanceof EReference && feature.getUpperBound()!=1){
	
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_197);
    	sc=env.retrieveSpecCode(clazz, genFeature.getSafeName(), GenEnvironment.LIST_SUB);
		code="";
		if(sc!=null){
			code=sc.getCode().getCode();
			code=env.preProc(code,genFeature,genClass,genPackage);
		}
	
    stringBuffer.append(TEXT_198);
    stringBuffer.append(code.trim());
    stringBuffer.append(TEXT_199);
    }
    stringBuffer.append(TEXT_200);
    }
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_203);
    for (GenFeature genFeature:genClass.getGenFeatures()){
		EStructuralFeature feature=genFeature.getEcoreFeature();
		if(feature instanceof EReference){
			FeatureMap fm=env.retrieveFeatureMap(clazz,feature.getName());
			if(fm==null || !(fm instanceof FeatureMapForAbstractClass)) continue;
			
			for(java.util.Map.Entry entry:((FeatureMapForAbstractClass)fm).getClass2eclass()){
	
    stringBuffer.append(TEXT_204);
    stringBuffer.append(entry.getKey());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(entry.getValue());
    stringBuffer.append(TEXT_206);
    }//for
    stringBuffer.append(TEXT_207);
    }//if
    stringBuffer.append(TEXT_208);
    }//for
    stringBuffer.append(TEXT_209);
    }
    if (isImplementation && genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL && (genClass.getClassExtendsGenClass() == null || genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL)) {
    stringBuffer.append(TEXT_210);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_211);
    }
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_213);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_214);
    if (!isImplementation) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_217);
    } else {
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_218);
    }
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_221);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_225);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_227);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_228);
    } else {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_231);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_233);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(TEXT_240);
    if (!isImplementation) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_243);
    } else {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_246);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_248);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_249);
    }
    stringBuffer.append(TEXT_250);
    if (!isImplementation) {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_252);
    } else {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_254);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_256);
    } else {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_259);
    }
    stringBuffer.append(TEXT_260);
    }
    stringBuffer.append(TEXT_261);
    if (!isImplementation) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_265);
    } else {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_273);
    }
    stringBuffer.append(TEXT_274);
    if (!isImplementation) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_277);
    } else {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_281);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_284);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_285);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_287);
    } else {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_289);
    }
    stringBuffer.append(TEXT_290);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_292);
    } else {
    stringBuffer.append(TEXT_293);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_294);
    }
    stringBuffer.append(TEXT_295);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_296);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_297);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_298);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_300);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_302);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_303);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_306);
    }
    }
    stringBuffer.append(TEXT_307);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_310);
    }
    stringBuffer.append(TEXT_311);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_313);
    }
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_316);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_319);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_321);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_324);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_327);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_329);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_330);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_332);
    }}
    stringBuffer.append(TEXT_333);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_334);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_337);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_338);
    }
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_341);
    }
    stringBuffer.append(TEXT_342);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_343);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_344);
    }
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_347);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_349);
    }
    stringBuffer.append(TEXT_350);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_355);
    }
    stringBuffer.append(TEXT_356);
    /*SpecGetList*/
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_358);
    
	SpecCode sc=null;
	EStructuralFeature feature=genFeature.getEcoreFeature();
	//EClass clazzz=(EClass)feature.getEType();
	String featureTypeName=feature.getEType().getName();
	String sss=genFeature.getImportedType(genClass);
	int stsss=sss.indexOf("<");
	int ensss=sss.indexOf(">");
	String featureTypeNameForList=sss.substring(stsss+1,ensss);
	
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_362);
    } else {
    stringBuffer.append(TEXT_363);
     
		
			sc=env.retrieveSpecCode(clazz,feature.getName(),GenEnvironment.LIST_SUB);
			if(sc==null){
		
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_366);
    	}
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(featureTypeNameForList);
    stringBuffer.append(TEXT_369);
    stringBuffer.append(featureTypeNameForList);
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(featureTypeName);
    stringBuffer.append(TEXT_373);
    }
    stringBuffer.append(TEXT_374);
    if(!genModel.isVirtualDelegation() && sc!=null){
    stringBuffer.append(TEXT_375);
    stringBuffer.append(featureTypeNameForList);
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_377);
    }
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_379);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_382);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_400);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_405);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_409);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_413);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_414);
    }
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_416);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_419);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_422);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_423);
    }
    stringBuffer.append(TEXT_424);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_427);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_433);
    }
    stringBuffer.append(TEXT_434);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_438);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_441);
    } else {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_446);
    }
    } else {
    /*SpecGet*/
            
        	EStructuralFeature feature=genFeature.getEcoreFeature();        	
        	
        	String specType=env.retrieveSpecType(clazz);
        	
        
    stringBuffer.append(TEXT_447);
    stringBuffer.append(TEXT_448);
    stringBuffer.append(specType);
    stringBuffer.append(TEXT_449);
    stringBuffer.append(specType);
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_451);
    	
        	SpecCode sCode=env.retrieveSpecCode(
        			clazz,
        			genFeature.getSafeName(),
        			GenEnvironment.GET
        		);
        	String code="";
        	if(sCode!=null){
        		code=sCode.getCode().getCode();
        		code=env.preProc(code,genFeature,genClass,genPackage);
        	
        
    stringBuffer.append(TEXT_452);
    stringBuffer.append(TEXT_453);
    stringBuffer.append(code.trim());
    if(genFeature.getEcoreFeature() instanceof EReference){ 
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_456);
    }
    }
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_458);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_468);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_472);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_475);
    } else {
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_480);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_482);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_484);
    } else {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_487);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_488);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_489);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_491);
    }
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_493);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_495);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_497);
    }
    stringBuffer.append(TEXT_498);
    } else {
    stringBuffer.append(TEXT_499);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_500);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_502);
    }
    stringBuffer.append(TEXT_503);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_505);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_507);
    }
    stringBuffer.append(TEXT_508);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_512);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_513);
    if (genFeature.isMapType()) {
    stringBuffer.append(TEXT_514);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_515);
    } else {
    stringBuffer.append(TEXT_516);
    }
    stringBuffer.append(TEXT_517);
    }
    stringBuffer.append(TEXT_518);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_519);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_520);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_523);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_526);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_529);
    } else {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_531);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_534);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_536);
    } else {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_540);
    }
    } else {
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_543);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_544);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_545);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_551);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_555);
    stringBuffer.append(TEXT_556);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_560);
    } else {
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_566);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_568);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_572);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_575);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_578);
    }
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_580);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_581);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_586);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_590);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_591);
    } else {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_593);
    }
    stringBuffer.append(TEXT_594);
    } else {
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_599);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_604);
    }
    stringBuffer.append(TEXT_605);
    }
    stringBuffer.append(TEXT_606);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_609);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_612);
    } else {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_617);
    }
    } else {
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_620);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_621);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_629);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_632);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_634);
    }
    }
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_636);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_637);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_640);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_642);
    }
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_644);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_645);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_647);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_649);
    }
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_651);
    }
    stringBuffer.append(TEXT_652);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_666);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_670);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_676);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_681);
    }
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_686);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_694);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_698);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_703);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_704);
    }
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_709);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_712);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_716);
    }
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_719);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_722);
    }
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_724);
    }
    stringBuffer.append(TEXT_725);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_732);
    }
    stringBuffer.append(TEXT_733);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_739);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_744);
    } else {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_751);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_757);
    } else {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_764);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_766);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_768);
    }
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_770);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_774);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    } else {
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_785);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_790);
    } else {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_794);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_798);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_804);
    }
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_807);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_810);
    }
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_812);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_816);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_820);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_822);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_823);
    } else {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    }
    stringBuffer.append(TEXT_826);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    /*SpecSet*/
    stringBuffer.append(TEXT_827);
    
	        EStructuralFeature feature=genFeature.getEcoreFeature();
	        	
	        String specType=env.retrieveSpecType(clazz);
	        
    stringBuffer.append(TEXT_828);
    stringBuffer.append(specType);
    stringBuffer.append(TEXT_829);
    stringBuffer.append(specType);
    stringBuffer.append(TEXT_830);
    
	    	SpecCode sCode=env.retrieveSpecCode(
        			clazz,
        			genFeature.getSafeName(),
        			GenEnvironment.SET
        		);
        	String code="";
        	if(sCode!=null){
        		code=sCode.getCode().getCode();
        		code=env.preProc(code,genFeature,genClass,genPackage);
        	}
        	
    stringBuffer.append(TEXT_831);
    stringBuffer.append(code.trim());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_835);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_840);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_842);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_847);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_849);
    }
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_851);
    }
    stringBuffer.append(TEXT_852);
    } else {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_856);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_858);
    }
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_860);
    }
    stringBuffer.append(TEXT_861);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_862);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_865);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_866);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_867);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_871);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_873);
    }
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_875);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_879);
    }
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_881);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_883);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_887);
    }
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_890);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_893);
    }
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_895);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_900);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_902);
    } else {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_904);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_905);
    } else {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_907);
    }
    stringBuffer.append(TEXT_908);
    }
    } else {
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_911);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_912);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(TEXT_918);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_920);
    }
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_922);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_925);
    }
    stringBuffer.append(TEXT_926);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_927);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_929);
    } else {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_931);
    }
    stringBuffer.append(TEXT_932);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_934);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_939);
    }
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_944);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_949);
    }
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_952);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_956);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_960);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_961);
    }
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_963);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_966);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_970);
    }
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_973);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_976);
    }
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_978);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_983);
    }
    stringBuffer.append(TEXT_984);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_989);
    } else {
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_996);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_999);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1003);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1005);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1009);
    } else {
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1012);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1014);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1017);
    } else {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1019);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1023);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1025);
    } else {
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1027);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1028);
    } else {
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1030);
    }
    stringBuffer.append(TEXT_1031);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1037);
    } else {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1042);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1045);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1048);
    } else {
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1050);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1054);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1059);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1060);
    } else {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1062);
    }
    stringBuffer.append(TEXT_1063);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1068);
    } else {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1072);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1076);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1077);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1085);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1087);
    }
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1089);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1092);
    }
    stringBuffer.append(TEXT_1093);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1094);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1096);
    } else {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1098);
    }
    stringBuffer.append(TEXT_1099);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1101);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1106);
    }
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1111);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1113);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1116);
    } else {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1118);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1123);
    } else {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1127);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1131);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1132);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(TEXT_1134);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1135);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1141);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1144);
    }}
    stringBuffer.append(TEXT_1145);
    //Class/genOperation.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1146);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/genOperation.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1151);
    } else {
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1156);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1170);
    } else {
    stringBuffer.append(TEXT_1171);
    //Class/implementedGenOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1172);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1173);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1174);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1175);
    }
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1180);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1182);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1187);
    } else {
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1189);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1190);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1193);
    } else {
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1195);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1200);
    } else if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1203);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1205);
    }
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1207);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1211);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1216);
    }
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1219);
    }
    }
    stringBuffer.append(TEXT_1220);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1221);
    } else {
    stringBuffer.append(TEXT_1222);
    }
    stringBuffer.append(TEXT_1223);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1224);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1225);
    }
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1230);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1232);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1237);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1241);
    } else {
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1244);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1246);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1248);
    } else {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1250);
    }
    }
    stringBuffer.append(TEXT_1251);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1252);
    } else {
    stringBuffer.append(TEXT_1253);
    }
    stringBuffer.append(TEXT_1254);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1255);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1256);
    }
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1260);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1264);
    }
    stringBuffer.append(TEXT_1265);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1266);
    } else {
    stringBuffer.append(TEXT_1267);
    }
    stringBuffer.append(TEXT_1268);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1269);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1270);
    }
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1272);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1274);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1276);
    } else {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1279);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1282);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1287);
    } else {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1290);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1294);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1298);
    } else {
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1300);
    }
    }
    stringBuffer.append(TEXT_1301);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1302);
    } else {
    stringBuffer.append(TEXT_1303);
    }
    stringBuffer.append(TEXT_1304);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1305);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1306);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1307);
    }
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1309);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1311);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1315);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1318);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1323);
    } else {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1326);
    }
    } else {
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1331);
    }
    stringBuffer.append(TEXT_1332);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1336);
    } else {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1338);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1340);
    }
    stringBuffer.append(TEXT_1341);
    }
    stringBuffer.append(TEXT_1342);
    }
    stringBuffer.append(TEXT_1343);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1344);
    } else {
    stringBuffer.append(TEXT_1345);
    }
    stringBuffer.append(TEXT_1346);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1347);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1348);
    }
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1350);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1352);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1355);
    } else {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1357);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1359);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1362);
    } else {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1365);
    }
    stringBuffer.append(TEXT_1366);
    }
    stringBuffer.append(TEXT_1367);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1368);
    } else {
    stringBuffer.append(TEXT_1369);
    }
    stringBuffer.append(TEXT_1370);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1371);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1372);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1373);
    }
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1375);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1377);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1380);
    } else {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1383);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1386);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1393);
    } else {
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1395);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1397);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1399);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1401);
    } else {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1403);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1405);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1407);
    } else {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1409);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1413);
    } else {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1417);
    }
    } else {
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1420);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1424);
    } else {
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1427);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1432);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1442);
    } else {
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1447);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1448);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1449);
    } else {
    stringBuffer.append(TEXT_1450);
    }
    stringBuffer.append(TEXT_1451);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1452);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1453);
    }
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1455);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1458);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1461);
    }
    stringBuffer.append(TEXT_1462);
    }
    stringBuffer.append(TEXT_1463);
    }
    stringBuffer.append(TEXT_1464);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1465);
    }
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1467);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1469);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1472);
    }
    stringBuffer.append(TEXT_1473);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1476);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1479);
    }
    stringBuffer.append(TEXT_1480);
    }
    stringBuffer.append(TEXT_1481);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1482);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1483);
    }
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1485);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1486);
    }
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1488);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_1489);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1490);
    }
    stringBuffer.append(TEXT_1491);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1494);
    }
    stringBuffer.append(TEXT_1495);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1496);
    }
    stringBuffer.append(TEXT_1497);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1500);
    }
    stringBuffer.append(TEXT_1501);
    }
    }
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1502);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1503);
    }
    stringBuffer.append(TEXT_1504);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1512);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1515);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1516);
    }
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1520);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1523);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1524);
    }
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_1530);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1533);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1534);
    }
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_1539);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1542);
    } else {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1547);
    }
    } else {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1549);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1550);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1553);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1555);
    } else {
    stringBuffer.append(TEXT_1556);
    }
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1558);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1559);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1561);
    }
    stringBuffer.append(TEXT_1562);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1563);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1566);
    } else {
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1568);
    }
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1570);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1572);
    } else {
    stringBuffer.append(TEXT_1573);
    }
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1577);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1578);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1580);
    }
    stringBuffer.append(TEXT_1581);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1582);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1585);
    } else {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1587);
    }
    stringBuffer.append(TEXT_1588);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_1589);
    }
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1593);
    }
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1595);
    return stringBuffer.toString();
  }
}
