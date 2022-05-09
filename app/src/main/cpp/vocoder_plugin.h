/*
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND ISC DISCLAIMS ALL WARRANTIES WITH
 * REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS.  IN NO EVENT SHALL ISC BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
 * LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE
 * OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THIS SOFTWARE.
 */
 
#ifndef VOCODER_PLUGIN_H
#define VOCODER_PLUGIN_H

#include <cinttypes>

#include <stdio.h>
#include <cstring>
#include <cmath>

#include "imbe_vocoder_api.h"
#include "vocoder_plugin.h"
#include "vocoder_tables.h"
#include "ambe3600x2400_const.h"
#include "ambe3600x2450_const.h"
#include "mbelib_parms.h"


static const short b0_lookup[] = {
		0, 0, 0, 1, 1, 2, 2, 2,
		3, 3, 4, 4, 4, 5, 5, 5,
		6, 6, 7, 7, 7, 8, 8, 8,
		9, 9, 9, 10, 10, 11, 11, 11,
		12, 12, 12, 13, 13, 13, 14, 14,
		14, 15, 15, 15, 16, 16, 16, 17,
		17, 17, 17, 18, 18, 18, 19, 19,
		19, 20, 20, 20, 21, 21, 21, 21,
		22, 22, 22, 23, 23, 23, 24, 24,
		24, 24, 25, 25, 25, 25, 26, 26,
		26, 27, 27, 27, 27, 28, 28, 28,
		29, 29, 29, 29, 30, 30, 30, 30,
		31, 31, 31, 31, 31, 32, 32, 32,
		32, 33, 33, 33, 33, 34, 34, 34,
		34, 35, 35, 35, 35, 36, 36, 36,
		36, 37, 37, 37, 37, 38, 38, 38,
		38, 38, 39, 39, 39, 39, 40, 40,
		40, 40, 40, 41, 41, 41, 41, 42,
		42, 42, 42, 42, 43, 43, 43, 43,
		43, 44, 44, 44, 44, 45, 45, 45,
		45, 45, 46, 46, 46, 46, 46, 47,
		47, 47, 47, 47, 48, 48, 48, 48,
		48, 49, 49, 49, 49, 49, 49, 50,
		50, 50, 50, 50, 51, 51, 51, 51,
		51, 52, 52, 52, 52, 52, 52, 53,
		53, 53, 53, 53, 54, 54, 54, 54,
		54, 54, 55, 55, 55, 55, 55, 56,
		56, 56, 56, 56, 56, 57, 57, 57,
		57, 57, 57, 58, 58, 58, 58, 58,
		58, 59, 59, 59, 59, 59, 59, 60,
		60, 60, 60, 60, 60, 61, 61, 61,
		61, 61, 61, 62, 62, 62, 62, 62,
		62, 63, 63, 63, 63, 63, 63, 63,
		64, 64, 64, 64, 64, 64, 65, 65,
		65, 65, 65, 65, 65, 66, 66, 66,
		66, 66, 66, 67, 67, 67, 67, 67,
		67, 67, 68, 68, 68, 68, 68, 68,
		68, 69, 69, 69, 69, 69, 69, 69,
		70, 70, 70, 70, 70, 70, 70, 71,
		71, 71, 71, 71, 71, 71, 72, 72,
		72, 72, 72, 72, 72, 73, 73, 73,
		73, 73, 73, 73, 73, 74, 74, 74,
		74, 74, 74, 74, 75, 75, 75, 75,
		75, 75, 75, 75, 76, 76, 76, 76,
		76, 76, 76, 76, 77, 77, 77, 77,
		77, 77, 77, 77, 77, 78, 78, 78,
		78, 78, 78, 78, 78, 79, 79, 79,
		79, 79, 79, 79, 79, 80, 80, 80,
		80, 80, 80, 80, 80, 81, 81, 81,
		81, 81, 81, 81, 81, 81, 82, 82,
		82, 82, 82, 82, 82, 82, 83, 83,
		83, 83, 83, 83, 83, 83, 83, 84,
		84, 84, 84, 84, 84, 84, 84, 84,
		85, 85, 85, 85, 85, 85, 85, 85,
		85, 86, 86, 86, 86, 86, 86, 86,
		86, 86, 87, 87, 87, 87, 87, 87,
		87, 87, 87, 88, 88, 88, 88, 88,
		88, 88, 88, 88, 89, 89, 89, 89,
		89, 89, 89, 89, 89, 89, 90, 90,
		90, 90, 90, 90, 90, 90, 90, 90,
		91, 91, 91, 91, 91, 91, 91, 91,
		91, 92, 92, 92, 92, 92, 92, 92,
		92, 92, 92, 93, 93, 93, 93, 93,
		93, 93, 93, 93, 93, 94, 94, 94,
		94, 94, 94, 94, 94, 94, 94, 94,
		95, 95, 95, 95, 95, 95, 95, 95,
		95, 95, 96, 96, 96, 96, 96, 96,
		96, 96, 96, 96, 96, 97, 97, 97,
		97, 97, 97, 97, 97, 97, 97, 98,
		98, 98, 98, 98, 98, 98, 98, 98,
		98, 98, 99, 99, 99, 99, 99, 99,
		99, 99, 99, 99, 99, 99, 100, 100,
		100, 100, 100, 100, 100, 100, 100, 100,
		100, 101, 101, 101, 101, 101, 101, 101,
		101, 101, 101, 101, 102, 102, 102, 102,
		102, 102, 102, 102, 102, 102, 102, 102,
		103, 103, 103, 103, 103, 103, 103, 103,
		103, 103, 103, 103, 104, 104, 104, 104,
		104, 104, 104, 104, 104, 104, 104, 104,
		105, 105, 105, 105, 105, 105, 105, 105,
		105, 105, 105, 105, 106, 106, 106, 106,
		106, 106, 106, 106, 106, 106, 106, 106,
		107, 107, 107, 107, 107, 107, 107, 107,
		107, 107, 107, 107, 107, 108, 108, 108,
		108, 108, 108, 108, 108, 108, 108, 108,
		108, 109, 109, 109, 109, 109, 109, 109,
		109, 109, 109, 109, 109, 109, 110, 110,
		110, 110, 110, 110, 110, 110, 110, 110,
		110, 110, 110, 111, 111, 111, 111, 111,
		111, 111, 111, 111, 111, 111, 111, 111,
		112, 112, 112, 112, 112, 112, 112, 112,
		112, 112, 112, 112, 112, 112, 113, 113,
		113, 113, 113, 113, 113, 113, 113, 113,
		113, 113, 113, 113, 114, 114, 114, 114,
		114, 114, 114, 114, 114, 114, 114, 114,
		114, 115, 115, 115, 115, 115, 115, 115,
		115, 115, 115, 115, 115, 115, 115, 116,
		116, 116, 116, 116, 116, 116, 116, 116,
		116, 116, 116, 116, 116, 116, 117, 117,
		117, 117, 117, 117, 117, 117, 117, 117,
		117, 117, 117, 117, 118, 118, 118, 118,
		118, 118, 118, 118, 118, 118, 118, 118,
		118, 118, 118, 119, 119, 119, 119, 119,
		119, 119, 119
};

