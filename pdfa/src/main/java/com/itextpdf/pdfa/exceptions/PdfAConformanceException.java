/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2023 Apryse Group NV
    Authors: Apryse Software.

    This program is offered under a commercial and under the AGPL license.
    For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

    AGPL licensing:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itextpdf.pdfa.exceptions;

import com.itextpdf.kernel.exceptions.PdfException;

/**
 * Exception that is thrown when the PDF Document doesn't adhere to the PDF/A specification.
 */
public class PdfAConformanceException extends PdfException {

    @Deprecated
    public static final String _0_ACTIONS_ARE_NOT_ALLOWED = "{0} actions are not allowed";
    @Deprecated
    public static final String A_CATALOG_DICTIONARY_SHALL_CONTAIN_METADATA_ENTRY = "A catalog dictionary shall contain metadata entry";
    @Deprecated
    public static final String A_CATALOG_DICTIONARY_SHALL_NOT_CONTAIN_AA_ENTRY = "A catalog dictionary shall not contain aa entry";
    public static final String A_CATALOG_DICTIONARY_SHALL_NOT_CONTAIN_ALTERNATEPRESENTATIONS_NAMES_ENTRY = "A catalog dictionary shall not contain alternatepresentations names entry";
    @Deprecated
    public static final String A_CATALOG_DICTIONARY_SHALL_NOT_CONTAIN_OCPROPERTIES_KEY = "A catalog dictionary shall not contain the ocproperties key";
    @Deprecated
    public static final String A_CATALOG_DICTIONARY_SHALL_NOT_CONTAIN_REQUIREMENTS_ENTRY = "A catalog dictionary shall not contain a requirements entry";
    @Deprecated
    public static final String A_CATALOG_SHALL_INCLUDE_MARK_INFO_DICTIONARY_WITH_MARKED_TRUE_VALUE = "A catalog dictionary shall include a markinfo dictionary whose entry marked shall have a value of true";
    @Deprecated
    public static final String A_FORM_XOBJECT_DICTIONARY_SHALL_NOT_CONTAIN_OPI_KEY = "A form xobject dictionary shall not contain opi key";
    @Deprecated
    public static final String A_FORM_XOBJECT_DICTIONARY_SHALL_NOT_CONTAIN_PS_KEY = "A form xobject dictionary shall not contain PS key";
    @Deprecated
    public static final String A_FORM_XOBJECT_DICTIONARY_SHALL_NOT_CONTAIN_SUBTYPE2_KEY_WITH_A_VALUE_OF_PS = "A form xobject dictionary shall not contain subtype2 key with a value of PS";
    @Deprecated
    public static final String A_GROUP_OBJECT_WITH_AN_S_KEY_WITH_A_VALUE_OF_TRANSPARENCY_SHALL_NOT_BE_INCLUDED_IN_A_FORM_XOBJECT = "A group object with an s key with a value of transparency shall not be included in a form xobject";
    @Deprecated
    public static final String A_GROUP_OBJECT_WITH_AN_S_KEY_WITH_A_VALUE_OF_TRANSPARENCY_SHALL_NOT_BE_INCLUDED_IN_A_PAGE_XOBJECT = "A group object with an s key with a value of transparency shall not be included in a page xobject";
    @Deprecated
    public static final String A_NAME_DICTIONARY_SHALL_NOT_CONTAIN_THE_EMBEDDED_FILES_KEY = "A name dictionary shall not contain the EmbeddedFiles key";
    @Deprecated
    public static final String ALL_COLOUR_CHANNELS_IN_THE_JPEG2000_DATA_SHALL_HAVE_THE_SAME_BIT_DEPTH = "All colour channels in the jpeg2000 data shall have the same bit-depth";
    @Deprecated
    public static final String ALL_HALFTONES_SHALL_HAVE_HALFTONETYPE_1_OR_5 = "All halftones shall have halftonetype 1 or 5";
    @Deprecated
    public static final String ALL_NON_SYMBOLIC_TRUE_TYPE_FONT_SHALL_SPECIFY_MAC_ROMAN_ENCODING_OR_WIN_ANSI_ENCODING = "All non-symbolic TrueType fonts shall specify MacRomanEncoding or WinAnsiEncoding as the value of the Encoding entry in the font dictionary ";
    @Deprecated
    public static final String ALL_NON_SYMBOLIC_TRUE_TYPE_FONT_SHALL_SPECIFY_MAC_ROMAN_OR_WIN_ANSI_ENCODING_AS_THE_ENCODING_ENTRY = "All non-symbolic TrueType fonts shall specify MacRomanEncoding or WinAnsiEncoding as the value of the Encoding entry in the font dictionary  This also means that Encoding entry in the font dictionary shall not be an encoding dictionary ";
    @Deprecated
    public static final String ALL_SYMBOLIC_TRUE_TYPE_FONTS_SHALL_NOT_SPECIFY_ENCODING = "All symbolic TrueType fonts shall not specify an Encoding entry in the font dictionary ";
    @Deprecated
    public static final String ALL_THE_FONTS_MUST_BE_EMBEDDED_THIS_ONE_IS_NOT_0 = "All the fonts must be embedded. This one is not: {0}";
    @Deprecated
    public static final String AN_ANNOTATION_DICTIONARY_SHALL_CONTAIN_THE_F_KEY = "An annotation dictionary shall contain the f key";
    @Deprecated
    public static final String AN_ANNOTATION_DICTIONARY_SHALL_NOT_CONTAIN_AA_KEY = "An annotation dictionary shall not contain aa key";
    @Deprecated
    public static final String AN_ANNOTATION_DICTIONARY_SHALL_NOT_CONTAIN_THE_CA_KEY_WITH_A_VALUE_OTHER_THAN_1 = "An annotation dictionary shall not contain the ca key with a value other than 1";
    @Deprecated
    public static final String AN_EXTGSTATE_DICTIONARY_SHALL_NOT_CONTAIN_THE_HTP_KEY = "An extgstate dictionary shall not contain the HTP key";
    @Deprecated
    public static final String AN_EXTGSTATE_DICTIONARY_SHALL_NOT_CONTAIN_THE_TR_2_KEY_WITH_A_VALUE_OTHER_THAN_DEFAULT = "An extgstate dictionary shall not contain the TR2 key with a value other than default";
    @Deprecated
    public static final String AN_EXTGSTATE_DICTIONARY_SHALL_NOT_CONTAIN_THE_TR_KEY = "An extgstate dictionary shall not contain the tr key";
    @Deprecated
    public static final String AN_IMAGE_DICTIONARY_SHALL_NOT_CONTAIN_ALTERNATES_KEY = "An image dictionary shall not contain alternates key";
    @Deprecated
    public static final String AN_IMAGE_DICTIONARY_SHALL_NOT_CONTAIN_OPI_KEY = "An image dictionary shall not contain opi key";
    @Deprecated
    public static final String ANNOTATION_OF_TYPE_0_SHOULD_HAVE_CONTENTS_KEY = "Annotation of type {0} should have contents key";
    @Deprecated
    public static final String ANNOTATION_TYPE_0_IS_NOT_PERMITTED = "Annotation type {0} is not permitted";
    @Deprecated
    public static final String APPEARANCE_DICTIONARY_OF_WIDGET_SUBTYPE_AND_BTN_FIELD_TYPE_SHALL_CONTAIN_ONLY_THE_N_KEY_WITH_DICTIONARY_VALUE = "Appearance dictionary of widget subtype and btn field type shall contain only the n key with dictionary value";
    @Deprecated
    public static final String APPEARANCE_DICTIONARY_SHALL_CONTAIN_ONLY_THE_N_KEY_WITH_STREAM_VALUE = "Appearance dictionary shall contain only the n key with stream value";
    @Deprecated
    public static final String BLEND_MODE_SHALL_HAVE_VALUE_NORMAL_OR_COMPATIBLE = "Blend mode shall have value normal or compatible";
    @Deprecated
    public static final String COLOR_SPACE_0_SHALL_BE_DEVICE_INDEPENDENT = "Color space {0} shall be device independent";
    @Deprecated
    public static final String COLOR_SPACE_0_SHALL_HAVE_1_COMPONENTS = "Color space {0} shall have {1} components";
    @Deprecated
    public static final String CRYPT_FILTER_IS_NOT_PERMITTED_INLINE_IMAGE = "Crypt filter is not permitted inline image";
    @Deprecated
    public static final String DEPRECATED_SETSTATE_AND_NOOP_ACTIONS_ARE_NOT_ALLOWED = "Deprecated setstate and noop actions are not allowed";
    @Deprecated
    public static final String DESTOUTPUTPROFILE_IN_THE_PDFA1_OUTPUTINTENT_DICTIONARY_SHALL_BE_RGB = "Destoutputprofile in the pdfa1 outputintent dictionary shall be rgb";
    @Deprecated
    public static final String DEVICECMYK_MAY_BE_USED_ONLY_IF_THE_FILE_HAS_A_CMYK_PDFA_OUTPUT_INTENT = "Devicecmyk may be used only if the file has a cmyk pdfa outputIntent";
    @Deprecated
    public static final String DEVICECMYK_MAY_BE_USED_ONLY_IF_THE_FILE_HAS_A_CMYK_PDFA_OUTPUT_INTENT_OR_DEFAULTCMYK_IN_USAGE_CONTEXT = "Devicecmyk may be used only if the file has a cmyk pdfa outputIntent or defaultcmyk in usage context";
    @Deprecated
    public static final String DEVICERGB_AND_DEVICECMYK_COLORSPACES_CANNOT_BE_USED_BOTH_IN_ONE_FILE = "Devicergb and devicecmyk colorspaces cannot be used both in one file";
    @Deprecated
    public static final String DEVICERGB_MAY_BE_USED_ONLY_IF_THE_FILE_HAS_A_RGB_PDFA_OUTPUT_INTENT = "Devicergb may be used only if the file has a rgb pdfa outputIntent";
    @Deprecated
    public static final String DEVICERGB_MAY_BE_USED_ONLY_IF_THE_FILE_HAS_A_RGB_PDFA_OUTPUT_INTENT_OR_DEFAULTRGB_IN_USAGE_CONTEXT = "Devicergb may be used only if the file has a rgb pdfa outputIntent or defaultrgb in usage context";
    @Deprecated
    public static final String DOCUMENT_TO_READ_FROM_SHALL_BE_A_PDFA_CONFORMANT_FILE_WITH_VALID_XMP_METADATA = "Document to read from shall be a pdfa conformant file with valid xmp metadata";
    @Deprecated
    public static final String EF_KEY_OF_FILE_SPECIFICATION_DICTIONARY_SHALL_CONTAIN_DICTIONARY_WITH_VALID_F_KEY = "Ef key of file specification dictionary shall contain dictionary with valid f key";
    @Deprecated
    public static final String EMBEDDED_FILE_SHALL_CONTAIN_PARAMS_KEY_WITH_DICTIONARY_AS_VALUE = "Embedded file shall contain params key with dictionary as value";
    @Deprecated
    public static final String EMBEDDED_FILE_SHALL_CONTAIN_PARAMS_KEY_WITH_VALID_MODDATE_KEY = "Embedded file shall contain params key with valid moddate key";
    @Deprecated
    public static final String KEYWORD_ENCRYPT_SHALL_NOT_BE_USED_IN_THE_TRAILER_DICTIONARY = "Keyword encrypt shall not be used in the trailer dictionary";
    @Deprecated
    public static final String EVERY_ANNOTATION_SHALL_HAVE_AT_LEAST_ONE_APPEARANCE_DICTIONARY = "Every annotation shall have at least one appearance dictionary";
    @Deprecated
    public static final String EXACTLY_ONE_COLOUR_SPACE_SPECIFICATION_SHALL_HAVE_THE_VALUE_0X01_IN_THE_APPROX_FIELD = "Exactly one colour space specification shall have the value 0x01 in the approx field";
    @Deprecated
    public static final String FILE_SPECIFICATION_DICTIONARY_SHALL_CONTAIN_F_KEY_AND_UF_KEY = "File specification dictionary shall contain f key and uf key";
    @Deprecated
    public static final String FILE_SPECIFICATION_DICTIONARY_SHALL_CONTAIN_ONE_OF_THE_PREDEFINED_AFRELATIONSHIP_KEYS = "File specification dictionary shall contain one of the predefined afrelationship keys";
    @Deprecated
    public static final String FILE_SPECIFICATION_DICTIONARY_SHALL_NOT_CONTAIN_THE_EF_KEY = "File specification dictionary shall not contain the EF key";
    @Deprecated
    public static final String GRAPHICS_STATE_STACK_DEPTH_IS_GREATER_THAN_28 = "Graphics state stack depth is greater than 28";
    @Deprecated
    public static final String HALFTONES_SHALL_NOT_CONTAIN_HALFTONENAME = "Halftones shall not contain halftonename";
    @Deprecated
    public static final String IF_DEVICE_RGB_CMYK_GRAY_USED_IN_FILE_THAT_FILE_SHALL_CONTAIN_PDFA_OUTPUTINTENT = "If device rgb cmyk gray used in file, that file shall contain pdfa outputintent";
    @Deprecated
    public static final String IF_DEVICE_RGB_CMYK_GRAY_USED_IN_FILE_THAT_FILE_SHALL_CONTAIN_PDFA_OUTPUTINTENT_OR_DEFAULT_RGB_CMYK_GRAY_IN_USAGE_CONTEXT = "If device rgb cmyk gray used in file that file shall contain pdfa outputintent or DefaultRgb Cmyk Gray in usage context";
    @Deprecated
    public static final String IF_OUTPUTINTENTS_ARRAY_HAS_MORE_THAN_ONE_ENTRY_WITH_DESTOUTPUTPROFILE_KEY_THE_SAME_INDIRECT_OBJECT_SHALL_BE_USED_AS_THE_VALUE_OF_THAT_OBJECT = "If outputintents array has more than one entry with destoutputprofile key the same indirect object shall be used as the value of that object";
    @Deprecated
    public static final String IF_SPECIFIED_RENDERING_SHALL_BE_ONE_OF_THE_FOLLOWING_RELATIVECOLORIMETRIC_ABSOLUTECOLORIMETRIC_PERCEPTUAL_OR_SATURATION = "If specified rendering shall be one of the following relativecolorimetric absolutecolorimetric perceptual or saturation";
    @Deprecated
    public static final String INTEGER_NUMBER_IS_OUT_OF_RANGE = "Integer number is out of range";
    @Deprecated
    public static final String THE_DOCUMENT_DOES_NOT_CONTAIN_A_PDFA_OUTPUTINTENT_BUT_PAGE_CONTAINS_TRANSPARENCY_AND_DOES_NOT_CONTAIN_BLENDING_COLOR_SPACE = "If the document does not contain a OutputIntent, then page with transparency shall include the dictionary with Group key that include a CS with blending colour space";
    @Deprecated
    public static final String JPEG2000_ENUMERATED_COLOUR_SPACE_19_CIEJAB_SHALL_NOT_BE_USED = "jpeg2000 enumerated colour space 19 (CIEJab) shall not be used";
    @Deprecated
    public static final String LZWDECODE_FILTER_IS_NOT_PERMITTED = "LZWDecode filter is not permitted";
    @Deprecated
    public static final String MAXIMUM_ARRAY_CAPACITY_IS_EXCEEDED = "Maximum array capacity is exceeded";
    @Deprecated
    public static final String MAXIMUM_DICTIONARY_CAPACITY_IS_EXCEEDED = "Maximum dictionary capacity is exceeded";
    @Deprecated
    public static final String MAXIMUM_NUMBER_OF_INDIRECT_OBJECTS_EXCEEDED =
            "Maximum number of indirect objects exceeded";
    @Deprecated
    public static final String MIME_TYPE_SHALL_BE_SPECIFIED_USING_THE_SUBTYPE_KEY_OF_THE_FILE_SPECIFICATION_STREAM_DICTIONARY = "Mime type shall be specified using the subtype key of the file specification stream dictionary";
    @Deprecated
    public static final String N_KEY_SHALL_BE_APPEARANCE_SUBDICTIONARY = "If an annotation dictionary's Subtype key has a value of Widget and its FT key has a value of Btn, the value of the N key shall be an appearance subdictionary";
    @Deprecated
    public static final String NAMED_ACTION_TYPE_0_IS_NOT_ALLOWED = "Named action type {0} not allowed";
    @Deprecated
    public static final String NEEDAPPEARANCES_FLAG_OF_THE_INTERACTIVE_FORM_DICTIONARY_SHALL_EITHER_NOT_BE_PRESENTED_OR_SHALL_BE_FALSE = "Needappearances flag of the interactive form dictionary shall either not be presented or shall be false";
    @Deprecated
    public static final String NO_KEYS_OTHER_THAN_UR3_AND_DOC_MDP_SHALL_BE_PRESENT_IN_A_PERMISSIONS_DICTIONARY = "No keys other than UR3 and DocMDP shall be present in a permissions dictionary";
    @Deprecated
    public static final String NOT_IDENTITY_CRYPT_FILTER_IS_NOT_PERMITTED = "Not identity crypt filter is not permitted";
    @Deprecated
    public static final String ONLY_JPX_BASELINE_SET_OF_FEATURES_SHALL_BE_USED = "Only jpx baseline set of features shall be used";
    @Deprecated
    public static final String ONLY_STANDARD_BLEND_MODES_SHALL_BE_USED_FOR_THE_VALUE_OF_THE_BM_KEY_IN_AN_EXTENDED_GRAPHIC_STATE_DICTIONARY = "Only standard blend modes shall be used for the value of the BM key in an extended graphic state dictionary";
    @Deprecated
    public static final String OPTIONAL_CONTENT_CONFIGURATION_DICTIONARY_SHALL_CONTAIN_NAME_ENTRY = "Optional content configuration dictionary shall contain name entry";
    @Deprecated
    public static final String ORDER_ARRAY_SHALL_CONTAIN_REFERENCES_TO_ALL_OCGS = "Order array shall contain references to all ocgs";
    @Deprecated
    public static final String OUTPUT_INTENT_COLOR_SPACE_SHALL_BE_EITHER_GRAY_RGB_OR_CMYK = "Output intent color space shall be either gray rgb or cmyk";
    @Deprecated
    public static final String OVERPRINT_MODE_SHALL_NOT_BE_ONE_WHEN_AN_ICCBASED_CMYK_COLOUR_SPACE_IS_USED_AND_WHEN_OVERPRINTING_IS_SET_TO_TRUE = "Overprint mode shall not be one when an ICCBased CMYK colour space is used and when overprinting is set to true";
    @Deprecated
    public static final String PDF_NAME_IS_TOO_LONG = "PdfName is too long";
    @Deprecated
    public static final String PDF_STRING_IS_TOO_LONG = "PdfString is too long";
    @Deprecated
    public static final String PROFILE_STREAM_OF_OUTPUTINTENT_SHALL_BE_OUTPUT_PROFILE_PRTR_OR_MONITOR_PROFILE_MNTR = "Profile stream of outputintent shall be output profile (prtr) or monitor profile (mntr)";
    @Deprecated
    public static final String REAL_NUMBER_IS_OUT_OF_RANGE = "Real number is out of range";
    @Deprecated
    public static final String SIGNATURE_REFERENCES_DICTIONARY_SHALL_NOT_CONTAIN_DIGESTLOCATION_DIGESTMETHOD_DIGESTVALUE = "Signature references dictionary shall not contain digestlocation digestmethod digestvalue";
    @Deprecated
    public static final String STREAM_OBJECT_DICTIONARY_SHALL_NOT_CONTAIN_THE_F_FFILTER_OR_FDECODEPARAMS_KEYS = "Stream object dictionary shall not contain the f ffilter or fdecodeparams keys";
    @Deprecated
    public static final String THE_AS_KEY_SHALL_NOT_APPEAR_IN_ANY_OPTIONAL_CONTENT_CONFIGURATION_DICTIONARY = "The as key shall not appear in any optional content configuration dictionary";
    @Deprecated
    public static final String THE_BIT_DEPTH_OF_THE_JPEG2000_DATA_SHALL_HAVE_A_VALUE_IN_THE_RANGE_1_TO_38 = "The bit-depth of the jpeg2000 data shall have a value in the range 1 to 38";
    @Deprecated
    public static final String THE_CATALOG_DICTIONARY_SHALL_NOT_CONTAIN_THE_NEEDSRENDERING_KEY = "The catalog dictionary shall not contain the needsrendering key";
    @Deprecated
    public static final String THE_F_KEYS_PRINT_FLAG_BIT_SHALL_BE_SET_TO_1_AND_ITS_HIDDEN_INVISIBLE_AND_NOVIEW_FLAG_BITS_SHALL_BE_SET_TO_0 = "The f keys print flag bit shall be set to 1 and its hidden invisible and noview flag bits shall be set to 0";
    @Deprecated
    public static final String THE_F_KEYS_PRINT_FLAG_BIT_SHALL_BE_SET_TO_1_AND_ITS_HIDDEN_INVISIBLE_NOVIEW_AND_TOGGLENOVIEW_FLAG_BITS_SHALL_BE_SET_TO_0 = "The f keys print flag bit shall be set to 1 and its hidden invisible noview and togglenoview flag bits shall be set to 0";
    @Deprecated
    public static final String THE_INTERACTIVE_FORM_DICTIONARY_SHALL_NOT_CONTAIN_THE_XFA_KEY = "The interactive form dictionary shall not contain the xfa key";
    @Deprecated
    public static final String THE_NUMBER_OF_COLOR_COMPONENTS_IN_DEVICE_N_COLORSPACE_SHOULD_NOT_EXCEED = "The number of color components in DeviceN colorspace should not exceed {0}";
    @Deprecated
    public static final String THE_NUMBER_OF_COLOUR_CHANNELS_IN_THE_JPEG2000_DATA_SHALL_BE_1_3_OR_4 = "The number of colour channels in the jpeg2000 data shall be 1, 3 or 4";
    @Deprecated
    public static final String THE_PAGE_DICTIONARY_SHALL_NOT_CONTAIN_AA_ENTRY = "The page dictionary shall not contain aa entry";
    @Deprecated
    public static final String THE_PAGE_DICTIONARY_SHALL_NOT_CONTAIN_PRESSTEPS_ENTRY = "The page dictionary shall not contain pressteps entry";
    @Deprecated
    public static final String THE_PAGE_LESS_3_UNITS_NO_GREATER_14400_IN_EITHER_DIRECTION = "The page is less than 3 units or greater than 14400 in either direction";
    @Deprecated
    public static final String THE_SMASK_KEY_IS_NOT_ALLOWED_IN_EXTGSTATE = "The smask key is not allowed in extgstate";
    @Deprecated
    public static final String THE_SMASK_KEY_IS_NOT_ALLOWED_IN_XOBJECTS = "The smask key is not allowed in xobjects";
    @Deprecated
    public static final String THE_VALUE_OF_INTERPOLATE_KEY_SHALL_BE_FALSE = "The value of interpolate key shall not be true";
    @Deprecated
    public static final String THE_VALUE_OF_THE_METH_ENTRY_IN_COLR_BOX_SHALL_BE_1_2_OR_3 = "The value of the meth entry in colr box shall be 1, 2 or 3";
    @Deprecated
    public static final String TINT_TRANSFORM_AND_ALTERNATE_SPACE_SHALL_BE_THE_SAME_FOR_THE_ALL_SEPARATION_CS_WITH_THE_SAME_NAME = "TintTransform and alternateSpace shall be the same for the all separation cs with the same name";
    @Deprecated
    public static final String TRANSPARENCY_IS_NOT_ALLOWED_AND_CA_SHALL_BE_EQUAL_TO_1 = "Transparency is not allowed. ca shall be equal to 1";
    @Deprecated
    public static final String TRANSPARENCY_IS_NOT_ALLOWED_CA_SHALL_BE_EQUAL_TO_1 = "Transparency is not allowed. CA shall be equal to 1";
    @Deprecated
    public static final String VALUE_OF_NAME_ENTRY_SHALL_BE_UNIQUE_AMONG_ALL_OPTIONAL_CONTENT_CONFIGURATION_DICTIONARIES = "Value of name entry shall be unique among all optional content configuration dictionaries";
    @Deprecated
    public static final String WIDGET_ANNOTATION_DICTIONARY_OR_FIELD_DICTIONARY_SHALL_NOT_INCLUDE_A_OR_AA_ENTRY = "Widget annotation dictionary or field dictionary shall not include a or aa entry";


    /**
     * Creates a PdfAConformanceException.
     *
     * @param message the error message
     */
    public PdfAConformanceException(String message) {
        super(message);
    }

    /**
     * Creates a PdfAConformanceException.
     *
     * @param message the error message
     * @param object  an object
     */
    public PdfAConformanceException(String message, Object object) {
        super(message, object);
    }
}