static const int m_list[] = {0, 1, 2, 3, 4, 5, 11, 12, 13, 14, 17, 18, 19, 20, 21, 22, 23, 26, 27,
							 28, 29, 30, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
							 7, 8, 9, 10, 15, 16, 24, 25, 31, 32, 6};
static const int d_list[] = {7, 1, 11, 21, 31, 25, 35, 45, 55, 49, 59, 69, 6, 0, 10, 20, 30, 24, 34,
							 44, 54, 48, 58, 68, 5, 15, 9, 19, 29, 39, 33, 43, 53, 63, 57, 67, 4,
							 14, 8, 18, 28, 38, 32, 42, 52, 62, 56, 66, 3, 13, 23, 17, 27, 37, 47,
							 41, 51, 61, 71, 65, 2, 12, 22, 16, 26, 36, 46, 40, 50, 60, 70, 64};
static const int alt_d_list[] = {0, 12, 24, 36, 48, 60, 1, 13, 25, 37, 49, 61, 2, 14, 26, 38, 50,
								 62, 3, 15, 27, 39, 51, 63, 4, 16, 28, 40, 52, 64, 5, 17, 29, 41,
								 53, 65, 6, 18, 30, 42, 54, 66, 7, 19, 31, 43, 55, 67, 8, 20, 32,
								 44, 56, 68, 9, 21, 33, 45, 57, 69, 10, 22, 34, 46, 58, 70, 11, 23,
								 35, 47, 59, 71};
static const int b_lengths[] = {7, 4, 6, 9, 7, 4, 4, 4, 3};

const int dW[72] = {0, 0, 3, 2, 1, 1, 0, 0, 1, 1, 0, 0, 3, 2, 1, 1, 3, 2, 1, 1, 0, 0, 3, 2, 0, 0, 3,
					2, 1, 1, 0, 0, 1, 1, 0, 0,
					3, 2, 1, 1, 3, 2, 1, 1, 0, 0, 3, 2, 0, 0, 3, 2, 1, 1, 0, 0, 1, 1, 0, 0, 3, 2, 1,
					1, 3, 3, 2, 1, 0, 0, 3, 3,};

const int dX[72] = {10, 22, 11, 9, 10, 22, 11, 23, 8, 20, 9, 21, 10, 8, 9, 21, 8, 6, 7, 19, 8, 20,
					9, 7, 6, 18, 7, 5, 6, 18, 7, 19, 4, 16, 5, 17, 6,
					4, 5, 17, 4, 2, 3, 15, 4, 16, 5, 3, 2, 14, 3, 1, 2, 14, 3, 15, 0, 12, 1, 13, 2,
					0, 1, 13, 0, 12, 10, 11, 0, 12, 1, 13,};
const int rW[36] = {
		0, 1, 0, 1, 0, 1,
		0, 1, 0, 1, 0, 1,
		0, 1, 0, 1, 0, 1,
		0, 1, 0, 1, 0, 2,
		0, 2, 0, 2, 0, 2,
		0, 2, 0, 2, 0, 2
};

const int rX[36] = {
		23, 10, 22, 9, 21, 8,
		20, 7, 19, 6, 18, 5,
		17, 4, 16, 3, 15, 2,
		14, 1, 13, 0, 12, 10,
		11, 9, 10, 8, 9, 7,
		8, 6, 7, 5, 6, 4
};

// bit 0
const int rY[36] = {
		0, 2, 0, 2, 0, 2,
		0, 2, 0, 3, 0, 3,
		1, 3, 1, 3, 1, 3,
		1, 3, 1, 3, 1, 3,
		1, 3, 1, 3, 1, 3,
		1, 3, 1, 3, 1, 3
};

const int rZ[36] = {
		5, 3, 4, 2, 3, 1,
		2, 0, 1, 13, 0, 12,
		22, 11, 21, 10, 20, 9,
		19, 8, 18, 7, 17, 6,
		16, 5, 15, 4, 14, 3,
		13, 2, 12, 1, 11, 0
};

class Vocoder
{
public:
	Vocoder() {}
	virtual ~Vocoder() {}
	virtual void decode_2400x1200(int16_t *pcm, uint8_t *codec) = 0;
	virtual void decode_2450x1150(int16_t *pcm, uint8_t *codec) = 0;
	virtual void decode_2450(int16_t *pcm, uint8_t *codec) = 0;
	virtual void encode_2400x1200(int16_t *pcm, uint8_t *codec) = 0;
	virtual void encode_2450x1150(int16_t *pcm, uint8_t *codec) = 0;
	virtual void encode_2450(int16_t *pcm, uint8_t *codec) = 0;
};

typedef Vocoder* create_t();
typedef void destry_t(Vocoder *);

void encode_ambe(const IMBE_PARAM *imbe_param, int b[], mbe_parms *cur_mp, mbe_parms *prev_mp,
				 bool dstar, float gain_adjust);
void store_reg(int reg, uint8_t val[], int len);
int load_reg(const uint8_t val[], int len);
float make_f0(int b0);
uint32_t golay_23_encode(uint32_t code_word_in);
uint32_t golay_24_encode(uint32_t code_word_in);
void dump_i(uint8_t dest[], int src, int count);
int
mbe_dequantizeAmbeParms(mbe_parms *cur_mp, mbe_parms *prev_mp, const int *b, int dstar);
int
mbe_dequantizeAmbe2400Parms(mbe_parms *cur_mp, mbe_parms *prev_mp, const int *b);
int
mbe_dequantizeAmbe2250Parms(mbe_parms *cur_mp, mbe_parms *prev_mp, const int *b);


class VocoderPlugin : public Vocoder {
public:
	VocoderPlugin() {
		m_mbelibParms = new mbelibParms();
		m_audio_out_temp_buf_p = m_audio_out_temp_buf;

		memset(m_audio_out_buf, 0, sizeof(short) * 2 * 48000);
		m_audio_out_buf_p = m_audio_out_buf;
		m_audio_out_nb_samples = 0;
		m_audio_out_buf_size = 48000; // given in number of unique samples

		initMbeParms();
		memset(ambe_d, 0, 49);
	}

	virtual void decode_2400x1200(int16_t *pcm, uint8_t *ambe) {
		int samples = 0;
		process_2400x1200(ambe);
		int16_t *p = getAudio(samples);
		memcpy(pcm, p, samples * sizeof(int16_t));
		resetAudio();
	}

	virtual void decode_2450x1150(int16_t *pcm, uint8_t *ambe) {
		int samples = 0;
		process_2450x1150(ambe);
		int16_t *p = getAudio(samples);
		memcpy(pcm, p, samples * sizeof(int16_t));
		resetAudio();
	}

	virtual void decode_2450(int16_t *pcm, uint8_t *ambe) {
		int samples = 0;
		process_2450(ambe);
		int16_t *p = getAudio(samples);
		memcpy(pcm, p, samples * sizeof(int16_t));
		resetAudio();
	}

	virtual void encode_2400x1200(int16_t *pcm, uint8_t *ambe) {
		int b[9];
		int16_t frame_vector[8];    // result ignored
		uint8_t ambe_frame[72];

		uint8_t pbuf[48];
		uint8_t tbuf[48];
		int tbufp = 0;

		vocoder.imbe_encode(frame_vector, pcm);
		encode_ambe(vocoder.param(), b, &cur_mp, &prev_mp, true, 1.0);

		for (int i = 0; i < 9; i++) {
			store_reg(b[i], &tbuf[tbufp], b_lengths[i]);
			tbufp += b_lengths[i];
		}

		for (int i = 0; i < 48; i++)
			pbuf[i] = tbuf[m_list[i]];

		int u0 = load_reg(pbuf + 0, 12);
		int u1 = load_reg(pbuf + 12, 12);

		int m1 = PRNG_TABLE[u0];
		int c0 = golay_24_encode(u0);
		int c1 = golay_24_encode(u1) ^ m1;

		uint8_t pre_buf[72];
		store_reg(c0, pre_buf, 24);
		store_reg(c1, pre_buf + 24, 24);
		memcpy(pre_buf + 48, pbuf + 24, 24);

		for (int i = 0; i < 72; i++)
			ambe_frame[d_list[i]] = pre_buf[i];

		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 8; ++j) {
				ambe[i] |= (ambe_frame[(i * 8) + j] << j);
			}
		}
	}

	virtual void encode_2450x1150(int16_t *pcm, uint8_t *ambe) {
		unsigned int aOrig = 0U;
		unsigned int bOrig = 0U;
		unsigned int cOrig = 0U;
		unsigned int MASK = 0x000800U;
		uint8_t tmp[9];

		memset(tmp, 0, 9);
		memset(ambe, 0, 9);
		encode_2450(pcm, tmp);

		for (unsigned int i = 0U; i < 12U; i++, MASK >>= 1) {
			unsigned int n1 = i;
			unsigned int n2 = i + 12U;
			if (READ_BIT(tmp, n1))
				aOrig |= MASK;
			if (READ_BIT(tmp, n2))
				bOrig |= MASK;
		}

		MASK = 0x1000000U;
		for (unsigned int i = 0U; i < 25U; i++, MASK >>= 1) {
			unsigned int n = i + 24U;
			if (READ_BIT(tmp, n))
				cOrig |= MASK;
		}

		unsigned int a = golay_24_encode(aOrig);

		// The PRNG
		unsigned int p = PRNG_TABLE[aOrig] >> 1;

		unsigned int b = golay_23_encode(bOrig);
		b ^= p;

		MASK = 0x800000U;
		for (unsigned int i = 0U; i < 24U; i++, MASK >>= 1) {
			unsigned int aPos = A_TABLE[i];
			WRITE_BIT(ambe, aPos, a & MASK);
		}

		MASK = 0x400000U;
		for (unsigned int i = 0U; i < 23U; i++, MASK >>= 1) {
			unsigned int bPos = B_TABLE[i];
			WRITE_BIT(ambe, bPos, b & MASK);
		}

		MASK = 0x1000000U;
		for (unsigned int i = 0U; i < 25U; i++, MASK >>= 1) {
			unsigned int cPos = C_TABLE[i];
			WRITE_BIT(ambe, cPos, cOrig & MASK);
		}
	}

	virtual void encode_2450(int16_t *pcm, uint8_t *ambe) {
		int b[9];
		int16_t frame_vector[8];    // result ignored
		uint8_t ambe_frame[49];

		vocoder.imbe_encode(frame_vector, pcm);
		encode_ambe(vocoder.param(), b, &cur_mp, &prev_mp, false, 1.0);

		ambe_frame[0] = (b[0] >> 6) & 1;
		ambe_frame[1] = (b[0] >> 5) & 1;
		ambe_frame[2] = (b[0] >> 4) & 1;
		ambe_frame[3] = (b[0] >> 3) & 1;
		ambe_frame[4] = (b[1] >> 4) & 1;
		ambe_frame[5] = (b[1] >> 3) & 1;
		ambe_frame[6] = (b[1] >> 2) & 1;
		ambe_frame[7] = (b[1] >> 1) & 1;
		ambe_frame[8] = (b[2] >> 4) & 1;
		ambe_frame[9] = (b[2] >> 3) & 1;
		ambe_frame[10] = (b[2] >> 2) & 1;
		ambe_frame[11] = (b[2] >> 1) & 1;
		ambe_frame[12] = (b[3] >> 8) & 1;
		ambe_frame[13] = (b[3] >> 7) & 1;
		ambe_frame[14] = (b[3] >> 6) & 1;
		ambe_frame[15] = (b[3] >> 5) & 1;
		ambe_frame[16] = (b[3] >> 4) & 1;
		ambe_frame[17] = (b[3] >> 3) & 1;
		ambe_frame[18] = (b[3] >> 2) & 1;
		ambe_frame[19] = (b[3] >> 1) & 1;
		ambe_frame[20] = (b[4] >> 6) & 1;
		ambe_frame[21] = (b[4] >> 5) & 1;
		ambe_frame[22] = (b[4] >> 4) & 1;
		ambe_frame[23] = (b[4] >> 3) & 1;
		ambe_frame[24] = (b[5] >> 4) & 1;
		ambe_frame[25] = (b[5] >> 3) & 1;
		ambe_frame[26] = (b[5] >> 2) & 1;
		ambe_frame[27] = (b[5] >> 1) & 1;
		ambe_frame[28] = (b[6] >> 3) & 1;
		ambe_frame[29] = (b[6] >> 2) & 1;
		ambe_frame[30] = (b[6] >> 1) & 1;
		ambe_frame[31] = (b[7] >> 3) & 1;
		ambe_frame[32] = (b[7] >> 2) & 1;
		ambe_frame[33] = (b[7] >> 1) & 1;
		ambe_frame[34] = (b[8] >> 2) & 1;
		ambe_frame[35] = b[1] & 1;
		ambe_frame[36] = b[2] & 1;
		ambe_frame[37] = (b[0] >> 2) & 1;
		ambe_frame[38] = (b[0] >> 1) & 1;
		ambe_frame[39] = b[0] & 1;
		ambe_frame[40] = b[3] & 1;
		ambe_frame[41] = (b[4] >> 2) & 1;
		ambe_frame[42] = (b[4] >> 1) & 1;
		ambe_frame[43] = b[4] & 1;
		ambe_frame[44] = b[5] & 1;
		ambe_frame[45] = b[6] & 1;
		ambe_frame[46] = b[7] & 1;
		ambe_frame[47] = (b[8] >> 1) & 1;
		ambe_frame[48] = b[8] & 1;

		for (int i = 0; i < 7; ++i) {
			for (int j = 0; j < 8; ++j) {
				ambe[i] |= (ambe_frame[(i * 8) + j] << (7 - j));
			}
		}
	}

private:
	imbe_vocoder vocoder;
	mbe_parms cur_mp;
	mbe_parms prev_mp;
	mbelibParms *m_mbelibParms;
	//int m_errs;
	int m_errs2;
	char m_err_str[64];

	float m_audio_out_temp_buf[160];   //!< output of decoder
	float *m_audio_out_temp_buf_p;
	float m_aout_max_buf[200];
	float *m_aout_max_buf_p;
	int m_aout_max_buf_idx;
	short m_audio_out_buf[2 * 48000];    //!< final result - 1s of L+R S16LE samples
	short *m_audio_out_buf_p;
	int m_audio_out_nb_samples;
	int m_audio_out_buf_size;
	const int *w, *x, *y, *z;
	char ambe_d[49];

	void initMbeParms() {
		mbe_initMbeParms(m_mbelibParms->m_cur_mp, m_mbelibParms->m_prev_mp,
						 m_mbelibParms->m_prev_mp_enhanced);
		//m_errs = 0;
		m_errs2 = 0;
		m_err_str[0] = 0;
	}

	void process_2400x1200(unsigned char *d) {
		char ambe_fr[4][24];

		memset(ambe_fr, 0, 96);
		w = dW;
		x = dX;

		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 8; ++j) {
				ambe_fr[*w][*x] = (1 & (d[i] >> j));
				w++;
				x++;
			}
		}

		mbe_processAmbe3600x2400Framef(m_audio_out_temp_buf, &m_errs2, m_err_str, ambe_fr, ambe_d,
									   m_mbelibParms->m_cur_mp, m_mbelibParms->m_prev_mp,
									   m_mbelibParms->m_prev_mp_enhanced, 3);
		processAudio();
	}

	void process_2450x1150(unsigned char *d) {
		char ambe_fr[4][24];

		memset(ambe_fr, 0, 96);
		w = rW;
		x = rX;
		y = rY;
		z = rZ;

		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 8; j += 2) {
				ambe_fr[*y][*z] = (1 & (d[i] >> (7 - (j + 1))));
				ambe_fr[*w][*x] = (1 & (d[i] >> (7 - j)));
				w++;
				x++;
				y++;
				z++;
			}
		}

		mbe_processAmbe3600x2450Framef(m_audio_out_temp_buf, &m_errs2, m_err_str, ambe_fr, ambe_d,
									   m_mbelibParms->m_cur_mp, m_mbelibParms->m_prev_mp,
									   m_mbelibParms->m_prev_mp_enhanced, 3);
		processAudio();
	}

	void process_2450(unsigned char *d) {
		char ambe_data[49];
		char dvsi_data[7];
		memset(dvsi_data, 0, 7);

		for (int i = 0; i < 6; ++i) {
			for (int j = 0; j < 8; j++) {
				ambe_data[j + (8 * i)] = (1 & (d[i] >> (7 - j)));
			}
		}
		ambe_data[48] = (1 & (d[6] >> 7));
		processData(ambe_data);
	}

	void processData(char ambe_data[49]) {
		mbe_processAmbe2450Dataf(m_audio_out_temp_buf, &m_errs2, m_err_str, ambe_data,
								 m_mbelibParms->m_cur_mp, m_mbelibParms->m_prev_mp,
								 m_mbelibParms->m_prev_mp_enhanced, 3);
		processAudio();
	}

	short *getAudio(int &nbSamples) {
		nbSamples = m_audio_out_nb_samples;
		return m_audio_out_buf;
	}

	void resetAudio() {
		m_audio_out_nb_samples = 0;
		m_audio_out_buf_p = m_audio_out_buf;
	}

	void processAudio() {
		m_audio_out_temp_buf_p = m_audio_out_temp_buf;

		if (m_audio_out_nb_samples + 160 >= m_audio_out_buf_size) {
			resetAudio();
		}

		for (int i = 0; i < 160; i++) {
			if (*m_audio_out_temp_buf_p > static_cast<float>(32760)) {
				*m_audio_out_temp_buf_p = static_cast<float>(32760);
			} else if (*m_audio_out_temp_buf_p < static_cast<float>(-32760)) {
				*m_audio_out_temp_buf_p = static_cast<float>(-32760);
			}

			*m_audio_out_buf_p = static_cast<short>(*m_audio_out_temp_buf_p);
			m_audio_out_buf_p++;

			m_audio_out_nb_samples++;
			m_audio_out_temp_buf_p++;
		}
	}
};

#endif // VOCODER_PLUGIN_H
